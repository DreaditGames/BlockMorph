package com.dreadit;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import java.util.ArrayList;
import java.util.List;

public class MorphManager {
    public static class MorphDef {
        public final Item baseItem;
        public final Item variant;
        public final int baseCost;
        public final int variantYield;

        public MorphDef(Item baseItem, Item variant, int baseCost, int variantYield) {
            this.baseItem = baseItem;
            this.variant = variant;
            this.baseCost = baseCost;
            this.variantYield = variantYield;
        }
    }

    public static final List<MorphDef> RECIPES = new ArrayList<>();

    static {
        // === WOOD FAMILIES ===
        registerWoodFamily(Items.OAK_PLANKS, Items.OAK_STAIRS, Items.OAK_SLAB, Items.OAK_FENCE, Items.OAK_FENCE_GATE, Items.OAK_DOOR, Items.OAK_TRAPDOOR, Items.OAK_SIGN, Items.OAK_HANGING_SIGN, Items.OAK_BUTTON, Items.OAK_PRESSURE_PLATE);
        registerWoodFamily(Items.SPRUCE_PLANKS, Items.SPRUCE_STAIRS, Items.SPRUCE_SLAB, Items.SPRUCE_FENCE, Items.SPRUCE_FENCE_GATE, Items.SPRUCE_DOOR, Items.SPRUCE_TRAPDOOR, Items.SPRUCE_SIGN, Items.SPRUCE_HANGING_SIGN, Items.SPRUCE_BUTTON, Items.SPRUCE_PRESSURE_PLATE);
        registerWoodFamily(Items.BIRCH_PLANKS, Items.BIRCH_STAIRS, Items.BIRCH_SLAB, Items.BIRCH_FENCE, Items.BIRCH_FENCE_GATE, Items.BIRCH_DOOR, Items.BIRCH_TRAPDOOR, Items.BIRCH_SIGN, Items.BIRCH_HANGING_SIGN, Items.BIRCH_BUTTON, Items.BIRCH_PRESSURE_PLATE);
        registerWoodFamily(Items.JUNGLE_PLANKS, Items.JUNGLE_STAIRS, Items.JUNGLE_SLAB, Items.JUNGLE_FENCE, Items.JUNGLE_FENCE_GATE, Items.JUNGLE_DOOR, Items.JUNGLE_TRAPDOOR, Items.JUNGLE_SIGN, Items.JUNGLE_HANGING_SIGN, Items.JUNGLE_BUTTON, Items.JUNGLE_PRESSURE_PLATE);
        registerWoodFamily(Items.ACACIA_PLANKS, Items.ACACIA_STAIRS, Items.ACACIA_SLAB, Items.ACACIA_FENCE, Items.ACACIA_FENCE_GATE, Items.ACACIA_DOOR, Items.ACACIA_TRAPDOOR, Items.ACACIA_SIGN, Items.ACACIA_HANGING_SIGN, Items.ACACIA_BUTTON, Items.ACACIA_PRESSURE_PLATE);
        registerWoodFamily(Items.DARK_OAK_PLANKS, Items.DARK_OAK_STAIRS, Items.DARK_OAK_SLAB, Items.DARK_OAK_FENCE, Items.DARK_OAK_FENCE_GATE, Items.DARK_OAK_DOOR, Items.DARK_OAK_TRAPDOOR, Items.DARK_OAK_SIGN, Items.DARK_OAK_HANGING_SIGN, Items.DARK_OAK_BUTTON, Items.DARK_OAK_PRESSURE_PLATE);
        registerWoodFamily(Items.MANGROVE_PLANKS, Items.MANGROVE_STAIRS, Items.MANGROVE_SLAB, Items.MANGROVE_FENCE, Items.MANGROVE_FENCE_GATE, Items.MANGROVE_DOOR, Items.MANGROVE_TRAPDOOR, Items.MANGROVE_SIGN, Items.MANGROVE_HANGING_SIGN, Items.MANGROVE_BUTTON, Items.MANGROVE_PRESSURE_PLATE);
        registerWoodFamily(Items.CHERRY_PLANKS, Items.CHERRY_STAIRS, Items.CHERRY_SLAB, Items.CHERRY_FENCE, Items.CHERRY_FENCE_GATE, Items.CHERRY_DOOR, Items.CHERRY_TRAPDOOR, Items.CHERRY_SIGN, Items.CHERRY_HANGING_SIGN, Items.CHERRY_BUTTON, Items.CHERRY_PRESSURE_PLATE);
        registerWoodFamily(Items.CRIMSON_PLANKS, Items.CRIMSON_STAIRS, Items.CRIMSON_SLAB, Items.CRIMSON_FENCE, Items.CRIMSON_FENCE_GATE, Items.CRIMSON_DOOR, Items.CRIMSON_TRAPDOOR, Items.CRIMSON_SIGN, Items.CRIMSON_HANGING_SIGN, Items.CRIMSON_BUTTON, Items.CRIMSON_PRESSURE_PLATE);
        registerWoodFamily(Items.WARPED_PLANKS, Items.WARPED_STAIRS, Items.WARPED_SLAB, Items.WARPED_FENCE, Items.WARPED_FENCE_GATE, Items.WARPED_DOOR, Items.WARPED_TRAPDOOR, Items.WARPED_SIGN, Items.WARPED_HANGING_SIGN, Items.WARPED_BUTTON, Items.WARPED_PRESSURE_PLATE);
        registerWoodFamily(Items.BAMBOO_PLANKS, Items.BAMBOO_STAIRS, Items.BAMBOO_SLAB, Items.BAMBOO_FENCE, Items.BAMBOO_FENCE_GATE, Items.BAMBOO_DOOR, Items.BAMBOO_TRAPDOOR, Items.BAMBOO_SIGN, Items.BAMBOO_HANGING_SIGN, Items.BAMBOO_BUTTON, Items.BAMBOO_PRESSURE_PLATE);
        registerWoodFamily(Items.PALE_OAK_PLANKS, Items.PALE_OAK_STAIRS, Items.PALE_OAK_SLAB, Items.PALE_OAK_FENCE, Items.PALE_OAK_FENCE_GATE, Items.PALE_OAK_DOOR, Items.PALE_OAK_TRAPDOOR, Items.PALE_OAK_SIGN, Items.PALE_OAK_HANGING_SIGN, Items.PALE_OAK_BUTTON, Items.PALE_OAK_PRESSURE_PLATE);
        registerWoodFamily(Items.POPLAR_PLANKS, Items.POPLAR_STAIRS, Items.POPLAR_SLAB, Items.POPLAR_FENCE, Items.POPLAR_FENCE_GATE, Items.POPLAR_DOOR, Items.POPLAR_TRAPDOOR, Items.POPLAR_SIGN, Items.POPLAR_HANGING_SIGN, Items.POPLAR_BUTTON, Items.POPLAR_PRESSURE_PLATE);

        addRecipe(Items.OAK_PLANKS, Items.CHISELED_BOOKSHELF, 7, 1);

        //LOG FAMILIES
        registerLogFamily(Items.OAK_PLANKS, Items.OAK_LOG, Items.OAK_WOOD, Items.STRIPPED_OAK_LOG, Items.STRIPPED_OAK_WOOD, Items.OAK_SHELF);
        registerLogFamily(Items.SPRUCE_PLANKS, Items.SPRUCE_LOG, Items.SPRUCE_WOOD, Items.STRIPPED_SPRUCE_LOG, Items.STRIPPED_SPRUCE_WOOD, Items.SPRUCE_SHELF);
        registerLogFamily(Items.BIRCH_PLANKS, Items.BIRCH_LOG, Items.BIRCH_WOOD, Items.STRIPPED_BIRCH_LOG, Items.STRIPPED_BIRCH_WOOD, Items.BIRCH_SHELF);
        registerLogFamily(Items.JUNGLE_PLANKS, Items.JUNGLE_LOG, Items.JUNGLE_WOOD, Items.STRIPPED_JUNGLE_LOG, Items.STRIPPED_JUNGLE_WOOD, Items.JUNGLE_SHELF);
        registerLogFamily(Items.ACACIA_PLANKS, Items.ACACIA_LOG, Items.ACACIA_WOOD, Items.STRIPPED_ACACIA_LOG, Items.STRIPPED_ACACIA_WOOD, Items.ACACIA_SHELF);
        registerLogFamily(Items.DARK_OAK_PLANKS, Items.DARK_OAK_LOG, Items.DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_WOOD, Items.DARK_OAK_SHELF);
        registerLogFamily(Items.MANGROVE_PLANKS, Items.MANGROVE_LOG, Items.MANGROVE_WOOD, Items.STRIPPED_MANGROVE_LOG, Items.STRIPPED_MANGROVE_WOOD, Items.MANGROVE_SHELF);
        registerLogFamily(Items.CHERRY_PLANKS, Items.CHERRY_LOG, Items.CHERRY_WOOD, Items.STRIPPED_CHERRY_LOG, Items.STRIPPED_CHERRY_WOOD, Items.CHERRY_SHELF);
        registerLogFamily(Items.CRIMSON_PLANKS, Items.CRIMSON_STEM, Items.CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_STEM, Items.STRIPPED_CRIMSON_HYPHAE, Items.CRIMSON_SHELF);
        registerLogFamily(Items.WARPED_PLANKS, Items.WARPED_STEM, Items.WARPED_HYPHAE, Items.STRIPPED_WARPED_STEM, Items.STRIPPED_WARPED_HYPHAE, Items.WARPED_SHELF);
        registerLogFamily(Items.PALE_OAK_PLANKS, Items.PALE_OAK_LOG, Items.PALE_OAK_WOOD, Items.STRIPPED_PALE_OAK_LOG, Items.STRIPPED_PALE_OAK_WOOD, Items.PALE_OAK_SHELF);
        registerLogFamily(Items.POPLAR_PLANKS, Items.POPLAR_LOG, Items.POPLAR_WOOD, Items.STRIPPED_POPLAR_LOG, Items.STRIPPED_POPLAR_WOOD, Items.POPLAR_SHELF);

        // Bamboo math
        addRecipe(Items.BAMBOO_PLANKS, Items.BAMBOO_BLOCK, 2, 1);
        addRecipe(Items.BAMBOO_PLANKS, Items.STRIPPED_BAMBOO_BLOCK, 2, 1);
        addRecipe(Items.BAMBOO_PLANKS, Items.BAMBOO_SHELF, 2, 1);

        // === MAJOR STONE FAMILIES ===
        registerStoneFamily(Items.STONE, Items.STONE_STAIRS, Items.STONE_SLAB, null);
        addRecipe(Items.STONE, Items.STONE_BUTTON, 1, 1);
        addRecipe(Items.STONE, Items.STONE_PRESSURE_PLATE, 2, 1);
        addRecipe(Items.STONE, Items.SMOOTH_STONE, 1, 1);
        addRecipe(Items.STONE, Items.SMOOTH_STONE_SLAB, 1, 2);

        registerStoneFamily(Items.COBBLESTONE, Items.COBBLESTONE_STAIRS, Items.COBBLESTONE_SLAB, Items.COBBLESTONE_WALL);
        registerStoneFamily(Items.MOSSY_COBBLESTONE, Items.MOSSY_COBBLESTONE_STAIRS, Items.MOSSY_COBBLESTONE_SLAB, Items.MOSSY_COBBLESTONE_WALL);

        // Stone Bricks & Chiseled Variant
        registerStoneFamily(Items.STONE_BRICKS, Items.STONE_BRICK_STAIRS, Items.STONE_BRICK_SLAB, Items.STONE_BRICK_WALL);
        addRecipe(Items.STONE_BRICKS, Items.CHISELED_STONE_BRICKS, 1, 1);

        registerStoneFamily(Items.MOSSY_STONE_BRICKS, Items.MOSSY_STONE_BRICK_STAIRS, Items.MOSSY_STONE_BRICK_SLAB, Items.MOSSY_STONE_BRICK_WALL);

        // Deepslate & Chiseled Variant
        registerStoneFamily(Items.DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICK_STAIRS, Items.DEEPSLATE_BRICK_SLAB, Items.DEEPSLATE_BRICK_WALL);
        addRecipe(Items.DEEPSLATE_BRICKS, Items.CHISELED_DEEPSLATE, 1, 1);

        registerStoneFamily(Items.COBBLED_DEEPSLATE, Items.COBBLED_DEEPSLATE_STAIRS, Items.COBBLED_DEEPSLATE_SLAB, Items.COBBLED_DEEPSLATE_WALL);
        registerStoneFamily(Items.POLISHED_DEEPSLATE, Items.POLISHED_DEEPSLATE_STAIRS, Items.POLISHED_DEEPSLATE_SLAB, Items.POLISHED_DEEPSLATE_WALL);
        registerStoneFamily(Items.DEEPSLATE_TILES, Items.DEEPSLATE_TILE_STAIRS, Items.DEEPSLATE_TILE_SLAB, Items.DEEPSLATE_TILE_WALL);
        registerStoneFamily(Items.BLACKSTONE, Items.BLACKSTONE_STAIRS, Items.BLACKSTONE_SLAB, Items.BLACKSTONE_WALL);
        registerStoneFamily(Items.POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE_BRICK_STAIRS, Items.POLISHED_BLACKSTONE_BRICK_SLAB, Items.POLISHED_BLACKSTONE_BRICK_WALL);
        registerStoneFamily(Items.BRICKS, Items.BRICK_STAIRS, Items.BRICK_SLAB, Items.BRICK_WALL);

        // Polished Blackstone & Chiseled Variant
        registerStoneFamily(Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_STAIRS, Items.POLISHED_BLACKSTONE_SLAB, Items.POLISHED_BLACKSTONE_WALL);
        addRecipe(Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_BUTTON, 1, 1);
        addRecipe(Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, 2, 1);
        addRecipe(Items.POLISHED_BLACKSTONE, Items.CHISELED_POLISHED_BLACKSTONE, 1, 1);

        // === SANDSTONE ===
        registerStoneFamily(Items.SANDSTONE, Items.SANDSTONE_STAIRS, Items.SANDSTONE_SLAB, Items.SANDSTONE_WALL);
        addRecipe(Items.SANDSTONE, Items.SAND, 1, 4);
        addRecipe(Items.SANDSTONE, Items.CUT_SANDSTONE, 1, 1);
        addRecipe(Items.SANDSTONE, Items.CHISELED_SANDSTONE, 1, 1);
        addRecipe(Items.SANDSTONE, Items.SMOOTH_SANDSTONE, 1, 1);
        addRecipe(Items.SANDSTONE, Items.SMOOTH_SANDSTONE_STAIRS, 1, 1);
        addRecipe(Items.SANDSTONE, Items.SMOOTH_SANDSTONE_SLAB, 1, 2);
        addRecipe(Items.SANDSTONE, Items.CUT_STANDSTONE_SLAB, 1, 2);

        // === RED SANDSTONE ===
        registerStoneFamily(Items.RED_SANDSTONE, Items.RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE_SLAB, Items.RED_SANDSTONE_WALL);
        addRecipe(Items.RED_SANDSTONE, Items.RED_SAND, 1, 4);
        addRecipe(Items.RED_SANDSTONE, Items.CUT_RED_SANDSTONE, 1, 1);
        addRecipe(Items.RED_SANDSTONE, Items.CUT_RED_SANDSTONE_SLAB, 1, 2);
        addRecipe(Items.RED_SANDSTONE, Items.CHISELED_RED_SANDSTONE, 1, 1);
        addRecipe(Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, 1, 1);
        addRecipe(Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE_STAIRS, 1, 1);
        addRecipe(Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE_SLAB, 1, 2);

        // === QUARTZ ===
        registerStoneFamily(Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS, Items.QUARTZ_SLAB, null);
        addRecipe(Items.QUARTZ_BLOCK, Items.QUARTZ, 1, 4);
        addRecipe(Items.QUARTZ_BLOCK, Items.CHISELED_QUARTZ_BLOCK, 1, 1);
        addRecipe(Items.QUARTZ_BLOCK, Items.QUARTZ_BRICKS, 1, 1);
        addRecipe(Items.QUARTZ_BLOCK, Items.QUARTZ_PILLAR, 1, 1);
        addRecipe(Items.QUARTZ_BLOCK, Items.SMOOTH_QUARTZ, 1, 1);
        addRecipe(Items.QUARTZ_BLOCK, Items.SMOOTH_QUARTZ_STAIRS, 1, 1);
        addRecipe(Items.QUARTZ_BLOCK, Items.SMOOTH_QUARTZ_SLAB, 1, 2);

        // === RESIN ===
        registerStoneFamily(Items.RESIN_BLOCK, null, null, null);
        addRecipe(Items.RESIN_BLOCK, Items.RESIN_CLUMP, 1, 9);
        addRecipe(Items.RESIN_BLOCK, Items.RESIN_BRICKS, 1, 1);
        addRecipe(Items.RESIN_BLOCK, Items.RESIN_BRICK_STAIRS, 1, 1);
        addRecipe(Items.RESIN_BLOCK, Items.RESIN_BRICK_SLAB, 1, 2);
        addRecipe(Items.RESIN_BLOCK, Items.RESIN_BRICK_WALL, 1, 1);
        addRecipe(Items.RESIN_BLOCK, Items.CHISELED_RESIN_BRICKS, 1, 1);

        // === IGNEOUS ROCKS ===
        registerStoneFamily(Items.GRANITE, Items.GRANITE_STAIRS, Items.GRANITE_SLAB, Items.GRANITE_WALL);
        registerStoneFamily(Items.POLISHED_GRANITE, Items.POLISHED_GRANITE_STAIRS, Items.POLISHED_GRANITE_SLAB, null);
        registerStoneFamily(Items.DIORITE, Items.DIORITE_STAIRS, Items.DIORITE_SLAB, Items.DIORITE_WALL);
        registerStoneFamily(Items.POLISHED_DIORITE, Items.POLISHED_DIORITE_STAIRS, Items.POLISHED_DIORITE_SLAB, null);
        registerStoneFamily(Items.ANDESITE, Items.ANDESITE_STAIRS, Items.ANDESITE_SLAB, Items.ANDESITE_WALL);
        registerStoneFamily(Items.POLISHED_ANDESITE, Items.POLISHED_ANDESITE_STAIRS, Items.POLISHED_ANDESITE_SLAB, null);

        // === PRISMARINE & OCEAN ===
        registerStoneFamily(Items.PRISMARINE, Items.PRISMARINE_STAIRS, Items.PRISMARINE_SLAB, Items.PRISMARINE_WALL);
        registerStoneFamily(Items.PRISMARINE_BRICKS, Items.PRISMARINE_BRICK_STAIRS, Items.PRISMARINE_BRICK_SLAB, null);
        registerStoneFamily(Items.DARK_PRISMARINE, Items.DARK_PRISMARINE_STAIRS, Items.DARK_PRISMARINE_SLAB, null);

        // === NETHER & END ===
        registerStoneFamily(Items.NETHER_BRICKS, Items.NETHER_BRICK_STAIRS, Items.NETHER_BRICK_SLAB, Items.NETHER_BRICK_WALL);
        addRecipe(Items.NETHER_BRICKS, Items.NETHER_BRICK_FENCE, 1, 1);
        addRecipe(Items.NETHER_BRICKS, Items.CHISELED_NETHER_BRICKS, 1, 1);

        registerStoneFamily(Items.RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_STAIRS, Items.RED_NETHER_BRICK_SLAB, Items.RED_NETHER_BRICK_WALL);
        registerStoneFamily(Items.END_STONE_BRICKS, Items.END_STONE_BRICK_STAIRS, Items.END_STONE_BRICK_SLAB, Items.END_STONE_BRICK_WALL);
        registerStoneFamily(Items.PURPUR_BLOCK, Items.PURPUR_STAIRS, Items.PURPUR_SLAB, null);
        addRecipe(Items.PURPUR_BLOCK, Items.PURPUR_PILLAR, 1, 1);

        // === Mud, Bamboo, Tuff ===
        addRecipe(Items.BAMBOO_PLANKS, Items.BAMBOO_MOSAIC, 1, 1);
        addRecipe(Items.BAMBOO_PLANKS, Items.BAMBOO_MOSAIC_STAIRS, 1, 1);
        addRecipe(Items.BAMBOO_PLANKS, Items.BAMBOO_MOSAIC_SLAB, 1, 2);

        registerStoneFamily(Items.MUD_BRICKS, Items.MUD_BRICK_STAIRS, Items.MUD_BRICK_SLAB, Items.MUD_BRICK_WALL);
        addRecipe(Items.MUD, Items.DIRT, 1, 1);

        registerStoneFamily(Items.TUFF, Items.TUFF_STAIRS, Items.TUFF_SLAB, Items.TUFF_WALL);
        addRecipe(Items.TUFF, Items.CHISELED_TUFF, 1, 1);

        registerStoneFamily(Items.POLISHED_TUFF, Items.POLISHED_TUFF_STAIRS, Items.POLISHED_TUFF_SLAB, Items.POLISHED_TUFF_WALL);

        registerStoneFamily(Items.TUFF_BRICKS, Items.TUFF_BRICK_STAIRS, Items.TUFF_BRICK_SLAB, Items.TUFF_BRICK_WALL);
        addRecipe(Items.TUFF_BRICKS, Items.CHISELED_TUFF_BRICKS, 1, 1);

        // === CHAOS CUBED UPDATE (Sulfur Caves) ===
        registerStoneFamily(Items.CINNABAR, Items.CINNABAR_STAIRS, Items.CINNABAR_SLAB, Items.CINNABAR_WALL);
        registerStoneFamily(Items.POLISHED_CINNABAR, Items.POLISHED_CINNABAR_STAIRS, Items.POLISHED_CINNABAR_SLAB, Items.POLISHED_CINNABAR_WALL);
        registerStoneFamily(Items.CINNABAR_BRICKS, Items.CINNABAR_BRICK_STAIRS, Items.CINNABAR_BRICK_SLAB, Items.CINNABAR_BRICK_WALL);
        addRecipe(Items.CINNABAR_BRICKS, Items.CHISELED_CINNABAR, 1, 1);

        registerStoneFamily(Items.SULFUR, Items.SULFUR_STAIRS, Items.SULFUR_SLAB, Items.SULFUR_WALL);
        registerStoneFamily(Items.POLISHED_SULFUR, Items.POLISHED_SULFUR_STAIRS, Items.POLISHED_SULFUR_SLAB, Items.POLISHED_SULFUR_WALL);
        registerStoneFamily(Items.SULFUR_BRICKS, Items.SULFUR_BRICK_STAIRS, Items.SULFUR_BRICK_SLAB, Items.SULFUR_BRICK_WALL);
        addRecipe(Items.SULFUR_BRICKS, Items.CHISELED_SULFUR, 1, 1);

        // === UNWAXED COPPER ===
        registerCopperFamily(Items.COPPER_BLOCK.weathering().unaffected(), Items.CUT_COPPER.weathering().unaffected(), Items.CHISELED_COPPER.weathering().unaffected(), Items.COPPER_GRATE.weathering().unaffected(), Items.COPPER_BULB.weathering().unaffected(), Items.CUT_COPPER_STAIRS.weathering().unaffected(), Items.CUT_COPPER_SLAB.weathering().unaffected());
        registerCopperFamily(Items.COPPER_BLOCK.weathering().exposed(), Items.CUT_COPPER.weathering().exposed(), Items.CHISELED_COPPER.weathering().exposed(), Items.COPPER_GRATE.weathering().exposed(), Items.COPPER_BULB.weathering().exposed(), Items.CUT_COPPER_STAIRS.weathering().exposed(), Items.CUT_COPPER_SLAB.weathering().exposed());
        registerCopperFamily(Items.COPPER_BLOCK.weathering().weathered(), Items.CUT_COPPER.weathering().weathered(), Items.CHISELED_COPPER.weathering().weathered(), Items.COPPER_GRATE.weathering().weathered(), Items.COPPER_BULB.weathering().weathered(), Items.CUT_COPPER_STAIRS.weathering().weathered(), Items.CUT_COPPER_SLAB.weathering().weathered());
        registerCopperFamily(Items.COPPER_BLOCK.weathering().oxidized(), Items.CUT_COPPER.weathering().oxidized(), Items.CHISELED_COPPER.weathering().oxidized(), Items.COPPER_GRATE.weathering().oxidized(), Items.COPPER_BULB.weathering().oxidized(), Items.CUT_COPPER_STAIRS.weathering().oxidized(), Items.CUT_COPPER_SLAB.weathering().oxidized());

        // === WAXED COPPER ===
        registerCopperFamily(Items.COPPER_BLOCK.waxed().unaffected(), Items.CUT_COPPER.waxed().unaffected(), Items.CHISELED_COPPER.waxed().unaffected(), Items.COPPER_GRATE.waxed().unaffected(), Items.COPPER_BULB.waxed().unaffected(), Items.CUT_COPPER_STAIRS.waxed().unaffected(), Items.CUT_COPPER_SLAB.waxed().unaffected());
        registerCopperFamily(Items.COPPER_BLOCK.waxed().exposed(), Items.CUT_COPPER.waxed().exposed(), Items.CHISELED_COPPER.waxed().exposed(), Items.COPPER_GRATE.waxed().exposed(), Items.COPPER_BULB.waxed().exposed(), Items.CUT_COPPER_STAIRS.waxed().exposed(), Items.CUT_COPPER_SLAB.waxed().exposed());
        registerCopperFamily(Items.COPPER_BLOCK.waxed().weathered(), Items.CUT_COPPER.waxed().weathered(), Items.CHISELED_COPPER.waxed().weathered(), Items.COPPER_GRATE.waxed().weathered(), Items.COPPER_BULB.waxed().weathered(), Items.CUT_COPPER_STAIRS.waxed().weathered(), Items.CUT_COPPER_SLAB.waxed().weathered());
        registerCopperFamily(Items.COPPER_BLOCK.waxed().oxidized(), Items.CUT_COPPER.waxed().oxidized(), Items.CHISELED_COPPER.waxed().oxidized(), Items.COPPER_GRATE.waxed().oxidized(), Items.COPPER_BULB.waxed().oxidized(), Items.CUT_COPPER_STAIRS.waxed().oxidized(), Items.CUT_COPPER_SLAB.waxed().oxidized());

        // === IRON & COPPER DOORS / TRAPDOORS ===
        registerMetalFamily(Items.IRON_INGOT, Items.IRON_DOOR, Items.IRON_TRAPDOOR);
        addRecipe(Items.IRON_INGOT, Items.IRON_BARS, 3, 8);
        addRecipe(Items.IRON_INGOT, Items.HEAVY_WEIGHTED_PRESSURE_PLATE, 2, 1);

        registerMetalFamily(Items.COPPER_INGOT, Items.COPPER_DOOR.weathering().unaffected(), Items.COPPER_TRAPDOOR.weathering().unaffected());
        registerMetalFamily(Items.COPPER_INGOT, Items.COPPER_DOOR.weathering().exposed(), Items.COPPER_TRAPDOOR.weathering().exposed());
        registerMetalFamily(Items.COPPER_INGOT, Items.COPPER_DOOR.weathering().weathered(), Items.COPPER_TRAPDOOR.weathering().weathered());
        registerMetalFamily(Items.COPPER_INGOT, Items.COPPER_DOOR.weathering().oxidized(), Items.COPPER_TRAPDOOR.weathering().oxidized());
        registerMetalFamily(Items.COPPER_INGOT, Items.COPPER_DOOR.waxed().unaffected(), Items.COPPER_TRAPDOOR.waxed().unaffected());
        registerMetalFamily(Items.COPPER_INGOT, Items.COPPER_DOOR.waxed().exposed(), Items.COPPER_TRAPDOOR.waxed().exposed());
        registerMetalFamily(Items.COPPER_INGOT, Items.COPPER_DOOR.waxed().weathered(), Items.COPPER_TRAPDOOR.waxed().weathered());
        registerMetalFamily(Items.COPPER_INGOT, Items.COPPER_DOOR.waxed().oxidized(), Items.COPPER_TRAPDOOR.waxed().oxidized());

        // === ALL COLORS ===
        registerColorFamily(Items.WOOL.white(), Items.CARPET.white(), Items.WOOL_STAIRS.white(), Items.WOOL_SLAB.white(), Items.STAINED_GLASS.white(), Items.STAINED_GLASS_PANE.white());
        registerColorFamily(Items.WOOL.orange(), Items.CARPET.orange(), Items.WOOL_STAIRS.orange(), Items.WOOL_SLAB.orange(), Items.STAINED_GLASS.orange(), Items.STAINED_GLASS_PANE.orange());
        registerColorFamily(Items.WOOL.magenta(), Items.CARPET.magenta(), Items.WOOL_STAIRS.magenta(), Items.WOOL_SLAB.magenta(), Items.STAINED_GLASS.magenta(), Items.STAINED_GLASS_PANE.magenta());
        registerColorFamily(Items.WOOL.lightBlue(), Items.CARPET.lightBlue(), Items.WOOL_STAIRS.lightBlue(), Items.WOOL_SLAB.lightBlue(), Items.STAINED_GLASS.lightBlue(), Items.STAINED_GLASS_PANE.lightBlue());
        registerColorFamily(Items.WOOL.yellow(), Items.CARPET.yellow(), Items.WOOL_STAIRS.yellow(), Items.WOOL_SLAB.yellow(), Items.STAINED_GLASS.yellow(), Items.STAINED_GLASS_PANE.yellow());
        registerColorFamily(Items.WOOL.lime(), Items.CARPET.lime(), Items.WOOL_STAIRS.lime(), Items.WOOL_SLAB.lime(), Items.STAINED_GLASS.lime(), Items.STAINED_GLASS_PANE.lime());
        registerColorFamily(Items.WOOL.pink(), Items.CARPET.pink(), Items.WOOL_STAIRS.pink(), Items.WOOL_SLAB.pink(), Items.STAINED_GLASS.pink(), Items.STAINED_GLASS_PANE.pink());
        registerColorFamily(Items.WOOL.gray(), Items.CARPET.gray(), Items.WOOL_STAIRS.gray(), Items.WOOL_SLAB.gray(), Items.STAINED_GLASS.gray(), Items.STAINED_GLASS_PANE.gray());
        registerColorFamily(Items.WOOL.lightGray(), Items.CARPET.lightGray(), Items.WOOL_STAIRS.lightGray(), Items.WOOL_SLAB.lightGray(), Items.STAINED_GLASS.lightGray(), Items.STAINED_GLASS_PANE.lightGray());
        registerColorFamily(Items.WOOL.cyan(), Items.CARPET.cyan(), Items.WOOL_STAIRS.cyan(), Items.WOOL_SLAB.cyan(), Items.STAINED_GLASS.cyan(), Items.STAINED_GLASS_PANE.cyan());
        registerColorFamily(Items.WOOL.purple(), Items.CARPET.purple(), Items.WOOL_STAIRS.purple(), Items.WOOL_SLAB.purple(), Items.STAINED_GLASS.purple(), Items.STAINED_GLASS_PANE.purple());
        registerColorFamily(Items.WOOL.blue(), Items.CARPET.blue(), Items.WOOL_STAIRS.blue(), Items.WOOL_SLAB.blue(), Items.STAINED_GLASS.blue(), Items.STAINED_GLASS_PANE.blue());
        registerColorFamily(Items.WOOL.brown(), Items.CARPET.brown(), Items.WOOL_STAIRS.brown(), Items.WOOL_SLAB.brown(), Items.STAINED_GLASS.brown(), Items.STAINED_GLASS_PANE.brown());
        registerColorFamily(Items.WOOL.green(), Items.CARPET.green(), Items.WOOL_STAIRS.green(), Items.WOOL_SLAB.green(), Items.STAINED_GLASS.green(), Items.STAINED_GLASS_PANE.green());
        registerColorFamily(Items.WOOL.red(), Items.CARPET.red(), Items.WOOL_STAIRS.red(), Items.WOOL_SLAB.red(), Items.STAINED_GLASS.red(), Items.STAINED_GLASS_PANE.red());
        registerColorFamily(Items.WOOL.black(), Items.CARPET.black(), Items.WOOL_STAIRS.black(), Items.WOOL_SLAB.black(), Items.STAINED_GLASS.black(), Items.STAINED_GLASS_PANE.black());

        // === CONCRETE ===
        registerConcreteFamily(Items.CONCRETE_POWDER.white(), Items.CONCRETE.white(), Items.CONCRETE_STAIRS.white(), Items.CONCRETE_SLAB.white());
        registerConcreteFamily(Items.CONCRETE_POWDER.orange(), Items.CONCRETE.orange(), Items.CONCRETE_STAIRS.orange(), Items.CONCRETE_SLAB.orange());
        registerConcreteFamily(Items.CONCRETE_POWDER.magenta(), Items.CONCRETE.magenta(), Items.CONCRETE_STAIRS.magenta(), Items.CONCRETE_SLAB.magenta());
        registerConcreteFamily(Items.CONCRETE_POWDER.lightBlue(), Items.CONCRETE.lightBlue(), Items.CONCRETE_STAIRS.lightBlue(), Items.CONCRETE_SLAB.lightBlue());
        registerConcreteFamily(Items.CONCRETE_POWDER.yellow(), Items.CONCRETE.yellow(), Items.CONCRETE_STAIRS.yellow(), Items.CONCRETE_SLAB.yellow());
        registerConcreteFamily(Items.CONCRETE_POWDER.lime(), Items.CONCRETE.lime(), Items.CONCRETE_STAIRS.lime(), Items.CONCRETE_SLAB.lime());
        registerConcreteFamily(Items.CONCRETE_POWDER.pink(), Items.CONCRETE.pink(), Items.CONCRETE_STAIRS.pink(), Items.CONCRETE_SLAB.pink());
        registerConcreteFamily(Items.CONCRETE_POWDER.gray(), Items.CONCRETE.gray(), Items.CONCRETE_STAIRS.gray(), Items.CONCRETE_SLAB.gray());
        registerConcreteFamily(Items.CONCRETE_POWDER.lightGray(), Items.CONCRETE.lightGray(), Items.CONCRETE_STAIRS.lightGray(), Items.CONCRETE_SLAB.lightGray());
        registerConcreteFamily(Items.CONCRETE_POWDER.cyan(), Items.CONCRETE.cyan(), Items.CONCRETE_STAIRS.cyan(), Items.CONCRETE_SLAB.cyan());
        registerConcreteFamily(Items.CONCRETE_POWDER.purple(), Items.CONCRETE.purple(), Items.CONCRETE_STAIRS.purple(), Items.CONCRETE_SLAB.purple());
        registerConcreteFamily(Items.CONCRETE_POWDER.blue(), Items.CONCRETE.blue(), Items.CONCRETE_STAIRS.blue(), Items.CONCRETE_SLAB.blue());
        registerConcreteFamily(Items.CONCRETE_POWDER.brown(), Items.CONCRETE.brown(), Items.CONCRETE_STAIRS.brown(), Items.CONCRETE_SLAB.brown());
        registerConcreteFamily(Items.CONCRETE_POWDER.green(), Items.CONCRETE.green(), Items.CONCRETE_STAIRS.green(), Items.CONCRETE_SLAB.green());
        registerConcreteFamily(Items.CONCRETE_POWDER.red(), Items.CONCRETE.red(), Items.CONCRETE_STAIRS.red(), Items.CONCRETE_SLAB.red());
        registerConcreteFamily(Items.CONCRETE_POWDER.black(), Items.CONCRETE.black(), Items.CONCRETE_STAIRS.black(), Items.CONCRETE_SLAB.black());

        // === CRACKED VARIANTS (1:1 Smelting Bypass) ===
        addRecipe(Items.STONE_BRICKS, Items.CRACKED_STONE_BRICKS, 1, 1);
        addRecipe(Items.DEEPSLATE_BRICKS, Items.CRACKED_DEEPSLATE_BRICKS, 1, 1);
        addRecipe(Items.DEEPSLATE_TILES, Items.CRACKED_DEEPSLATE_TILES, 1, 1);
        addRecipe(Items.POLISHED_BLACKSTONE_BRICKS, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, 1, 1);
        addRecipe(Items.NETHER_BRICKS, Items.CRACKED_NETHER_BRICKS, 1, 1);
    }

