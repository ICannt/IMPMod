package org.icannt.impmod.item;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import org.icannt.impmod.gui.IMPCreativeTab;
import org.icannt.impmod.lib.Constants;
import org.icannt.impmod.lib.IMPMaterial;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemICanntiumSword extends ItemSword
{
	private String type = "weapon";
	private String name = "ICanntium_Sword";
	
	public ItemICanntiumSword(ToolMaterial enumToolMaterial)
	{
		super(enumToolMaterial);
		this.setUnlocalizedName(Constants.MODID + "." + type + "." + name.toLowerCase());
		this.setTextureName(Constants.MODID + ":" + type + "/" + name);
		this.setCreativeTab(IMPCreativeTab.impCreativeTab);
		this.setMaxStackSize(1);
		this.setMaxDamage(3000);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return (new ItemStack(IMPItems.ingotIMP, 1, 0)).getItem() == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack item)
    {    	
    	return EnumRarity.valueOf(IMPMaterial.IMPRarity[2].toLowerCase());
    }
}
