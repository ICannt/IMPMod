package org.icannt.impmod.recipe;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
//import net.minecraftforge.oredict.ShapelessOreRecipe;

import org.icannt.impmod.item.IMPItems;

public class IMPRecipes
{
	public static void init()
	{
		
		// Koobynite Dust
		ItemStack result = new ItemStack(IMPItems.dustIMP, 1, 1);
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "OMO",
	        " P ",
	        "SMS",
	        Character.valueOf('O'), "dustRefinedObsidian",
	        Character.valueOf('M'), "dustMagnesium",
	        Character.valueOf('P'), "dustPetrotheum",
	        Character.valueOf('S'), "dustPlatinum"
        }));
		
		// Trabnetium Dust
		result = new ItemStack(IMPItems.dustIMP, 1, 2);
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "PLM",
	        "C  ",
	        "PLM",
	        Character.valueOf('P'), "dustPlutonium",
	        Character.valueOf('L'), "dustLapis",
	        Character.valueOf('M'), "dustMithril",
	        Character.valueOf('C'), "dustCryotheum"
        }));

		// P1cwh0rium Dust
		result = new ItemStack(IMPItems.dustIMP, 1, 3);
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "B E",
	        "LAL",
	        "B E",
	        Character.valueOf('A'), "dustAerotheum",
	        Character.valueOf('B'), "dustAluminumBrass",
	        Character.valueOf('L'), "dustBlutonium",
	        Character.valueOf('E'), "dustEnderium"
        }));
		
		// Camstaticium Dust
		result = new ItemStack(IMPItems.dustIMP, 1, 4);
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "NGD",
	        "  P",
	        "NGD",
	        Character.valueOf('D'), "dustDiamond",
	        Character.valueOf('G'), "dustGunpowder",
	        Character.valueOf('N'), "dustNickel",
	        Character.valueOf('P'), "dustPyrotheum"
        }));
		
		// Grovergen Dust
		result = new ItemStack(IMPItems.dustIMP, 1, 5);
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "CFC",
	        "P P",
	        "I I",
	        Character.valueOf('C'), "dustCobalt",
	        Character.valueOf('F'), "dustElectrumFlux",
	        Character.valueOf('P'), "dustEnderPearl",
	        Character.valueOf('I'), "dustInvar"
        }));
		
		// Princecatnium Dust
		result = new ItemStack(IMPItems.dustIMP, 1, 6);
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "M M",
	        "G G",
	        "SVS",
	        Character.valueOf('G'), "dustGold",
	        Character.valueOf('M'), "dustManyullyn",
	        Character.valueOf('S'), "dustSilver",
	        Character.valueOf('V'), "dustVinteum"
        }));
		
		// Kambrookton Dust
		result = new ItemStack(IMPItems.dustIMP, 1, 7);
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        " I ",
	        "SLS",
	        "RIR",
	        Character.valueOf('I'), "dustIron",
	        Character.valueOf('L'), "dustLithium",
	        Character.valueOf('R'), "dustRedstone",
	        Character.valueOf('S'), "dustSteel"
        }));
		
		// ICanntium Dust
		result = new ItemStack(IMPItems.dustIMP, 1, 0);		
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "TKP",
	        "CBG",
	        "RBA",
	        Character.valueOf('K'), "dustKoobynite",
	        Character.valueOf('T'), "dustTrabnetium",
	        Character.valueOf('P'), "dustP1cwh0rium",
	        Character.valueOf('C'), "dustCamstaticium",
	        Character.valueOf('G'), "dustGrovergen",
	        Character.valueOf('R'), "dustPrincecatnium",
	        Character.valueOf('A'), "dustKambrookton",
	        Character.valueOf('B'), "ingotBedrockium"
        }));
		
		// ICanntium Ingot
		GameRegistry.addSmelting(new ItemStack(IMPItems.dustIMP, 1, 0), new ItemStack(IMPItems.ingotIMP, 1, 0), 4.0F);
		
		// ICanntium Sword
		result = new ItemStack(IMPItems.icanntiumSword, 1);		
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "I",
	        "I",
	        "S",
	        Character.valueOf('I'), "ingotICanntium",
	        Character.valueOf('S'), "stickWood"
        }));
		
		// ICanntium Super Sword
		result = new ItemStack(IMPItems.icanntiumSuperSword, 1);		
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "DBD",
	        "DDD",
	        "DSD",
	        Character.valueOf('S'), IMPItems.icanntiumSword,
	        Character.valueOf('D'), "blockDiamond",
	        Character.valueOf('B'), "blockBedrockium"
        }));
		
		// ICanntium Shovel
		result = new ItemStack(IMPItems.icanntiumShovel, 1);		
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "I",
	        "S",
	        "S",
	        Character.valueOf('I'), "ingotICanntium",
	        Character.valueOf('S'), "stickWood"
        }));
		
		// ICanntium Pickaxe
		result = new ItemStack(IMPItems.icanntiumPickaxe, 1);		
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "III",
	        " S ",
	        " S ",
	        Character.valueOf('I'), "ingotICanntium",
	        Character.valueOf('S'), "stickWood"
        }));
		
		// ICanntium Fortune Pickaxe
		result = new ItemStack(IMPItems.icanntiumFortunePickaxe, 1);		
		GameRegistry.addRecipe(new ShapedOreRecipe(result, false, new Object[]
		{
	        "DBD",
	        "DDD",
	        "DPD",
	        Character.valueOf('P'), IMPItems.icanntiumPickaxe,
	        Character.valueOf('D'), "blockDiamond",
	        Character.valueOf('B'), "blockBedrockium"
        }));
		
		// ICanntium Axe
		result = new ItemStack(IMPItems.icanntiumAxe, 1);		
		GameRegistry.addRecipe(new ShapedOreRecipe(result, true, new Object[]
		{
	        "II",
	        "IS",
	        " S",
	        Character.valueOf('I'), "ingotICanntium",
	        Character.valueOf('S'), "stickWood"
        }));
		
	}
}
