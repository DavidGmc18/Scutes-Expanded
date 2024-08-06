package net.scutes_expanded.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.scutes_expanded.Constants;

public class ModItems {
    public static final Item TURTLE_CHESTPLATE = registerItem(
            "turtle_chestplate",
            new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.CHESTPLATE,
                    (new Item.Properties()).durability(ArmorItem.Type.CHESTPLATE.getDurability(25)))
    );

    public static final Item TURTLE_LEGGINGS = registerItem(
            "turtle_leggings",
            new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.LEGGINGS,
                    (new Item.Properties()).durability(ArmorItem.Type.LEGGINGS.getDurability(25)))
    );

    public static final Item TURTLE_BOOTS = registerItem(
            "turtle_boots",
            new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.BOOTS,
                    (new Item.Properties()).durability(ArmorItem.Type.BOOTS.getDurability(25)))
    );

    public static final Item ARMADILLO_HELMET = registerItem(
            "armadillo_helmet",
            new ArmadilloArmorItem(
                    ArmorItem.Type.HELMET,
                    (new Item.Properties()).durability(ArmorItem.Type.HELMET.getDurability(25)))
    );

    public static final Item ARMADILLO_CHESTPLATE = registerItem(
            "armadillo_chestplate",
            new ArmadilloArmorItem(
                    ArmorItem.Type.CHESTPLATE,
                    (new Item.Properties()).durability(ArmorItem.Type.CHESTPLATE.getDurability(25)))
    );

    public static final Item ARMADILLO_LEGGINGS = registerItem(
            "armadillo_leggings",
            new ArmadilloArmorItem(
                    ArmorItem.Type.LEGGINGS,
                    (new Item.Properties()).durability(ArmorItem.Type.LEGGINGS.getDurability(25)))
    );

    public static final Item ARMADILLO_BOOTS = registerItem(
            "armadillo_boots",
            new ArmadilloArmorItem(
                    ArmorItem.Type.BOOTS,
                    (new Item.Properties()).durability(ArmorItem.Type.BOOTS.getDurability(25)))
    );

    public static Item registerItem(String pKey, Item pItem) {
        return Items.registerItem(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, pKey), pItem);
    }

    public static void registerModItems() {
        Constants.LOG.info("Registering ModItems for " + Constants.MOD_ID);
    }
}
