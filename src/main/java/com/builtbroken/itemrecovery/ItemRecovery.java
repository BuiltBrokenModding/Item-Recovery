package com.builtbroken.itemrecovery;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 10/4/2018.
 */
@Mod(modid = ItemRecovery.DOMAIN, name = "BBM's Item Recovery", version = ItemRecovery.VERSION, dependencies = ItemRecovery.DEPENDENCIES)
@Mod.EventBusSubscriber
public class ItemRecovery
{
    public static final String DOMAIN = "bbmitemrecovery";
    public static final String PREFIX = DOMAIN + ":";

    public static final String MAJOR_VERSION = "@MAJOR@";
    public static final String MINOR_VERSION = "@MINOR@";
    public static final String REVISION_VERSION = "@REVIS@";
    public static final String BUILD_VERSION = "@BUILD@";
    public static final String MC_VERSION = "@MC@";
    public static final String VERSION = MC_VERSION + "-" + MAJOR_VERSION + "." + MINOR_VERSION + "." + REVISION_VERSION + "." + BUILD_VERSION;
    public static final String DEPENDENCIES = "";

    public static final String TEXTURE_DIRECTORY = "textures/";
    public static final String GUI_TEXTURE_DIRECTORY = TEXTURE_DIRECTORY + "gui/";
    public static final String MODEL_TEXTURE_DIRECTORY = TEXTURE_DIRECTORY + "models/";

    @SidedProxy(clientSide = "com.builtbroken.itemrecovery.client.ClientProxy", serverSide = "com.builtbroken.itemrecovery.CommonProxy")
    public static CommonProxy sideProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(this, sideProxy);
    }

    //@Mod.EventHandler
    public void init(FMLInitializationEvent evt)
    {

    }

    //@Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

    //@Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event)
    {

    }

    @SubscribeEvent
    public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equals(DOMAIN))
        {
            ConfigManager.sync(DOMAIN, Config.Type.INSTANCE);
        }
    }
}
