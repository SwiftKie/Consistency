package com.swiftkie.consistency.creation;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class BlockSet extends BlockRegistry
{
    public static final Block CHISELED_BRICKS = register("chiseled_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS)));
    public static final Block CRACKED_BRICKS = register("cracked_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS)));
    public static final Block CRACKED_BRICK_STAIRS = registerStairs("cracked_brick", BlockSet.CRACKED_BRICKS);
    public static final Block CRACKED_BRICK_SLAB = registerSlab("cracked_brick", BlockSet.CRACKED_BRICKS);
    public static final Block CRACKED_BRICK_WALL = registerWall("cracked_brick", BlockSet.CRACKED_BRICKS );

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

    public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_STONE_STAIRS = registerStairs(BlockSet.POLISHED_STONE);
    public static final Block POLISHED_STONE_SLAB = registerSlab(BlockSet.POLISHED_STONE);
    public static final Block POLISHED_STONE_WALL = registerWall(BlockSet.POLISHED_STONE);

    public static final Block POLISHED_SANDSTONE = register("polished_sandstone", new Block(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block POLISHED_SANDSTONE_STAIRS = registerStairs(BlockSet.POLISHED_SANDSTONE);
    public static final Block POLISHED_SANDSTONE_SLAB = registerSlab(BlockSet.POLISHED_SANDSTONE);
    public static final Block POLISHED_SANDSTONE_WALL = registerWall(BlockSet.POLISHED_SANDSTONE);

    public static final Block POLISHED_SANDSTONE_BRICKS = register("polished_sandstone_bricks", new Block(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block POLISHED_SANDSTONE_BRICK_STAIRS = registerStairs("polished_sandstone_brick", BlockSet.POLISHED_SANDSTONE_BRICKS);
    public static final Block POLISHED_SANDSTONE_BRICK_SLAB = registerSlab("polished_sandstone_brick", BlockSet.POLISHED_SANDSTONE_BRICKS);
    public static final Block POLISHED_SANDSTONE_BRICK_WALL = registerWall("polished_sandstone_brick", BlockSet.POLISHED_SANDSTONE_BRICKS);

    public static final Block POLISHED_GRANITE_WALL = registerWall(Blocks.POLISHED_GRANITE);
    public static final Block POLISHED_DIORITE_WALL = registerWall(Blocks.POLISHED_DIORITE);
    public static final Block POLISHED_ANDESITE_WALL = registerWall(Blocks.POLISHED_ANDESITE);
    public static final Block STONE_WALL = registerWall(Blocks.STONE);

}
