package net.Davidak.ScutesExpanded.init;

import net.Davidak.ScutesExpanded.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {
    public static final Block TURTLE_SCUTE_BLOCK = register("turtle_scute_block",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.PACKED_MUD)
                    .requiresCorrectToolForDrops().strength(20.0F, 200.0F)));
    public static final Block ARMADILLO_SCUTE_BLOCK = register("armadillo_scute_block",
            new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.PACKED_MUD)
                    .requiresCorrectToolForDrops().strength(20.0F, 200.0F)));


    private static Block register(String name) {
        return register(modBlockID(name), new Block(BlockBehaviour.Properties.of()));
    }

    private static Block register(String name, Block block) {
        return register(modBlockID(name), block);
    }

    private static Block register(ResourceKey<Block> resourceKey, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, resourceKey, block);
    }

    private static ResourceKey<Block> modBlockID(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }

    public static void register() {}
}
