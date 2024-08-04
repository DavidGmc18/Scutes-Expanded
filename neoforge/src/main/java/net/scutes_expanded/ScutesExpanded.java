package net.scutes_expanded;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.scutes_expanded.CommonClass;
import net.scutes_expanded.Constants;

@Mod(Constants.MOD_ID)
public class ScutesExpanded {

    public ScutesExpanded(IEventBus eventBus) {
        CommonClass.init();

    }
}