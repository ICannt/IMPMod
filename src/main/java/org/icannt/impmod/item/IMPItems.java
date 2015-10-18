package org.icannt.impmod.item;

import org.icannt.impmod.lib.IMPMaterial;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class IMPItems
{
	public static String[] meta;
	public static String type;
	
	public static final ToolMaterial ICANNTIUM = EnumHelper.addToolMaterial("ICANNTIUM", 10, 3000, 15.0F, 36, 100);
	
	public static final ItemDustIMP dustIMP = new ItemDustIMP(IMPMaterial.Dust, IMPMaterial.DustRarity);
	
	public static final ItemIngotIMP ingotIMP = new ItemIngotIMP(IMPMaterial.Ingot, IMPMaterial.IngotRarity);
		
	public static final ItemICanntiumSword icanntiumSword = new ItemICanntiumSword(ICANNTIUM);
	public static final ItemICanntiumShovel icanntiumShovel = new ItemICanntiumShovel(ICANNTIUM);
	public static final ItemICanntiumPickaxe icanntiumPickaxe = new ItemICanntiumPickaxe(ICANNTIUM);
	public static final ItemICanntiumAxe icanntiumAxe = new ItemICanntiumAxe(ICANNTIUM);

	public static final ItemICanntiumSuperSword icanntiumSuperSword = new ItemICanntiumSuperSword(ICANNTIUM);
	public static final ItemICanntiumFortunePickaxe icanntiumFortunePickaxe = new ItemICanntiumFortunePickaxe(ICANNTIUM);
		
	public static void init()
	{
		GameRegistry.registerItem(dustIMP, "dustIMP");
		
		GameRegistry.registerItem(ingotIMP, "ingotIMP");

        GameRegistry.registerItem(icanntiumSword, "icanntiumSword");
		GameRegistry.registerItem(icanntiumShovel, "icanntiumShovel");
		GameRegistry.registerItem(icanntiumPickaxe, "icanntiumPickaxe");
		GameRegistry.registerItem(icanntiumAxe, "icanntiumAxe");
	
		GameRegistry.registerItem(icanntiumSuperSword, "icanntiumSuperSword");
		GameRegistry.registerItem(icanntiumFortunePickaxe, "icanntiumFortunePickaxe");
		
		meta = IMPMaterial.Dust;
		type = "dust";
        for (int i = 0; i < meta.length; i++)
        {
        	OreDictionary.registerOre(type + meta[i], new ItemStack(dustIMP, 1, i));
        }
        
		meta = IMPMaterial.Ingot;
		type = "ingot";
        for (int i = 0; i < meta.length; i++)
        {
        	OreDictionary.registerOre(type + meta[i], new ItemStack(ingotIMP, 1, i));
        }        
	}
}
