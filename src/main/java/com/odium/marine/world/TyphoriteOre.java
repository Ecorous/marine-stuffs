package com.odium.marine.world;

import com.odium.marine.registry.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class TyphoriteOre {
    private void handleBiome(Biome biome) {
        if(biome.getCategory() == Biome.Category.OCEAN) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    ModBlocks.TYPHORITE_ORE.getDefaultState(),
                                    2 //Ore vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    1, //Number of veins per chunk
                                    0, //Bottom Offset
                                    14, //Min y level
                                    56 //Max y level
                            ))));
        }
    }
}
