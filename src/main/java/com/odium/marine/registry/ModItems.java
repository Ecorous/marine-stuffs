package com.odium.marine.registry;

import com.odium.marine.Marine;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CEVICHE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(6).build()));
    public static final Item FUGU = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(10).build()));
    

    public static void RegisterItems(){
        Registry.register(Registry.ITEM, new Identifier(Marine.MOD_ID, "ceviche"), CEVICHE);
        Registry.register(Registry.ITEM, new Identifier(Marine.MOD_ID, "fugu"), FUGU);

    }
}


