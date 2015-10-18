package org.icannt.impmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import java.util.List;

import org.icannt.impmod.gui.IMPCreativeTab;
import org.icannt.impmod.lib.Constants;
import org.icannt.impmod.lib.IMPMaterial;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemICanntiumSuperSword extends ItemSword
{
	private String type = "weapon";
	private String name = "ICanntium_Super_Sword";
	
	public ItemICanntiumSuperSword(ToolMaterial enumToolMaterial)
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
	
	@SuppressWarnings({ "unchecked" , "rawtypes" })
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
		ItemStack newItem = new ItemStack(IMPItems.icanntiumSuperSword, 1, 0);
		newItem.addEnchantment(Enchantment.looting, 5);
		newItem.addEnchantment(Enchantment.sharpness, 7);
		newItem.addEnchantment(Enchantment.unbreaking, 5);
		list.add(newItem);
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack item)
    {    	
    	return EnumRarity.valueOf(IMPMaterial.IMPRarity[3].toLowerCase());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack)
    {
        return itemStack.getItemDamage() >= 0;
    }
}
