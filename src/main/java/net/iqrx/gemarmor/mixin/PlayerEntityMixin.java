package net.iqrx.gemarmor.mixin;

import net.dragonloot.init.ItemInit;
import net.iqrx.gemarmor.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    public PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "checkFallFlying", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/entity/player/PlayerEntity;getEquippedStack(Lnet/minecraft/entity/EquipmentSlot;)Lnet/minecraft/item/ItemStack;"), cancellable = true)
    private void checkFallFlyingMixin(CallbackInfoReturnable<Boolean> info) {
        if (this.getEquippedStack(EquipmentSlot.CHEST).getItem() == ModItems.WINGED_GEM_CHESTPLATE) {
            this.startFallFlying();
            info.setReturnValue(true);
        }

    }

    @Shadow
    public void startFallFlying() {
    }

}
