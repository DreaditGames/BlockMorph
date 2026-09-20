package com.dreadit;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Blockmorph implements ModInitializer {
	@Override
	public void onInitialize() {
		PayloadTypeRegistry.serverboundPlay().register(MorphPayload.ID, MorphPayload.CODEC);

		ServerPlayNetworking.registerGlobalReceiver(MorphPayload.ID, (payload, context) -> {
			context.server().execute(() -> {
				ServerPlayer player = context.player();
				ItemStack heldItem = player.getMainHandItem();

				if (heldItem.isEmpty()) return;

				Item targetType = BuiltInRegistries.ITEM.getValue(Identifier.parse(payload.variantName()));
				if (targetType == null) return;

				Item heldType = heldItem.getItem();
				Item baseBlock = MorphManager.getBaseBlock(heldType);

				if (baseBlock != MorphManager.getBaseBlock(targetType)) return;

				int maxHeld = heldItem.getCount();


				int heldCost = (heldType == baseBlock) ? 1 : MorphManager.getDef(baseBlock, heldType).baseCost;
				int heldYield = (heldType == baseBlock) ? 1 : MorphManager.getDef(baseBlock, heldType).variantYield;

				int targetCost = (targetType == baseBlock) ? 1 : MorphManager.getDef(baseBlock, targetType).baseCost;
				int targetYield = (targetType == baseBlock) ? 1 : MorphManager.getDef(baseBlock, targetType).variantYield;


				int maxConversions = maxHeld / heldYield;
				int maxBaseAvailable = maxConversions * heldCost;


				if (maxBaseAvailable < targetCost) return;

				int baseToUse = 0;
				if (payload.morphAll()) {
					int targetBatches = maxBaseAvailable / targetCost;
					baseToUse = targetBatches * targetCost;
				} else {
					baseToUse = targetCost;
				}

				int conversionsUsed = (int) Math.ceil((double) baseToUse / heldCost);
				int itemsToConsume = conversionsUsed * heldYield;

				int actualBaseGenerated = conversionsUsed * heldCost;
				int targetBatchesCreated = actualBaseGenerated / targetCost;
				int targetItemsToGive = targetBatchesCreated * targetYield;
				int leftoverBase = actualBaseGenerated % targetCost;

				heldItem.shrink(itemsToConsume);

				// stonecutter chunk sound
				player.level().playSound(null, player.blockPosition(), net.minecraft.sounds.SoundEvents.UI_STONECUTTER_TAKE_RESULT, net.minecraft.sounds.SoundSource.PLAYERS, 1.0F, 1.0F);

				if (targetItemsToGive > 0) {
					giveItemSafe(player, new ItemStack(targetType, targetItemsToGive));
				}
				if (leftoverBase > 0) {
					giveItemSafe(player, new ItemStack(baseBlock, leftoverBase));
				}
			});
		});
	}

	private void giveItemSafe(ServerPlayer player, ItemStack stack) {
		if (!player.getInventory().add(stack)) {

			net.minecraft.world.entity.item.ItemEntity drop = new net.minecraft.world.entity.item.ItemEntity(
					player.level(),
					player.getX(),
					player.getY(),
					player.getZ(),
					stack
			);
			drop.setNoPickUpDelay();
			player.level().addFreshEntity(drop);
		}
	}
}