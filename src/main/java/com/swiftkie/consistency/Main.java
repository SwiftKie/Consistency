package com.swiftkie.consistency;

import com.swiftkie.consistency.creation.BlockSet;
import com.swiftkie.consistency.creation.ItemSet;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer
{
    public static final String MOD_ID = "consistency";

    @Override
    public void onInitialize()
    {
        new BlockSet();
        new ItemSet();
    }

    public static final ItemGroup STONE = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "stone"))
            .icon(() -> new ItemStack((ItemSet.CRACKED_BRICKS)))
            .appendItems(stacks ->
                    {
                        stacks.add(new ItemStack(ItemSet.CRACKED_BRICKS));
                        stacks.add(new ItemStack(ItemSet.CHISELED_BRICKS));
                    }
            ).build();
}
