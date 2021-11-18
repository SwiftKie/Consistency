package com.swiftkie.consistency.creation;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemSet
{
    public static final Item CRACKED_BRICKS = register(BlockSet.CRACKED_BRICKS);
    public static final Item CHISELED_BRICKS = register(BlockSet.CHISELED_BRICKS);

    public static Item register(Block block)
    {
        return Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), new BlockItem(block, new Item.Settings().maxCount(64)));
    }
}
