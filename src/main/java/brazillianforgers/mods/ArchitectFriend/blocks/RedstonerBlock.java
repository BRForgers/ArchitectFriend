package brazillianforgers.mods.ArchitectFriend.blocks;

import java.util.ArrayList;
import java.util.List;

import com.sun.beans.editors.IntegerEditor;

import brazillianforgers.lib.RecipeHelper.ICraftable;
import brazillianforgers.lib.RecipeHelper.Recipe;
import brazillianforgers.lib.RecipeHelper.RecipeValue;
import brazillianforgers.lib.RecipeHelper.RecipeValues;
import brazillianforgers.mods.ArchitectFriend.ArchitectFriend;
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

public class RedstonerBlock extends Block implements ICraftable {
	@SideOnly(Side.CLIENT)
	protected IIcon[] icons = new IIcon[16];
	
	public RedstonerBlock() {
		super(Material.rock);
		this.setBlockName("RedstonerBlock");
		this.setBlockTextureName(Lib.TEXTURE_PATH + "Redstoner");
		this.setCreativeTab(ArchitectFriend.tabArchitect);
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		this.setStepSound(soundTypeStone);
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
	@SideOnly(Side.CLIENT)
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
				new ItemStack(this,4,0), new String[]{"BSB","SRS","BSB"},
				new RecipeValue('R', Items.redstone), new RecipeValue('S', Blocks.stone), new RecipeValue('B', new ItemStack(Items.dye,1,15))
			)
		);
		
		for(int i = 0; i < 16; i++)
		{
			r.add(new Recipe(
				new ItemStack(this,8,i), new String[]{"BBB","BDB","BBB"},
				new RecipeValue('B', this), new RecipeValue('D', new ItemStack(Items.dye,1,15 - i))
			));
		}
		return r.toArray(new Recipe[r.size()]);
	}
}
