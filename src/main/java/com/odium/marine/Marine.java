package com.odium.marine;

import com.odium.marine.registry.ModBlocks;
import com.odium.marine.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Marine implements ModInitializer {

    public static String ID = "mstuff";

    @Override
    public void onInitialize() {
        ModItems.RegisterItems();
        ModBlocks.RegisterBlocks();
    }
}
