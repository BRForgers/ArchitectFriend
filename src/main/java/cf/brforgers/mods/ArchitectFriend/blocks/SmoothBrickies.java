package cf.brforgers.mods.ArchitectFriend.blocks;

import cf.brforgers.mods.ArchitectFriend.ArchitectFriend;
import cf.brforgers.mods.ArchitectFriend.Lib;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class SmoothBrickies extends Block {
    @SideOnly(Side.CLIENT)
    protected IIcon[] icons = new IIcon[16];

    public SmoothBrickies() {
        super(Material.rock);
        this.setBlockName("Brickies");
        this.setBlockTextureName(Lib.TEXTURE_PATH + "Brickies");
        this.setCreativeTab(ArchitectFriend.tabArchitect);
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

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 16; i++) {
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
}
