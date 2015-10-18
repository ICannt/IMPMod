package org.icannt.impmod.imports;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ThirdParty
{
	// Import third party content for recipe usage
	public static final Item ingotBedrockium = GameRegistry.findItem("ExtraUtilities", "bedrockiumIngot");
	public static final Block blockBedrockium = GameRegistry.findBlock("ExtraUtilities", "block_bedrockium");
	
	public static void init()
	{
        // Add new Ore Dictionary listings for third party content, makes recipes much easier to deal with
		// TODO: Needs error detection here, does not error silently
		OreDictionary.registerOre("ingotBedrockium", new ItemStack(ingotBedrockium));
		OreDictionary.registerOre("blockBedrockium", new ItemStack(blockBedrockium));
	}
}
