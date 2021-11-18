package com.swiftkie.consistency.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class BlockStairs extends StairsBlock
{
    public final Block baseBlock;

    public BlockStairs(BlockState blockState, Settings settings)
    {
        super(blockState, settings);
        this.baseBlock = blockState.getBlock();
    }

}
