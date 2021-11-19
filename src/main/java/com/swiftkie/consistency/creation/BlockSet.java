package com.swiftkie.consistency.creation;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class BlockSet extends BlockRegistry
{
    public static final Block CRACKED_BRICKS = register("cracked_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS)));
    public static final Block CHISELED_BRICKS = register("chiseled_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS)));

    public static final Block POLISHED_GRANITE_BRICKS = registerBricks(Blocks.POLISHED_GRANITE);
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerStairs("polished_granite_brick", BlockSet.POLISHED_GRANITE_BRICKS);
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerSlab("polished_granite_brick", BlockSet.POLISHED_GRANITE_BRICKS);
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerWall("polished_granite_brick", BlockSet.POLISHED_GRANITE_BRICKS );

    public static final Block POLISHED_DIORITE_BRICKS = registerBricks(Blocks.POLISHED_DIORITE);
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerStairs("polished_diorite_brick", BlockSet.POLISHED_DIORITE_BRICKS);
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerSlab("polished_diorite_brick", BlockSet.POLISHED_DIORITE_BRICKS);
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerWall("polished_diorite_brick", BlockSet.POLISHED_DIORITE_BRICKS);

    public static final Block POLISHED_ANDESITE_BRICKS = registerBricks(Blocks.POLISHED_ANDESITE);
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerStairs("polished_andesite_brick", BlockSet.POLISHED_ANDESITE_BRICKS);
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerSlab("polished_andesite_brick", BlockSet.POLISHED_ANDESITE_BRICKS);
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerWall("polished_andesite_brick", BlockSet.POLISHED_ANDESITE_BRICKS);
}
