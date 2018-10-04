package com.builtbroken.itemrecovery.client;

import com.builtbroken.itemrecovery.ItemRecovery;
import com.builtbroken.itemrecovery.content.BlockReg;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
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
    private static final String INVENTORY = "inventory";

    @SubscribeEvent
    public static void registerAllModels(ModelRegistryEvent event)
    {
        newBlockModel(BlockReg.blockGrinder);
    }

    protected static void newBlockModel(Block block)
    {
        newBlockModel(block, 0, INVENTORY);
    }

    protected static void newBlockModel(Block block, int meta, String varient)
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(block.getRegistryName(), varient));
    }

    protected static void newItemModel(Item item)
    {
        newItemModel(item, 0, INVENTORY);
    }

    protected static void newItemModel(Item item, int meta, String varient)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), varient));
    }
}
