package com.dreadit.client;

import com.dreadit.MorphManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class BlockmorphClient implements ClientModInitializer {
	private static KeyMapping variantMenuKey;
	private static KeyMapping.Category blockmorphCategory;

	@Override
	public void onInitializeClient() {

		blockmorphCategory = KeyMapping.Category.register(
				Identifier.fromNamespaceAndPath("blockmorph", "general")
		);

		// Pass the Category object into the 3-argument constructor
		variantMenuKey = KeyMappingHelper.registerKeyMapping(new KeyMapping(
				"key.blockmorph.open_menu",
				86, // Hardware ID for 'V'
				blockmorphCategory
		));

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (variantMenuKey.consumeClick()) {
				if (client.player != null) {
					Item heldItem = client.player.getMainHandItem().getItem();
					Item baseBlock = MorphManager.getBaseBlock(heldItem);
					int familySize = MorphManager.getFamily(baseBlock).size();

					if (familySize > 1) {
						client.setScreenAndShow(new VariantMenuScreen());
					}
				}
			}
		});
	}
}