package com.swiftkie.consistency.creation;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ItemSet
{
    public static final Item CHISELED_BRICKS = register(BlockSet.CHISELED_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static final Item CRACKED_BRICKS = register(BlockSet.CRACKED_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static final Item CRACKED_BRICK_STAIRS = register(BlockSet.CRACKED_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item CRACKED_BRICK_SLAB = register(BlockSet.CRACKED_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item CRACKED_BRICK_WALL = register(BlockSet.CRACKED_BRICK_WALL, ItemGroup.DECORATIONS);

    public static final Item POLISHED_GRANITE_BRICKS = register(BlockSet.POLISHED_GRANITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_GRANITE_BRICK_STAIRS = register(BlockSet.POLISHED_GRANITE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_GRANITE_BRICK_SLAB = register(BlockSet.POLISHED_GRANITE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_GRANITE_BRICK_WALL = register(BlockSet.POLISHED_GRANITE_BRICK_WALL, ItemGroup.DECORATIONS);

    public static final Item POLISHED_DIORITE_BRICKS = register(BlockSet.POLISHED_DIORITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_DIORITE_BRICK_STAIRS = register(BlockSet.POLISHED_DIORITE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_DIORITE_BRICK_SLAB = register(BlockSet.POLISHED_DIORITE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_DIORITE_BRICK_WALL = register(BlockSet.POLISHED_DIORITE_BRICK_WALL, ItemGroup.DECORATIONS);

    public static final Item POLISHED_ANDESITE_BRICKS = register(BlockSet.POLISHED_ANDESITE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_ANDESITE_BRICK_STAIRS = register(BlockSet.POLISHED_ANDESITE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_ANDESITE_BRICK_SLAB = register(BlockSet.POLISHED_ANDESITE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_ANDESITE_BRICK_WALL = register(BlockSet.POLISHED_ANDESITE_BRICK_WALL, ItemGroup.DECORATIONS);

    public static final Item POLISHED_STONE = register(BlockSet.POLISHED_STONE, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_STONE_STAIRS = register(BlockSet.POLISHED_STONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_STONE_SLAB = register(BlockSet.POLISHED_STONE_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_STONE_WALL = register(BlockSet.POLISHED_STONE_WALL, ItemGroup.DECORATIONS);
    public static final Item POLISHED_STONE_PRESSURE_PLATE = register(BlockSet.POLISHED_STONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item POLISHED_STONE_BUTTON = register(BlockSet.POLISHED_STONE_BUTTON, ItemGroup.REDSTONE);

    public static final Item CRACKED_STONE_BRICK_STAIRS = register(BlockSet.CRACKED_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item CRACKED_STONE_BRICK_SLAB = register(BlockSet.CRACKED_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item CRACKED_STONE_BRICK_WALL = register(BlockSet.CRACKED_STONE_BRICK_WALL, ItemGroup.DECORATIONS);

    public static final Item SANDSTONE_PRESSURE_PLATE = register(BlockSet.SANDSTONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item SANDSTONE_BUTTON = register(BlockSet.SANDSTONE_BUTTON, ItemGroup.REDSTONE);

    public static final Item POLISHED_SANDSTONE = register(BlockSet.POLISHED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_SANDSTONE_STAIRS = register(BlockSet.POLISHED_SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_SANDSTONE_SLAB = register(BlockSet.POLISHED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_SANDSTONE_WALL = register(BlockSet.POLISHED_SANDSTONE_WALL, ItemGroup.DECORATIONS);
    public static final Item POLISHED_SANDSTONE_PRESSURE_PLATE = register(BlockSet.POLISHED_SANDSTONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item POLISHED_SANDSTONE_BUTTON = register(BlockSet.POLISHED_SANDSTONE_BUTTON, ItemGroup.REDSTONE);

    public static final Item POLISHED_SANDSTONE_BRICKS = register(BlockSet.POLISHED_SANDSTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_SANDSTONE_BRICK_STAIRS = register(BlockSet.POLISHED_SANDSTONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_SANDSTONE_BRICK_SLAB = register(BlockSet.POLISHED_SANDSTONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item POLISHED_SANDSTONE_BRICK_WALL = register(BlockSet.POLISHED_SANDSTONE_BRICK_WALL, ItemGroup.DECORATIONS);

    public static final Item DEEPSLATE_STAIRS = register(BlockSet.DEEPSLATE_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item DEEPSLATE_SLAB = register(BlockSet.DEEPSLATE_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item DEEPSLATE_WALL = register(BlockSet.DEEPSLATE_WALL, ItemGroup.DECORATIONS);
    public static final Item DEEPSLATE_PRESSURE_PLATE = register(BlockSet.DEEPSLATE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item DEEPSLATE_BUTTON = register(BlockSet.DEEPSLATE_BUTTON, ItemGroup.REDSTONE);

    public static final Item POLISHED_DEEPSLATE_PRESSURE_PLATE = register(BlockSet.POLISHED_DEEPSLATE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item POLISHED_DEEPSLATE_BUTTON = register(BlockSet.POLISHED_DEEPSLATE_BUTTON, ItemGroup.REDSTONE);

    public static final Item BLACKSTONE_PRESSURE_PLATE = register(BlockSet.BLACKSTONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item BLACKSTONE_BUTTON = register(BlockSet.BLACKSTONE_BUTTON, ItemGroup.REDSTONE);

    public static final Item POLISHED_GRANITE_WALL = register(BlockSet.POLISHED_GRANITE_WALL, ItemGroup.DECORATIONS);
    public static final Item POLISHED_GRANITE_PRESSURE_PLATE = register(BlockSet.POLISHED_GRANITE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item POLISHED_GRANITE_BUTTON = register(BlockSet.POLISHED_GRANITE_BUTTON, ItemGroup.REDSTONE);
    public static final Item GRANITE_PRESSURE_PLATE = register(BlockSet.GRANITE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item GRANITE_BUTTON = register(BlockSet.GRANITE_BUTTON, ItemGroup.REDSTONE);

    public static final Item POLISHED_DIORITE_WALL = register(BlockSet.POLISHED_DIORITE_WALL, ItemGroup.DECORATIONS);
    public static final Item POLISHED_DIORITE_PRESSURE_PLATE = register(BlockSet.POLISHED_DIORITE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item POLISHED_DIORITE_BUTTON = register(BlockSet.POLISHED_DIORITE_BUTTON, ItemGroup.REDSTONE);
    public static final Item DIORITE_PRESSURE_PLATE = register(BlockSet.DIORITE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item DIORITE_BUTTON = register(BlockSet.DIORITE_BUTTON, ItemGroup.REDSTONE);

    public static final Item POLISHED_ANDESITE_WALL = register(BlockSet.POLISHED_ANDESITE_WALL, ItemGroup.DECORATIONS);
    public static final Item POLISHED_ANDESITE_PRESSURE_PLATE = register(BlockSet.POLISHED_ANDESITE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item POLISHED_ANDESITE_BUTTON = register(BlockSet.POLISHED_ANDESITE_BUTTON, ItemGroup.REDSTONE);
    public static final Item ANDESITE_PRESSURE_PLATE = register(BlockSet.ANDESITE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    public static final Item ANDESITE_BUTTON = register(BlockSet.ANDESITE_BUTTON, ItemGroup.REDSTONE);

    public static final Item STONE_WALL = register(BlockSet.STONE_WALL, ItemGroup.DECORATIONS);
    public static final Item QUARTZ_WALL = register(BlockSet.QUARTZ_WALL, ItemGroup.DECORATIONS);
    public static final Item QUARTZ_BRICK_STAIRS = register(BlockSet.QUARTZ_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
    public static final Item QUARTZ_BRICK_SLAB = register(BlockSet.QUARTZ_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
    public static final Item QUARTZ_BRICK_WALL = register(BlockSet.QUARTZ_BRICK_WALL, ItemGroup.DECORATIONS);

    public static Item register(Block block, ItemGroup group)
    {
        return Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), new BlockItem(block, new Item.Settings().maxCount(64).group(group)));
    }
}
