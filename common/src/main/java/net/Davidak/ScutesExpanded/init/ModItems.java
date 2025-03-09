package net.Davidak.ScutesExpanded.init;

import net.Davidak.ScutesExpanded.Constants;
import net.Davidak.ScutesExpanded.item.ArmadilloArmorItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModItems {
    public static final Item TURTLE_SCUTE_BLOCK = Items.registerBlock(ModBlocks.TURTLE_SCUTE_BLOCK);
    public static final Item ARMADILLO_SCUTE_BLOCK = Items.registerBlock(ModBlocks.ARMADILLO_SCUTE_BLOCK);

    public static final Item TURTLE_CHESTPLATE = register(
            "turtle_chestplate",
            new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.CHESTPLATE,
                    (new Item.Properties()).durability(ArmorItem.Type.CHESTPLATE.getDurability(25)))
    );

    public static final Item TURTLE_LEGGINGS = register(
            "turtle_leggings",
            new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.LEGGINGS,
                    (new Item.Properties()).durability(ArmorItem.Type.LEGGINGS.getDurability(25)))
    );

    public static final Item TURTLE_BOOTS = register(
            "turtle_boots",
            new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.BOOTS,
                    (new Item.Properties()).durability(ArmorItem.Type.BOOTS.getDurability(25)))
    );

    public static final Item ARMADILLO_HELMET = register(
            "armadillo_helmet",
            new ArmadilloArmorItem(
                    ArmorItem.Type.HELMET,
                    (new Item.Properties()).durability(ArmorItem.Type.HELMET.getDurability(25)))
    );

    public static final Item ARMADILLO_CHESTPLATE = register(
            "armadillo_chestplate",
            new ArmadilloArmorItem(
                    ArmorItem.Type.CHESTPLATE,
                    (new Item.Properties()).durability(ArmorItem.Type.CHESTPLATE.getDurability(25)))
    );

    public static final Item ARMADILLO_LEGGINGS = register(
            "armadillo_leggings",
            new ArmadilloArmorItem(
                    ArmorItem.Type.LEGGINGS,
                    (new Item.Properties()).durability(ArmorItem.Type.LEGGINGS.getDurability(25)))
    );

    public static final Item ARMADILLO_BOOTS = register(
            "armadillo_boots",
            new ArmadilloArmorItem(
                    ArmorItem.Type.BOOTS,
                    (new Item.Properties()).durability(ArmorItem.Type.BOOTS.getDurability(25)))
    );

    private static Item register(String name) {
        return Items.registerItem(modItemID(name), new Item(new Item.Properties()));
    }

    private static Item register(String name, Item.Properties properties) {
        return Items.registerItem(modItemID(name), new Item(properties));
    }

    private static Item register(String name, Item item) {
        return Items.registerItem(modItemID(name), item);
    }

    private static ResourceKey<Item> modItemID(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
    }

    public static void register() {}
}
