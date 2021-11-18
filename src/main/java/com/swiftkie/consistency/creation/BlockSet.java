package com.swiftkie.consistency.creation;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class BlockSet extends BlockRegistry
{
    public static final Block CRACKED_BRICKS = register("cracked_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS)));
    public static final Block CHISELED_BRICKS = register("chiseled_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS)));
}
