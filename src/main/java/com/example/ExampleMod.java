package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This the common area of your code. You don't have access to Minecraft but Minecraft has access to you
 */
public class ExampleMod {
    public static ExampleMod INSTANCE = new ExampleMod();

    private final Logger logger = LogManager.getLogger();

    public void main() {
        logger.info("ExampleMod was loaded! :)");
    }

    public Logger getLogger() {
        return logger;
    }
}
