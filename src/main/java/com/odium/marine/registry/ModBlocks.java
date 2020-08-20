package com.odium.marine.registry;

import com.odium.marine.Marine;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    public static final Block SCUTE_BLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(4.0f));
    public static final Block SEAGRASS_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).hardness(1.0f));
    public static final Block KELP_BLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(1.0f));
    public static final Block ROASTED_SEAGRASS_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).hardness(1.0f));

    public static void RegisterItems(){

        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "scute_block"), SCUTE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "seagrass_block"),SEAGRASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "kelp_block"), KELP_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "roasted_seagrass_block"),ROASTED_SEAGRASS_BLOCK);
    }


}
