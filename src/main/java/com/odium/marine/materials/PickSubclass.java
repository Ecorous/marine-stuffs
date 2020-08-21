package com.odium.marine.materials;

import net.minecraft.item.PickaxeItem;

public class PickSubclass extends PickaxeItem {
    public PickSubclass(SeaMaterial.SeaToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
