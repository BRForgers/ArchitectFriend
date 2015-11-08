package brazillianforgers.mods.ArchitectFriend.proxy;

import brazillianforgers.mods.ArchitectFriend.manager.BlockManager;

public class CommonProxy
{

	public void preInit() {
		BlockManager.init();
	}

}
