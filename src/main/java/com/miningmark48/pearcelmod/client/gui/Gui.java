package com.miningmark48.pearcelmod.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

/**
 * Created by MarkA on 2/25/2015.
 */
public class Gui extends GuiScreen {
    public static final int GUI_ID = 20;

    public Gui(){
        //Gui Constructor
    }

    @Override
    public void initGui(){

    }

    @Override
    public boolean doesGuiPauseGame(){
        return false;
    }
        //Draw gui
    @Override
    public void drawScreen(int i, int j, float f){
        drawDefaultBackground();
        super.drawScreen(i, j, f);
    }

    @Override
    public void actionPerformed(GuiButton button){
        //Button clicked
    }
}
