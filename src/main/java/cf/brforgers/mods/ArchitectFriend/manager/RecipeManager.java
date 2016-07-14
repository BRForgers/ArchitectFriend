package cf.brforgers.mods.ArchitectFriend.manager;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static cf.brforgers.mods.ArchitectFriend.manager.BlockManager.*;
import static cpw.mods.fml.common.registry.GameRegistry.addShapedRecipe;
import static net.minecraft.init.Blocks.*;
import static net.minecraft.init.Items.*;

public class RecipeManager {
    public static void init() {
        initNormalRecipes();
        initDyableRecipes();
    }

    private static void initNormalRecipes() {
        //Redstoner Block (White)
        addShapedRecipe(
                new ItemStack(redstonerBlock,4,0), "BSB","SRS","BSB",
                'R', redstone, 'S', stone , 'B', new ItemStack(dye,1,15)
        );

        //Smooth Block (White)
        addShapedRecipe(
                new ItemStack(smoothBlock,8,0), "PPP","PLP","PPP",
                'P', paper , 'L', redstone_lamp
		);

        //TrueColor Clay (White)
        addShapedRecipe(
                new ItemStack(trueColorClay,4,0), "BHB","HCH","BHB",
                'C', clay_ball , 'H', hardened_clay , 'B', new ItemStack(dye,1,15)
        );
        addShapedRecipe(
                new ItemStack(trueColorClay,4,0), "BHB","HCH","BHB",
                'C', clay_ball , 'H', new ItemStack(stained_hardened_clay,1,0) , 'B', new ItemStack(dye,1,15)
        );
    }

    private static void initDyableRecipes() {
        for(int i = 0; i < 16; i++)
        {
            //Redstoner Block (All)
            addShapedRecipe(
                    new ItemStack(redstonerBlock,8,i), "BBB","BDB","BBB",
                    'B', redstonerBlock , 'D', new ItemStack(Items.dye,1,15 - i)
            );

            //Smooth Block (All)
            addShapedRecipe(
                    new ItemStack(smoothBlock,8,i), "BBB","BDB","BBB",
                    'B', new ItemStack(smoothBlock) , 'D', new ItemStack(Items.dye,1,15 - i)
            );

            //Smooth Brickies (All)
            addShapedRecipe(
                    new ItemStack(smoothBrickies,4,i), "BB","BB",
                    'B', new ItemStack(smoothBricks,1,i)
            );

            //Smooth Bricks (All)
            addShapedRecipe(
                    new ItemStack(smoothBricks,4,i), "BB","BB",
                    'B', new ItemStack(smoothBlock,1,i)
            );


            //TrueColor Clay (All)
            addShapedRecipe(
                    new ItemStack(trueColorClay,8,i), "BBB","BDB","BBB",
                    'B', new ItemStack(trueColorClay,1,0) , 'D', new ItemStack(Items.dye,1,15 - i)
            );
        }
    }
}
