package net.Davidak.ScutesExpanded;

import net.Davidak.ScutesExpanded.init.ModBlocks;
import net.Davidak.ScutesExpanded.init.ModCreativeTabs;
import net.Davidak.ScutesExpanded.init.ModItems;
import net.Davidak.ScutesExpanded.init.ModVillagerTrades;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ScutesExpanded {
    public ScutesExpanded(IEventBus eventBus) {
        CommonClass.init();
    }

    @SubscribeEvent
    public static void registerEvent(RegisterEvent event) {
        if (event.getRegistryKey().equals(Registries.BLOCK)) ModBlocks.register();
        if (event.getRegistryKey().equals(Registries.ITEM)) ModItems.register();
        if (event.getRegistryKey().equals(Registries.CREATIVE_MODE_TAB)) ModCreativeTabs.register();
        if (event.getRegistryKey().equals(Registries.VILLAGER_PROFESSION)) ModVillagerTrades.register();
    }
}