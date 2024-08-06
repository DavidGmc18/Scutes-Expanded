package net.scutes_expanded.mixin;

import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.scutes_expanded.item.ArmadilloArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Spider.class)
public class SpiderMixin extends MobMixin {
    @Inject(method = "registerGoals", at = @At("RETURN"))
    private void registerGoals(CallbackInfo ci) {
        this.goalSelector.addGoal(
                2,
                new AvoidEntityGoal<>((Spider) (Object) this,
                        Player.class,
                        6.0F,
                        1.0,
                        1.2,
                        entity -> {
                            for (ItemStack item : entity.getArmorSlots()) {
                                if (item.getItem() instanceof ArmadilloArmorItem) {
                                    return true;
                                }
                            }
                            return false;
                        }
                ));
    }
}