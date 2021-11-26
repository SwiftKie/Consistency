package com.swiftkie.consistency.creation;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;

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
    public static final Block POLISHED_STONE_PRESSURE_PLATE = registerPressurePlate("polished_stone", PressurePlateBlock.ActivationRule.MOBS, BlockSet.POLISHED_STONE);
    public static final Block POLISHED_STONE_BUTTON = registerStoneButton(BlockSet.POLISHED_STONE);

    public static final Block CRACKED_STONE_BRICK_STAIRS = registerStairs("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_STONE_BRICK_SLAB = registerSlab("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_STONE_BRICK_WALL = registerWall("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS );

    public static final Block SANDSTONE_PRESSURE_PLATE = registerPressurePlate("sandstone", PressurePlateBlock.ActivationRule.MOBS, Blocks.SANDSTONE);
    public static final Block SANDSTONE_BUTTON = registerStoneButton(Blocks.SANDSTONE);

    public static final Block POLISHED_SANDSTONE = register("polished_sandstone", new Block(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block POLISHED_SANDSTONE_STAIRS = registerStairs(BlockSet.POLISHED_SANDSTONE);
    public static final Block POLISHED_SANDSTONE_SLAB = registerSlab(BlockSet.POLISHED_SANDSTONE);
    public static final Block POLISHED_SANDSTONE_WALL = registerWall(BlockSet.POLISHED_SANDSTONE);
    public static final Block POLISHED_SANDSTONE_PRESSURE_PLATE = registerPressurePlate("polished_sandstone", PressurePlateBlock.ActivationRule.MOBS, BlockSet.POLISHED_SANDSTONE);
    public static final Block POLISHED_SANDSTONE_BUTTON = registerStoneButton(BlockSet.POLISHED_SANDSTONE);

    public static final Block POLISHED_SANDSTONE_BRICKS = register("polished_sandstone_bricks", new Block(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block POLISHED_SANDSTONE_BRICK_STAIRS = registerStairs("polished_sandstone_brick", BlockSet.POLISHED_SANDSTONE_BRICKS);
    public static final Block POLISHED_SANDSTONE_BRICK_SLAB = registerSlab("polished_sandstone_brick", BlockSet.POLISHED_SANDSTONE_BRICKS);
    public static final Block POLISHED_SANDSTONE_BRICK_WALL = registerWall("polished_sandstone_brick", BlockSet.POLISHED_SANDSTONE_BRICKS);

    public static final Block DEEPSLATE_STAIRS = registerStairs(Blocks.DEEPSLATE);
    public static final Block DEEPSLATE_SLAB = registerSlab(Blocks.DEEPSLATE);
    public static final Block DEEPSLATE_WALL = registerWall(Blocks.DEEPSLATE);
    public static final Block DEEPSLATE_PRESSURE_PLATE = registerPressurePlate("deepslate", PressurePlateBlock.ActivationRule.MOBS, Blocks.DEEPSLATE);
    public static final Block DEEPSLATE_BUTTON = registerStoneButton(Blocks.DEEPSLATE);

    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerPressurePlate("polished_deepslate", PressurePlateBlock.ActivationRule.MOBS, Blocks.POLISHED_DEEPSLATE);
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerStoneButton(Blocks.POLISHED_DEEPSLATE);

    public static final Block BLACKSTONE_PRESSURE_PLATE = registerPressurePlate("blackstone", PressurePlateBlock.ActivationRule.MOBS, Blocks.BLACKSTONE);
    public static final Block BLACKSTONE_BUTTON = registerStoneButton(Blocks.BLACKSTONE);

    public static final Block POLISHED_GRANITE_WALL = registerWall(Blocks.POLISHED_GRANITE);
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerPressurePlate("polished_granite", PressurePlateBlock.ActivationRule.MOBS, Blocks.POLISHED_GRANITE);
    public static final Block POLISHED_GRANITE_BUTTON = registerStoneButton(Blocks.POLISHED_GRANITE);
    public static final Block GRANITE_PRESSURE_PLATE = registerPressurePlate("granite", PressurePlateBlock.ActivationRule.MOBS, Blocks.GRANITE);
    public static final Block GRANITE_BUTTON = registerStoneButton(Blocks.GRANITE);

    public static final Block POLISHED_DIORITE_WALL = registerWall(Blocks.POLISHED_DIORITE);
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerPressurePlate("polished_diorite", PressurePlateBlock.ActivationRule.MOBS, Blocks.POLISHED_DIORITE);
    public static final Block POLISHED_DIORITE_BUTTON = registerStoneButton(Blocks.POLISHED_DIORITE);
    public static final Block DIORITE_PRESSURE_PLATE = registerPressurePlate("diorite", PressurePlateBlock.ActivationRule.MOBS, Blocks.DIORITE);
    public static final Block DIORITE_BUTTON = registerStoneButton(Blocks.DIORITE);

    public static final Block POLISHED_ANDESITE_WALL = registerWall(Blocks.POLISHED_ANDESITE);
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerPressurePlate("polished_andesite", PressurePlateBlock.ActivationRule.MOBS, Blocks.POLISHED_ANDESITE);
    public static final Block POLISHED_ANDESITE_BUTTON = registerStoneButton(Blocks.POLISHED_ANDESITE);
    public static final Block ANDESITE_PRESSURE_PLATE = registerPressurePlate("andesite", PressurePlateBlock.ActivationRule.MOBS, Blocks.ANDESITE);
    public static final Block ANDESITE_BUTTON = registerStoneButton(Blocks.ANDESITE);

    public static final Block STONE_WALL = registerWall(Blocks.STONE);
    public static final Block QUARTZ_WALL = registerWall("quartz", Blocks.QUARTZ_BLOCK);
    public static final Block QUARTZ_BRICK_STAIRS = registerStairs("quartz_brick", Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_SLAB = registerSlab("quartz_brick", Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_WALL = registerWall("quartz_brick", Blocks.QUARTZ_BRICKS);
}
