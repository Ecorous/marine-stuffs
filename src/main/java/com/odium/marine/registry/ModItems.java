package com.odium.marine.registry;

import com.odium.marine.Marine;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Lazy;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class ModItems {
    public static final Item CEVICHE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(6).build()));
    public static final Item FUGU = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(10).build()));
    public static final Item SEA_HELMET = new ArmorItem(SeaArmorMaterial.SEA, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_CHESTPLATE = new ArmorItem(SeaArmorMaterial.SEA, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_LEGGINGS = new ArmorItem(SeaArmorMaterial.SEA, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_BOOTS = new ArmorItem(SeaArmorMaterial.SEA, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));


    public enum SeaArmorMaterial implements ArmorMaterial {
        SEA("sea", 33, new int[] {3 , 6, 8 , 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.ofItems(Items.DARK_PRISMARINE);
        });
        private static final int[] baseDurability = {13, 15, 16, 11};
        private final String name;
        private final int durabilityMultiplier;
        private final int[] armorValues;
        private final int enchantability;
        private final SoundEvent equipSound;
        private final float toughness;
        private final float knockbackResistance;
        private final Lazy<Ingredient> repairIngredient;

        SeaArmorMaterial(String name, int durabilityMultiplier, int[] armorValueArr, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
            this.name = name;
            this.durabilityMultiplier = durabilityMultiplier;
            this.armorValues = armorValueArr;
            this.enchantability = enchantability;
            this.equipSound = soundEvent;
            this.toughness = toughness;
            this.knockbackResistance = getKnockbackResistance();
            this.repairIngredient = new Lazy(repairIngredient);
        }

        public int getDurability(EquipmentSlot equipmentSlot_1) {
            return baseDurability[equipmentSlot_1.getEntitySlotId()] * this.durabilityMultiplier;
        }

        public int getProtectionAmount(EquipmentSlot equipmentSlot_1) {
            return this.armorValues[equipmentSlot_1.getEntitySlotId()];
        }

        public int getEnchantability() {
            return this.enchantability;
        }

        public SoundEvent getEquipSound() {
            return this.equipSound;
        }

        public Ingredient getRepairIngredient() {
            // We needed to make it a Lazy type so we can actually get the Ingredient from the Supplier.
            return this.repairIngredient.get();
        }

        @Environment(EnvType.CLIENT)
        public String getName() {
            return this.name;
        }

        public float getToughness() {
            return this.toughness;
        }

        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }

    }

    public static void RegisterItems(){

        Registry.register(Registry.ITEM, new Identifier(Marine.MOD_ID, "ceviche"), CEVICHE);
        Registry.register(Registry.ITEM, new Identifier(Marine.MOD_ID, "fugu"), FUGU);
        Registry.register(Registry.ITEM, new Identifier(Marine.MOD_ID, "sea_helmet"), SEA_HELMET);
        Registry.register(Registry.ITEM,new Identifier(Marine.MOD_ID,"sea_chestplate"), SEA_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(Marine.MOD_ID,"sea_leggings"), SEA_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(Marine.MOD_ID,"sea_boots"), SEA_BOOTS);
    }
}


