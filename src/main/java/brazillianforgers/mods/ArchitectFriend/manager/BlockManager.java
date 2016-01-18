package brazillianforgers.mods.ArchitectFriend.manager;

import net.minecraft.block.Block;

import java.util.ArrayList;

import brazillianforgers.lib.RecipeHelper.ICraftable;
import brazillianforgers.lib.RecipeHelper.RecipeHandler;
import brazillianforgers.lib.RecipeHelper.RecipeHelper;
import brazillianforgers.mods.ArchitectFriend.ArchitectFriend;
import brazillianforgers.mods.ArchitectFriend.blocks.*;
import brazillianforgers.mods.ArchitectFriend.itemblocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
	public static Block smoothBlock, smoothBricks, smoothBrickies, trueColorClay, redstonerBlock;
	
	public static void init()
	{
		ArrayList<ICraftable> craftables = new ArrayList<ICraftable>();
		
		smoothBlock = new SmoothBlock();
		GameRegistry.registerBlock(smoothBlock, ItemSmoothBlock.class ,"smoothBlock");
		craftables.add((ICraftable)smoothBlock);
		
		smoothBricks = new SmoothBricks();
		GameRegistry.registerBlock(smoothBricks, ItemSmoothBricks.class ,"smoothBricks");
		craftables.add((ICraftable)smoothBricks);
		
		smoothBrickies = new SmoothBrickies();
		GameRegistry.registerBlock(smoothBrickies, ItemSmoothBrickies.class ,"smoothBrickies");
		craftables.add((ICraftable)smoothBrickies);
		
		trueColorClay = new TrueColorClay();
		GameRegistry.registerBlock(trueColorClay, ItemTrueColorClay.class, "trueColorClay");
		craftables.add((ICraftable)trueColorClay);
		
		redstonerBlock = new RedstonerBlock();
		GameRegistry.registerBlock(redstonerBlock, ItemRedstonerBlock.class, "redstonerBlock");
		craftables.add((ICraftable)redstonerBlock);
		
		ArchitectFriend.recipes.add(craftables.toArray(new ICraftable[craftables.size()]));
	}
}