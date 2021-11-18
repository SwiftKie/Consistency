package com.swiftkie.consistency.creation;

import com.swiftkie.consistency.Main;
import com.swiftkie.consistency.blocks.BlockStairs;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class BlockRegistry
{
    // BlockCopy
    public static Block registerBlockCopy(String id, Block base) {
        return register(id, new Block(FabricBlockSettings.copy(base)));
    }

    public static Block registerBlockCopy(String id, Block base, MapColor color) {
        return register(id, new Block(FabricBlockSettings.copyOf(base).mapColor(color)));
    }

    //Slab
    public static Block registerSlab(String id, Block base) { return register(id + "_slab", new SlabBlock(FabricBlockSettings.copy(base))); }
    public static Block registerSlab(Block base) { return registerSlab(Registry.BLOCK.getId(base).getPath(), base); }

    // Stairs
    public static Block registerStairs(String id, Block base) { return register(id + "_stairs", new BlockStairs(base.getDefaultState(), FabricBlockSettings.copy(base))); }
    //public static Block registerStairs(Block base) { return registerStairs(Registry.BLOCK.getId(base).getPath(), base); }

    // Wall
    public static Block registerWall(String id, Block base) { return register(id + "_wall", new WallBlock(FabricBlockSettings.copy(base))); }
    public static Block registerWall(Block base) {
        return registerWall(Registry.BLOCK.getId(base).getPath(), base);
    }

    public static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, id), block);
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    public static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    public static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

}
