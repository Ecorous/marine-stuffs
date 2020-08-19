package com.odium.marine.registry;

import com.odium.marine.Marine;
import com.odium.marine.armors.DeepSeaMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CEVICHE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(6).build()));
    public static final Item FUGU = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(10).build()));
    public static final Item SEA_HELMET = new ArmorItem(DeepSeaMaterial.SeaArmorMaterial.SEA, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_CHESTPLATE = new ArmorItem(DeepSeaMaterial.SeaArmorMaterial.SEA, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_LEGGINGS = new ArmorItem(DeepSeaMaterial.SeaArmorMaterial.SEA, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_BOOTS = new ArmorItem(DeepSeaMaterial.SeaArmorMaterial.SEA, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));



    public static void RegisterItems(){

        Registry.register(Registry.ITEM, new Identifier(Marine.MOD_ID, "ceviche"), CEVICHE);
        Registry.register(Registry.ITEM, new Identifier(Marine.MOD_ID, "fugu"), FUGU);
        Registry.register(Registry.ITEM, new Identifier(Marine.MOD_ID, "sea_helmet"), SEA_HELMET);
        Registry.register(Registry.ITEM,new Identifier(Marine.MOD_ID,"sea_chestplate"), SEA_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(Marine.MOD_ID,"sea_leggings"), SEA_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(Marine.MOD_ID,"sea_boots"), SEA_BOOTS);
    }
}


