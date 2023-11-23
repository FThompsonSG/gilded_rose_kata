package com.gildedrose.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleHandlerSetup {

    public static void setupConsoleHandler(Logger logger) {

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());

        logger.addHandler(consoleHandler);

    }

}
