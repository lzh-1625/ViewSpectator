package top.xcon.where;

import org.bukkit.Material;
import org.bukkit.block.Block;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    static Map<Material, Color> blocksMap = new HashMap<>();


    public static void loadColors() {
        // Materials we don't want to use minecraft images for (could be because the
        // image provides a poor color)
        blocksMap.put(Material.TALL_GRASS, new Color(49, 101, 25));
        blocksMap.put(Material.LARGE_FERN, new Color(49, 101, 25));
        blocksMap.put(Material.FERN, new Color(49, 101, 25));
        blocksMap.put(Material.COBBLESTONE, new Color(130, 130, 130));
        blocksMap.put(Material.COBBLESTONE_STAIRS, new Color(130, 130, 130));
        blocksMap.put(Material.COBBLESTONE_SLAB, new Color(130, 130, 130));
        blocksMap.put(Material.FURNACE, new Color(130, 130, 130));
        blocksMap.put(Material.STONE, new Color(117, 117, 117));
        blocksMap.put(Material.STONE_SLAB, new Color(117, 117, 117));
        blocksMap.put(Material.IRON_ORE, new Color(117, 117, 117));
        blocksMap.put(Material.GOLD_ORE, new Color(117, 117, 117));
        blocksMap.put(Material.REDSTONE_ORE, new Color(117, 117, 117));
        blocksMap.put(Material.DIAMOND_ORE, new Color(117, 117, 117));
        blocksMap.put(Material.COAL_ORE, new Color(117, 117, 117));
        blocksMap.put(Material.EMERALD_ORE, new Color(117, 117, 117));
        blocksMap.put(Material.LAPIS_ORE, new Color(117, 117, 117));
        blocksMap.put(Material.IRON_BLOCK, new Color(236, 236, 236));
        blocksMap.put(Material.GOLD_BLOCK, new Color(243, 223, 75));
        blocksMap.put(Material.REDSTONE_BLOCK, new Color(196, 25, 16));
        blocksMap.put(Material.DIAMOND_BLOCK, new Color(95, 233, 217));
        blocksMap.put(Material.COAL_BLOCK, new Color(19, 19, 19));
        blocksMap.put(Material.EMERALD_BLOCK, new Color(71, 213, 105));
        blocksMap.put(Material.LAPIS_BLOCK, new Color(42, 80, 139));
        blocksMap.put(Material.WATER, new Color(67, 101, 165));
        blocksMap.put(Material.SEAGRASS, new Color(67, 101, 165));
        blocksMap.put(Material.BUBBLE_COLUMN, new Color(67, 101, 165));
        blocksMap.put(Material.TALL_SEAGRASS, new Color(67, 101, 165));
        blocksMap.put(Material.KELP, new Color(67, 101, 165));
        blocksMap.put(Material.GRASS_BLOCK, new Color(82, 129, 69));
        blocksMap.put(Material.DIRT, new Color(168, 120, 83));
        blocksMap.put(Material.SAND, new Color(222, 215, 172));
        blocksMap.put(Material.SANDSTONE, new Color(213, 207, 162));
        blocksMap.put(Material.ACACIA_LEAVES, new Color(44, 97, 22));
        blocksMap.put(Material.BIRCH_LEAVES, new Color(114, 149, 76));
        blocksMap.put(Material.DARK_OAK_LEAVES, new Color(46, 111, 17));
        blocksMap.put(Material.JUNGLE_LEAVES, new Color(60, 141, 24));
        blocksMap.put(Material.OAK_LEAVES, new Color(49, 111, 21));
        blocksMap.put(Material.SPRUCE_LEAVES, new Color(55, 91, 56));
        blocksMap.put(Material.COARSE_DIRT, new Color(104, 75, 51));
        blocksMap.put(Material.ANDESITE, new Color(136, 136, 138));
        blocksMap.put(Material.DIORITE, new Color(181, 181, 181));
        blocksMap.put(Material.DEAD_BUSH, new Color(144, 97, 39));
        blocksMap.put(Material.CACTUS, new Color(76, 107, 35));
        blocksMap.put(Material.DANDELION, new Color(247, 229, 77));
        blocksMap.put(Material.POPPY, new Color(230, 47, 43));
        blocksMap.put(Material.CORNFLOWER, new Color(70, 106, 235));
        blocksMap.put(Material.AZURE_BLUET, new Color(210, 215, 223));
        blocksMap.put(Material.OXEYE_DAISY, new Color(187, 188, 189));
        blocksMap.put(Material.LAVA, new Color(211, 124, 40));
        blocksMap.put(Material.GRANITE, new Color(156, 111, 91));
        blocksMap.put(Material.REDSTONE_LAMP, new Color(123, 73, 33));
        blocksMap.put(Material.GRAVEL, new Color(139, 135, 134));
        blocksMap.put(Material.SPRUCE_LOG, new Color(48, 34, 25));
        blocksMap.put(Material.OAK_LOG, new Color(58, 35, 9));
        blocksMap.put(Material.BIRCH_LOG, new Color(196, 195, 193));
        blocksMap.put(Material.JUNGLE_LOG, new Color(89, 76, 37));
        blocksMap.put(Material.ACACIA_LOG, new Color(95, 95, 85));
        blocksMap.put(Material.DARK_OAK_LOG, new Color(35, 27, 16));
        blocksMap.put(Material.SPRUCE_PLANKS, new Color(100, 78, 47));
        blocksMap.put(Material.OAK_PLANKS, new Color(172, 140, 88));
        blocksMap.put(Material.BIRCH_PLANKS, new Color(202, 185, 131));
        blocksMap.put(Material.JUNGLE_PLANKS, new Color(172, 124, 89));
        blocksMap.put(Material.ACACIA_PLANKS, new Color(178, 102, 60));
        blocksMap.put(Material.DARK_OAK_PLANKS, new Color(62, 41, 18));
        blocksMap.put(Material.SPRUCE_FENCE, new Color(100, 78, 47));
        blocksMap.put(Material.OAK_FENCE, new Color(172, 140, 88));
        blocksMap.put(Material.BIRCH_FENCE, new Color(202, 185, 131));
        blocksMap.put(Material.JUNGLE_FENCE, new Color(172, 124, 89));
        blocksMap.put(Material.ACACIA_FENCE, new Color(178, 102, 60));
        blocksMap.put(Material.DARK_OAK_FENCE, new Color(62, 41, 18));
        blocksMap.put(Material.SPRUCE_STAIRS, new Color(100, 78, 47));
        blocksMap.put(Material.OAK_STAIRS, new Color(172, 140, 88));
        blocksMap.put(Material.BIRCH_STAIRS, new Color(202, 185, 131));
        blocksMap.put(Material.JUNGLE_STAIRS, new Color(172, 124, 89));
        blocksMap.put(Material.ACACIA_STAIRS, new Color(178, 102, 60));
        blocksMap.put(Material.DARK_OAK_STAIRS, new Color(62, 41, 18));
        blocksMap.put(Material.SPRUCE_SLAB, new Color(100, 78, 47));
        blocksMap.put(Material.OAK_SLAB, new Color(172, 140, 88));
        blocksMap.put(Material.BIRCH_SLAB, new Color(202, 185, 131));
        blocksMap.put(Material.JUNGLE_SLAB, new Color(172, 124, 89));
        blocksMap.put(Material.ACACIA_SLAB, new Color(178, 102, 60));
        blocksMap.put(Material.DARK_OAK_SLAB, new Color(62, 41, 18));
        blocksMap.put(Material.CRAFTING_TABLE, new Color(172, 140, 88));
        blocksMap.put(Material.BOOKSHELF, new Color(172, 140, 88));
        blocksMap.put(Material.SUGAR_CANE, new Color(71, 139, 42));
        blocksMap.put(Material.BEDROCK, new Color(47, 47, 47));
        blocksMap.put(Material.TORCH, new Color(206, 173, 26));
        blocksMap.put(Material.WALL_TORCH, new Color(206, 173, 26));
        blocksMap.put(Material.PUMPKIN, new Color(222, 141, 28));
        blocksMap.put(Material.CARVED_PUMPKIN, new Color(222, 141, 28));
        blocksMap.put(Material.JACK_O_LANTERN, new Color(222, 141, 28));
        blocksMap.put(Material.TNT, new Color(203, 49, 26));
        blocksMap.put(Material.BLACK_WOOL, new Color(6, 7, 12));
        blocksMap.put(Material.WHITE_WOOL, new Color(225, 226, 228));
        blocksMap.put(Material.BLUE_WOOL, new Color(45, 50, 145));
        blocksMap.put(Material.BROWN_WOOL, new Color(105, 70, 39));
        blocksMap.put(Material.CYAN_WOOL, new Color(21, 139, 145));
        blocksMap.put(Material.GRAY_WOOL, new Color(64, 67, 72));
        blocksMap.put(Material.GREEN_WOOL, new Color(83, 108, 20));
        blocksMap.put(Material.LIGHT_BLUE_WOOL, new Color(121, 148, 202));
        blocksMap.put(Material.LIGHT_GRAY_WOOL, new Color(164, 168, 169));
        blocksMap.put(Material.LIME_WOOL, new Color(122, 198, 38));
        blocksMap.put(Material.MAGENTA_WOOL, new Color(188, 66, 179));
        blocksMap.put(Material.ORANGE_WOOL, new Color(240, 125, 30));
        blocksMap.put(Material.PINK_WOOL, new Color(242, 148, 177));
        blocksMap.put(Material.PURPLE_WOOL, new Color(129, 65, 182));
        blocksMap.put(Material.RED_WOOL, new Color(155, 53, 49));
        blocksMap.put(Material.YELLOW_WOOL, new Color(195, 182, 47));
        blocksMap.put(Material.BLACK_BANNER, new Color(6, 7, 12));
        blocksMap.put(Material.WHITE_BANNER, new Color(225, 226, 228));
        blocksMap.put(Material.BLUE_BANNER, new Color(45, 50, 145));
        blocksMap.put(Material.BROWN_BANNER, new Color(105, 70, 39));
        blocksMap.put(Material.CYAN_BANNER, new Color(21, 139, 145));
        blocksMap.put(Material.GRAY_BANNER, new Color(64, 67, 72));
        blocksMap.put(Material.GREEN_BANNER, new Color(83, 108, 20));
        blocksMap.put(Material.LIGHT_BLUE_BANNER, new Color(121, 148, 202));
        blocksMap.put(Material.LIGHT_GRAY_BANNER, new Color(164, 168, 169));
        blocksMap.put(Material.LIME_BANNER, new Color(122, 198, 38));
        blocksMap.put(Material.MAGENTA_BANNER, new Color(188, 66, 179));
        blocksMap.put(Material.ORANGE_BANNER, new Color(240, 125, 30));
        blocksMap.put(Material.PINK_BANNER, new Color(242, 148, 177));
        blocksMap.put(Material.PURPLE_BANNER, new Color(129, 65, 182));
        blocksMap.put(Material.RED_BANNER, new Color(155, 53, 49));
        blocksMap.put(Material.YELLOW_BANNER, new Color(195, 182, 47));
        blocksMap.put(Material.BLACK_WALL_BANNER, new Color(6, 7, 12));
        blocksMap.put(Material.WHITE_WALL_BANNER, new Color(225, 226, 228));
        blocksMap.put(Material.BLUE_WALL_BANNER, new Color(45, 50, 145));
        blocksMap.put(Material.BROWN_WALL_BANNER, new Color(105, 70, 39));
        blocksMap.put(Material.CYAN_WALL_BANNER, new Color(21, 139, 145));
        blocksMap.put(Material.GRAY_WALL_BANNER, new Color(64, 67, 72));
        blocksMap.put(Material.GREEN_WALL_BANNER, new Color(83, 108, 20));
        blocksMap.put(Material.LIGHT_BLUE_WALL_BANNER, new Color(121, 148, 202));
        blocksMap.put(Material.LIGHT_GRAY_WALL_BANNER, new Color(164, 168, 169));
        blocksMap.put(Material.LIME_WALL_BANNER, new Color(122, 198, 38));
        blocksMap.put(Material.MAGENTA_WALL_BANNER, new Color(188, 66, 179));
        blocksMap.put(Material.ORANGE_WALL_BANNER, new Color(240, 125, 30));
        blocksMap.put(Material.PINK_WALL_BANNER, new Color(242, 148, 177));
        blocksMap.put(Material.PURPLE_WALL_BANNER, new Color(129, 65, 182));
        blocksMap.put(Material.RED_WALL_BANNER, new Color(155, 53, 49));
        blocksMap.put(Material.YELLOW_WALL_BANNER, new Color(195, 182, 47));
        blocksMap.put(Material.BLACK_CONCRETE, new Color(7, 9, 14));
        blocksMap.put(Material.WHITE_CONCRETE, new Color(199, 202, 207));
        blocksMap.put(Material.BLUE_CONCRETE, new Color(42, 44, 133));
        blocksMap.put(Material.BROWN_CONCRETE, new Color(91, 57, 30));
        blocksMap.put(Material.CYAN_CONCRETE, new Color(20, 113, 129));
        blocksMap.put(Material.GRAY_CONCRETE, new Color(118, 119, 110));
        blocksMap.put(Material.GREEN_CONCRETE, new Color(88, 156, 25));
        blocksMap.put(Material.LIGHT_BLUE_CONCRETE, new Color(33, 130, 190));
        blocksMap.put(Material.LIGHT_GRAY_CONCRETE, new Color(111, 115, 116));
        blocksMap.put(Material.LIME_CONCRETE, new Color(90, 162, 23));
        blocksMap.put(Material.MAGENTA_CONCRETE, new Color(162, 47, 152));
        blocksMap.put(Material.ORANGE_CONCRETE, new Color(207, 81, 1));
        blocksMap.put(Material.PINK_CONCRETE, new Color(205, 95, 138));
        blocksMap.put(Material.PURPLE_CONCRETE, new Color(155, 45, 145));
        blocksMap.put(Material.RED_CONCRETE, new Color(136, 30, 33));
        blocksMap.put(Material.YELLOW_CONCRETE, new Color(222, 162, 19));
        blocksMap.put(Material.SNOW, new Color(232, 240, 239));
        blocksMap.put(Material.SNOW_BLOCK, new Color(232, 240, 239));
        blocksMap.put(Material.GLASS, new Color(255, 255, 255));
        blocksMap.put(Material.WHITE_STAINED_GLASS, new Color(255, 255, 255));
        blocksMap.put(Material.GLASS_PANE, new Color(255, 255, 255));
        blocksMap.put(Material.WHITE_STAINED_GLASS_PANE, new Color(255, 255, 255));
        blocksMap.put(Material.CAMPFIRE, new Color(206, 173, 26));
        blocksMap.put(Material.COMMAND_BLOCK, new Color(198, 126, 78));
        blocksMap.put(Material.BEACON, new Color(117, 221, 215));
        blocksMap.put(Material.BREWING_STAND, new Color(122, 103, 85));
        blocksMap.put(Material.BRICK, new Color(146, 100, 87));
        blocksMap.put(Material.CHORUS_FLOWER, new Color(134, 104, 134));
        blocksMap.put(Material.CHORUS_PLANT, new Color(96, 60, 96));
        blocksMap.put(Material.CLAY, new Color(159, 165, 177));
        blocksMap.put(Material.DRAGON_EGG, new Color(13, 10, 16));
        blocksMap.put(Material.END_ROD, new Color(220, 198, 204));
        blocksMap.put(Material.END_STONE, new Color(221, 224, 165));
        blocksMap.put(Material.FLOWER_POT, new Color(118, 65, 51));
        blocksMap.put(Material.GLOWSTONE, new Color(144, 118, 70));
        blocksMap.put(Material.ICE, new Color(125, 174, 255));
        blocksMap.put(Material.IRON_BARS, new Color(109, 107, 105));
        blocksMap.put(Material.IRON_TRAPDOOR, new Color(201, 201, 201));
        blocksMap.put(Material.KNOWLEDGE_BOOK, new Color(56, 77, 47));
        blocksMap.put(Material.LADDER, new Color(124, 97, 54));
        blocksMap.put(Material.LEVER, new Color(106, 89, 64));
        blocksMap.put(Material.NETHERRACK, new Color(111, 54, 53));
        blocksMap.put(Material.NETHER_BRICK, new Color(45, 23, 27));
        blocksMap.put(Material.NETHER_WART_BLOCK, new Color(117, 6, 7));
        blocksMap.put(Material.OBSIDIAN, new Color(20, 18, 30));
        blocksMap.put(Material.PRISMARINE_BRICKS, new Color(100, 160, 143));
        blocksMap.put(Material.PURPUR_BLOCK, new Color(166, 122, 166));
        blocksMap.put(Material.PURPUR_PILLAR, new Color(170, 127, 170));
        blocksMap.put(Material.RED_SAND, new Color(169, 88, 33));
        blocksMap.put(Material.SEA_LANTERN, new Color(173, 200, 191));
        blocksMap.put(Material.SOUL_SAND, new Color(85, 65, 52));
        blocksMap.put(Material.SPONGE, new Color(195, 196, 85));
        blocksMap.put(Material.STRUCTURE_BLOCK, new Color(89, 74, 90));
        blocksMap.put(Material.ACACIA_TRAPDOOR, new Color(136, 71, 40));
        blocksMap.put(Material.ANVIL, new Color(61, 61, 61));
        blocksMap.put(Material.BIRCH_TRAPDOOR, new Color(158, 139, 97));
        blocksMap.put(Material.BLACKSTONE, new Color(39, 34, 28));
        blocksMap.put(Material.BLACK_CONCRETE_POWDER, new Color(35, 37, 40));
        blocksMap.put(Material.BLACK_GLAZED_TERRACOTTA, new Color(44, 44, 50));
        blocksMap.put(Material.BLACK_SHULKER_BOX, new Color(29, 29, 33));
        blocksMap.put(Material.BLACK_STAINED_GLASS, new Color(25, 25, 25));
        blocksMap.put(Material.BLACK_TERRACOTTA, new Color(37, 22, 16));
        blocksMap.put(Material.BLUE_CONCRETE_POWDER, new Color(80, 83, 178));
        blocksMap.put(Material.BLUE_GLAZED_TERRACOTTA, new Color(35, 30, 67));
        blocksMap.put(Material.BLUE_ICE, new Color(108, 163, 253));
        blocksMap.put(Material.BLUE_SHULKER_BOX, new Color(47, 49, 149));
        blocksMap.put(Material.BLUE_STAINED_GLASS, new Color(51, 76, 178));
        blocksMap.put(Material.BLUE_TERRACOTTA, new Color(73, 58, 90));
        blocksMap.put(Material.BRAIN_CORAL_BLOCK, new Color(217, 98, 163));
        blocksMap.put(Material.BRICKS, new Color(177, 98, 77));
        blocksMap.put(Material.BROWN_CONCRETE_POWDER, new Color(113, 77, 47));
        blocksMap.put(Material.BROWN_GLAZED_TERRACOTTA, new Color(131, 84, 50));
        blocksMap.put(Material.BROWN_MUSHROOM_BLOCK, new Color(148, 109, 82));
        blocksMap.put(Material.BROWN_SHULKER_BOX, new Color(98, 61, 32));
        blocksMap.put(Material.BROWN_STAINED_GLASS, new Color(102, 76, 51));
        blocksMap.put(Material.BROWN_TERRACOTTA, new Color(77, 50, 36));
        blocksMap.put(Material.BUBBLE_CORAL_BLOCK, new Color(145, 22, 145));
        blocksMap.put(Material.CHISELED_NETHER_BRICKS, new Color(68, 36, 42));
        blocksMap.put(Material.CHISELED_POLISHED_BLACKSTONE, new Color(78, 75, 84));
        blocksMap.put(Material.CHISELED_QUARTZ_BLOCK, new Color(221, 217, 203));
        blocksMap.put(Material.CHISELED_RED_SANDSTONE, new Color(217, 123, 48));
        blocksMap.put(Material.CHISELED_SANDSTONE, new Color(237, 235, 203));
        blocksMap.put(Material.CHISELED_STONE_BRICKS, new Color(156, 153, 156));
        blocksMap.put(Material.COBWEB, new Color(196, 206, 210));
        blocksMap.put(Material.COMPARATOR, new Color(123, 125, 123));
        blocksMap.put(Material.CONDUIT, new Color(255, 255, 255));
        blocksMap.put(Material.CRACKED_NETHER_BRICKS, new Color(25, 13, 16));
        blocksMap.put(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, new Color(49, 44, 54));
        blocksMap.put(Material.CRACKED_STONE_BRICKS, new Color(99, 99, 99));
        blocksMap.put(Material.CRIMSON_NYLIUM, new Color(133, 66, 66));
        blocksMap.put(Material.CRIMSON_PLANKS, new Color(126, 58, 86));
        blocksMap.put(Material.CRIMSON_STEM, new Color(68, 33, 49));
        blocksMap.put(Material.CRIMSON_TRAPDOOR, new Color(92, 48, 66));
        blocksMap.put(Material.CRYING_OBSIDIAN, new Color(0, 0, 1));
        blocksMap.put(Material.CUT_RED_SANDSTONE, new Color(217, 123, 48));
        blocksMap.put(Material.CUT_SANDSTONE, new Color(237, 235, 203));
        blocksMap.put(Material.CYAN_CONCRETE_POWDER, new Color(37, 147, 157));
        blocksMap.put(Material.CYAN_GLAZED_TERRACOTTA, new Color(22, 156, 156));
        blocksMap.put(Material.CYAN_SHULKER_BOX, new Color(22, 128, 143));
        blocksMap.put(Material.CYAN_STAINED_GLASS, new Color(76, 127, 153));
        blocksMap.put(Material.CYAN_TERRACOTTA, new Color(85, 89, 90));
        blocksMap.put(Material.DARK_OAK_TRAPDOOR, new Color(73, 49, 22));
        blocksMap.put(Material.DARK_PRISMARINE, new Color(59, 130, 104));
        blocksMap.put(Material.DEAD_BRAIN_CORAL_BLOCK, new Color(134, 123, 119));
        blocksMap.put(Material.DEAD_BRAIN_CORAL_FAN, new Color(255, 255, 255));
        blocksMap.put(Material.DEAD_BUBBLE_CORAL_BLOCK, new Color(116, 106, 102));
        blocksMap.put(Material.DEAD_BUBBLE_CORAL_FAN, new Color(255, 255, 255));
        blocksMap.put(Material.DEAD_FIRE_CORAL_BLOCK, new Color(153, 147, 141));
        blocksMap.put(Material.DEAD_FIRE_CORAL_FAN, new Color(255, 255, 255));
        blocksMap.put(Material.DEAD_HORN_CORAL_BLOCK, new Color(134, 123, 119));
        blocksMap.put(Material.DEAD_HORN_CORAL_FAN, new Color(255, 255, 255));
        blocksMap.put(Material.LILY_PAD, new Color(59, 130, 104));
        blocksMap.put(Material.WHITE_CONCRETE_POWDER, new Color(255, 255, 255));
        blocksMap.put(Material.DEAD_TUBE_CORAL_BLOCK, new Color(134, 123, 119));
        blocksMap.put(Material.DEAD_TUBE_CORAL_FAN, new Color(255, 255, 255));
        blocksMap.put(Material.END_STONE_BRICKS, new Color(232, 244, 178));
        blocksMap.put(Material.FARMLAND, new Color(150, 108, 74));
        blocksMap.put(Material.FIRE_CORAL_BLOCK, new Color(198, 42, 55));
        blocksMap.put(Material.GILDED_BLACKSTONE, new Color(39, 34, 28));
        blocksMap.put(Material.GRAY_CONCRETE_POWDER, new Color(76, 80, 83));
        blocksMap.put(Material.GRAY_GLAZED_TERRACOTTA, new Color(54, 57, 61));
        blocksMap.put(Material.GRAY_SHULKER_BOX, new Color(59, 63, 66));
        blocksMap.put(Material.GRAY_STAINED_GLASS, new Color(76, 76, 76));
        blocksMap.put(Material.GRAY_TERRACOTTA, new Color(57, 42, 36));
        blocksMap.put(Material.GREEN_CONCRETE_POWDER, new Color(96, 120, 47));
        blocksMap.put(Material.GREEN_GLAZED_TERRACOTTA, new Color(102, 127, 51));
        blocksMap.put(Material.GREEN_SHULKER_BOX, new Color(81, 104, 31));
        blocksMap.put(Material.GREEN_STAINED_GLASS, new Color(102, 127, 51));
        blocksMap.put(Material.GREEN_TERRACOTTA, new Color(75, 82, 41));
        blocksMap.put(Material.HONEYCOMB_BLOCK, new Color(216, 120, 3));
        blocksMap.put(Material.HORN_CORAL_BLOCK, new Color(209, 179, 65));
        blocksMap.put(Material.ITEM_FRAME, new Color(41, 36, 34));
        blocksMap.put(Material.JUNGLE_TRAPDOOR, new Color(114, 80, 53));
        blocksMap.put(Material.LIGHT_BLUE_CONCRETE_POWDER, new Color(78, 188, 217));
        blocksMap.put(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, new Color(55, 57, 155));
        blocksMap.put(Material.LIGHT_BLUE_SHULKER_BOX, new Color(53, 172, 215));
        blocksMap.put(Material.LIGHT_BLUE_STAINED_GLASS, new Color(102, 153, 216));
        blocksMap.put(Material.LIGHT_BLUE_TERRACOTTA, new Color(111, 107, 137));
        blocksMap.put(Material.LIGHT_GRAY_CONCRETE_POWDER, new Color(138, 138, 130));
        blocksMap.put(Material.LIGHT_GRAY_GLAZED_TERRACOTTA, new Color(87, 105, 111));
        blocksMap.put(Material.LIGHT_GRAY_SHULKER_BOX, new Color(107, 107, 98));
        blocksMap.put(Material.LIGHT_GRAY_STAINED_GLASS, new Color(153, 153, 153));
        blocksMap.put(Material.LIGHT_GRAY_TERRACOTTA, new Color(135, 106, 97));
        blocksMap.put(Material.LILY_OF_THE_VALLEY, new Color(255, 255, 255));
        blocksMap.put(Material.LIME_CONCRETE_POWDER, new Color(119, 186, 41));
        blocksMap.put(Material.LIME_GLAZED_TERRACOTTA, new Color(255, 236, 157));
        blocksMap.put(Material.LIME_SHULKER_BOX, new Color(106, 183, 24));
        blocksMap.put(Material.LIME_STAINED_GLASS, new Color(127, 204, 25));
        blocksMap.put(Material.LIME_TERRACOTTA, new Color(100, 116, 51));
        blocksMap.put(Material.MAGENTA_CONCRETE_POWDER, new Color(178, 72, 170));
        blocksMap.put(Material.MAGENTA_GLAZED_TERRACOTTA, new Color(199, 78, 189));
        blocksMap.put(Material.MAGENTA_SHULKER_BOX, new Color(161, 44, 151));
        blocksMap.put(Material.MAGENTA_STAINED_GLASS, new Color(178, 76, 216));
        blocksMap.put(Material.MAGENTA_TERRACOTTA, new Color(149, 87, 108));
        blocksMap.put(Material.MOSSY_COBBLESTONE, new Color(82, 93, 57));
        blocksMap.put(Material.MOSSY_STONE_BRICKS, new Color(139, 137, 139));
        blocksMap.put(Material.MUSHROOM_STEM, new Color(211, 204, 196));
        blocksMap.put(Material.NETHERITE_BLOCK, new Color(60, 50, 50));
        blocksMap.put(Material.NETHER_BRICKS, new Color(25, 13, 16));
        blocksMap.put(Material.NETHER_GOLD_ORE, new Color(81, 21, 21));
        blocksMap.put(Material.NETHER_PORTAL, new Color(115, 22, 209));
        blocksMap.put(Material.NETHER_QUARTZ_ORE, new Color(81, 21, 21));
        blocksMap.put(Material.NOTE_BLOCK, new Color(41, 40, 32));
        blocksMap.put(Material.OAK_TRAPDOOR, new Color(74, 60, 32));
        blocksMap.put(Material.ORANGE_CONCRETE_POWDER, new Color(226, 137, 44));
        blocksMap.put(Material.ORANGE_GLAZED_TERRACOTTA, new Color(249, 128, 29));
        blocksMap.put(Material.ORANGE_SHULKER_BOX, new Color(227, 98, 0));
        blocksMap.put(Material.ORANGE_STAINED_GLASS, new Color(216, 127, 51));
        blocksMap.put(Material.ORANGE_TERRACOTTA, new Color(160, 83, 37));
        blocksMap.put(Material.PACKED_ICE, new Color(133, 173, 248));
        blocksMap.put(Material.PINK_CONCRETE_POWDER, new Color(223, 146, 172));
        blocksMap.put(Material.PINK_GLAZED_TERRACOTTA, new Color(184, 183, 173));
        blocksMap.put(Material.PINK_SHULKER_BOX, new Color(218, 104, 146));
        blocksMap.put(Material.PINK_STAINED_GLASS, new Color(242, 127, 165));
        blocksMap.put(Material.PINK_TERRACOTTA, new Color(160, 77, 78));
        blocksMap.put(Material.POLISHED_ANDESITE, new Color(180, 178, 172));
        blocksMap.put(Material.POLISHED_BLACKSTONE, new Color(60, 57, 71));
        blocksMap.put(Material.POLISHED_BLACKSTONE_BRICKS, new Color(78, 75, 84));
        blocksMap.put(Material.POLISHED_DIORITE, new Color(230, 226, 230));
        blocksMap.put(Material.POLISHED_GRANITE, new Color(201, 151, 129));
        blocksMap.put(Material.PRISMARINE, new Color(70, 137, 116));
        blocksMap.put(Material.PURPLE_CONCRETE_POWDER, new Color(138, 58, 183));
        blocksMap.put(Material.PURPLE_GLAZED_TERRACOTTA, new Color(162, 84, 224));
        blocksMap.put(Material.PURPLE_SHULKER_BOX, new Color(108, 34, 163));
        blocksMap.put(Material.PURPLE_STAINED_GLASS, new Color(127, 63, 178));
        blocksMap.put(Material.PURPLE_TERRACOTTA, new Color(118, 69, 86));
        blocksMap.put(Material.SHULKER_BOX, new Color(127, 90, 127));
        blocksMap.put(Material.ACACIA_SAPLING, new Color(124, 94, 18));
        blocksMap.put(Material.ACTIVATOR_RAIL, new Color(74, 3, 3));
        blocksMap.put(Material.ALLIUM, new Color(222, 195, 130));
        blocksMap.put(Material.ATTACHED_PUMPKIN_STEM, new Color(84, 84, 84));
        blocksMap.put(Material.BIRCH_SAPLING, new Color(201, 215, 165));
        blocksMap.put(Material.BLUE_ORCHID, new Color(74, 143, 40));
        blocksMap.put(Material.BRAIN_CORAL, new Color(232, 142, 193));
        blocksMap.put(Material.BRAIN_CORAL_FAN, new Color(0, 0, 0));
        blocksMap.put(Material.BROWN_MUSHROOM, new Color(204, 153, 120));
        blocksMap.put(Material.BUBBLE_CORAL, new Color(165, 29, 165));
        blocksMap.put(Material.BUBBLE_CORAL_FAN, new Color(165, 29, 165));
        blocksMap.put(Material.CHAIN, new Color(0, 0, 0));
        blocksMap.put(Material.CRIMSON_FUNGUS, new Color(115, 4, 8));
        blocksMap.put(Material.CRIMSON_ROOTS, new Color(146, 6, 54));
        blocksMap.put(Material.DARK_OAK_SAPLING, new Color(31, 101, 25));
        blocksMap.put(Material.DEAD_BRAIN_CORAL, new Color(164, 160, 156));
        blocksMap.put(Material.DEAD_BUBBLE_CORAL, new Color(134, 123, 119));
        blocksMap.put(Material.DEAD_FIRE_CORAL, new Color(153, 147, 141));
        blocksMap.put(Material.DEAD_HORN_CORAL, new Color(0, 0, 0));
        blocksMap.put(Material.DEAD_TUBE_CORAL, new Color(104, 100, 99));
        blocksMap.put(Material.DETECTOR_RAIL, new Color(156, 156, 156));
        blocksMap.put(Material.FIRE_CORAL, new Color(198, 42, 55));
        blocksMap.put(Material.FIRE_CORAL_FAN, new Color(0, 0, 0));
        blocksMap.put(Material.HORN_CORAL, new Color(0, 0, 0));
        blocksMap.put(Material.HORN_CORAL_FAN, new Color(237, 236, 76));
        blocksMap.put(Material.JUNGLE_SAPLING, new Color(43, 74, 12));
        blocksMap.put(Material.KELP_PLANT, new Color(85, 103, 30));
        blocksMap.put(Material.LANTERN, new Color(0, 0, 0));
        blocksMap.put(Material.MELON_STEM, new Color(124, 124, 124));
        blocksMap.put(Material.NETHER_SPROUTS, new Color(0, 0, 0));
        blocksMap.put(Material.OAK_SAPLING, new Color(87, 173, 63));
        blocksMap.put(Material.ORANGE_TULIP, new Color(82, 154, 46));
        blocksMap.put(Material.PINK_TULIP, new Color(74, 136, 43));
        blocksMap.put(Material.POWERED_RAIL, new Color(74, 3, 3));
        blocksMap.put(Material.QUARTZ_BRICKS, new Color(238, 234, 230));
        blocksMap.put(Material.QUARTZ_PILLAR, new Color(234, 226, 218));
        blocksMap.put(Material.RAIL, new Color(0, 0, 0));
        blocksMap.put(Material.REDSTONE_TORCH, new Color(175, 0, 0));
        blocksMap.put(Material.RED_CONCRETE_POWDER, new Color(170, 55, 48));
        blocksMap.put(Material.RED_GLAZED_TERRACOTTA, new Color(176, 46, 38));
        blocksMap.put(Material.RED_MUSHROOM, new Color(0, 0, 0));
        blocksMap.put(Material.RED_MUSHROOM_BLOCK, new Color(190, 35, 33));
        blocksMap.put(Material.RED_NETHER_BRICKS, new Color(52, 1, 3));
        blocksMap.put(Material.RED_SANDSTONE, new Color(203, 110, 36));
        blocksMap.put(Material.RED_SHULKER_BOX, new Color(154, 36, 34));
        blocksMap.put(Material.RED_STAINED_GLASS, new Color(153, 51, 51));
        blocksMap.put(Material.RED_TERRACOTTA, new Color(142, 60, 46));
        blocksMap.put(Material.RED_TULIP, new Color(0, 0, 0));
        blocksMap.put(Material.REPEATER, new Color(44, 3, 0));
        blocksMap.put(Material.SEA_PICKLE, new Color(75, 79, 25));
        blocksMap.put(Material.SHROOMLIGHT, new Color(254, 135, 56));
        blocksMap.put(Material.SMOOTH_STONE, new Color(168, 168, 168));
        blocksMap.put(Material.SOUL_LANTERN, new Color(0, 0, 0));
        blocksMap.put(Material.SOUL_SOIL, new Color(73, 55, 44));
        blocksMap.put(Material.SOUL_TORCH, new Color(109, 87, 54));
        blocksMap.put(Material.SPAWNER, new Color(24, 44, 57));
        blocksMap.put(Material.SPRUCE_SAPLING, new Color(34, 53, 34));
        blocksMap.put(Material.SPRUCE_TRAPDOOR, new Color(102, 77, 40));
        blocksMap.put(Material.STONE_BRICKS, new Color(139, 137, 139));
        blocksMap.put(Material.STRIPPED_ACACIA_LOG, new Color(178, 91, 59));
        blocksMap.put(Material.STRIPPED_BIRCH_LOG, new Color(205, 184, 125));
        blocksMap.put(Material.STRIPPED_CRIMSON_STEM, new Color(137, 57, 91));
        blocksMap.put(Material.STRIPPED_DARK_OAK_LOG, new Color(96, 75, 49));
        blocksMap.put(Material.STRIPPED_JUNGLE_LOG, new Color(159, 132, 77));
        blocksMap.put(Material.STRIPPED_OAK_LOG, new Color(185, 149, 88));
        blocksMap.put(Material.STRIPPED_SPRUCE_LOG, new Color(134, 98, 56));
        blocksMap.put(Material.STRIPPED_WARPED_STEM, new Color(59, 153, 151));
        blocksMap.put(Material.TERRACOTTA, new Color(156, 93, 65));
        blocksMap.put(Material.TRIPWIRE, new Color(0, 0, 0));
        blocksMap.put(Material.TRIPWIRE_HOOK, new Color(122, 122, 122));
        blocksMap.put(Material.TUBE_CORAL, new Color(33, 67, 164));
        blocksMap.put(Material.TUBE_CORAL_BLOCK, new Color(33, 67, 164));
        blocksMap.put(Material.TUBE_CORAL_FAN, new Color(63, 108, 229));
        blocksMap.put(Material.TURTLE_EGG, new Color(245, 236, 201));
        blocksMap.put(Material.TWISTING_VINES, new Color(17, 155, 133));
        blocksMap.put(Material.TWISTING_VINES_PLANT, new Color(17, 155, 133));
        blocksMap.put(Material.WARPED_FUNGUS, new Color(20, 180, 133));
        blocksMap.put(Material.WARPED_NYLIUM, new Color(17, 155, 133));
        blocksMap.put(Material.WARPED_PLANKS, new Color(58, 142, 140));
        blocksMap.put(Material.WARPED_ROOTS, new Color(22, 126, 134));
        blocksMap.put(Material.WARPED_STEM, new Color(68, 33, 49));
        blocksMap.put(Material.WARPED_TRAPDOOR, new Color(0, 0, 0));
        blocksMap.put(Material.WARPED_WART_BLOCK, new Color(22, 126, 134));
        blocksMap.put(Material.WEEPING_VINES, new Color(0, 0, 0));
        blocksMap.put(Material.WEEPING_VINES_PLANT, new Color(0, 0, 0));
        blocksMap.put(Material.WET_SPONGE, new Color(150, 168, 70));
        blocksMap.put(Material.WHITE_GLAZED_TERRACOTTA, new Color(35, 137, 199));
        blocksMap.put(Material.WHITE_SHULKER_BOX, new Color(228, 233, 233));
        blocksMap.put(Material.WHITE_TERRACOTTA, new Color(209, 177, 161));
        blocksMap.put(Material.WHITE_TULIP, new Color(23, 124, 4));
        blocksMap.put(Material.WITHER_ROSE, new Color(33, 26, 22));
        blocksMap.put(Material.YELLOW_CONCRETE_POWDER, new Color(230, 195, 50));
        blocksMap.put(Material.YELLOW_GLAZED_TERRACOTTA, new Color(173, 124, 80));
        blocksMap.put(Material.YELLOW_SHULKER_BOX, new Color(252, 198, 35));
        blocksMap.put(Material.YELLOW_STAINED_GLASS, new Color(229, 229, 51));
        blocksMap.put(Material.YELLOW_TERRACOTTA, new Color(185, 132, 35));
        blocksMap.put(Material.QUARTZ, new Color(200, 200, 255));
        blocksMap.put(Material.QUARTZ_BLOCK, new Color(200, 200, 255));
        blocksMap.put(Material.QUARTZ_STAIRS, new Color(200, 200, 255));
        blocksMap.put(Material.QUARTZ_SLAB, new Color(200, 200, 255));
        blocksMap.put(Material.RED_CARPET, new Color(255, 0, 0));
        blocksMap.put(Material.GRAY_BED, new Color(128, 128, 128));
        blocksMap.put(Material.ROSE_BUSH, new Color(255, 0, 0));
        blocksMap.put(Material.VINE, new Color(23, 124, 4));
        blocksMap.put(Material.INFESTED_STONE, new Color(117, 117, 117));
        blocksMap.put(Material.LILAC, new Color(255, 0, 255));
        blocksMap.put(Material.PEONY, new Color(182, 108, 175));
        ;
        blocksMap.put(Material.BEE_NEST, new Color(152, 126, 51));
        ;
        blocksMap.put(Material.SWEET_BERRY_BUSH, new Color(218, 50, 23));
        ;
        blocksMap.put(Material.STONE_BRICK_STAIRS, new Color(115, 115, 115));
        ;
        blocksMap.put(Material.CHEST, new Color(164, 114, 39));
        ;
        blocksMap.put(Material.STONE_BRICK_WALL, new Color(115, 115, 115));
        ;
        blocksMap.put(Material.STONE_BRICK_SLAB, new Color(115, 115, 115));
        ;
        blocksMap.put(Material.MAGMA_BLOCK, new Color(113, 56, 8));
        ;
        blocksMap.put(Material.COCOA, new Color(136, 143, 65));
        blocksMap.put(Material.MELON, new Color(108, 144, 34));
        blocksMap.put(Material.WHEAT, new Color(26, 147, 26));
        blocksMap.put(Material.HAY_BLOCK, new Color(202, 175, 8));
        blocksMap.put(Material.ACACIA_WOOD, new Color(170, 86, 56));
        blocksMap.put(Material.COMPOSTER, new Color(135, 88, 46));
        blocksMap.put(Material.ACACIA_DOOR, new Color(177, 102, 64));
        blocksMap.put(Material.ACACIA_FENCE_GATE, new Color(177, 102, 64));
        blocksMap.put(Material.SUNFLOWER, new Color(255, 215, 25));
        blocksMap.put(Material.OAK_DOOR, new Color(178, 148, 87));
        blocksMap.put(Material.STRIPPED_OAK_WOOD, new Color(178, 148, 87));
        blocksMap.put(Material.CARROTS, new Color(239, 106, 0));
        blocksMap.put(Material.POTATOES, new Color(249, 187, 92));
        blocksMap.put(Material.SMOOTH_STONE_SLAB, new Color(168, 168, 168));
        blocksMap.put(Material.BELL, new Color(204, 189, 63));
        blocksMap.put(Material.COBBLESTONE_WALL, new Color(124, 123, 124));
        blocksMap.put(Material.BEETROOTS, new Color(133, 111, 74));
        blocksMap.put(Material.SANDSTONE_SLAB, new Color(217, 210, 157));
        blocksMap.put(Material.WHITE_BED, new Color(255, 255, 255));
        blocksMap.put(Material.OAK_FENCE_GATE, new Color(178, 148, 87));
        blocksMap.put(Material.MOSSY_COBBLESTONE_STAIRS, new Color(61, 74, 44));
        blocksMap.put(Material.DEEPSLATE, new Color(43, 43, 43)); // 深灰色
        blocksMap.put(Material.COBBLED_DEEPSLATE, new Color(99, 99, 99)); // 灰色
        blocksMap.put(Material.POLISHED_DEEPSLATE, new Color(25, 25, 25)); // 深灰色
        blocksMap.put(Material.CALCITE, new Color(255, 255, 224)); // 柔和的白色
        blocksMap.put(Material.TUFF, new Color(139, 126, 107)); // 灰褐色
        blocksMap.put(Material.DRIPSTONE_BLOCK, new Color(102, 102, 102)); // 灰色
        blocksMap.put(Material.PODZOL, new Color(112, 78, 37)); // 棕色
        blocksMap.put(Material.ROOTED_DIRT, new Color(102, 65, 39)); // 棕色
        blocksMap.put(Material.MUD, new Color(78, 55, 45)); // 深棕色
        blocksMap.put(Material.CHERRY_PLANKS, new Color(228, 129, 131)); // 粉红色
        blocksMap.put(Material.MANGROVE_PLANKS, new Color(130, 56, 45)); // 红褐色
        blocksMap.put(Material.BAMBOO_PLANKS, new Color(220, 215, 161)); // 浅黄色
        blocksMap.put(Material.BAMBOO_MOSAIC, new Color(220, 215, 161)); // 浅黄色
        blocksMap.put(Material.CHERRY_SAPLING, new Color(228, 129, 131)); // 粉色
        blocksMap.put(Material.MANGROVE_PROPAGULE, new Color(60, 120, 65)); // 绿色
        blocksMap.put(Material.SUSPICIOUS_SAND, new Color(223, 200, 139)); // 黄色
        blocksMap.put(Material.DEEPSLATE_COAL_ORE, new Color(37, 37, 37)); // 深灰色
        blocksMap.put(Material.DEEPSLATE_IRON_ORE, new Color(37, 37, 37)); // 深灰色
        blocksMap.put(Material.COPPER_ORE, new Color(222, 136, 91)); // 橙色
        blocksMap.put(Material.DEEPSLATE_COPPER_ORE, new Color(37, 37, 37)); // 深灰色
        blocksMap.put(Material.DEEPSLATE_GOLD_ORE, new Color(37, 37, 37)); // 深灰色
        blocksMap.put(Material.DEEPSLATE_REDSTONE_ORE, new Color(37, 37, 37)); // 深灰色
        blocksMap.put(Material.DEEPSLATE_EMERALD_ORE, new Color(37, 37, 37)); // 深灰色
        blocksMap.put(Material.DEEPSLATE_LAPIS_ORE, new Color(37, 17, 107)); // 深蓝色
        blocksMap.put(Material.DEEPSLATE_DIAMOND_ORE, new Color(37, 37, 37)); // 深灰色
        blocksMap.put(Material.ANCIENT_DEBRIS, new Color(77, 40, 29)); // 深棕色
        blocksMap.put(Material.RAW_IRON_BLOCK, new Color(189, 189, 189)); // 浅灰色
        blocksMap.put(Material.RAW_COPPER_BLOCK, new Color(207, 132, 93)); // 淡橙色
        blocksMap.put(Material.RAW_GOLD_BLOCK, new Color(255, 215, 0)); // 金色
        blocksMap.put(Material.AMETHYST_BLOCK, new Color(148, 78, 179)); // 紫色
        blocksMap.put(Material.BUDDING_AMETHYST, new Color(199, 163, 215)); // 淡紫色
        blocksMap.put(Material.COPPER_BLOCK, new Color(222, 136, 91)); // 橙色
        blocksMap.put(Material.EXPOSED_COPPER, new Color(207, 132, 93)); // 浅橙色
        blocksMap.put(Material.WEATHERED_COPPER, new Color(122, 97, 87)); // 绿色
        blocksMap.put(Material.OXIDIZED_COPPER, new Color(48, 75, 65)); // 深绿色
        blocksMap.put(Material.CUT_COPPER, new Color(222, 136, 91)); // 橙色
        blocksMap.put(Material.EXPOSED_CUT_COPPER, new Color(207, 132, 93)); // 浅橙色
        blocksMap.put(Material.WEATHERED_CUT_COPPER, new Color(122, 97, 87)); // 绿色
        blocksMap.put(Material.OXIDIZED_CUT_COPPER, new Color(48, 75, 65)); // 深绿色
        blocksMap.put(Material.CUT_COPPER_STAIRS, new Color(222, 136, 91)); // 橙色
        blocksMap.put(Material.EXPOSED_CUT_COPPER_STAIRS, new Color(207, 132, 93)); // 浅橙色
        blocksMap.put(Material.WEATHERED_CUT_COPPER_STAIRS, new Color(122, 97, 87)); // 绿色
        blocksMap.put(Material.OXIDIZED_CUT_COPPER_STAIRS, new Color(48, 75, 65)); // 深绿色
        blocksMap.put(Material.CUT_COPPER_SLAB, new Color(222, 136, 91)); // 橙色
        blocksMap.put(Material.EXPOSED_CUT_COPPER_SLAB, new Color(207, 132, 93)); // 浅橙色
        blocksMap.put(Material.WEATHERED_CUT_COPPER_SLAB, new Color(122, 97, 87)); // 绿色
        blocksMap.put(Material.OXIDIZED_CUT_COPPER_SLAB, new Color(48, 75, 65)); // 深绿色
        blocksMap.put(Material.WAXED_COPPER_BLOCK, new Color(189, 189, 189)); // 浅灰色
        blocksMap.put(Material.WAXED_EXPOSED_COPPER, new Color(207, 132, 93)); // 浅橙色
        blocksMap.put(Material.WAXED_WEATHERED_COPPER, new Color(122, 97, 87)); // 绿色
        blocksMap.put(Material.WAXED_OXIDIZED_COPPER, new Color(48, 75, 65)); // 深绿色
        blocksMap.put(Material.WAXED_CUT_COPPER, new Color(222, 136, 91)); // 橙色
        blocksMap.put(Material.WAXED_EXPOSED_CUT_COPPER, new Color(207, 132, 93)); // 浅橙色
        blocksMap.put(Material.WAXED_WEATHERED_CUT_COPPER, new Color(122, 97, 87)); // 绿色
        blocksMap.put(Material.WAXED_OXIDIZED_CUT_COPPER, new Color(48, 75, 65)); // 深绿色
        blocksMap.put(Material.WAXED_CUT_COPPER_STAIRS, new Color(222, 136, 91)); // 橙色
        blocksMap.put(Material.WAXED_EXPOSED_CUT_COPPER_STAIRS, new Color(207, 132, 93)); // 浅橙色
        blocksMap.put(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS, new Color(122, 97, 87)); // 绿色
        blocksMap.put(Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS, new Color(48, 75, 65)); // 深绿色
        blocksMap.put(Material.WAXED_CUT_COPPER_SLAB, new Color(222, 136, 91)); // 橙色
        blocksMap.put(Material.WAXED_EXPOSED_CUT_COPPER_SLAB, new Color(207, 132, 93)); // 浅橙色
        blocksMap.put(Material.WAXED_WEATHERED_CUT_COPPER_SLAB, new Color(122, 97, 87)); // 绿色
        blocksMap.put(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB, new Color(48, 75, 65)); // 深绿色
        blocksMap.put(Material.CHERRY_LOG, new Color(188, 130, 130)); // 粉红色
        blocksMap.put(Material.MANGROVE_LOG, new Color(107, 66, 54)); // 深棕色
        blocksMap.put(Material.MANGROVE_ROOTS, new Color(99, 69, 60)); // 深棕色
        blocksMap.put(Material.MUDDY_MANGROVE_ROOTS, new Color(63, 47, 39)); // 深棕色
        blocksMap.put(Material.BAMBOO_BLOCK, new Color(222, 215, 162)); // 浅黄色
        blocksMap.put(Material.STRIPPED_CHERRY_LOG, new Color(224, 151, 153)); // 浅粉红色
        blocksMap.put(Material.STRIPPED_MANGROVE_LOG, new Color(113, 77, 62)); // 红褐色
        blocksMap.put(Material.STRIPPED_SPRUCE_WOOD, new Color(158, 139, 123)); // 浅棕色
        blocksMap.put(Material.STRIPPED_BIRCH_WOOD, new Color(229, 226, 141)); // 淡黄色
        blocksMap.put(Material.STRIPPED_JUNGLE_WOOD, new Color(229, 189, 116)); // 浅黄褐色
        blocksMap.put(Material.STRIPPED_ACACIA_WOOD, new Color(180, 106, 45)); // 浅橙色
        blocksMap.put(Material.STRIPPED_CHERRY_WOOD, new Color(224, 151, 153)); // 浅粉红色
        blocksMap.put(Material.STRIPPED_DARK_OAK_WOOD, new Color(83, 73, 61)); // 深棕色
        blocksMap.put(Material.STRIPPED_MANGROVE_WOOD, new Color(113, 77, 62)); // 红褐色
        blocksMap.put(Material.STRIPPED_CRIMSON_HYPHAE, new Color(197, 75, 82)); // 红色
        blocksMap.put(Material.STRIPPED_WARPED_HYPHAE, new Color(75, 108, 118)); // 深蓝色
        blocksMap.put(Material.STRIPPED_BAMBOO_BLOCK, new Color(223, 215, 160)); // 浅黄色
        blocksMap.put(Material.OAK_WOOD, new Color(178, 148, 87)); // 棕色
        blocksMap.put(Material.SPRUCE_WOOD, new Color(96, 83, 69)); // 深棕色
        blocksMap.put(Material.BIRCH_WOOD, new Color(229, 224, 165)); // 淡黄色
        blocksMap.put(Material.JUNGLE_WOOD, new Color(193, 141, 92)); // 黄褐色
        blocksMap.put(Material.CHERRY_WOOD, new Color(188, 130, 130)); // 粉红色
        blocksMap.put(Material.DARK_OAK_WOOD, new Color(59, 50, 42)); // 深棕色
        blocksMap.put(Material.MANGROVE_WOOD, new Color(107, 66, 54)); // 深棕色
        blocksMap.put(Material.CRIMSON_HYPHAE, new Color(197, 75, 82)); // 红色
        blocksMap.put(Material.WARPED_HYPHAE, new Color(75, 108, 118)); // 深蓝色
        blocksMap.put(Material.CHERRY_LEAVES, new Color(189, 36, 72)); // 绿色
        blocksMap.put(Material.MANGROVE_LEAVES, new Color(81, 110, 89)); // 深绿色
        blocksMap.put(Material.AZALEA_LEAVES, new Color(134, 174, 128)); // 绿色
        blocksMap.put(Material.FLOWERING_AZALEA_LEAVES, new Color(190, 214, 134)); // 浅绿色
        blocksMap.put(Material.TINTED_GLASS, new Color(75, 75, 75)); // 深灰色
        blocksMap.put(Material.AZALEA, new Color(134, 174, 128)); // 绿色
        blocksMap.put(Material.FLOWERING_AZALEA, new Color(190, 214, 134)); // 浅绿色
        blocksMap.put(Material.TORCHFLOWER, new Color(255, 195, 0)); // 明亮的黄色
        blocksMap.put(Material.SPORE_BLOSSOM, new Color(255, 204, 204)); // 粉色
        blocksMap.put(Material.MOSS_CARPET, new Color(70, 140, 55)); // 深绿色
        blocksMap.put(Material.PINK_PETALS, new Color(255, 182, 193)); // 浅粉红色
        blocksMap.put(Material.MOSS_BLOCK, new Color(124, 179, 83));
        blocksMap.put(Material.HANGING_ROOTS, new Color(91, 63, 39));
        blocksMap.put(Material.BIG_DRIPLEAF, new Color(86, 153, 80));
        blocksMap.put(Material.SMALL_DRIPLEAF, new Color(86, 153, 80));
        blocksMap.put(Material.BAMBOO, new Color(170, 220, 82));
        blocksMap.put(Material.CHERRY_SLAB, new Color(255, 187, 204));
        blocksMap.put(Material.MANGROVE_SLAB, new Color(181, 77, 71));
        blocksMap.put(Material.BAMBOO_SLAB, new Color(170, 220, 82));
        blocksMap.put(Material.BAMBOO_MOSAIC_SLAB, new Color(170, 220, 82));
        blocksMap.put(Material.CRIMSON_SLAB, new Color(176, 106, 132));
        blocksMap.put(Material.WARPED_SLAB, new Color(92, 165, 155));
        blocksMap.put(Material.CUT_SANDSTONE_SLAB, new Color(232, 210, 139));
        blocksMap.put(Material.PETRIFIED_OAK_SLAB, new Color(148, 118, 83));
        blocksMap.put(Material.BRICK_SLAB, new Color(139, 69, 19));
        blocksMap.put(Material.MUD_BRICK_SLAB, new Color(106, 77, 38));
        blocksMap.put(Material.NETHER_BRICK_SLAB, new Color(112, 29, 29));
        blocksMap.put(Material.RED_SANDSTONE_SLAB, new Color(194, 104, 65));
        blocksMap.put(Material.CUT_RED_SANDSTONE_SLAB, new Color(214, 151, 103));
        blocksMap.put(Material.PURPUR_SLAB, new Color(153, 51, 153));
        blocksMap.put(Material.PRISMARINE_SLAB, new Color(0, 128, 128));
        blocksMap.put(Material.PRISMARINE_BRICK_SLAB, new Color(0, 102, 102));
        blocksMap.put(Material.DARK_PRISMARINE_SLAB, new Color(64, 64, 64));
        blocksMap.put(Material.SMOOTH_QUARTZ, new Color(234, 234, 234));
        blocksMap.put(Material.SMOOTH_RED_SANDSTONE, new Color(217, 139, 94));
        blocksMap.put(Material.SMOOTH_SANDSTONE, new Color(232, 211, 162));
        blocksMap.put(Material.CHISELED_BOOKSHELF, new Color(110, 78, 39));
        blocksMap.put(Material.DECORATED_POT, new Color(164, 104, 63));
        blocksMap.put(Material.PURPUR_STAIRS, new Color(153, 51, 153));
        blocksMap.put(Material.JUKEBOX, new Color(128, 90, 55));
        blocksMap.put(Material.CHERRY_FENCE, new Color(255, 187, 204));
        blocksMap.put(Material.MANGROVE_FENCE, new Color(181, 77, 71));
        blocksMap.put(Material.BAMBOO_FENCE, new Color(170, 220, 82));
        blocksMap.put(Material.CRIMSON_FENCE, new Color(176, 106, 132));
        blocksMap.put(Material.WARPED_FENCE, new Color(92, 165, 155));
        blocksMap.put(Material.BASALT, new Color(35, 33, 32));
        blocksMap.put(Material.POLISHED_BASALT, new Color(65, 61, 59));
        blocksMap.put(Material.SMOOTH_BASALT, new Color(53, 53, 56));
        blocksMap.put(Material.INFESTED_COBBLESTONE, new Color(112, 112, 112));
        blocksMap.put(Material.INFESTED_STONE_BRICKS, new Color(112, 112, 112));
        blocksMap.put(Material.INFESTED_MOSSY_STONE_BRICKS, new Color(112, 112, 112));
        blocksMap.put(Material.INFESTED_CRACKED_STONE_BRICKS, new Color(112, 112, 112));
        blocksMap.put(Material.INFESTED_CHISELED_STONE_BRICKS, new Color(112, 112, 112));
        blocksMap.put(Material.INFESTED_DEEPSLATE, new Color(112, 112, 112));
        blocksMap.put(Material.PACKED_MUD, new Color(119, 88, 62));
        blocksMap.put(Material.MUD_BRICKS, new Color(106, 76, 37));
        blocksMap.put(Material.CRACKED_DEEPSLATE_BRICKS, new Color(82, 82, 82));
        blocksMap.put(Material.CRACKED_DEEPSLATE_TILES, new Color(82, 82, 82));
        blocksMap.put(Material.CHISELED_DEEPSLATE, new Color(75, 75, 75));
        blocksMap.put(Material.REINFORCED_DEEPSLATE, new Color(69, 69, 69));
        blocksMap.put(Material.GLOW_LICHEN, new Color(173, 255, 173));
        blocksMap.put(Material.BRICK_STAIRS, new Color(139, 69, 19));
        blocksMap.put(Material.MUD_BRICK_STAIRS, new Color(106, 76, 37));
        blocksMap.put(Material.MYCELIUM, new Color(100, 82, 124));
        blocksMap.put(Material.NETHER_BRICK_FENCE, new Color(112, 29, 29));
        blocksMap.put(Material.NETHER_BRICK_STAIRS, new Color(112, 29, 29));
        blocksMap.put(Material.SCULK, new Color(44, 44, 44));
        blocksMap.put(Material.SCULK_VEIN, new Color(34, 34, 34));
        blocksMap.put(Material.SCULK_CATALYST, new Color(56, 56, 56));
        blocksMap.put(Material.SCULK_SHRIEKER, new Color(48, 48, 48));
        blocksMap.put(Material.ENCHANTING_TABLE, new Color(175, 146, 164));
        blocksMap.put(Material.END_PORTAL_FRAME, new Color(65, 66, 66));
        blocksMap.put(Material.SANDSTONE_STAIRS, new Color(232, 210, 139));
        blocksMap.put(Material.ENDER_CHEST, new Color(40, 26, 54));
        blocksMap.put(Material.CHERRY_STAIRS, new Color(255, 187, 204));
        blocksMap.put(Material.MANGROVE_STAIRS, new Color(181, 77, 71));
        blocksMap.put(Material.BAMBOO_STAIRS, new Color(170, 220, 82));
        blocksMap.put(Material.BAMBOO_MOSAIC_STAIRS, new Color(170, 220, 82));
        blocksMap.put(Material.CRIMSON_STAIRS, new Color(176, 106, 132));
        blocksMap.put(Material.WARPED_STAIRS, new Color(92, 165, 155));
        blocksMap.put(Material.MOSSY_COBBLESTONE_WALL, new Color(61, 74, 44));
        blocksMap.put(Material.BRICK_WALL, new Color(139, 69, 19));
        blocksMap.put(Material.PRISMARINE_WALL, new Color(0, 128, 128));
        blocksMap.put(Material.RED_SANDSTONE_WALL, new Color(194, 104, 65));
        blocksMap.put(Material.MOSSY_STONE_BRICK_WALL, new Color(61, 74, 44));
        blocksMap.put(Material.GRANITE_WALL, new Color(122, 56, 56));
        blocksMap.put(Material.MUD_BRICK_WALL, new Color(106, 76, 37));
        blocksMap.put(Material.NETHER_BRICK_WALL, new Color(112, 29, 29));
        blocksMap.put(Material.ANDESITE_WALL, new Color(116, 116, 116));
        blocksMap.put(Material.RED_NETHER_BRICK_WALL, new Color(112, 29, 29));
        blocksMap.put(Material.SANDSTONE_WALL, new Color(232, 210, 139));
        blocksMap.put(Material.END_STONE_BRICK_WALL, new Color(229, 221, 175));
        blocksMap.put(Material.DIORITE_WALL, new Color(214, 214, 214));
        blocksMap.put(Material.BLACKSTONE_WALL, new Color(24, 24, 26));
        blocksMap.put(Material.POLISHED_BLACKSTONE_WALL, new Color(65, 60, 50));
        blocksMap.put(Material.POLISHED_BLACKSTONE_BRICK_WALL, new Color(65, 60, 50));
        blocksMap.put(Material.COBBLED_DEEPSLATE_WALL, new Color(55, 55, 55));
        blocksMap.put(Material.POLISHED_DEEPSLATE_WALL, new Color(53, 53, 56));
        blocksMap.put(Material.CHIPPED_ANVIL, new Color(200, 200, 200));
        blocksMap.put(Material.DAMAGED_ANVIL, new Color(180, 180, 180));
        blocksMap.put(Material.BARRIER, new Color(160, 0, 160));
        blocksMap.put(Material.LIGHT, new Color(255, 255, 204));
        blocksMap.put(Material.WHITE_CARPET, new Color(255, 255, 255));
        blocksMap.put(Material.ORANGE_CARPET, new Color(255, 178, 102));
        blocksMap.put(Material.MAGENTA_CARPET, new Color(204, 51, 204));
        blocksMap.put(Material.LIGHT_BLUE_CARPET, new Color(128, 179, 255));
        blocksMap.put(Material.YELLOW_CARPET, new Color(255, 255, 0));
        blocksMap.put(Material.LIME_CARPET, new Color(0, 255, 0));
        blocksMap.put(Material.PINK_CARPET, new Color(255, 192, 203));
        blocksMap.put(Material.GRAY_CARPET, new Color(169, 169, 169));
        blocksMap.put(Material.LIGHT_GRAY_CARPET, new Color(211, 211, 211));
        blocksMap.put(Material.CYAN_CARPET, new Color(0, 255, 255));
        blocksMap.put(Material.PURPLE_CARPET, new Color(128, 0, 128));
        blocksMap.put(Material.BLUE_CARPET, new Color(0, 0, 255));
        blocksMap.put(Material.BROWN_CARPET, new Color(139, 69, 19));
        blocksMap.put(Material.GREEN_CARPET, new Color(0, 128, 0));
        blocksMap.put(Material.BLACK_CARPET, new Color(0, 0, 0));
        blocksMap.put(Material.ORANGE_STAINED_GLASS_PANE, new Color(255, 165, 0));
        blocksMap.put(Material.MAGENTA_STAINED_GLASS_PANE, new Color(255, 0, 255));
        blocksMap.put(Material.LIGHT_BLUE_STAINED_GLASS_PANE, new Color(173, 216, 230));
        blocksMap.put(Material.YELLOW_STAINED_GLASS_PANE, new Color(255, 255, 0));
        blocksMap.put(Material.LIME_STAINED_GLASS_PANE, new Color(0, 255, 0));
        blocksMap.put(Material.PINK_STAINED_GLASS_PANE, new Color(255, 192, 203));
        blocksMap.put(Material.GRAY_STAINED_GLASS_PANE, new Color(169, 169, 169));
        blocksMap.put(Material.LIGHT_GRAY_STAINED_GLASS_PANE, new Color(211, 211, 211));
        blocksMap.put(Material.CYAN_STAINED_GLASS_PANE, new Color(0, 255, 255));
        blocksMap.put(Material.PURPLE_STAINED_GLASS_PANE, new Color(128, 0, 128));
        blocksMap.put(Material.BLUE_STAINED_GLASS_PANE, new Color(0, 0, 255));
        blocksMap.put(Material.BROWN_STAINED_GLASS_PANE, new Color(139, 69, 19));
        blocksMap.put(Material.GREEN_STAINED_GLASS_PANE, new Color(0, 128, 0));
        blocksMap.put(Material.RED_STAINED_GLASS_PANE, new Color(255, 0, 0));
        blocksMap.put(Material.BLACK_STAINED_GLASS_PANE, new Color(0, 0, 0));
        blocksMap.put(Material.PRISMARINE_STAIRS, new Color(0, 178, 204));
        blocksMap.put(Material.PRISMARINE_BRICK_STAIRS, new Color(51, 153, 153));
        blocksMap.put(Material.DARK_PRISMARINE_STAIRS, new Color(0, 102, 102));
        blocksMap.put(Material.RED_SANDSTONE_STAIRS, new Color(204, 102, 0));
        blocksMap.put(Material.REPEATING_COMMAND_BLOCK, new Color(128, 128, 128));
        blocksMap.put(Material.CHAIN_COMMAND_BLOCK, new Color(192, 192, 192));
        blocksMap.put(Material.BONE_BLOCK, new Color(255, 255, 255));
        blocksMap.put(Material.STRUCTURE_VOID, new Color(0, 0, 0, 0));
        blocksMap.put(Material.POLISHED_GRANITE_STAIRS, new Color(144, 100, 72));
        blocksMap.put(Material.SMOOTH_RED_SANDSTONE_STAIRS, new Color(255, 227, 204));
        blocksMap.put(Material.MOSSY_STONE_BRICK_STAIRS, new Color(100, 100, 100));
        blocksMap.put(Material.POLISHED_DIORITE_STAIRS, new Color(229, 229, 229));
        blocksMap.put(Material.END_STONE_BRICK_STAIRS, new Color(255, 255, 204));
        blocksMap.put(Material.STONE_STAIRS, new Color(169, 169, 169));
        blocksMap.put(Material.SMOOTH_SANDSTONE_STAIRS, new Color(255, 255, 204));
        blocksMap.put(Material.SMOOTH_QUARTZ_STAIRS, new Color(255, 255, 255));
        blocksMap.put(Material.GRANITE_STAIRS, new Color(153, 76, 0));
        blocksMap.put(Material.ANDESITE_STAIRS, new Color(144, 144, 144));
        blocksMap.put(Material.RED_NETHER_BRICK_STAIRS, new Color(153, 0, 0));
        blocksMap.put(Material.POLISHED_ANDESITE_STAIRS, new Color(169, 169, 169));
        blocksMap.put(Material.DIORITE_STAIRS, new Color(255, 255, 255));
        blocksMap.put(Material.COBBLED_DEEPSLATE_STAIRS, new Color(64, 64, 64));
        blocksMap.put(Material.POLISHED_DEEPSLATE_STAIRS, new Color(96, 96, 96));
        blocksMap.put(Material.POLISHED_GRANITE_SLAB, new Color(144, 100, 72));
        blocksMap.put(Material.SMOOTH_RED_SANDSTONE_SLAB, new Color(255, 227, 204));
        blocksMap.put(Material.MOSSY_STONE_BRICK_SLAB, new Color(100, 100, 100));
        blocksMap.put(Material.POLISHED_DIORITE_SLAB, new Color(229, 229, 229));
        blocksMap.put(Material.MOSSY_COBBLESTONE_SLAB, new Color(61, 74, 44));
        blocksMap.put(Material.END_STONE_BRICK_SLAB, new Color(255, 255, 204));
        blocksMap.put(Material.SMOOTH_SANDSTONE_SLAB, new Color(255, 255, 204));
        blocksMap.put(Material.SMOOTH_QUARTZ_SLAB, new Color(255, 255, 255));
        blocksMap.put(Material.GRANITE_SLAB, new Color(153, 76, 0));
        blocksMap.put(Material.ANDESITE_SLAB, new Color(144, 144, 144));
        blocksMap.put(Material.RED_NETHER_BRICK_SLAB, new Color(153, 0, 0));
        blocksMap.put(Material.POLISHED_ANDESITE_SLAB, new Color(169, 169, 169));
        blocksMap.put(Material.DIORITE_SLAB, new Color(255, 255, 255));
        blocksMap.put(Material.COBBLED_DEEPSLATE_SLAB, new Color(64, 64, 64));
        blocksMap.put(Material.POLISHED_DEEPSLATE_SLAB, new Color(96, 96, 96));
        blocksMap.put(Material.SCAFFOLDING, new Color(229, 229, 229));
        blocksMap.put(Material.REDSTONE, new Color(255, 0, 0));
        blocksMap.put(Material.PISTON, new Color(128, 128, 128));
        blocksMap.put(Material.STICKY_PISTON, new Color(128, 128, 128));
        blocksMap.put(Material.SLIME_BLOCK, new Color(0, 255, 0));
        blocksMap.put(Material.HONEY_BLOCK, new Color(255, 217, 0));
        blocksMap.put(Material.OBSERVER, new Color(169, 169, 169));
        blocksMap.put(Material.HOPPER, new Color(128, 128, 128));
        blocksMap.put(Material.DISPENSER, new Color(169, 169, 169));
        blocksMap.put(Material.DROPPER, new Color(169, 169, 169));
        blocksMap.put(Material.LECTERN, new Color(204, 153, 102));
        blocksMap.put(Material.TARGET, new Color(255, 0, 0));
        blocksMap.put(Material.LIGHTNING_ROD, new Color(128, 128, 128));
        blocksMap.put(Material.DAYLIGHT_DETECTOR, new Color(255, 255, 204));
        blocksMap.put(Material.SCULK_SENSOR, new Color(100, 100, 100));
        blocksMap.put(Material.TRAPPED_CHEST, new Color(139, 69, 19));
        blocksMap.put(Material.STONE_BUTTON, new Color(169, 169, 169));
        blocksMap.put(Material.POLISHED_BLACKSTONE_BUTTON, new Color(50, 50, 50));
        blocksMap.put(Material.OAK_BUTTON, new Color(178, 148, 87));
        blocksMap.put(Material.SPRUCE_BUTTON, new Color(139, 69, 19));
        blocksMap.put(Material.BIRCH_BUTTON, new Color(255, 222, 89));
        blocksMap.put(Material.JUNGLE_BUTTON, new Color(89, 179, 23));
        blocksMap.put(Material.ACACIA_BUTTON, new Color(255, 165, 0));
        blocksMap.put(Material.CHERRY_BUTTON, new Color(255, 182, 193));
        blocksMap.put(Material.DARK_OAK_BUTTON, new Color(84, 53, 24));
        blocksMap.put(Material.MANGROVE_BUTTON, new Color(128, 64, 0));
        blocksMap.put(Material.BAMBOO_BUTTON, new Color(190, 255, 0));
        blocksMap.put(Material.CRIMSON_BUTTON, new Color(204, 0, 0));
        blocksMap.put(Material.WARPED_BUTTON, new Color(0, 204, 204));
        blocksMap.put(Material.STONE_PRESSURE_PLATE, new Color(169, 169, 169));
        blocksMap.put(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE, new Color(50, 50, 50));
        blocksMap.put(Material.LIGHT_WEIGHTED_PRESSURE_PLATE, new Color(255, 255, 255)); // White
        blocksMap.put(Material.HEAVY_WEIGHTED_PRESSURE_PLATE, new Color(200, 200, 200)); // Light Gray
        blocksMap.put(Material.OAK_PRESSURE_PLATE, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.SPRUCE_PRESSURE_PLATE, new Color(101, 67, 33)); // Dark Brown
        blocksMap.put(Material.BIRCH_PRESSURE_PLATE, new Color(255, 239, 191)); // Light Yellow
        blocksMap.put(Material.JUNGLE_PRESSURE_PLATE, new Color(92, 64, 51)); // Jungle Wood
        blocksMap.put(Material.ACACIA_PRESSURE_PLATE, new Color(210, 105, 30)); // Dark Orange
        blocksMap.put(Material.CHERRY_PRESSURE_PLATE, new Color(255, 105, 180)); // Hot Pink
        blocksMap.put(Material.DARK_OAK_PRESSURE_PLATE, new Color(55, 27, 10)); // Very Dark Brown
        blocksMap.put(Material.MANGROVE_PRESSURE_PLATE, new Color(128, 42, 42)); // Red-brown
        blocksMap.put(Material.BAMBOO_PRESSURE_PLATE, new Color(194, 198, 0)); // Light Green Yellow
        blocksMap.put(Material.CRIMSON_PRESSURE_PLATE, new Color(139, 0, 0)); // Dark Red
        blocksMap.put(Material.WARPED_PRESSURE_PLATE, new Color(0, 128, 128)); // Teal
        blocksMap.put(Material.IRON_DOOR, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.SPRUCE_DOOR, new Color(86, 64, 39)); // Brown
        blocksMap.put(Material.BIRCH_DOOR, new Color(229, 222, 192)); // Pale Yellow
        blocksMap.put(Material.JUNGLE_DOOR, new Color(81, 75, 52)); // Jungle Wood
        blocksMap.put(Material.CHERRY_DOOR, new Color(255, 182, 193)); // Light Pink
        blocksMap.put(Material.DARK_OAK_DOOR, new Color(32, 19, 9)); // Very Dark Brown
        blocksMap.put(Material.MANGROVE_DOOR, new Color(128, 42, 42)); // Red-brown
        blocksMap.put(Material.BAMBOO_DOOR, new Color(204, 204, 51)); // Light Green Yellow
        blocksMap.put(Material.CRIMSON_DOOR, new Color(255, 0, 0)); // Bright Red
        blocksMap.put(Material.WARPED_DOOR, new Color(0, 255, 255)); // Cyan
        blocksMap.put(Material.CHERRY_TRAPDOOR, new Color(255, 105, 180)); // Hot Pink
        blocksMap.put(Material.MANGROVE_TRAPDOOR, new Color(128, 42, 42)); // Red-brown
        blocksMap.put(Material.BAMBOO_TRAPDOOR, new Color(194, 198, 0)); // Light Green Yellow
        blocksMap.put(Material.SPRUCE_FENCE_GATE, new Color(86, 64, 39)); // Brown
        blocksMap.put(Material.BIRCH_FENCE_GATE, new Color(229, 222, 192)); // Pale Yellow
        blocksMap.put(Material.JUNGLE_FENCE_GATE, new Color(81, 75, 52)); // Jungle Wood
        blocksMap.put(Material.CHERRY_FENCE_GATE, new Color(255, 182, 193)); // Light Pink
        blocksMap.put(Material.DARK_OAK_FENCE_GATE, new Color(32, 19, 9)); // Very Dark Brown
        blocksMap.put(Material.MANGROVE_FENCE_GATE, new Color(128, 42, 42)); // Red-brown
        blocksMap.put(Material.BAMBOO_FENCE_GATE, new Color(204, 204, 51)); // Light Green Yellow
        blocksMap.put(Material.CRIMSON_FENCE_GATE, new Color(255, 0, 0)); // Bright Red
        blocksMap.put(Material.WARPED_FENCE_GATE, new Color(0, 255, 255)); // Cyan
        blocksMap.put(Material.SADDLE, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.MINECART, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.CHEST_MINECART, new Color(101, 67, 33)); // Dark Brown
        blocksMap.put(Material.FURNACE_MINECART, new Color(125, 125, 125)); // Gray
        blocksMap.put(Material.TNT_MINECART, new Color(255, 0, 0)); // Bright Red
        blocksMap.put(Material.HOPPER_MINECART, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.CARROT_ON_A_STICK, new Color(255, 165, 0)); // Orange
        blocksMap.put(Material.WARPED_FUNGUS_ON_A_STICK, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.ELYTRA, new Color(17, 37, 54)); // Dark Blue
        blocksMap.put(Material.OAK_BOAT, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.OAK_CHEST_BOAT, new Color(177, 143, 107)); // Tan
        blocksMap.put(Material.SPRUCE_BOAT, new Color(101, 67, 33)); // Dark Brown
        blocksMap.put(Material.SPRUCE_CHEST_BOAT, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.BIRCH_BOAT, new Color(255, 239, 191)); // Light Yellow
        blocksMap.put(Material.BIRCH_CHEST_BOAT, new Color(255, 239, 191)); // Light Yellow
        blocksMap.put(Material.JUNGLE_BOAT, new Color(92, 64, 51)); // Jungle Wood
        blocksMap.put(Material.JUNGLE_CHEST_BOAT, new Color(92, 64, 51)); // Jungle Wood
        blocksMap.put(Material.ACACIA_BOAT, new Color(210, 105, 30)); // Dark Orange
        blocksMap.put(Material.ACACIA_CHEST_BOAT, new Color(210, 105, 30)); // Dark Orange
        blocksMap.put(Material.CHERRY_BOAT, new Color(255, 105, 180)); // Hot Pink
        blocksMap.put(Material.CHERRY_CHEST_BOAT, new Color(255, 105, 180)); // Hot Pink
        blocksMap.put(Material.DARK_OAK_BOAT, new Color(55, 27, 10)); // Very Dark Brown
        blocksMap.put(Material.DARK_OAK_CHEST_BOAT, new Color(55, 27, 10)); // Very Dark Brown
        blocksMap.put(Material.MANGROVE_BOAT, new Color(128, 42, 42)); // Red-brown
        blocksMap.put(Material.MANGROVE_CHEST_BOAT, new Color(128, 42, 42)); // Red-brown
        blocksMap.put(Material.BAMBOO_RAFT, new Color(194, 198, 0)); // Light Green Yellow
        blocksMap.put(Material.BAMBOO_CHEST_RAFT, new Color(194, 198, 0)); // Light Green Yellow
        blocksMap.put(Material.JIGSAW, new Color(205, 133, 63)); // Peru
        blocksMap.put(Material.TURTLE_HELMET, new Color(0, 128, 128)); // Teal
        blocksMap.put(Material.FLINT_AND_STEEL, new Color(105, 105, 105)); // Dim Gray
        blocksMap.put(Material.APPLE, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.BOW, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.ARROW, new Color(105, 105, 105)); // Dim Gray
        blocksMap.put(Material.COAL, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.CHARCOAL, new Color(50, 50, 50)); // Dark Gray
        blocksMap.put(Material.DIAMOND, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.EMERALD, new Color(80, 240, 120)); // Light Green
        blocksMap.put(Material.LAPIS_LAZULI, new Color(38, 97, 156)); // Blue
        blocksMap.put(Material.AMETHYST_SHARD, new Color(153, 102, 204)); // Purple
        blocksMap.put(Material.RAW_IRON, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.IRON_INGOT, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.RAW_COPPER, new Color(184, 115, 51)); // Copper
        blocksMap.put(Material.COPPER_INGOT, new Color(184, 115, 51)); // Copper
        blocksMap.put(Material.RAW_GOLD, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.GOLD_INGOT, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.NETHERITE_INGOT, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.NETHERITE_SCRAP, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.WOODEN_SWORD, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.WOODEN_SHOVEL, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.WOODEN_PICKAXE, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.WOODEN_AXE, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.WOODEN_HOE, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.STONE_SWORD, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.STONE_SHOVEL, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.STONE_PICKAXE, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.STONE_AXE, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.STONE_HOE, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.GOLDEN_SWORD, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.GOLDEN_SHOVEL, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.GOLDEN_PICKAXE, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.GOLDEN_AXE, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.GOLDEN_HOE, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.IRON_SWORD, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.IRON_SHOVEL, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.IRON_PICKAXE, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.IRON_AXE, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.IRON_HOE, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.DIAMOND_SWORD, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.DIAMOND_SHOVEL, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.DIAMOND_PICKAXE, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.DIAMOND_AXE, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.DIAMOND_HOE, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.NETHERITE_SWORD, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.NETHERITE_SHOVEL, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.NETHERITE_PICKAXE, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.NETHERITE_AXE, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.NETHERITE_HOE, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.STICK, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.BOWL, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.MUSHROOM_STEW, new Color(255, 204, 204)); // Light Red
        blocksMap.put(Material.STRING, new Color(255, 255, 255)); // White
        blocksMap.put(Material.FEATHER, new Color(255, 255, 255)); // White
        blocksMap.put(Material.GUNPOWDER, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.WHEAT_SEEDS, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.BREAD, new Color(255, 204, 153)); // Light Brown
        blocksMap.put(Material.LEATHER_HELMET, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.LEATHER_CHESTPLATE, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.LEATHER_LEGGINGS, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.LEATHER_BOOTS, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.CHAINMAIL_HELMET, new Color(192, 192, 192)); // Silver
        blocksMap.put(Material.CHAINMAIL_CHESTPLATE, new Color(192, 192, 192)); // Silver
        blocksMap.put(Material.CHAINMAIL_LEGGINGS, new Color(192, 192, 192)); // Silver
        blocksMap.put(Material.CHAINMAIL_BOOTS, new Color(192, 192, 192)); // Silver
        blocksMap.put(Material.IRON_HELMET, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.IRON_CHESTPLATE, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.IRON_LEGGINGS, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.IRON_BOOTS, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.DIAMOND_HELMET, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.DIAMOND_CHESTPLATE, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.DIAMOND_LEGGINGS, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.DIAMOND_BOOTS, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.GOLDEN_HELMET, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.GOLDEN_CHESTPLATE, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.GOLDEN_LEGGINGS, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.GOLDEN_BOOTS, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.NETHERITE_HELMET, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.NETHERITE_CHESTPLATE, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.NETHERITE_LEGGINGS, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.NETHERITE_BOOTS, new Color(112, 112, 112)); // Light Gray
        blocksMap.put(Material.FLINT, new Color(105, 105, 105)); // Dim Gray
        blocksMap.put(Material.PORKCHOP, new Color(255, 182, 193)); // Light Pink
        blocksMap.put(Material.COOKED_PORKCHOP, new Color(210, 105, 30)); // Dark Orange
        blocksMap.put(Material.PAINTING, new Color(205, 133, 63)); // Peru
        blocksMap.put(Material.GOLDEN_APPLE, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.ENCHANTED_GOLDEN_APPLE, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.OAK_SIGN, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.SPRUCE_SIGN, new Color(86, 64, 39)); // Brown
        blocksMap.put(Material.BIRCH_SIGN, new Color(255, 239, 191)); // Light Yellow
        blocksMap.put(Material.JUNGLE_SIGN, new Color(92, 64, 51)); // Jungle Wood
        blocksMap.put(Material.ACACIA_SIGN, new Color(210, 105, 30)); // Dark Orange
        blocksMap.put(Material.CHERRY_SIGN, new Color(255, 105, 180)); // Hot Pink
        blocksMap.put(Material.DARK_OAK_SIGN, new Color(55, 27, 10)); // Very Dark Brown
        blocksMap.put(Material.MANGROVE_SIGN, new Color(128, 42, 42)); // Red-brown
        blocksMap.put(Material.BAMBOO_SIGN, new Color(204, 204, 51)); // Light Green Yellow
        blocksMap.put(Material.CRIMSON_SIGN, new Color(200, 0, 0)); // Crimson Red
        blocksMap.put(Material.WARPED_SIGN, new Color(0, 200, 200)); // Turquoise
        blocksMap.put(Material.OAK_HANGING_SIGN, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.SPRUCE_HANGING_SIGN, new Color(86, 64, 39)); // Brown
        blocksMap.put(Material.BIRCH_HANGING_SIGN, new Color(255, 239, 191)); // Light Yellow
        blocksMap.put(Material.JUNGLE_HANGING_SIGN, new Color(92, 64, 51)); // Jungle Wood
        blocksMap.put(Material.ACACIA_HANGING_SIGN, new Color(210, 105, 30)); // Dark Orange
        blocksMap.put(Material.CHERRY_HANGING_SIGN, new Color(255, 105, 180)); // Hot Pink
        blocksMap.put(Material.DARK_OAK_HANGING_SIGN, new Color(55, 27, 10)); // Very Dark Brown
        blocksMap.put(Material.MANGROVE_HANGING_SIGN, new Color(128, 42, 42)); // Red-brown
        blocksMap.put(Material.BAMBOO_HANGING_SIGN, new Color(204, 204, 51)); // Light Green Yellow
        blocksMap.put(Material.CRIMSON_HANGING_SIGN, new Color(200, 0, 0)); // Crimson Red
        blocksMap.put(Material.WARPED_HANGING_SIGN, new Color(0, 200, 200)); // Turquoise
        blocksMap.put(Material.BUCKET, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.WATER_BUCKET, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.LAVA_BUCKET, new Color(255, 69, 0)); // Red-Orange
        blocksMap.put(Material.POWDER_SNOW_BUCKET, new Color(255, 255, 255)); // White
        blocksMap.put(Material.SNOWBALL, new Color(255, 255, 255)); // White
        blocksMap.put(Material.LEATHER, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.MILK_BUCKET, new Color(255, 255, 255)); // White
        blocksMap.put(Material.PUFFERFISH_BUCKET, new Color(255, 204, 204)); // Light Red
        blocksMap.put(Material.SALMON_BUCKET, new Color(255, 160, 122)); // Light Salmon
        blocksMap.put(Material.COD_BUCKET, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.TROPICAL_FISH_BUCKET, new Color(255, 140, 0)); // Orange
        blocksMap.put(Material.AXOLOTL_BUCKET, new Color(255, 228, 196)); // Light Pink
        blocksMap.put(Material.TADPOLE_BUCKET, new Color(127, 255, 0)); // Chartreuse
        blocksMap.put(Material.CLAY_BALL, new Color(205, 133, 63)); // Peru
        blocksMap.put(Material.DRIED_KELP_BLOCK, new Color(34, 139, 34)); // Dark Green
        blocksMap.put(Material.PAPER, new Color(255, 255, 255)); // White
        blocksMap.put(Material.BOOK, new Color(134, 47, 17)); // Dark Red
        blocksMap.put(Material.SLIME_BALL, new Color(60, 179, 113)); // Medium Sea Green
        blocksMap.put(Material.EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.COMPASS, new Color(192, 192, 192)); // Silver
        blocksMap.put(Material.RECOVERY_COMPASS, new Color(192, 192, 192)); // Silver
        blocksMap.put(Material.BUNDLE, new Color(210, 180, 140)); // Tan
        blocksMap.put(Material.FISHING_ROD, new Color(139, 69, 19)); // Brown
        blocksMap.put(Material.CLOCK, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.SPYGLASS, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.GLOWSTONE_DUST, new Color(255, 214, 0)); // Light Yellow
        blocksMap.put(Material.COD, new Color(86, 122, 155)); // Blue
        blocksMap.put(Material.SALMON, new Color(255, 160, 122)); // Salmon Pink
        blocksMap.put(Material.TROPICAL_FISH, new Color(255, 123, 64)); // Orange
        blocksMap.put(Material.PUFFERFISH, new Color(255, 233, 122)); // Yellow
        blocksMap.put(Material.COOKED_COD, new Color(217, 169, 125)); // Cooked Brown
        blocksMap.put(Material.COOKED_SALMON, new Color(255, 82, 82)); // Cooked Salmon
        blocksMap.put(Material.INK_SAC, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.GLOW_INK_SAC, new Color(255, 255, 255)); // White
        blocksMap.put(Material.COCOA_BEANS, new Color(138, 90, 58)); // Brown
        blocksMap.put(Material.WHITE_DYE, new Color(255, 255, 255)); // White
        blocksMap.put(Material.ORANGE_DYE, new Color(255, 165, 0)); // Orange
        blocksMap.put(Material.MAGENTA_DYE, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.LIGHT_BLUE_DYE, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.YELLOW_DYE, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.LIME_DYE, new Color(0, 255, 0)); // Lime
        blocksMap.put(Material.PINK_DYE, new Color(255, 192, 203)); // Pink
        blocksMap.put(Material.GRAY_DYE, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.LIGHT_GRAY_DYE, new Color(211, 211, 211)); // Light Gray
        blocksMap.put(Material.CYAN_DYE, new Color(0, 255, 255)); // Cyan
        blocksMap.put(Material.PURPLE_DYE, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.BLUE_DYE, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.BROWN_DYE, new Color(165, 42, 42)); // Brown
        blocksMap.put(Material.GREEN_DYE, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.RED_DYE, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.BLACK_DYE, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.BONE_MEAL, new Color(255, 255, 255)); // White
        blocksMap.put(Material.BONE, new Color(255, 255, 204)); // Off White
        blocksMap.put(Material.SUGAR, new Color(255, 255, 255)); // White
        blocksMap.put(Material.CAKE, new Color(255, 204, 204)); // Light Cake Color
        blocksMap.put(Material.ORANGE_BED, new Color(255, 165, 0)); // Orange
        blocksMap.put(Material.MAGENTA_BED, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.LIGHT_BLUE_BED, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.YELLOW_BED, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.LIME_BED, new Color(0, 255, 0)); // Lime
        blocksMap.put(Material.PINK_BED, new Color(255, 192, 203)); // Pink
        blocksMap.put(Material.LIGHT_GRAY_BED, new Color(211, 211, 211)); // Light Gray
        blocksMap.put(Material.CYAN_BED, new Color(0, 255, 255)); // Cyan
        blocksMap.put(Material.PURPLE_BED, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.BLUE_BED, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.BROWN_BED, new Color(165, 42, 42)); // Brown
        blocksMap.put(Material.GREEN_BED, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.RED_BED, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.BLACK_BED, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.COOKIE, new Color(205, 133, 63)); // Brownish
        blocksMap.put(Material.FILLED_MAP, new Color(255, 255, 255)); // White
        blocksMap.put(Material.SHEARS, new Color(169, 169, 169)); // Light Gray
        blocksMap.put(Material.MELON_SLICE, new Color(255, 192, 203)); // Light Pink
        blocksMap.put(Material.DRIED_KELP, new Color(107, 142, 35)); // Olive Green
        blocksMap.put(Material.PUMPKIN_SEEDS, new Color(255, 204, 0)); // Pumpkin Orange
        blocksMap.put(Material.MELON_SEEDS, new Color(255, 255, 102)); // Light Yellow
        blocksMap.put(Material.BEEF, new Color(128, 0, 0)); // Dark Red
        blocksMap.put(Material.COOKED_BEEF, new Color(255, 165, 0)); // Cooked Orange
        blocksMap.put(Material.CHICKEN, new Color(255, 240, 192)); // Light Chicken
        blocksMap.put(Material.COOKED_CHICKEN, new Color(255, 192, 128)); // Cooked Light Brown
        blocksMap.put(Material.ROTTEN_FLESH, new Color(139, 69, 19)); // Dark Brown
        blocksMap.put(Material.ENDER_PEARL, new Color(207, 183, 198)); // Light Purple
        blocksMap.put(Material.BLAZE_ROD, new Color(255, 165, 0)); // Blaze Orange
        blocksMap.put(Material.GHAST_TEAR, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.GOLD_NUGGET, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.NETHER_WART, new Color(127, 0, 0)); // Dark Red
        blocksMap.put(Material.POTION, new Color(0, 255, 0)); // Green
        blocksMap.put(Material.GLASS_BOTTLE, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.SPIDER_EYE, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.FERMENTED_SPIDER_EYE, new Color(107, 65, 65)); // Dark Brown
        blocksMap.put(Material.BLAZE_POWDER, new Color(255, 165, 0)); // Blaze Orange
        blocksMap.put(Material.MAGMA_CREAM, new Color(255, 69, 0)); // Orange Red
        blocksMap.put(Material.CAULDRON, new Color(169, 169, 169)); // Light Gray
        blocksMap.put(Material.ENDER_EYE, new Color(183, 92, 128)); // Pinkish
        blocksMap.put(Material.GLISTERING_MELON_SLICE, new Color(255, 165, 0)); // Glistering Orange
        blocksMap.put(Material.ALLAY_SPAWN_EGG, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.AXOLOTL_SPAWN_EGG, new Color(255, 182, 193)); // Light Pink
        blocksMap.put(Material.BAT_SPAWN_EGG, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.BEE_SPAWN_EGG, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.BLAZE_SPAWN_EGG, new Color(255, 165, 0)); // Blaze Orange
        blocksMap.put(Material.CAT_SPAWN_EGG, new Color(255, 192, 203)); // Light Pink
        blocksMap.put(Material.CAMEL_SPAWN_EGG, new Color(205, 133, 63)); // Brown
        blocksMap.put(Material.CAVE_SPIDER_SPAWN_EGG, new Color(0, 255, 0)); // Green
        blocksMap.put(Material.CHICKEN_SPAWN_EGG, new Color(255, 227, 101)); // Light Yellow
        blocksMap.put(Material.COD_SPAWN_EGG, new Color(86, 122, 155)); // Blue
        blocksMap.put(Material.COW_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.CREEPER_SPAWN_EGG, new Color(0, 255, 0)); // Green
        blocksMap.put(Material.DOLPHIN_SPAWN_EGG, new Color(70, 130, 180)); // Steel Blue
        blocksMap.put(Material.DONKEY_SPAWN_EGG, new Color(164, 79, 45)); // Brown
        blocksMap.put(Material.DROWNED_SPAWN_EGG, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.ELDER_GUARDIAN_SPAWN_EGG, new Color(0, 128, 128)); // Teal
        blocksMap.put(Material.ENDER_DRAGON_SPAWN_EGG, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.ENDERMAN_SPAWN_EGG, new Color(75, 0, 130)); // Indigo
        blocksMap.put(Material.ENDERMITE_SPAWN_EGG, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.EVOKER_SPAWN_EGG, new Color(219, 166, 128)); // Tan
        blocksMap.put(Material.FOX_SPAWN_EGG, new Color(255, 140, 0)); // Orange
        blocksMap.put(Material.FROG_SPAWN_EGG, new Color(50, 205, 50)); // Lime Green
        blocksMap.put(Material.GHAST_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.GLOW_SQUID_SPAWN_EGG, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.GOAT_SPAWN_EGG, new Color(255, 255, 224)); // Light Yellow
        blocksMap.put(Material.GUARDIAN_SPAWN_EGG, new Color(0, 128, 255)); // Light Blue
        blocksMap.put(Material.HOGLIN_SPAWN_EGG, new Color(174, 92, 45)); // Brown
        blocksMap.put(Material.HORSE_SPAWN_EGG, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.HUSK_SPAWN_EGG, new Color(217, 217, 217)); // Gray
        blocksMap.put(Material.IRON_GOLEM_SPAWN_EGG, new Color(160, 160, 160)); // Silver
        blocksMap.put(Material.LLAMA_SPAWN_EGG, new Color(255, 228, 196)); // Bisque
        blocksMap.put(Material.MAGMA_CUBE_SPAWN_EGG, new Color(255, 102, 0)); // Orange
        blocksMap.put(Material.MOOSHROOM_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.MULE_SPAWN_EGG, new Color(210, 180, 140)); // Tan
        blocksMap.put(Material.OCELOT_SPAWN_EGG, new Color(252, 163, 17)); // Orange
        blocksMap.put(Material.PANDA_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.PARROT_SPAWN_EGG, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.PHANTOM_SPAWN_EGG, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.PIG_SPAWN_EGG, new Color(250, 206, 215)); // Light Pink
        blocksMap.put(Material.PIGLIN_SPAWN_EGG, new Color(108, 70, 31)); // Brown
        blocksMap.put(Material.PIGLIN_BRUTE_SPAWN_EGG, new Color(79, 39, 21)); // Dark Brown
        blocksMap.put(Material.PILLAGER_SPAWN_EGG, new Color(255, 204, 204)); // Light Pink
        blocksMap.put(Material.POLAR_BEAR_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.PUFFERFISH_SPAWN_EGG, new Color(255, 233, 122)); // Yellow
        blocksMap.put(Material.RABBIT_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.RAVAGER_SPAWN_EGG, new Color(168, 95, 65)); // Brown
        blocksMap.put(Material.SALMON_SPAWN_EGG, new Color(255, 160, 122)); // Salmon
        blocksMap.put(Material.SHEEP_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.SHULKER_SPAWN_EGG, new Color(169, 139, 160)); // Light Purple
        blocksMap.put(Material.SILVERFISH_SPAWN_EGG, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.SKELETON_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.SKELETON_HORSE_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.SLIME_SPAWN_EGG, new Color(50, 205, 50)); // Lime Green
        blocksMap.put(Material.SNIFFER_SPAWN_EGG, new Color(179, 255, 179)); // Light Green
        blocksMap.put(Material.SNOW_GOLEM_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.SPIDER_SPAWN_EGG, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.SQUID_SPAWN_EGG, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.STRAY_SPAWN_EGG, new Color(200, 200, 200)); // Light Gray
        blocksMap.put(Material.STRIDER_SPAWN_EGG, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.TADPOLE_SPAWN_EGG, new Color(51, 153, 255)); // Light Blue
        blocksMap.put(Material.TRADER_LLAMA_SPAWN_EGG, new Color(215, 180, 140)); // Tan
        blocksMap.put(Material.TROPICAL_FISH_SPAWN_EGG, new Color(255, 127, 80)); // Coral
        blocksMap.put(Material.TURTLE_SPAWN_EGG, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.VEX_SPAWN_EGG, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.VILLAGER_SPAWN_EGG, new Color(236, 236, 236)); // Light Gray
        blocksMap.put(Material.VINDICATOR_SPAWN_EGG, new Color(219, 204, 179)); // Tan
        blocksMap.put(Material.WANDERING_TRADER_SPAWN_EGG, new Color(236, 236, 236)); // Light Gray
        blocksMap.put(Material.WARDEN_SPAWN_EGG, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.WITCH_SPAWN_EGG, new Color(0, 0, 139)); // Dark Blue
        blocksMap.put(Material.WITHER_SPAWN_EGG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.WITHER_SKELETON_SPAWN_EGG, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.WOLF_SPAWN_EGG, new Color(169, 169, 169)); // Gray
        blocksMap.put(Material.ZOGLIN_SPAWN_EGG, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.ZOMBIE_SPAWN_EGG, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.ZOMBIE_HORSE_SPAWN_EGG, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.ZOMBIE_VILLAGER_SPAWN_EGG, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG, new Color(119, 62, 36)); // Dark Brown
        blocksMap.put(Material.EXPERIENCE_BOTTLE, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.FIRE_CHARGE, new Color(255, 69, 0)); // Orange Red
        blocksMap.put(Material.WRITABLE_BOOK, new Color(184, 134, 11)); // Goldenrod
        blocksMap.put(Material.WRITTEN_BOOK, new Color(255, 255, 255)); // White
        blocksMap.put(Material.GLOW_ITEM_FRAME, new Color(255, 255, 255)); // White
        blocksMap.put(Material.CARROT, new Color(255, 165, 0)); // Orange
        blocksMap.put(Material.POTATO, new Color(205, 133, 63)); // Brownish
        blocksMap.put(Material.BAKED_POTATO, new Color(255, 228, 196)); // Bisque
        blocksMap.put(Material.POISONOUS_POTATO, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.MAP, new Color(255, 255, 255)); // White
        blocksMap.put(Material.GOLDEN_CARROT, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.SKELETON_SKULL, new Color(255, 255, 255)); // White
        blocksMap.put(Material.WITHER_SKELETON_SKULL, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.PLAYER_HEAD, new Color(255, 224, 189)); // Skin Color
        blocksMap.put(Material.ZOMBIE_HEAD, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.CREEPER_HEAD, new Color(0, 255, 0)); // Green
        blocksMap.put(Material.DRAGON_HEAD, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.NETHER_STAR, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.PUMPKIN_PIE, new Color(255, 204, 0)); // Pumpkin Orange
        blocksMap.put(Material.FIREWORK_ROCKET, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.FIREWORK_STAR, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.ENCHANTED_BOOK, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.PRISMARINE_SHARD, new Color(0, 139, 139)); // Dark Cyan
        blocksMap.put(Material.PRISMARINE_CRYSTALS, new Color(38, 193, 56)); // Light Cyan
        blocksMap.put(Material.RABBIT, new Color(255, 255, 255)); // White
        blocksMap.put(Material.COOKED_RABBIT, new Color(218, 165, 32)); // Golden Brown
        blocksMap.put(Material.RABBIT_STEW, new Color(255, 255, 255)); // White
        blocksMap.put(Material.RABBIT_FOOT, new Color(205, 133, 63)); // Brownish
        blocksMap.put(Material.RABBIT_HIDE, new Color(139, 69, 19)); // Dark Brown
        blocksMap.put(Material.ARMOR_STAND, new Color(160, 82, 45)); // Saddle Brown
        blocksMap.put(Material.IRON_HORSE_ARMOR, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.GOLDEN_HORSE_ARMOR, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.DIAMOND_HORSE_ARMOR, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.LEATHER_HORSE_ARMOR, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.LEAD, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.NAME_TAG, new Color(255, 255, 255)); // White
        blocksMap.put(Material.COMMAND_BLOCK_MINECART, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.MUTTON, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.COOKED_MUTTON, new Color(255, 160, 122)); // Cooked Salmon
        blocksMap.put(Material.END_CRYSTAL, new Color(255, 255, 255)); // White
        blocksMap.put(Material.CHORUS_FRUIT, new Color(221, 160, 221)); // Plum
        blocksMap.put(Material.POPPED_CHORUS_FRUIT, new Color(204, 204, 255)); // Lavender
        blocksMap.put(Material.TORCHFLOWER_SEEDS, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.BEETROOT, new Color(178, 34, 34)); // Firebrick
        blocksMap.put(Material.BEETROOT_SEEDS, new Color(50, 205, 50)); // Lime Green
        blocksMap.put(Material.BEETROOT_SOUP, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.DRAGON_BREATH, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.SPLASH_POTION, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.SPECTRAL_ARROW, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.TIPPED_ARROW, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.LINGERING_POTION, new Color(255, 140, 0)); // Orange
        blocksMap.put(Material.SHIELD, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.TOTEM_OF_UNDYING, new Color(50, 205, 50)); // Lime Green
        blocksMap.put(Material.SHULKER_SHELL, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.IRON_NUGGET, new Color(200, 200, 200)); // Light Gray
        blocksMap.put(Material.DEBUG_STICK, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.MUSIC_DISC_13, new Color(107, 142, 35)); // Olive Green
        blocksMap.put(Material.MUSIC_DISC_CAT, new Color(255, 255, 102)); // Light Yellow
        blocksMap.put(Material.MUSIC_DISC_BLOCKS, new Color(135, 206, 235)); // Sky Blue
        blocksMap.put(Material.MUSIC_DISC_CHIRP, new Color(255, 128, 0)); // Orange
        blocksMap.put(Material.MUSIC_DISC_FAR, new Color(0, 128, 255)); // Light Blue
        blocksMap.put(Material.MUSIC_DISC_MALL, new Color(255, 192, 203)); // Light Pink
        blocksMap.put(Material.MUSIC_DISC_MELLOHI, new Color(255, 20, 147)); // Deep Pink
        blocksMap.put(Material.MUSIC_DISC_STAL, new Color(169, 169, 169)); // Light Gray
        blocksMap.put(Material.MUSIC_DISC_STRAD, new Color(123, 104, 238)); // Medium Slate Blue
        blocksMap.put(Material.MUSIC_DISC_WARD, new Color(102, 205, 170)); // Medium Aquamarine
        blocksMap.put(Material.MUSIC_DISC_11, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.MUSIC_DISC_WAIT, new Color(240, 128, 128)); // Light Coral
        blocksMap.put(Material.MUSIC_DISC_OTHERSIDE, new Color(72, 61, 139)); // Dark Slate Blue
        blocksMap.put(Material.MUSIC_DISC_5, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.MUSIC_DISC_PIGSTEP, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.DISC_FRAGMENT_5, new Color(255, 140, 0)); // Orange
        blocksMap.put(Material.TRIDENT, new Color(30, 144, 255)); // Dodger Blue
        blocksMap.put(Material.PHANTOM_MEMBRANE, new Color(135, 206, 235)); // Sky Blue
        blocksMap.put(Material.NAUTILUS_SHELL, new Color(135, 206, 250)); // Light Sky Blue
        blocksMap.put(Material.HEART_OF_THE_SEA, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.CROSSBOW, new Color(160, 82, 45)); // Saddle Brown
        blocksMap.put(Material.SUSPICIOUS_STEW, new Color(186, 129, 94)); // Tan
        blocksMap.put(Material.LOOM, new Color(255, 228, 196)); // Bisque
        blocksMap.put(Material.FLOWER_BANNER_PATTERN, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.CREEPER_BANNER_PATTERN, new Color(0, 255, 0)); // Green
        blocksMap.put(Material.SKULL_BANNER_PATTERN, new Color(255, 255, 255)); // White
        blocksMap.put(Material.MOJANG_BANNER_PATTERN, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.GLOBE_BANNER_PATTERN, new Color(30, 144, 255)); // Dodger Blue
        blocksMap.put(Material.PIGLIN_BANNER_PATTERN, new Color(200, 164, 114)); // Tan
        blocksMap.put(Material.GOAT_HORN, new Color(255, 228, 196)); // Bisque
        blocksMap.put(Material.BARREL, new Color(178, 148, 87)); // Oak
        blocksMap.put(Material.SMOKER, new Color(100, 100, 100)); // Gray
        blocksMap.put(Material.BLAST_FURNACE, new Color(64, 64, 64)); // Dark Gray
        blocksMap.put(Material.CARTOGRAPHY_TABLE, new Color(255, 228, 196)); // Bisque
        blocksMap.put(Material.FLETCHING_TABLE, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.GRINDSTONE, new Color(211, 211, 211)); // Light Gray
        blocksMap.put(Material.SMITHING_TABLE, new Color(160, 82, 45)); // Saddle Brown
        blocksMap.put(Material.STONECUTTER, new Color(139, 139, 139)); // Gray
        blocksMap.put(Material.SWEET_BERRIES, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.GLOW_BERRIES, new Color(255, 224, 102)); // Light Yellow
        blocksMap.put(Material.SOUL_CAMPFIRE, new Color(0, 255, 255)); // Cyan
        blocksMap.put(Material.HONEYCOMB, new Color(255, 204, 0)); // Gold
        blocksMap.put(Material.BEEHIVE, new Color(255, 204, 0)); // Gold
        blocksMap.put(Material.HONEY_BOTTLE, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.LODESTONE, new Color(80, 80, 80)); // Dark Gray
        blocksMap.put(Material.BLACKSTONE_SLAB, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.BLACKSTONE_STAIRS, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.POLISHED_BLACKSTONE_SLAB, new Color(112, 112, 112)); // Gray
        blocksMap.put(Material.POLISHED_BLACKSTONE_STAIRS, new Color(112, 112, 112)); // Gray
        blocksMap.put(Material.POLISHED_BLACKSTONE_BRICK_SLAB, new Color(95, 95, 95)); // Dark Gray
        blocksMap.put(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, new Color(95, 95, 95)); // Dark Gray
        blocksMap.put(Material.RESPAWN_ANCHOR, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.CANDLE, new Color(255, 255, 204)); // Light Yellow
        blocksMap.put(Material.WHITE_CANDLE, new Color(255, 255, 255)); // White
        blocksMap.put(Material.ORANGE_CANDLE, new Color(255, 165, 0)); // Orange
        blocksMap.put(Material.MAGENTA_CANDLE, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.LIGHT_BLUE_CANDLE, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.YELLOW_CANDLE, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.LIME_CANDLE, new Color(0, 255, 0)); // Lime
        blocksMap.put(Material.PINK_CANDLE, new Color(255, 192, 203)); // Pink
        blocksMap.put(Material.GRAY_CANDLE, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.LIGHT_GRAY_CANDLE, new Color(211, 211, 211)); // Light Gray
        blocksMap.put(Material.CYAN_CANDLE, new Color(0, 255, 255)); // Cyan
        blocksMap.put(Material.PURPLE_CANDLE, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.BLUE_CANDLE, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.BROWN_CANDLE, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.GREEN_CANDLE, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.RED_CANDLE, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.BLACK_CANDLE, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.SMALL_AMETHYST_BUD, new Color(153, 50, 204)); // Dark Orchid
        blocksMap.put(Material.MEDIUM_AMETHYST_BUD, new Color(186, 85, 211)); // Medium Orchid
        blocksMap.put(Material.LARGE_AMETHYST_BUD, new Color(148, 0, 211)); // Dark Violet
        blocksMap.put(Material.AMETHYST_CLUSTER, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.POINTED_DRIPSTONE, new Color(139, 137, 137)); // Gray
        blocksMap.put(Material.OCHRE_FROGLIGHT, new Color(255, 204, 0)); // Gold
        blocksMap.put(Material.VERDANT_FROGLIGHT, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.PEARLESCENT_FROGLIGHT, new Color(240, 248, 255)); // Alice Blue
        blocksMap.put(Material.FROGSPAWN, new Color(110, 174, 150)); // Dark Sea Green
        blocksMap.put(Material.ECHO_SHARD, new Color(211, 211, 211)); // Light Gray
        blocksMap.put(Material.BRUSH, new Color(160, 82, 45)); // Saddle Brown
        blocksMap.put(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(0, 100, 0)); // Dark Green
        blocksMap.put(Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(244, 164, 96)); // Sandy Brown
        blocksMap.put(Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(176, 224, 230)); // Powder Blue
        blocksMap.put(Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(0, 100, 0)); // Dark Green
        blocksMap.put(Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(255, 255, 255)); // White
        blocksMap.put(Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(255, 215, 0)); // Gold
        blocksMap.put(Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(135, 206, 250)); // Light Sky Blue
        blocksMap.put(Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(30, 144, 255)); // Dodger Blue
        blocksMap.put(Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(204, 101, 192)); // Medium Violet Red
        blocksMap.put(Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(220, 20, 60)); // Crimson
        blocksMap.put(Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(240, 230, 140)); // Khaki
        blocksMap.put(Material.PISTON_HEAD, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.MOVING_PISTON, new Color(169, 169, 169)); // Dark Gray
        blocksMap.put(Material.FIRE, new Color(255, 69, 0)); // Orange Red
        blocksMap.put(Material.SOUL_FIRE, new Color(154, 205, 50)); // Yellow Green
        blocksMap.put(Material.REDSTONE_WIRE, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.OAK_WALL_SIGN, new Color(165, 123, 63)); // Brown
        blocksMap.put(Material.SPRUCE_WALL_SIGN, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.BIRCH_WALL_SIGN, new Color(255, 248, 220)); // Beige
        blocksMap.put(Material.ACACIA_WALL_SIGN, new Color(210, 105, 30)); // Chocolate
        blocksMap.put(Material.CHERRY_WALL_SIGN, new Color(255, 182, 193)); // Light Pink
        blocksMap.put(Material.JUNGLE_WALL_SIGN, new Color(106, 27, 154)); // Purple
        blocksMap.put(Material.DARK_OAK_WALL_SIGN, new Color(101, 67, 33)); // Chestnut
        blocksMap.put(Material.MANGROVE_WALL_SIGN, new Color(78, 54, 33)); // Dark Brown
        blocksMap.put(Material.BAMBOO_WALL_SIGN, new Color(227, 207, 100)); // Light Yellow
        blocksMap.put(Material.OAK_WALL_HANGING_SIGN, new Color(165, 123, 63)); // Brown
        blocksMap.put(Material.SPRUCE_WALL_HANGING_SIGN, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.BIRCH_WALL_HANGING_SIGN, new Color(255, 248, 220)); // Beige
        blocksMap.put(Material.ACACIA_WALL_HANGING_SIGN, new Color(210, 105, 30)); // Chocolate
        blocksMap.put(Material.CHERRY_WALL_HANGING_SIGN, new Color(255, 182, 193)); // Light Pink
        blocksMap.put(Material.JUNGLE_WALL_HANGING_SIGN, new Color(106, 27, 154)); // Purple
        blocksMap.put(Material.DARK_OAK_WALL_HANGING_SIGN, new Color(101, 67, 33)); // Chestnut
        blocksMap.put(Material.MANGROVE_WALL_HANGING_SIGN, new Color(78, 54, 33)); // Dark Brown
        blocksMap.put(Material.CRIMSON_WALL_HANGING_SIGN, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.WARPED_WALL_HANGING_SIGN, new Color(0, 255, 255)); // Cyan
        blocksMap.put(Material.BAMBOO_WALL_HANGING_SIGN, new Color(255, 255, 102)); // Light Yellow
        blocksMap.put(Material.REDSTONE_WALL_TORCH, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.SOUL_WALL_TORCH, new Color(50, 205, 50)); // Lime Green
        blocksMap.put(Material.ATTACHED_MELON_STEM, new Color(255, 204, 0)); // Gold
        blocksMap.put(Material.PUMPKIN_STEM, new Color(255, 165, 0)); // Orange
        blocksMap.put(Material.WATER_CAULDRON, new Color(0, 191, 255)); // Deep Sky Blue
        blocksMap.put(Material.LAVA_CAULDRON, new Color(255, 69, 0)); // Orange Red
        blocksMap.put(Material.POWDER_SNOW_CAULDRON, new Color(255, 255, 255)); // White
        blocksMap.put(Material.END_PORTAL, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.POTTED_TORCHFLOWER, new Color(255, 255, 102)); // Light Yellow
        blocksMap.put(Material.POTTED_OAK_SAPLING, new Color(34, 139, 34)); // Forest Green
        blocksMap.put(Material.POTTED_SPRUCE_SAPLING, new Color(32, 178, 170)); // Light Sea Green
        blocksMap.put(Material.POTTED_BIRCH_SAPLING, new Color(255, 228, 196)); // Bisque
        blocksMap.put(Material.POTTED_JUNGLE_SAPLING, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.POTTED_ACACIA_SAPLING, new Color(210, 105, 30)); // Chocolate
        blocksMap.put(Material.POTTED_CHERRY_SAPLING, new Color(255, 182, 193)); // Light Pink
        blocksMap.put(Material.POTTED_DARK_OAK_SAPLING, new Color(101, 67, 33)); // Chestnut
        blocksMap.put(Material.POTTED_MANGROVE_PROPAGULE, new Color(34, 139, 34)); // Forest Green
        blocksMap.put(Material.POTTED_FERN, new Color(107, 142, 35)); // Olive Green
        blocksMap.put(Material.POTTED_DANDELION, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.POTTED_POPPY, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.POTTED_BLUE_ORCHID, new Color(0, 191, 255)); // Light Sky Blue
        blocksMap.put(Material.POTTED_ALLIUM, new Color(218, 112, 214)); // Orchid
        blocksMap.put(Material.POTTED_AZURE_BLUET, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.POTTED_RED_TULIP, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.POTTED_ORANGE_TULIP, new Color(255, 165, 0)); // Orange
        blocksMap.put(Material.POTTED_WHITE_TULIP, new Color(255, 255, 255)); // White
        blocksMap.put(Material.POTTED_PINK_TULIP, new Color(255, 192, 203)); // Pink
        blocksMap.put(Material.POTTED_OXEYE_DAISY, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.POTTED_CORNFLOWER, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.POTTED_LILY_OF_THE_VALLEY, new Color(255, 255, 255)); // White
        blocksMap.put(Material.POTTED_WITHER_ROSE, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.POTTED_RED_MUSHROOM, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.POTTED_BROWN_MUSHROOM, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.POTTED_DEAD_BUSH, new Color(210, 180, 140)); // Tan
        blocksMap.put(Material.POTTED_CACTUS, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.SKELETON_WALL_SKULL, new Color(255, 255, 255)); // White
        blocksMap.put(Material.WITHER_SKELETON_WALL_SKULL, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.ZOMBIE_WALL_HEAD, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.PLAYER_WALL_HEAD, new Color(255, 224, 189)); // Skin Color
        blocksMap.put(Material.CREEPER_WALL_HEAD, new Color(0, 255, 0)); // Green
        blocksMap.put(Material.DRAGON_WALL_HEAD, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.PIGLIN_WALL_HEAD, new Color(212, 163, 115)); // Light Brown
        blocksMap.put(Material.TORCHFLOWER_CROP, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.END_GATEWAY, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.FROSTED_ICE, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.DEAD_TUBE_CORAL_WALL_FAN, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.DEAD_BRAIN_CORAL_WALL_FAN, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.DEAD_BUBBLE_CORAL_WALL_FAN, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.DEAD_FIRE_CORAL_WALL_FAN, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.DEAD_HORN_CORAL_WALL_FAN, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.TUBE_CORAL_WALL_FAN, new Color(255, 102, 178)); // Pink
        blocksMap.put(Material.BRAIN_CORAL_WALL_FAN, new Color(255, 20, 147)); // Deep Pink
        blocksMap.put(Material.BUBBLE_CORAL_WALL_FAN, new Color(135, 206, 250)); // Light Sky Blue
        blocksMap.put(Material.FIRE_CORAL_WALL_FAN, new Color(255, 69, 0)); // Orange Red
        blocksMap.put(Material.HORN_CORAL_WALL_FAN, new Color(255, 228, 196)); // Bisque
        blocksMap.put(Material.BAMBOO_SAPLING, new Color(34, 139, 34)); // Forest Green
        blocksMap.put(Material.POTTED_BAMBOO, new Color(34, 139, 34)); // Forest Green
        blocksMap.put(Material.VOID_AIR, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.CAVE_AIR, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.CRIMSON_WALL_SIGN, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.WARPED_WALL_SIGN, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.POTTED_CRIMSON_FUNGUS, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.POTTED_WARPED_FUNGUS, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.POTTED_CRIMSON_ROOTS, new Color(255, 102, 102)); // Light Red
        blocksMap.put(Material.POTTED_WARPED_ROOTS, new Color(0, 204, 255)); // Light Blue
        blocksMap.put(Material.CANDLE_CAKE, new Color(255, 204, 0)); // Gold
        blocksMap.put(Material.WHITE_CANDLE_CAKE, new Color(255, 255, 255)); // White
        blocksMap.put(Material.ORANGE_CANDLE_CAKE, new Color(255, 165, 0)); // Orange
        blocksMap.put(Material.MAGENTA_CANDLE_CAKE, new Color(255, 0, 255)); // Magenta
        blocksMap.put(Material.LIGHT_BLUE_CANDLE_CAKE, new Color(173, 216, 230)); // Light Blue
        blocksMap.put(Material.YELLOW_CANDLE_CAKE, new Color(255, 255, 0)); // Yellow
        blocksMap.put(Material.LIME_CANDLE_CAKE, new Color(0, 255, 0)); // Lime
        blocksMap.put(Material.PINK_CANDLE_CAKE, new Color(255, 192, 203)); // Pink
        blocksMap.put(Material.GRAY_CANDLE_CAKE, new Color(128, 128, 128)); // Gray
        blocksMap.put(Material.LIGHT_GRAY_CANDLE_CAKE, new Color(211, 211, 211)); // Light Gray
        blocksMap.put(Material.CYAN_CANDLE_CAKE, new Color(0, 255, 255)); // Cyan
        blocksMap.put(Material.PURPLE_CANDLE_CAKE, new Color(128, 0, 128)); // Purple
        blocksMap.put(Material.BLUE_CANDLE_CAKE, new Color(0, 0, 255)); // Blue
        blocksMap.put(Material.BROWN_CANDLE_CAKE, new Color(139, 69, 19)); // Saddle Brown
        blocksMap.put(Material.GREEN_CANDLE_CAKE, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.RED_CANDLE_CAKE, new Color(255, 0, 0)); // Red
        blocksMap.put(Material.BLACK_CANDLE_CAKE, new Color(0, 0, 0)); // Black
        blocksMap.put(Material.POWDER_SNOW, new Color(255, 255, 255)); // White
        blocksMap.put(Material.CAVE_VINES, new Color(0, 128, 0)); // Green
        blocksMap.put(Material.CAVE_VINES_PLANT, new Color(34, 139, 34)); // Forest Green
        blocksMap.put(Material.BIG_DRIPLEAF_STEM, new Color(100, 100, 100)); // Gray
        blocksMap.put(Material.POTTED_AZALEA_BUSH, new Color(255, 20, 147)); // Deep Pink
        blocksMap.put(Material.POTTED_FLOWERING_AZALEA_BUSH, new Color(255, 192, 203)); // Light Pink
        blocksMap.put(Material.SUSPICIOUS_GRAVEL, new Color(166, 167, 162));
        blocksMap.put(Material.SHORT_GRASS, new Color(79, 118, 77));
        blocksMap.put(Material.PITCHER_PLANT, new Color(120, 113, 144));
        blocksMap.put(Material.DIRT_PATH, new Color(133, 119, 91));
        blocksMap.put(Material.SNIFFER_EGG, new Color(255, 230, 153));
        blocksMap.put(Material.CALIBRATED_SCULK_SENSOR, new Color(5, 5, 5));
        blocksMap.put(Material.TURTLE_SCUTE, new Color(141, 176, 104));
        blocksMap.put(Material.ARMADILLO_SCUTE, new Color(145, 122, 102));
        blocksMap.put(Material.WOLF_ARMOR, new Color(64, 64, 64));
        blocksMap.put(Material.PIGLIN_HEAD, new Color(87, 64, 51));
        blocksMap.put(Material.PITCHER_POD, new Color(194, 153, 115));
        blocksMap.put(Material.MUSIC_DISC_RELIC, new Color(255, 218, 193));
        blocksMap.put(Material.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(232, 211, 183));
        blocksMap.put(Material.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(236, 206, 162));
        blocksMap.put(Material.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(202, 202, 202));
        blocksMap.put(Material.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(210, 112, 102));
        blocksMap.put(Material.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, new Color(178, 158, 136));
        blocksMap.put(Material.ANGLER_POTTERY_SHERD, new Color(137, 112, 68));
        blocksMap.put(Material.ARCHER_POTTERY_SHERD, new Color(179, 134, 86));
        blocksMap.put(Material.ARMS_UP_POTTERY_SHERD, new Color(204, 138, 105));
        blocksMap.put(Material.BLADE_POTTERY_SHERD, new Color(88, 105, 68));
        blocksMap.put(Material.BREWER_POTTERY_SHERD, new Color(115, 91, 45));
        blocksMap.put(Material.BURN_POTTERY_SHERD, new Color(156, 82, 56));
        blocksMap.put(Material.DANGER_POTTERY_SHERD, new Color(204, 39, 39));
        blocksMap.put(Material.EXPLORER_POTTERY_SHERD, new Color(69, 80, 31));
        blocksMap.put(Material.FRIEND_POTTERY_SHERD, new Color(210, 203, 173));
        blocksMap.put(Material.HEART_POTTERY_SHERD, new Color(232, 59, 59));
        blocksMap.put(Material.HEARTBREAK_POTTERY_SHERD, new Color(189, 70, 86));
        blocksMap.put(Material.HOWL_POTTERY_SHERD, new Color(145, 121, 72));
        blocksMap.put(Material.MINER_POTTERY_SHERD, new Color(153, 153, 153));
        blocksMap.put(Material.MOURNER_POTTERY_SHERD, new Color(66, 74, 102));
        blocksMap.put(Material.PLENTY_POTTERY_SHERD, new Color(245, 172, 131));
        blocksMap.put(Material.PRIZE_POTTERY_SHERD, new Color(210, 127, 70));
        blocksMap.put(Material.SHEAF_POTTERY_SHERD, new Color(124, 94, 43));
        blocksMap.put(Material.SHELTER_POTTERY_SHERD, new Color(214, 170, 154));
        blocksMap.put(Material.SKULL_POTTERY_SHERD, new Color(122, 108, 95));
        blocksMap.put(Material.SNORT_POTTERY_SHERD, new Color(130, 120, 95));
        blocksMap.put(Material.PITCHER_CROP, new Color(131, 210, 131));
    }

    public static Color getColorFromType(Block block, double[] dye) {
        if (blocksMap.containsKey(block.getType())) {
            // if blockMap has a color for the material, use that color
            Color color = blocksMap.get(block.getType());
            int redColor = (int) (color.getRed() * dye[0]);
            int greenColor = (int) (color.getGreen() * dye[1]);
            int blueColor = (int) (color.getBlue() * dye[2]);

            if (redColor > 255) redColor = 255;
            if (greenColor > 255) greenColor = 255;
            if (blueColor > 255) blueColor = 255;
            return new Color(redColor, greenColor, blueColor);
        }
        return new Color(0, 0, 0); // no color was found, use gray
    }
}
