package com.emeraldingot.demo;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Demo.MOD_ID)
public class Demo {
	public static final String MOD_ID = "demo";

	public static final Logger LOGGER = LoggerFactory.getLogger("demo");

	public Demo(IEventBus modEventBus) {
		LOGGER.info("Initialized Demo Mod! (Why would you want this?)");
	}
}