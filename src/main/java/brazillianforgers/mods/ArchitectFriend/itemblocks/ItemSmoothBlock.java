package brazillianforgers.mods.ArchitectFriend.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemSmoothBlock extends ItemBlockWithMetadata {

	public ItemSmoothBlock(Block block) {
		super(block, block);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}

}