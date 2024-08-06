package net.scutes_expanded;

import net.fabricmc.api.ModInitializer;
import net.scutes_expanded.block.ModBlocks;
import net.scutes_expanded.item.ModCreativeModTabs;

public class ScutesExpanded implements ModInitializer {

    @Override
    public void onInitialize() {
        CommonClass.init();
        ModBlocks.registerModBlocks();
        ModCreativeModTabs.registerItemGroups();
    }
}
