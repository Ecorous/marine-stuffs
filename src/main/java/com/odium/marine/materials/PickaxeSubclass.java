package com.odium.marine.materials;

import net.minecraft.item.PickaxeItem;

public class PickaxeSubclass extends PickaxeItem {
    public PickaxeSubclass(TyphoriteMaterial.TyphoriteToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
