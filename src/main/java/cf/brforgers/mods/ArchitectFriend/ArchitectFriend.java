package cf.brforgers.mods.ArchitectFriend;

import cf.brforgers.mods.ArchitectFriend.manager.BlockManager;
import cf.brforgers.mods.ArchitectFriend.manager.RecipeManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.apache.logging.log4j.Logger;

@Mod(modid = Lib.MODID, version = Lib.VERSION, name = Lib.MODNAME, dependencies = Lib.DEPS)
public class ArchitectFriend {
    @Instance(Lib.MODID)
    public static ArchitectFriend instance;

    public static CreativeTabs tabArchitect = new CreativeTabs("tabArchitect") {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.clay_ball;
        }
    };

    static Logger logger;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        logger.info(Lib.INITLOG);
        BlockManager.init();
    }

    @EventHandler
    public static void Init(FMLInitializationEvent e) {
        RecipeManager.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent e) {

    }
}
