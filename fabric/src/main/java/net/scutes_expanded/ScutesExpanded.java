package net.scutes_expanded;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.scutes_expanded.block.ModBlocks;
import net.scutes_expanded.item.ModCreativeModTabs;
import net.scutes_expanded.item.ModItems;

public class ScutesExpanded implements ModInitializer {

    @Override
    public void onInitialize() {
        CommonClass.init();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModCreativeModTabs.registerItemGroups();

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Items.TURTLE_SCUTE, 1), 5, 5, 0.02f));

            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 1),
                    new ItemStack(Items.ARMADILLO_SCUTE, 1), 5, 5, 0.02f));
        });
    }
}
