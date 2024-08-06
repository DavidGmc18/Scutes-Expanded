package net.scutes_expanded.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.scutes_expanded.Constants;

import java.util.function.Supplier;

public class ModItems {
    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

    public static final Supplier<Item> TURTLE_CHESTPLATE = ITEMS.registerItem(
            "turtle_chestplate",
            (Item.Properties pMaterial) -> new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.CHESTPLATE,
                    (new Item.Properties()).durability(ArmorItem.Type.CHESTPLATE.getDurability(25))),
            new Item.Properties()
    );

    public static final Supplier<Item> TURTLE_LEGGINGS = ITEMS.registerItem(
            "turtle_leggings",
            (Item.Properties pMaterial) -> new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.LEGGINGS,
                    (new Item.Properties()).durability(ArmorItem.Type.LEGGINGS.getDurability(25))),
            new Item.Properties()
    );

    public static final Supplier<Item> TURTLE_BOOTS = ITEMS.registerItem(
            "turtle_boots",
            (Item.Properties pMaterial) -> new ArmorItem(
                    ArmorMaterials.TURTLE,
                    ArmorItem.Type.BOOTS,
                    (new Item.Properties()).durability(ArmorItem.Type.BOOTS.getDurability(25))),
            new Item.Properties()
    );

    public static final Supplier<Item> ARMADILLO_HELMET = ITEMS.registerItem(
            "armadillo_helmet",
            (Item.Properties pMaterial) -> new ArmadilloArmorItem(
                    ArmorItem.Type.HELMET,
                    (new Item.Properties()).durability(ArmorItem.Type.HELMET.getDurability(25))),
            new Item.Properties()
    );

    public static final Supplier<Item> ARMADILLO_CHESTPLATE = ITEMS.registerItem(
            "armadillo_chestplate",
            (Item.Properties pMaterial) -> new ArmadilloArmorItem(
                    ArmorItem.Type.CHESTPLATE,
                    (new Item.Properties()).durability(ArmorItem.Type.CHESTPLATE.getDurability(25))),
            new Item.Properties()
    );

    public static final Supplier<Item> ARMADILLO_LEGGINGS = ITEMS.registerItem(
            "armadillo_leggings",
            (Item.Properties pMaterial) -> new ArmadilloArmorItem(
                    ArmorItem.Type.LEGGINGS,
                    (new Item.Properties()).durability(ArmorItem.Type.LEGGINGS.getDurability(25))),
            new Item.Properties()
    );

    public static final Supplier<Item> ARMADILLO_BOOTS = ITEMS.registerItem(
            "armadillo_boots",
            (Item.Properties pMaterial) -> new ArmadilloArmorItem(
                    ArmorItem.Type.BOOTS,
                    (new Item.Properties()).durability(ArmorItem.Type.BOOTS.getDurability(25))),
            new Item.Properties()
    );
}
