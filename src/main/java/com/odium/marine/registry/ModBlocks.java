package com.odium.marine.registry;

import com.odium.marine.Marine;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    public static final Block SCUTE_BLOCK = new Block(FabricBlockSettings.of(Material.SPONGE).hardness(4.0f).breakByHand(true));
    public static final Block SEAGRASS_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).hardness(1.0f).breakByHand(true));
    public static final Block ROASTED_SEAGRASS_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).hardness(1.0f).breakByHand(true));
    public static final Block TYPHORITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(50.0f).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 3));
    public static final Block TYPHORITE_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(50.0f).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 3));


    public static void RegisterBlocks(){

        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "scute_block"), SCUTE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "seagrass_block"),SEAGRASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "roasted_seagrass_block"),ROASTED_SEAGRASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "typhorite_block"), TYPHORITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Marine.ID, "typhorite_ore"), TYPHORITE_ORE);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "scute_block"), new BlockItem(SCUTE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "seagrass_block"),new BlockItem(SEAGRASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "roasted_seagrass_block"), new BlockItem(ROASTED_SEAGRASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_block"), new BlockItem(TYPHORITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_ore"), new BlockItem(TYPHORITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    }


}
