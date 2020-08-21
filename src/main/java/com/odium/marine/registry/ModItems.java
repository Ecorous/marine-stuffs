package com.odium.marine.registry;

import com.odium.marine.Marine;
import com.odium.marine.materials.*;
import com.odium.marine.charms.ConduitCharm;
import com.odium.marine.charms.DolphinCharm;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CEVICHE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(6).build()));
    public static final Item FUGU = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(10).build()));
    public static final Item CALAMARI = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(6).build()));
    public static final Item RAW_CALAMARI = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1).build()));
    public static final Item FISH_BOWL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(12).saturationModifier(14).build()));
    public static final Item ROASTED_SEAGRASS = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(1).build()));

    public static final Item DOLPHIN_LEATHER = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TYPHORITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.EPIC));
    public static final Item TYPHORITE_SCRAP = new Item(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.RARE));
    public static final Item TYPHORITE_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.RARE));

    public static final Item DOLPHIN_CHARM= new DolphinCharm();
    public static final Item CONDUIT_CHARM= new ConduitCharm();

    public static final Item SEA_HELMET = new ArmorItem(DeepSeaArmorMaterial.SeaArmorMaterial.SEA, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_CHESTPLATE = new ArmorItem(DeepSeaArmorMaterial.SeaArmorMaterial.SEA, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_LEGGINGS = new ArmorItem(DeepSeaArmorMaterial.SeaArmorMaterial.SEA, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_BOOTS = new ArmorItem(DeepSeaArmorMaterial.SeaArmorMaterial.SEA, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item SHELL_HELMET = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_CHESTPLATE = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_LEGGINGS = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_BOOTS = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item TYPHORITE_HELMET = new ArmorItem(TyphoriteArmorMaterial.TyphoriteArmMaterial.TYPHORITE, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));
    public static final Item TYPHORITE_CHESTPLATE = new ArmorItem(TyphoriteArmorMaterial.TyphoriteArmMaterial.TYPHORITE, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));
    public static final Item TYPHORITE_LEGGINGS = new ArmorItem(TyphoriteArmorMaterial.TyphoriteArmMaterial.TYPHORITE, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));
    public static final Item TYPHORITE_BOOTS = new ArmorItem(TyphoriteArmorMaterial.TyphoriteArmMaterial.TYPHORITE, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));

    public static final Item PRISM_HELM = new ArmorItem(PrismarineMaterial.PrismMaterial.PRISM, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item PRISM_CHEST = new ArmorItem(PrismarineMaterial.PrismMaterial.PRISM, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item PRISM_LEGS = new ArmorItem(PrismarineMaterial.PrismMaterial.PRISM, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item PRISM_BOOTS = new ArmorItem(PrismarineMaterial.PrismMaterial.PRISM, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));


    public static final Item TYPHORITE_SWORD = new SwordItem(TyphoriteMaterial.TyphoriteToolMaterial.TYPHORITE, 8, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC));
    public static final Item TYPHORITE_SHOVEL = new ShovelItem(TyphoriteMaterial.TyphoriteToolMaterial.TYPHORITE, 5, -2.8f, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.EPIC));
    public static final Item TYPHORITE_PICKAXE = new PickaxeSubclass(TyphoriteMaterial.TyphoriteToolMaterial.TYPHORITE, 5, -3f, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.EPIC));
    public static final Item TYPHORITE_AXE = new AxeSubclass(TyphoriteMaterial.TyphoriteToolMaterial.TYPHORITE, 9, -1.0f, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.EPIC));

    public static final Item SEA_SWORD = new SwordItem(SeaMaterial.SeaToolMaterial.SEA, 8, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC));
    public static final Item SEA_SHOVEL = new ShovelItem(SeaMaterial.SeaToolMaterial.SEA, 5, -2.8f, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.EPIC));
    public static final Item SEA_PICKAXE = new PickSubclass(SeaMaterial.SeaToolMaterial.SEA, 5, -3f, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.EPIC));
    public static final Item SEA_AXE = new AxSubclass(SeaMaterial.SeaToolMaterial.SEA, 9, -1.0f, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.EPIC));

    public static void RegisterItems(){

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "ceviche"), CEVICHE);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "fugu"), FUGU);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "calamari"), CALAMARI);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "raw_calamari"), RAW_CALAMARI);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "fish_bowl"), FISH_BOWL);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "roasted_seagrass"), ROASTED_SEAGRASS);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "dolphin_leather"), DOLPHIN_LEATHER);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "dolphin_charm"), DOLPHIN_CHARM);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "conduit_charm"), CONDUIT_CHARM);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "sea_helmet"), SEA_HELMET);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_chestplate"), SEA_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_leggings"), SEA_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_boots"), SEA_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "shell_helmet"), SHELL_HELMET);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_chestplate"), SHELL_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_leggings"), SHELL_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_boots"), SHELL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "prism_helm"), PRISM_HELM);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "prism_chest"), PRISM_CHEST);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "prism_legs"), PRISM_LEGS);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "prism_boots"), PRISM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_helmet"), TYPHORITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_chestplate"), TYPHORITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_leggings"), TYPHORITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_boots"), TYPHORITE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_ingot"), TYPHORITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_scrap"), TYPHORITE_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_nugget"), TYPHORITE_NUGGET);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_sword"), TYPHORITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_shovel"), TYPHORITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_pickaxe"), TYPHORITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_axe"), TYPHORITE_AXE);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "sea_sword"), SEA_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "sea_shovel"), SEA_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "sea_pickaxe"), SEA_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "sea_axe"), SEA_AXE);

    }
}


