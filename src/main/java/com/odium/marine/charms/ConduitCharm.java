package com.odium.marine.charms;
                                                                                  
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ConduitCharm extends Item {
    public ConduitCharm() {
        super((new Item.Settings().group(ItemGroup.TOOLS)));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (entity instanceof LivingEntity && !((LivingEntity) entity).hasStatusEffect(StatusEffects.CONDUIT_POWER)) {
            ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 1, 0));
        }
    }
}

