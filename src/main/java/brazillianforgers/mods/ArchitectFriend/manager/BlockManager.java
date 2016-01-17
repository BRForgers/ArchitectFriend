package brazillianforgers.mods.ArchitectFriend.manager;

import net.minecraft.block.Block;
import brazillianforgers.lib.RecipeHelper.ICraftable;
import brazillianforgers.lib.RecipeHelper.RecipeHelper;
import brazillianforgers.mods.ArchitectFriend.blocks.*;
import brazillianforgers.mods.ArchitectFriend.itemblocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
	public static Block smoothBlock, smoothBricks, smoothBrickies, trueColorClay, redstonerBlock;
	
	public static void init()
	{
		smoothBlock = new SmoothBlock();
		GameRegistry.registerBlock(smoothBlock, ItemSmoothBlock.class ,"smoothBlock");
		RecipeHelper.registerAll((ICraftable)smoothBlock);
		
		smoothBricks = new SmoothBricks();
		GameRegistry.registerBlock(smoothBricks, ItemSmoothBricks.class ,"smoothBricks");
		RecipeHelper.registerAll((ICraftable)smoothBricks);
		
		smoothBrickies = new SmoothBrickies();
		GameRegistry.registerBlock(smoothBrickies, ItemSmoothBrickies.class ,"smoothBrickies");
		RecipeHelper.registerAll((ICraftable)smoothBrickies);
		
		trueColorClay = new TrueColorClay();
		GameRegistry.registerBlock(trueColorClay, ItemTrueColorClay.class, "trueColorClay");
		RecipeHelper.registerAll((ICraftable)trueColorClay);
		
		redstonerBlock = new RedstonerBlock();
		GameRegistry.registerBlock(redstonerBlock, ItemRedstonerBlock.class, "redstonerBlock");
		RecipeHelper.registerAll((ICraftable)redstonerBlock);
	}
}