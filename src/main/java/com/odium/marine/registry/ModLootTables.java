package com.odium.marine.registry;

import com.odium.marine.Marine;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.util.Identifier;

public class ModLootTables
{
    private static final Identifier DOLPHIN_LEATHER_LOOT_TABLE_ID = new Identifier(Marine.ID, "items/dolphin_leather");
    // Loot Table Code
    LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
    if (DOLPHIN_LEATHER_LOOT_TABLE_ID.equals(Marine.ID)) {
        // Our code will go here
    }
}
