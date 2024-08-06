package net.scutes_expanded.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.scutes_expanded.Constants;
import net.scutes_expanded.block.ModBlocks;

public class ModCreativeModTabs {
    public static final CreativeModeTab SCUTES_EXPANDED_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "scutes_expanded"),
            FabricItemGroup.builder().title(Component.translatable("itemgroup.scutes_expanded"))
                    .icon(() -> new ItemStack(ModBlocks.TURTLE_SCUTE_BLOCK.asItem())).displayItems((FabricItemGroupEntries , entries) -> {
                        entries.accept(ModBlocks.TURTLE_SCUTE_BLOCK);
                        entries.accept(ModBlocks.ARMADILLO_SCUTE_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        Constants.LOG.info("Registering Item Groups for " + Constants.MOD_ID);
    }
}
