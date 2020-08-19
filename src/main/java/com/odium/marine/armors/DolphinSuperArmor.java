package com.odium.marine.armors;

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

public class DolphinSuperArmor extends ArmorItem {
    public DolphinSuperArmor() {
        super(DolphinMaterial.DolphinLeatherMaterial.DOLPHINLEATHER, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (entity instanceof LivingEntity && !((LivingEntity) entity).hasStatusEffect(StatusEffects.DOLPHINS_GRACE)) {
            ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1, 0));
        }
    }
}
