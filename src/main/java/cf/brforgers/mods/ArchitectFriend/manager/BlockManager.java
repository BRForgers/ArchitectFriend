package cf.brforgers.mods.ArchitectFriend.manager;

import cf.brforgers.mods.ArchitectFriend.blocks.*;
import cf.brforgers.mods.ArchitectFriend.itemblocks.ItemBlockDyable;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockManager {
	public static Block smoothBlock, smoothBricks, smoothBrickies, trueColorClay, redstonerBlock;
	
	public static void init()
	{
		smoothBlock = new SmoothBlock();
		GameRegistry.registerBlock(smoothBlock, ItemBlockDyable.class ,"smoothBlock");
		
		smoothBricks = new SmoothBricks();
		GameRegistry.registerBlock(smoothBricks, ItemBlockDyable.class ,"smoothBricks");
		
		smoothBrickies = new SmoothBrickies();
		GameRegistry.registerBlock(smoothBrickies, ItemBlockDyable.class ,"smoothBrickies");
		
		trueColorClay = new TrueColorClay();
		GameRegistry.registerBlock(trueColorClay, ItemBlockDyable.class, "trueColorClay");
		
		redstonerBlock = new RedstonerBlock();
		GameRegistry.registerBlock(redstonerBlock, ItemBlockDyable.class, "redstonerBlock");
	}
}