    // --- HELPER METHODS ---

    private static void registerWoodFamily(Item planks, Item stairs, Item slab, Item fence, Item gate, Item door, Item trapdoor, Item sign, Item hangingSign, Item button, Item pressurePlate) {
        if (stairs != null) addRecipe(planks, stairs, 1, 1);
        if (slab != null) addRecipe(planks, slab, 1, 2);
        if (fence != null) addRecipe(planks, fence, 1, 1);
        if (gate != null) addRecipe(planks, gate, 2, 1);
        if (door != null) addRecipe(planks, door, 2, 1);
        if (trapdoor != null) addRecipe(planks, trapdoor, 3, 1);
        if (sign != null) addRecipe(planks, sign, 2, 1);
        if (hangingSign != null) addRecipe(planks, hangingSign, 1, 1);
        if (button != null) addRecipe(planks, button, 1, 1);
        if (pressurePlate != null) addRecipe(planks, pressurePlate, 2, 1);
    }

    private static void registerLogFamily(Item planks, Item log, Item wood, Item strippedLog, Item strippedWood, Item shelf) {
        if (log != null) addRecipe(planks, log, 4, 1);
        if (wood != null) addRecipe(planks, wood, 16, 3);
        if (strippedLog != null) addRecipe(planks, strippedLog, 4, 1);
        if (strippedWood != null) addRecipe(planks, strippedWood, 16, 3);
        if (shelf != null) addRecipe(planks, shelf, 4, 1);
    }

