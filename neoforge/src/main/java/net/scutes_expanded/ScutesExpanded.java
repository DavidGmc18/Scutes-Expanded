package net.scutes_expanded;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.scutes_expanded.block.ModBlocks;
import net.scutes_expanded.item.ModCreativeModeTabs;
import net.scutes_expanded.item.ModItems;

@Mod(Constants.MOD_ID)
public class ScutesExpanded {

    public ScutesExpanded(IEventBus eventBus) {
        CommonClass.init();
        ModBlocks.BLOCKS.register(eventBus);
        ModItems.ITEMS.register(eventBus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(eventBus);
    }
}