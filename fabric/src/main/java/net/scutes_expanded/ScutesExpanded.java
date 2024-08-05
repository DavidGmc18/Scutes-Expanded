package net.scutes_expanded;

import net.fabricmc.api.ModInitializer;
import net.scutes_expanded.block.ModBlocks;

public class ScutesExpanded implements ModInitializer {

    @Override
    public void onInitialize() {
        CommonClass.init();
        ModBlocks.registerModBlocks();
    }
}