    private static void registerStoneFamily(Item base, Item stairs, Item slab, Item wall) {
        if (stairs != null) addRecipe(base, stairs, 1, 1);
        if (slab != null) addRecipe(base, slab, 1, 2);
        if (wall != null) addRecipe(base, wall, 1, 1);
    }

    private static void registerColorFamily(Item wool, Item carpet, Item woolStairs, Item woolSlab, Item glass, Item pane) {
        if (carpet != null) addRecipe(wool, carpet, 2, 3);
        if (woolStairs != null) addRecipe(wool, woolStairs, 1, 1);
        if (woolSlab != null) addRecipe(wool, woolSlab, 1, 2);
        if (pane != null) addRecipe(glass, pane, 3, 8);
    }

    private static void registerConcreteFamily(Item powder, Item concrete, Item stairs, Item slab) {
        if (concrete != null) addRecipe(powder, concrete, 1, 1);
        if (stairs != null) addRecipe(powder, stairs, 1, 1);
        if (slab != null) addRecipe(powder, slab, 1, 2);
    }

    private static void registerCopperFamily(Item copperBlock, Item cut, Item chiseled, Item grate, Item bulb, Item stairs, Item slab) {
        if (cut != null) addRecipe(copperBlock, cut, 1, 4);
        if (chiseled != null) addRecipe(copperBlock, chiseled, 1, 4);
        if (grate != null) addRecipe(copperBlock, grate, 1, 4);
        if (bulb != null) addRecipe(copperBlock, bulb, 3, 4);
        if (stairs != null) addRecipe(copperBlock, stairs, 1, 4);
        if (slab != null) addRecipe(copperBlock, slab, 1, 8);
    }

    private static void registerMetalFamily(Item ingot, Item door, Item trapdoor) {
        if (door != null) addRecipe(ingot, door, 2, 1);
        if (trapdoor != null) addRecipe(ingot, trapdoor, 4, 1);
    }

    private static void addRecipe(Item base, Item variant, int cost, int yieldAmount) {
        RECIPES.add(new MorphDef(base, variant, cost, yieldAmount));
    }


    public static Item getBaseBlock(Item item) {
        for (MorphDef def : RECIPES) {
            if (def.variant == item) return def.baseItem;
        }
        return item;
    }

    public static List<Item> getFamily(Item baseItem) {
        List<Item> family = new ArrayList<>();
        family.add(baseItem);
        for (MorphDef def : RECIPES) {
            if (def.baseItem == baseItem) family.add(def.variant);
        }
        return family;
    }

    public static MorphDef getDef(Item base, Item variant) {
        for (MorphDef def : RECIPES) {
            if (def.baseItem == base && def.variant == variant) return def;
        }
        return null;
    }
}