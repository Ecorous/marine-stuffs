package com.odium.marine.world;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.registry.Registry;

public class ModGeneration implements ModInitializer
{

    @Override
    public void onInitialize() {
        //Loop over existing biomes
        Registry.BIOME.forEach(this::handleBiome);

        //Listen for other biomes being registered
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiome(biome));
    }

}
