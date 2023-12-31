package top.xcon.where;

import org.bukkit.Material;
import org.bukkit.block.Block;
import sun.misc.BASE64Encoder;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Utils {
	static Map<Material, Color> blocksMap = new HashMap<Material, Color>();

	public static void loadColors() {
		// Materials we don't want to use minecraft images for (could be because the
		// image provides a poor color)
		blocksMap.put(Material.GRASS, new Color(49, 101, 25));
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
		blocksMap.put(Material.GRASS_PATH, new Color(170, 148, 89));
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
		blocksMap.put(Material.GRAY_BED,new Color(128,128,128));
		blocksMap.put(Material.ROSE_BUSH,new Color(255,0,0));
		blocksMap.put(Material.VINE,new Color(23, 124, 4));
		blocksMap.put(Material.INFESTED_STONE,new Color(117, 117, 117));
		blocksMap.put(Material.LILAC,new Color(255, 0, 255));
		blocksMap.put(Material.PEONY,new Color(182, 108, 175));;
		blocksMap.put(Material.BEE_NEST,new Color(152,126,51));;
		blocksMap.put(Material.SWEET_BERRY_BUSH,new Color(218, 50, 23));;
		blocksMap.put(Material.STONE_BRICK_STAIRS,new Color(115, 115, 115));;
		blocksMap.put(Material.CHEST,new Color(164, 114, 39));;
		blocksMap.put(Material.STONE_BRICK_WALL,new Color(115, 115, 115));;
		blocksMap.put(Material.STONE_BRICK_SLAB,new Color(115, 115, 115));;
		blocksMap.put(Material.MAGMA_BLOCK,new Color(113, 56, 8));;
		blocksMap.put(Material.COCOA,new Color(136, 143, 65));
		blocksMap.put(Material.MELON,new Color(108, 144, 34));
		blocksMap.put(Material.WHEAT,new Color(26, 147, 26));
		blocksMap.put(Material.HAY_BLOCK,new Color(202, 175, 8));
		blocksMap.put(Material.ACACIA_WOOD,new Color(170, 86, 56));
		blocksMap.put(Material.COMPOSTER,new Color(135, 88, 46));
		blocksMap.put(Material.ACACIA_DOOR,new Color(177, 102, 64));
		blocksMap.put(Material.ACACIA_FENCE_GATE,new Color(177, 102, 64));
		blocksMap.put(Material.SUNFLOWER,new Color(255, 215, 25));
		blocksMap.put(Material.OAK_DOOR,new Color(178, 148, 87));
		blocksMap.put(Material.STRIPPED_OAK_WOOD,new Color(178, 148, 87));
		blocksMap.put(Material.CARROTS,new Color(239, 106, 0));
		blocksMap.put(Material.POTATOES,new Color(249, 187, 92));
		blocksMap.put(Material.SMOOTH_STONE_SLAB,new Color(168, 168, 168));
		blocksMap.put(Material.BELL,new Color(204, 189, 63));
		blocksMap.put(Material.COBBLESTONE_WALL,new Color(124, 123, 124));
		blocksMap.put(Material.BEETROOTS,new Color(133, 111, 74));
		blocksMap.put(Material.SANDSTONE_SLAB,new Color(217, 210, 157));
		blocksMap.put(Material.WHITE_BED,new Color(255, 255, 255));
		blocksMap.put(Material.OAK_FENCE_GATE,new Color(178, 148, 87));
		blocksMap.put(Material.MOSSY_COBBLESTONE_STAIRS,new Color(61, 74, 44));
	}

	public static Color getColorFromType(Block block,double[] dye) {
		if (blocksMap.containsKey(block.getType())) {
			// if blockMap has a color for the material, use that color
			Color color = blocksMap.get(block.getType());
			int redColor = (int) (color.getRed() * dye[0]);
			int greenColor = (int) (color.getGreen() * dye[1]);
			int blueColor = (int) (color.getBlue() * dye[2]);

			if(redColor > 255) redColor = 255;
			if(greenColor > 255) greenColor = 255;
			if(blueColor > 255) blueColor = 255;
			return new Color(redColor, greenColor, blueColor);
		}
		return new Color(0,0,0); // no color was found, use gray
	}

	public static String getImageString(byte[] data) throws IOException {
		BASE64Encoder encoder = new BASE64Encoder();
		return data != null ? encoder.encode(data) : "";
	}
}
