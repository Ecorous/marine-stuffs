package com.odium.marine;

import com.odium.marine.registry.ModBlocks;
import com.odium.marine.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Marine implements ModInitializer {

    public static String ID = "mstuff";
    private void handleOreGeneration(Biome biome) {
        if (biome.getCategory() == Biome.Category.OCEAN) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    ModBlocks.TYPHORITE_ORE.getDefaultState(),
                                    3 //Ore vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    2,
                                    0,
                                    24,
                                    63
                            ))));
        }
    }

    @Override
    public void onInitialize() {
        ModItems.RegisterItems();
        ModBlocks.RegisterBlocks();
        Registry.BIOME.forEach(this::handleOreGeneration);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleOreGeneration(biome));
    }
}
