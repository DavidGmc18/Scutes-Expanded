package net.Davidak.ScutesExpanded;

import net.Davidak.ScutesExpanded.init.ModBlocks;
import net.Davidak.ScutesExpanded.init.ModCreativeTabs;
import net.Davidak.ScutesExpanded.init.ModItems;
import net.Davidak.ScutesExpanded.init.ModVillagerTrades;
import net.fabricmc.api.ModInitializer;

public class ScutesExpanded implements ModInitializer {
    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        ModCreativeTabs.register();
        ModVillagerTrades.register();

        CommonClass.init();
    }
}
