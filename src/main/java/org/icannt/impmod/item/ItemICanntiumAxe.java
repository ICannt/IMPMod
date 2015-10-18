package org.icannt.impmod.item;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import org.icannt.impmod.gui.IMPCreativeTab;
import org.icannt.impmod.lib.Constants;
import org.icannt.impmod.lib.IMPMaterial;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemICanntiumAxe extends ItemAxe
{
	private String type = "tool";
	private String name = "ICanntium_Axe";
	
	public ItemICanntiumAxe(ToolMaterial enumToolMaterial)
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