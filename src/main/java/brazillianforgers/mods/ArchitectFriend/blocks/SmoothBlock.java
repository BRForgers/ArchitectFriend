package brazillianforgers.mods.ArchitectFriend.blocks;

import java.util.ArrayList;
import java.util.List;

import com.sun.beans.editors.IntegerEditor;

import brazillianforgers.lib.RecipeHelper.ICraftable;
import brazillianforgers.lib.RecipeHelper.Recipe;
import brazillianforgers.lib.RecipeHelper.RecipeValue;
import brazillianforgers.lib.RecipeHelper.RecipeValues;
import brazillianforgers.mods.ArchitectFriend.Lib;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class SmoothBlock extends Block implements ICraftable {
	protected IIcon[] icons = new IIcon[16];
	
	public SmoothBlock() {
		super(Material.rock);
		this.setBlockName("SmoothBlock");
		this.setBlockTextureName(Lib.TEXTURE_PATH + "Smooth");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		this.setStepSound(soundTypeStone);
		this.setLightLevel(1.0F);
	}

	/* Metadata Override */
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 16; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	/* Texture Override */
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return this.icons[meta];
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 16; i++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
		}
	}
	
	/* ICraftable Method */
	@Override
	public Recipe[] getRecipes() {
		List<Recipe> r = new ArrayList<Recipe>();
		r.add(new Recipe(
				new ItemStack(this,8,0), new String[]{"PPP","PLP","PPP"},
				new RecipeValue('P', new ItemStack(Items.paper)), new RecipeValue('L', new ItemStack(Blocks.redstone_lamp))
			)
		);
		
		for(int i = 0; i < 16; i++)
		{
			r.add(new Recipe(
				new ItemStack(this,8,i), new String[]{"BBB","BDB","BBB"},
				new RecipeValue('B', new ItemStack(this)), new RecipeValue('D', new ItemStack(Items.dye,1,15 - i))
			));
		}
		return r.toArray(new Recipe[r.size()]);
	}
}
