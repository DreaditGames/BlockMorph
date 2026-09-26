package com.dreadit.client;

import com.dreadit.MorphManager;
import com.dreadit.MorphPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.gui.components.Tooltip;

import java.util.List;

public class VariantMenuScreen extends Screen {
    public VariantMenuScreen() {
        super(Component.literal("Variant Menu"));
    }

    @Override
    protected void init() {
        super.init();

        if (this.minecraft == null || this.minecraft.player == null) return;
        ItemStack heldItem = this.minecraft.player.getMainHandItem();
        if (heldItem.isEmpty()) return;

        Item heldType = heldItem.getItem();
        Item baseBlock = MorphManager.getBaseBlock(heldType);

        List<Item> allOptions = MorphManager.getFamily(baseBlock);
        allOptions.remove(heldType);

        // Strip out any item that costs more than a standard 64 stack
        allOptions.removeIf(option -> MorphManager.calculateCost(heldType, option) > 64);

        if (allOptions.isEmpty()) return;

        if (allOptions.isEmpty()) {
            this.onClose();
            return;
        }
        // --- GRID MATH ---
        int buttonSize = 24;
        int columns = Math.min(allOptions.size(), 7);
        int rows = (int) Math.ceil((double) allOptions.size() / columns);

        int startX = (this.width / 2) - ((columns * buttonSize) / 2);
        int startY = (this.height / 2) - ((rows * buttonSize) / 2);

        // --- DRAW THE HEADER TEXT ---
        Component titleText = Component.literal("BlockMorph");
        Component helperText = Component.literal("Single click: 1 batch  |  Shift-click: Max");

        this.addRenderableOnly((guiGraphics, mouseX, mouseY, partialTick) -> {
            guiGraphics.centeredText(this.font, titleText, this.width / 2, startY - 30, 0xFFFFFFFF);
            guiGraphics.centeredText(this.font, helperText, this.width / 2, startY - 15, 0xFFAAAAAA);
        });

        // --- BUTTON LOOP ---
        for (int i = 0; i < allOptions.size(); i++) {
            Item option = allOptions.get(i);
            String optionId = BuiltInRegistries.ITEM.getKey(option).toString();
            ItemStack optionStack = new ItemStack(option);

            int requiredAmount = MorphManager.calculateCost(heldType, option);
            boolean canAfford = heldItem.getCount() >= requiredAmount;

            String optionName = optionStack.getHoverName().getString();
            Component tooltipText = Component.literal(optionName + " (Costs: " + requiredAmount + ")");

            int col = i % columns;
            int row = i / columns;
            int x = startX + (col * buttonSize);
            int y = startY + (row * buttonSize);

            Button optionButton = Button.builder(Component.empty(), button -> {
                        int lShift = InputConstants.getKey("key.keyboard.left.shift").getValue();
                        int rShift = InputConstants.getKey("key.keyboard.right.shift").getValue();
                        boolean isShift = InputConstants.isKeyDown(lShift) || InputConstants.isKeyDown(rShift);

                        ClientPlayNetworking.send(new MorphPayload(optionId, isShift));
                        this.onClose();
                    })
                    .bounds(x, y, buttonSize, buttonSize)
                    .tooltip(Tooltip.create(tooltipText))
                    .build();

            optionButton.active = canAfford;

            this.addRenderableWidget(optionButton);

            this.addRenderableOnly((guiGraphics, mouseX, mouseY, partialTick) -> {
                int iconX = optionButton.getX() + 4;
                int iconY = optionButton.getY() + 4;

                guiGraphics.fakeItem(optionStack, iconX, iconY);

                if (!canAfford) {
                    guiGraphics.fill(iconX, iconY, iconX + 16, iconY + 16, 0x80FF0000);
                }
            });
        }
    }

    @Override
    public boolean keyPressed(KeyEvent event) {
        if (event.key() == InputConstants.getKey("key.keyboard.v").getValue()) {
            if (this.minecraft == null || this.minecraft.player == null) return true;

            ItemStack heldItem = this.minecraft.player.getMainHandItem();
            if (heldItem.isEmpty()) {
                this.onClose();
                return true;
            }

            Item heldType = heldItem.getItem();
            Item baseBlock = MorphManager.getBaseBlock(heldType);

            if (heldType == baseBlock) {
                this.onClose();
            } else {
                String baseId = BuiltInRegistries.ITEM.getKey(baseBlock).toString();

                int lShift = InputConstants.getKey("key.keyboard.left.shift").getValue();
                int rShift = InputConstants.getKey("key.keyboard.right.shift").getValue();
                boolean isShift = InputConstants.isKeyDown(lShift) || InputConstants.isKeyDown(rShift);
                ClientPlayNetworking.send(new MorphPayload(baseId, isShift));
                this.onClose();
            }
            return true;
        }

        return super.keyPressed(event);
    }
}