package net.scutes_expanded;

import net.fabricmc.api.ModInitializer;
import net.scutes_expanded.CommonClass;
import net.scutes_expanded.Constants;

public class ScutesExpanded implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CommonClass.init();
    }
}
