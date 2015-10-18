package org.icannt.impmod.armor;

import org.icannt.impmod.gui.IMPCreativeTab;
import org.icannt.impmod.lib.Constants;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorICanntium extends ItemArmor
{
	private String type = "armor";
	
	public ItemArmorICanntium(ArmorMaterial material, int armorType, String name)
	{
		super (material, 0, armorType);
		this.setUnlocalizedName(Constants.MODID + "." + type + "." + name.toLowerCase());
		this.setTextureName(Constants.MODID + ":" + type + "/" + name);
		this.setCreativeTab(IMPCreativeTab.impCreativeTab);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == IMPArmors.armorICanntiumHelmet || stack.getItem() == IMPArmors.armorICanntiumChestplate || stack.getItem() == IMPArmors.armorICanntiumBoots)
		{
			return Constants.MODID + ":textures/models/armor/ICanntium_Armor_Layer_1.png" ;
		}
		else if (stack.getItem() == IMPArmors.armorICanntiumLeggings)
		{
			return Constants.MODID + ":textures/models/armor/ICanntium_Armor_Layer_2.png" ;
		}
		else
		{
			System.out.println("Invalid Item");
			return null;
		}
	}

}
