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

  /*  public static final ItemGroup STONE = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "stone"))
            .icon(() -> new ItemStack((ItemSet.CRACKED_BRICKS)))
            .appendItems(stacks ->
                    {
                        stacks.add(new ItemStack(ItemSet.CHISELED_BRICKS));
                        stacks.add(new ItemStack(ItemSet.CRACKED_BRICKS));
                        stacks.add(new ItemStack(ItemSet.CRACKED_BRICK_STAIRS));
                        stacks.add(new ItemStack(ItemSet.CRACKED_BRICK_SLAB));
                        stacks.add(new ItemStack(ItemSet.CRACKED_BRICK_WALL));

                        stacks.add(new ItemStack(ItemSet.POLISHED_GRANITE_BRICKS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_GRANITE_BRICK_STAIRS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_GRANITE_BRICK_SLAB));
                        stacks.add(new ItemStack(ItemSet.POLISHED_GRANITE_BRICK_WALL));

                        stacks.add(new ItemStack(ItemSet.POLISHED_DIORITE_BRICKS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_DIORITE_BRICK_STAIRS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_DIORITE_BRICK_SLAB));
                        stacks.add(new ItemStack(ItemSet.POLISHED_DIORITE_BRICK_WALL));

                        stacks.add(new ItemStack(ItemSet.POLISHED_ANDESITE_BRICKS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_ANDESITE_BRICK_STAIRS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_ANDESITE_BRICK_SLAB));
                        stacks.add(new ItemStack(ItemSet.POLISHED_ANDESITE_BRICK_WALL));

                        stacks.add(new ItemStack(ItemSet.POLISHED_STONE));
                        stacks.add(new ItemStack(ItemSet.POLISHED_STONE_STAIRS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_STONE_SLAB));
                        stacks.add(new ItemStack(ItemSet.POLISHED_STONE_WALL));
                        stacks.add(new ItemStack(ItemSet.POLISHED_STONE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.POLISHED_STONE_BUTTON));

                        stacks.add(new ItemStack(ItemSet.SANDSTONE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.SANDSTONE_BUTTON));

                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE));
                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_STAIRS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_SLAB));
                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_WALL));
                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_BUTTON));

                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_BRICKS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_BRICK_STAIRS));
                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_BRICK_SLAB));
                        stacks.add(new ItemStack(ItemSet.POLISHED_SANDSTONE_BRICK_WALL));

                        stacks.add(new ItemStack(ItemSet.STONE_WALL));

                        stacks.add(new ItemStack(ItemSet.QUARTZ_WALL));
                        stacks.add(new ItemStack(ItemSet.QUARTZ_BRICK_STAIRS));
                        stacks.add(new ItemStack(ItemSet.QUARTZ_BRICK_SLAB));
                        stacks.add(new ItemStack(ItemSet.QUARTZ_BRICK_WALL));

                        stacks.add(new ItemStack(ItemSet.DEEPSLATE_STAIRS));
                        stacks.add(new ItemStack(ItemSet.DEEPSLATE_SLAB));
                        stacks.add(new ItemStack(ItemSet.DEEPSLATE_WALL));
                        stacks.add(new ItemStack(ItemSet.DEEPSLATE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.DEEPSLATE_BUTTON));

                        stacks.add(new ItemStack(ItemSet.POLISHED_DEEPSLATE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.POLISHED_DEEPSLATE_BUTTON));

                        stacks.add(new ItemStack(ItemSet.BLACKSTONE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.BLACKSTONE_BUTTON));

                        stacks.add(new ItemStack(ItemSet.POLISHED_GRANITE_WALL));
                        stacks.add(new ItemStack(ItemSet.POLISHED_GRANITE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.POLISHED_GRANITE_BUTTON));
                        stacks.add(new ItemStack(ItemSet.GRANITE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.GRANITE_BUTTON));

                        stacks.add(new ItemStack(ItemSet.POLISHED_DIORITE_WALL));
                        stacks.add(new ItemStack(ItemSet.POLISHED_DIORITE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.POLISHED_DIORITE_BUTTON));
                        stacks.add(new ItemStack(ItemSet.DIORITE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.DIORITE_BUTTON));

                        stacks.add(new ItemStack(ItemSet.POLISHED_ANDESITE_WALL));
                        stacks.add(new ItemStack(ItemSet.POLISHED_ANDESITE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.POLISHED_ANDESITE_BUTTON));
                        stacks.add(new ItemStack(ItemSet.ANDESITE_PRESSURE_PLATE));
                        stacks.add(new ItemStack(ItemSet.ANDESITE_BUTTON));

                    }
            ).build(); */
}
