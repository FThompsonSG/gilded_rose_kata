package com.gildedrose.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerSetup {

    public static void setupLogger(Logger logger) {

        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
        logger.setFilter(new CustomFilter());

    }

}
