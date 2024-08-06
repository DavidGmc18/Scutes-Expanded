package net.scutes_expanded.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.scutes_expanded.Constants;

public class ModBlocks {

    public static final Block TURTLE_SCUTE_BLOCK = register("turtle_scute_block",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.PACKED_MUD).requiresCorrectToolForDrops().strength(20.0F, 200.0F)));
    public static final Block ARMADILLO_SCUTE_BLOCK = register("armadillo_scute_block",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.PACKED_MUD).requiresCorrectToolForDrops().strength(20.0F, 200.0F)));

    private static Block register(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID , name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID , name),
                new BlockItem(block, new Item.Properties()));
    }

    public static void registerModBlocks() {
        Constants.LOG.info("Registering ModBlocks for " + Constants.MOD_ID);
    }
}