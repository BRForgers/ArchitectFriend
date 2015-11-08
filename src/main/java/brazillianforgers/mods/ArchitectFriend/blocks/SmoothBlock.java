package brazillianforgers.mods.ArchitectFriend.blocks;

import java.util.List;

import com.sun.beans.editors.IntegerEditor;

import brazillianforgers.lib.RecipeHelper.ICraftable;
import brazillianforgers.lib.RecipeHelper.Recipe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class SmoothBlock extends Block implements ICraftable {
	protected IIcon[] icons;
	
	public SmoothBlock() {
		super(Material.rock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Recipe[] getRecipes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        return icons[metadata];
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
    	for (int i = 0; i < 16; ++i)
        {
    		list.add(new ItemStack(item, 1, 0));
        }
    }
    
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        for (int i = 0; i < 16; ++i)
        {
            this.icons[i] = register.registerIcon("architectfriend:Smooth_" + Integer.toString(i));
        }
    }

}
