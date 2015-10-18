package org.icannt.impmod.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.icannt.impmod.item.IMPItems;
import org.icannt.impmod.lib.Constants;

public class IMPCreativeTab
{

    public static final CreativeTabs impCreativeTab = new CreativeTabs(Constants.MODID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
        	return IMPItems.icanntiumSword;
        }
    };
	
}
