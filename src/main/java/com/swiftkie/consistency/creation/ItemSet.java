package com.swiftkie.consistency.creation;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemSet
{
    public static final Item CRACKED_BRICKS = register(BlockSet.CRACKED_BRICKS);
    public static final Item CHISELED_BRICKS = register(BlockSet.CHISELED_BRICKS);

    public static final Item POLISHED_GRANITE_BRICKS = register(BlockSet.POLISHED_GRANITE_BRICKS);
    public static final Item POLISHED_GRANITE_BRICK_STAIRS = register(BlockSet.POLISHED_GRANITE_BRICK_STAIRS);
    public static final Item POLISHED_GRANITE_BRICK_SLAB = register(BlockSet.POLISHED_GRANITE_BRICK_SLAB);
    public static final Item POLISHED_GRANITE_BRICK_WALL = register(BlockSet.POLISHED_GRANITE_BRICK_WALL);

    public static final Item POLISHED_DIORITE_BRICKS = register(BlockSet.POLISHED_DIORITE_BRICKS);
    public static final Item POLISHED_DIORITE_BRICK_STAIRS = register(BlockSet.POLISHED_DIORITE_BRICK_STAIRS);
    public static final Item POLISHED_DIORITE_BRICK_SLAB = register(BlockSet.POLISHED_DIORITE_BRICK_SLAB);
    public static final Item POLISHED_DIORITE_BRICK_WALL = register(BlockSet.POLISHED_DIORITE_BRICK_WALL);

    public static final Item POLISHED_ANDESITE_BRICKS = register(BlockSet.POLISHED_ANDESITE_BRICKS);
    public static final Item POLISHED_ANDESITE_BRICK_STAIRS = register(BlockSet.POLISHED_ANDESITE_BRICK_STAIRS);
    public static final Item POLISHED_ANDESITE_BRICK_SLAB = register(BlockSet.POLISHED_ANDESITE_BRICK_SLAB);
    public static final Item POLISHED_ANDESITE_BRICK_WALL = register(BlockSet.POLISHED_ANDESITE_BRICK_WALL);

    public static Item register(Block block)
    {
        return Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), new BlockItem(block, new Item.Settings().maxCount(64)));
    }
}
