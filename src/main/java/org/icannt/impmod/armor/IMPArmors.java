package org.icannt.impmod.armor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class IMPArmors
{
	public static final ArmorMaterial armorICanntium = EnumHelper.addArmorMaterial("armorICanntium", 20, new int[] { 3, 7, 6, 3 }, 100);
	
	public static final Item armorICanntiumHelmet = new ItemArmorICanntium(armorICanntium, 0, "ICanntium_Helmet");
	public static final Item armorICanntiumChestplate = new ItemArmorICanntium(armorICanntium, 1, "ICanntium_Chestplate");
	public static final Item armorICanntiumLeggings = new ItemArmorICanntium(armorICanntium, 2, "ICanntium_Leggings");
	public static final Item armorICanntiumBoots = new ItemArmorICanntium(armorICanntium, 3, "ICanntium_Boots");
	
	public static final Item armorICanntiumAltHelmet = new ItemArmorICanntiumAlt(armorICanntium, 0, "ICanntium_Alt_Helmet");
	public static final Item armorICanntiumAltChestplate = new ItemArmorICanntiumAlt(armorICanntium, 1, "ICanntium_Alt_Chestplate");
	public static final Item armorICanntiumAltLeggings = new ItemArmorICanntiumAlt(armorICanntium, 2, "ICanntium_Alt_Leggings");
	public static final Item armorICanntiumAltBoots = new ItemArmorICanntiumAlt(armorICanntium, 3, "ICanntium_Alt_Boots");

	public static void init()
	{
		GameRegistry.registerItem(armorICanntiumHelmet, "armorICanntiumHelmet");
		GameRegistry.registerItem(armorICanntiumChestplate, "armorICanntiumChestplate");
		GameRegistry.registerItem(armorICanntiumLeggings, "armorICanntiumLeggings");
		GameRegistry.registerItem(armorICanntiumBoots, "armorICanntiumBoots");
		
		GameRegistry.registerItem(armorICanntiumAltHelmet, "armorICanntiumAltHelmet");
		GameRegistry.registerItem(armorICanntiumAltChestplate, "armorICanntiumAltChestplate");
		GameRegistry.registerItem(armorICanntiumAltLeggings, "armorICanntiumAltLeggings");
		GameRegistry.registerItem(armorICanntiumAltBoots, "armorICanntiumAltBoots");
	}

}
