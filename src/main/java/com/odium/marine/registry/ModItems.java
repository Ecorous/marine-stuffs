package com.odium.marine.registry;

import com.odium.marine.Marine;
import com.odium.marine.armors.DeepSeaMaterial;
import com.odium.marine.armors.NautilusShellMaterial;
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
    public static final Item SHELL_HELMET = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_CHESTPLATE = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_LEGGINGS = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_BOOTS = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));



    public static void RegisterItems(){

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "ceviche"), CEVICHE);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "fugu"), FUGU);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "sea_helmet"), SEA_HELMET);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_chestplate"), SEA_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_leggings"), SEA_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_boots"), SEA_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "shell_helmet"), SHELL_HELMET);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_chestplate"), SHELL_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_leggings"), SHELL_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_boots"), SHELL_BOOTS);

    }
}


