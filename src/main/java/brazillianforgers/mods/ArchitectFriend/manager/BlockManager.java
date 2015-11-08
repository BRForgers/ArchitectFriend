package brazillianforgers.mods.ArchitectFriend.manager;

import net.minecraft.block.Block;
import brazillianforgers.lib.RecipeHelper.ICraftable;
import brazillianforgers.mods.ArchitectFriend.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
	public static Block smoothBlock;
	public static Block smoothBricks;
	public static Block smoothBrickies;
	
	public static void init()
	{
		smoothBlock = new SmoothBlock();
		RecipeHandler.addToRecipes((ICraftable) smoothBlock);
		GameRegistry.registerBlock(smoothBlock, "smoothBlock");
	}
}
