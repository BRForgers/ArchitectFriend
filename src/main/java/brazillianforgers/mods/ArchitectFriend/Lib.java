package brazillianforgers.mods.ArchitectFriend;

public class Lib {
	//Mod Identity
	public static final String MODID = "ArchitectFriend";
	public static final String VERSION = "1.0";
	public static final String MODNAME = "Architect's Friend";
	public static final String DEPS = "required-after:BRForgersCore@[1.2,)"; // + ";required-after:MODID"; for Each other MOD
	
	//Little Helper, huh?
	public static final String TEXTURE_PATH = MODID + ":";
	public static final String UPDATEURL = "https://raw.githubusercontent.com/TheBrazillianForgersTeam/BRForgersCore/master/latest.txt";
	
	//Easter Eggs
	public static final String INITLOG = "Feeling a Architect, huh?";
	
	//Proxy Identity
	public static final String COMMONPROXY = "brazillianforgers.mods.ArchitectFriend.proxy.CommonProxy";
	public static final String CLIENT = "brazillianforgers.mods.ArchitectFriend.proxy.ClientProxy";
}
