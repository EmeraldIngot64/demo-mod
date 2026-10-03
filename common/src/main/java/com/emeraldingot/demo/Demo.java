package com.emeraldingot.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
	public static final String MOD_ID = "demo";

	public static final Logger LOGGER = LoggerFactory.getLogger("demo");

	public static void init() {
		LOGGER.info("Initialized Demo Mod! (Why would you want this?)");
	}
}