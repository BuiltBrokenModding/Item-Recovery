package com.builtbroken.itemrecovery.content;

import com.builtbroken.itemrecovery.ItemRecovery;
import com.builtbroken.itemrecovery.content.grinder.BlockGrinder;
import com.builtbroken.itemrecovery.content.grinder.TileEntityGrinder;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 10/4/2018.
 */
@Mod.EventBusSubscriber(modid = ItemRecovery.DOMAIN)
public class BlockReg
{
    @GameRegistry.ObjectHolder(ItemRecovery.PREFIX + "item_grinder")
    public static final Block blockGrinder = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new BlockGrinder());
        GameRegistry.registerTileEntity(TileEntityGrinder.class, ItemRecovery.PREFIX + "item_grinder");
    }
}
