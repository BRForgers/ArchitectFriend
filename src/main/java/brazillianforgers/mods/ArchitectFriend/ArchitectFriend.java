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
import brazillianforgers.lib.ObjectStorage;
import brazillianforgers.mods.ArchitectFriend.proxy.CommonProxy;

@Mod(modid = Lib.MODID , version = Lib.VERSION , name = Lib.MODNAME)
public class ArchitectFriend
{
	@Instance(Lib.MODID)
	public static ArchitectFriend instance;
	
	@SidedProxy(clientSide = Lib.CLIENT, serverSide = Lib.COMMONPROXY)
	public static CommonProxy proxy;	
	
	
	static Logger logger;
	static Configuration config;
	private static ObjectStorage configLib = new ObjectStorage();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();
		config = new Configuration(e.getSuggestedConfigurationFile());
		
		proxy.preInit();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent e)
	{
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e)
	{
		
	}
}
