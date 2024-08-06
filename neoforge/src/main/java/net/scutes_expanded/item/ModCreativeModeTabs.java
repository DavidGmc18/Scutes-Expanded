package net.scutes_expanded.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.scutes_expanded.Constants;
import net.scutes_expanded.block.ModBlocks;

import java.util.HashSet;
import java.util.Set;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static String SCUTES_EXPANDED_TAB_TITLE = "itemgroup.scutes_expanded";

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SCUTES_EXPANDED_TAB = CREATIVE_MODE_TABS.register("scutes_expanded_tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();

        builder.displayItems((itemDisplay, output) -> {
            Set<Item> addedItems = new HashSet<>();

            ModBlocks.BLOCKS.getEntries()
                    .stream()
                    .map((block) -> block.get().asItem())
                    .filter(addedItems::add)
                    .forEach(output::accept);

            ModItems.ITEMS.getEntries()
                    .stream()
                    .map((item) -> item.get().asItem())
                    .filter(addedItems::add)
                    .forEach(output::accept);

        });

        builder.icon(() -> new ItemStack(ModBlocks.TURTLE_SCUTE_BLOCK.get()));
        builder.title(Component.translatable(SCUTES_EXPANDED_TAB_TITLE));

        return builder.build();
    });
}
