package com.miningmark48.pearcelmod.init;

import cpw.mods.fml.common.Mod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init(){
		
		//Items
	    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcel, 9), new ItemStack(ModBlocks.pearcelBlock));
		GameRegistry.addRecipe(new ItemStack(ModItems.pearcel), "xxx", "x x", "xxx", 'x', new ItemStack(ModItems.pearcelNugget));
		GameRegistry.addSmelting(new ItemStack(ModBlocks.pearcelOre), new ItemStack(ModItems.pearcelNugget),  10f);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelSeeds), new ItemStack(ModItems.pearcel));
        GameRegistry.addSmelting(new ItemStack(ModBlocks.netherPearcelOre), new ItemStack(ModItems.pearcelNugget, 2),  10f);
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelStick, 4), "x", "x", 'x', new ItemStack(ModItems.pearcel));
        GameRegistry.addSmelting(new ItemStack(ModItems.pearcel, 4), new ItemStack(ModItems.pearcelFlour), 10f);
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelBread, 3), "xxx", 'x', new ItemStack(ModItems.pearcelFlour));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelPie), new ItemStack(ModItems.pearcelFlour), new ItemStack(ModItems.pearcel), new ItemStack(Items.egg));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelJuice), new ItemStack(ModItems.pearcel), new ItemStack(Items.bucket), new ItemStack(Items.sugar));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.angelDust), new ItemStack(Items.feather), new ItemStack(Items.sugar), new ItemStack(Items.rotten_flesh), new ItemStack(Items.spider_eye));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelMelon, 2), new ItemStack(Items.melon), new ItemStack(ModItems.pearcel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelSandwich), new ItemStack(ModItems.pearcel), new ItemStack(ModItems.pearcelBread), new ItemStack(ModItems.pearcelJelly), new ItemStack(Items.sugar));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.melonSandwich), new ItemStack(ModItems.pearcel), new ItemStack(ModItems.pearcelBread), new ItemStack(ModItems.melonJelly), new ItemStack(Items.sugar));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelJar, 3), "x x", "x x", " x ", 'x', new ItemStack(ModBlocks.meGlass));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelJelly), new ItemStack(ModItems.pearcelJar), new ItemStack(ModItems.pearcel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.melonJelly), new ItemStack(ModItems.pearcelJar), new ItemStack(ModItems.pearcelMelon));
        GameRegistry.addSmelting(new ItemStack(ModItems.pearcelBeef), new ItemStack(ModItems.pearcelSteak), 10f);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelMelon, 4), new ItemStack(ModBlocks.pearcelMelonBlock));

        //Tools and Weapons
		GameRegistry.addRecipe(new ItemStack(ModItems.pearcelSword), "x", "x", "y", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModItems.pearcelStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModItems.pearcelStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelAxe), "xx", "xy", " y", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModItems.pearcelStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelShovel), "x", "y", "y", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModItems.pearcelStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelHoe), "xx", " y", " y", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModItems.pearcelStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelShears), " x", "x ", 'x', new ItemStack(ModItems.pearcel));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelBow), " xy", "x y", " xy", 'x', new ItemStack(ModItems.pearcelStick), 'y', new ItemStack(Items.string));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelArrow, 4), "x", "y", "z", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModItems.pearcelStick), 'z', new ItemStack(Items.feather));
        GameRegistry.addRecipe(new ItemStack(ModItems.pcp), " x ", "xyx", " x ", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModBlocks.meWorkbench));
        GameRegistry.addRecipe(new ItemStack(ModItems.pcp), "xxx", "xyx", "xxx", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(Blocks.crafting_table));
        GameRegistry.addRecipe(new ItemStack(ModItems.pearcelStaff), "  x", "ay ", " z ", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModItems.pearcelStick), 'z', new ItemStack(ModItems.redMatter), 'a', new ItemStack(ModItems.greenMatter));
		//Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.pearcelTorch, 4), "x", "y", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(ModItems.pearcelStick));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.meBlock), "xxx", "xyx", "xxx", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(Items.iron_ingot));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.pearcelBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcel));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.meGlass, 8), "zxz", "xyx", "zxz", 'x', new ItemStack(Blocks.glass), 'y', new ItemStack(ModItems.pearcel), 'z', new ItemStack(Blocks.obsidian));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.meLamp, 8), "zxz", "xyx", "zxz", 'x', new ItemStack(Blocks.glowstone), 'y', new ItemStack(ModItems.pearcel), 'z', new ItemStack(Items.glowstone_dust));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.meWorkbench), "xy", "yx", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(Blocks.planks));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.ivet), "cyc", "axa", "bzb", 'a', new ItemStack(Blocks.obsidian), 'b', new ItemStack(ModItems.pearcel), 'c', new ItemStack(Items.iron_ingot), 'x', new ItemStack(ModBlocks.meWorkbench), 'y', new ItemStack(Items.book), 'z', new ItemStack(Items.diamond));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.pearcelMelonBlock), "xxx", "xyx", "xxx", 'x', new ItemStack(ModItems.pearcel), 'y', new ItemStack(Items.melon));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.pearcelMelonBlock), "xx", "xx", 'x', new ItemStack(ModItems.pearcelMelon));
        //Compressed Blocks/Items
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie), new ItemStack(Items.egg), new ItemStack(ModItems.pearcelFlour), new ItemStack(Items.sugar), new ItemStack(Items.milk_bucket));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pearcelCookie2), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcelCookie));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pearcelCookie3), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcelCookie2));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pearcelCookie4), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcelCookie3));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pearcelCookie5), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcelCookie4));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pearcelCookie6), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcelCookie5));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pearcelCookie7), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcelCookie6));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pearcelCookie8), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcelCookie7));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pearcelCookie9), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.pearcelCookie8));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie, 9), new ItemStack(ModItems.pearcelCookie2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie2, 9), new ItemStack(ModItems.pearcelCookie3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie3, 9), new ItemStack(ModItems.pearcelCookie4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie4, 9), new ItemStack(ModItems.pearcelCookie5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie5, 9), new ItemStack(ModItems.pearcelCookie6));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie6, 9), new ItemStack(ModItems.pearcelCookie7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie7, 9), new ItemStack(ModItems.pearcelCookie8));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pearcelCookie8, 9), new ItemStack(ModItems.pearcelCookie9));

        //ME^Matter Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.meMatterBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(ModItems.meMatterNeutral, 8), "xyx", "yzy", "xyx", 'x', new ItemStack(Items.emerald), 'y', new ItemStack(Items.diamond), 'z', new ItemStack(Items.nether_star));
        GameRegistry.addRecipe(new ItemStack(Items.diamond, 2), " x ", "xxx", " x ", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Items.blaze_rod, 2), "x  ", " x ", "  x", 'x', new ItemStack((ModItems.meMatter)));
        GameRegistry.addRecipe(new ItemStack(Items.nether_star), "xxx", "x x", "xxx", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Items.clay_ball, 4), "x ", " x", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Items.ender_pearl, 4), "xxx", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 8), "xx", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Items.bucket), " x ", "x x", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Items.flint, 4), "x x", "x x", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Items.ghast_tear, 2), "x  ", " xx", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Blocks.cocoa, 4), "x  ", "x  ", "  x", 'x', new ItemStack(ModItems.meMatter));
        GameRegistry.addRecipe(new ItemStack(Items.record_11), "x  ", "  x", " x ", 'x', new ItemStack(ModItems.meMatter));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.redMatter, 2), new ItemStack(ModItems.meMatter), new ItemStack(Items.dye, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.greenMatter, 2), new ItemStack(ModItems.meMatter), new ItemStack(Items.dye, 1, 2));

	}

}
