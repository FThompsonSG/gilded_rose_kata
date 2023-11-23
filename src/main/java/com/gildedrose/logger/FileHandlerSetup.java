package com.gildedrose.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class FileHandlerSetup {

    public static void setupFileHandler(Logger logger) {

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/logFile.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new XMLFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
