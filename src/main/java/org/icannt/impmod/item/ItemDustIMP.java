package org.icannt.impmod.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;

import org.icannt.impmod.gui.IMPCreativeTab;
import org.icannt.impmod.lib.Constants;
import org.icannt.impmod.lib.IMPMaterial;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDustIMP extends Item
{
	private String type = "mineral";
	private String subtype = "Dust_";

	public static String[] meta;
	public static int[] rarity;
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public ItemDustIMP(String impMeta[], int impRarity[])
	{
		meta = impMeta;
		rarity = impRarity;
		this.setHasSubtypes(true);
		this.setCreativeTab(IMPCreativeTab.impCreativeTab);
	}
	
	@SuppressWarnings({ "unchecked" , "rawtypes" })
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < meta.length; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }
	
    @Override
    public String getItemStackDisplayName(ItemStack item)
    {
        return StatCollector.translateToLocal(getUnlocalizedName(item));
    }

    @Override
    public String getUnlocalizedName(ItemStack item)
    {
        return "item."+ Constants.MODID + "." + type + "." + subtype.toLowerCase() + meta[item.getItemDamage()].toLowerCase() + ".name";
    }
    
    @Override
    public int getMetadata(int i)
    {
        return i;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister ir)
    {
    	icons = new IIcon[meta.length];
    	for (int i = 0; i < icons.length; i++)
    	{
    		icons[i] = ir.registerIcon(Constants.MODID + ":" + type + "/" + subtype + meta[i]);
    	}
    }
    
    @Override
    public IIcon getIconFromDamage(int damage)
    {
    	return icons[damage];
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack item)
    {    	
    	return EnumRarity.valueOf(IMPMaterial.IMPRarity[rarity[item.getItemDamage()]].toLowerCase());
    }
    
	@SuppressWarnings({ "unchecked" , "rawtypes" })
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
    {
    	list.add(StatCollector.translateToLocal("item."+ Constants.MODID + "." + type + "." + subtype.toLowerCase() + meta[item.getItemDamage()].toLowerCase() + ".tooltip").trim());
    }
    
}

