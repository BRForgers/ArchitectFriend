package brazillianforgers.mods.ArchitectFriend;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import brazillianforgers.core.UpdateChecker;
import brazillianforgers.lib.RecipeHelper.RecipeHandler;
import brazillianforgers.mods.ArchitectFriend.proxy.CommonProxy;

@Mod(modid = Lib.MODID , version = Lib.VERSION , name = Lib.MODNAME, dependencies = Lib.DEPS)
public class ArchitectFriend
{
	@Instance(Lib.MODID)
	public static ArchitectFriend instance;
	
	@SidedProxy(clientSide = Lib.CLIENT, serverSide = Lib.COMMONPROXY)
	public static CommonProxy proxy;
	
	public static RecipeHandler recipes = new RecipeHandler();
	
	public static CreativeTabs tabArchitect = new CreativeTabs("tabArchitect") {
		
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.clay_ball;
		}
	};
	
	static Logger logger;
	//static Configuration config;
	//private static ObjectStorage configLib = new ObjectStorage();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();
		//config = new Configuration(e.getSuggestedConfigurationFile());
		
		proxy.preInit();
		
		UpdateChecker.addToUpdateChecker(Lib.MODID, Lib.MODNAME, Lib.UPDATEURL, Lib.VERSION, logger);
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent e)
	{
		proxy.Init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e)
	{
		
	}
}
