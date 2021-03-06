package com.miningmark48.pearcelmod.init;

import com.miningmark48.pearcelmod.block.*;
import com.miningmark48.pearcelmod.creativetab.CreativeTabPearcelMod;
import com.miningmark48.pearcelmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    //Plants
    public static final Block pearcelPlant = new BlockPearcelPlant().setBlockName("pearcelPlant").setBlockTextureName(Reference.MOD_ID + ":pearcelPlant");
    //Ore
    public static final Block pearcelOre = new BlockPearcelOre().setBlockName("pearcelOre").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":pearcelOre").setHardness(1.2F).setResistance(1.2F);
    public static final Block netherPearcelOre = new BlockPearcelOre().setBlockName("netherPearcelOre").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":netherPearcelOre").setHardness(1.0F).setResistance(1.0F);
    //Models
    public static final Block pearcelPainting = new BlockPearcelPainting(Material.cloth).setBlockName("pearcelPainting").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setHardness(0.2F).setResistance(0.1F);
    public static final Block meMagicTable = new BlockMEMagicTable().setBlockName("meMagicTable").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setHardness(0.5F).setResistance(100.0F);
    //General blocks
	public static final Block meBlock = new BlockMEBlock().setBlockName("meBlock").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setLightLevel(0.5f).setBlockTextureName(Reference.MOD_ID + ":meBlock").setHardness(1.6F).setResistance(1.6F);
	public static final Block meGlass = new BlockMEGlass().setBlockName("meGlass").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setLightLevel(0.2f).setBlockTextureName(Reference.MOD_ID + ":meGlass").setHardness(0.5F).setResistance(99999.9F);
    public static final Block meLamp = new BlockMELamp().setBlockName("meLamp").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setLightLevel(2.0F).setBlockTextureName(Reference.MOD_ID + ":meLamp").setHardness(0.5F).setResistance(99999.9F);
    public static final Block meWorkbench = new BlockMEWorkbench().setBlockName("meWorkbench").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":meWorkbench").setHardness(2.5F).setResistance(5.0F);
    public static final Block ivet = new BlockIVET().setBlockName("ivet").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":ivet").setHardness(1.0F).setResistance(1000.0F);
    public static final Block pearcelTorch = new BlockPearcelTorch().setBlockName("pearcelTorch").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":pearcelTorch").setHardness(0.0F).setResistance(10.0F).setLightLevel(1.0F);
    public static final Block pearcelBlock = new BlockPearcelBlock().setBlockName("pearcelBlock").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":pearcelBlock").setHardness(1.5F).setResistance(10.0F);
    public static final Block bedrockGlass = new BlockBedrockGlass().setBlockName("bedrockGlass").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":bedrockGlass").setBlockUnbreakable().setResistance(99999.9F);
    public static final Block meMatterBlock = new BlockMEMatter().setBlockName("meMatterBlock").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":meMatterBlock").setHardness(0.6F).setResistance(1.0F);
    public static final Block FBomb = new BlockFBomb().setBlockName("FBomb").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":FBomb").setHardness(0.3F).setResistance(1.5F);
    public static final Block barrier = new BlockBarrier().setBlockName("barrier").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":barrier").setBlockUnbreakable().setResistance(99999.9F);
    public static final Block pearcelMelonBlock = new BlockPearcelMelon().setBlockName("pearcelMelonBlock").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":pearcelMelon_Side").setHardness(0.5F).setResistance(1.5F);
    //Fluids
    public static final Block pearcelFluid = new BlockPearcelFluid().setBlockName("pearcelFluid").setBlockTextureName(Reference.MOD_ID + ":pearcelFluid").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB);


	public static void init(){

        //General Blocks
		GameRegistry.registerBlock(meBlock, "meBlock");
        GameRegistry.registerBlock(pearcelBlock, "pearcelBlock");
		GameRegistry.registerBlock(meGlass, "meGlass");
        GameRegistry.registerBlock(meLamp, "meLamp");
        GameRegistry.registerBlock(meWorkbench, "meWorkbench");
        GameRegistry.registerBlock(ivet, "ivet");
        GameRegistry.registerBlock(pearcelTorch, "pearcelTorch");
        GameRegistry.registerBlock(bedrockGlass, "bedrockGlass");
        GameRegistry.registerBlock(meMatterBlock, "meMatterBlock");
        //GameRegistry.registerBlock(FBomb, "FBomb");
        GameRegistry.registerBlock(barrier, "barrier");
        GameRegistry.registerBlock(pearcelMelonBlock, "pearcelMelonBlock");
        //Ores
        GameRegistry.registerBlock(pearcelOre, "pearcelOre");
        GameRegistry.registerBlock(netherPearcelOre, "netherPearcelOre");
        //Plants
        GameRegistry.registerBlock(pearcelPlant, "pearcelPlant");
        //Models
        GameRegistry.registerBlock(pearcelPainting, "pearcelPainting");
        //GameRegistry.registerBlock(meMagicTable, "meMagicTable");
        //Fluid
        GameRegistry.registerBlock(pearcelFluid, "pearcelFluid");
		
	}
	
}
