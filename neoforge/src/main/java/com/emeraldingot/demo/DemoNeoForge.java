package com.emeraldingot.demo;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Demo.MOD_ID)
public class DemoNeoForge {
    public DemoNeoForge(IEventBus modEventBus) {
        Demo.init();
    }
}
