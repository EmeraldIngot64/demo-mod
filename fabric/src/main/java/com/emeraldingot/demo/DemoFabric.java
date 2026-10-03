package com.emeraldingot.demo;

import net.fabricmc.api.ModInitializer;

public class DemoFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Demo.init();
    }
}
