package net.Davidak.ScutesExpanded.init;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Items;

import java.util.Arrays;

import static net.minecraft.world.entity.npc.VillagerTrades.*;

public class ModVillagerTrades {
    private static void entries() {
        addWanderingTrades(1, new ItemListing[]{
                new EmeraldForItems(Items.TURTLE_SCUTE, 3, 5, 5),
                new EmeraldForItems(Items.ARMADILLO_SCUTE, 1, 5, 5)
        });
    }

    private static boolean registered = false;
    public static void register() {
        if (registered) return;
        entries();
        registered = true;
    }

    private static void addVillagerTrades(VillagerProfession profession, int level, ItemListing[] newTrades) {
        Int2ObjectMap<ItemListing[]> tradeMap = TRADES.get(profession);
        addTrades(tradeMap, level, newTrades);
    }

    private static void addWanderingTrades(int level, ItemListing[] newTrades) {
        addTrades(WANDERING_TRADER_TRADES, level, newTrades);
    }

    private static void addTrades(Int2ObjectMap<ItemListing[]> tradeMap, int level, ItemListing[] newTrades) {
        ItemListing[] oldTrades = tradeMap.get(level);
        ItemListing[] updatedTrades = Arrays.copyOf(oldTrades, oldTrades.length + newTrades.length);
        System.arraycopy(newTrades, 0, updatedTrades, oldTrades.length, newTrades.length);
        tradeMap.put(level, updatedTrades);
    }
}
