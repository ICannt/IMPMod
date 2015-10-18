package org.icannt.impmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

import org.icannt.impmod.lib.Constants;
import org.icannt.impmod.armor.IMPArmors;
import org.icannt.impmod.imports.ThirdParty;
import org.icannt.impmod.item.IMPItems;
import org.icannt.impmod.recipe.IMPRecipes;

@Mod(modid = Constants.MODID, name = Constants.NAME, version = Constants.VERSION, dependencies = "after:ExtraUtilities")

public class IMPMod
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	IMPItems.init();
    	IMPArmors.init();
    	ThirdParty.init();
    }
 
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	IMPRecipes.init();
    }
}