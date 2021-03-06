package com.miningmark48.pearcelmod.client.gui;

import com.miningmark48.pearcelmod.client.container.ContainerIVET;
import com.miningmark48.pearcelmod.client.container.ContainerMEWorkbench;
import com.miningmark48.pearcelmod.client.container.ContainerPCP;
import com.miningmark48.pearcelmod.init.ModBlocks;
import com.miningmark48.pearcelmod.init.ModItems;
import com.miningmark48.pearcelmod.item.ItemPCP;
import com.miningmark48.pearcelmod.reference.GUIs;
import com.miningmark48.pearcelmod.reference.Reference;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GUIs.guiIDMEWorkbench){
            return ID == GUIs.guiIDMEWorkbench && world.getBlock(x, y, z) == ModBlocks.meWorkbench ? new ContainerMEWorkbench(player.inventory, world, x, y, z) : null;
        }
        if (ID == GUIs.guiIDIVET){
            return ID == GUIs.guiIDIVET && world.getBlock(x, y, z) == ModBlocks.ivet ? new ContainerIVET(player.inventory, world, x, y, z) : null;
        }
        if (ID == GUIs.guiIDPCP){
            return new ContainerPCP(player.inventory, world, x, y, z);
        }
        return null;
    }


    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GUIs.guiIDMEWorkbench){
            return ID == GUIs.guiIDMEWorkbench && world.getBlock(x, y, z) == ModBlocks.meWorkbench ? new GuiMEWorkbench(player.inventory, world, x, y, z) : null;
        }
        if (ID == GUIs.guiIDIVET){
            return ID == GUIs.guiIDIVET && world.getBlock(x, y, z) == ModBlocks.ivet ? new GuiIVET(player.inventory, world, x, y, z) : null;
        }
        if (ID == GUIs.guiIDPCP){
            /*ItemStack i = player.getHeldItem();
            String name = "item.pearcelmod:pcp.name";
            if (i != null && i.getItem() instanceof ItemPCP && i.hasDisplayName()){
                name = i.getDisplayName();
            }*/
            return new GuiPCP(player.inventory, world, x, y, z);
        }
        return null;
    }
}
