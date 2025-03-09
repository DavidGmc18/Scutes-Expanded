package net.Davidak.ScutesExpanded.init;

import com.google.common.collect.ImmutableList;
import net.Davidak.ScutesExpanded.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ModCreativeTabs {
    public static CreativeModeTab MOD_TAB = register("scutes_expanded",
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .icon(() -> new ItemStack(ModItems.TURTLE_SCUTE_BLOCK))
                    .title(Component.translatable("itemGroup.scutes_expanded"))
                    .displayItems((parameters, output) -> {
                        addItemsFromClass(output, ModItems.class);
                    }).build());

    private static CreativeModeTab register(String name, CreativeModeTab tab) {
        return Registry.register(
                BuiltInRegistries.CREATIVE_MODE_TAB,
                ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name)),
                tab);
    }

    private static void addItemsFromClass(CreativeModeTab.Output output, Class clazz) {
        addItemsFromClass(output, clazz, ImmutableList.of());
    }

    private static void addItemsFromClass(CreativeModeTab.Output output, Class clazz, List<Item> blacklist) {
        Arrays.stream(clazz.getFields())
                .filter(field -> field.getType() == Item.class)
                .map(field -> {
                    try {
                        return (Item) field.get(null);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Cannot access item: " + field.getName(), e);
                    }
                })
                .filter(Objects::nonNull)
                .filter(item -> !blacklist.contains(item))
                .forEach(item -> output.accept(new ItemStack(item)));
    }

    public static void register() {}
}
