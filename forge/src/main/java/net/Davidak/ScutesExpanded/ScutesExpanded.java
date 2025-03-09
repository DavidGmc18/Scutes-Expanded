package net.Davidak.ScutesExpanded;

import net.Davidak.ScutesExpanded.init.ModBlocks;
import net.Davidak.ScutesExpanded.init.ModCreativeTabs;
import net.Davidak.ScutesExpanded.init.ModItems;
import net.Davidak.ScutesExpanded.init.ModVillagerTrades;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ScutesExpanded {
    public ScutesExpanded() {
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