package com.builtbroken.itemrecovery.content;

import com.builtbroken.itemrecovery.ItemRecovery;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 10/4/2018.
 */
@Mod.EventBusSubscriber(modid = ItemRecovery.DOMAIN)
public class ItemReg
{
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {

    }
}
