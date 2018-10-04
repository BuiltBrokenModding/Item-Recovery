package com.builtbroken.itemrecovery.client;

import com.builtbroken.itemrecovery.ItemRecovery;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 10/4/2018.
 */
@Mod.EventBusSubscriber(modid = ItemRecovery.DOMAIN, value = Side.CLIENT)
public class ClientReg
{
    @SubscribeEvent
    public static void registerAllModels(ModelRegistryEvent event)
    {

    }
}
