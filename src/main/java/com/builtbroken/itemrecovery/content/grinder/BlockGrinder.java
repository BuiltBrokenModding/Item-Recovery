package com.builtbroken.itemrecovery.content.grinder;

import com.builtbroken.itemrecovery.ItemRecovery;
import com.builtbroken.itemrecovery.content.prefab.BlockMachine;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 10/4/2018.
 */
public class BlockGrinder extends BlockMachine
{
    public BlockGrinder()
    {
        super(Material.IRON);
        setRegistryName(ItemRecovery.PREFIX + "item_grinder");
        setTranslationKey(ItemRecovery.PREFIX + "item.grinder");
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileEntityGrinder();
    }
}
