package brazillianforgers.mods.ArchitectFriend;

public class Lib {
	//Mod Identity
	public static final String MODID = "ArchitectFriend";
	public static final String VERSION = "1.0";
	public static final String MODNAME = "Architect's Friend";
	public static final String DEPS = "required-after:BRForgersCore[1.2,2.0]"; // + ";required-after:MODID"; for Each other MOD
	
	//Little Helper, huh?
	public static final String TEXTURE_PATH = MODID + ":";
	
	//Easter Eggs
	public static final String INITLOG = "Feeling a Architect, huh?";
	
	//Proxy Identity
	public static final String COMMONPROXY = "brazillianforgers.mods.ArchitectFriend.proxy.CommonProxy";
	public static final String CLIENT = "brazillianforgers.mods.ArchitectFriend.proxy.ClientProxy";
}
