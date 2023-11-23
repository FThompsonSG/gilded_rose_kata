package com.gildedrose;

import com.gildedrose.logger.ConsoleHandlerSetup;
import com.gildedrose.logger.FileHandlerSetup;
import com.gildedrose.logger.LoggerSetup;

import java.util.Objects;
import java.util.logging.Logger;

public class QualityAdjuster {

    public static final Logger logger = Logger.getLogger(QualityAdjuster.class.getName());

    public static void qualityCapCheck(Item item) {

        LoggerSetup.setupLogger(logger);
        FileHandlerSetup.setupFileHandler(logger);
        ConsoleHandlerSetup.setupConsoleHandler(logger);

        if (item.quality > 50) {
            item.quality = 50;
        }

    }

    public static void checkIsConjured(Item item) {

        if (item.name.contains("Conjured")) {
            if (item.sellIn > 0) {
                item.quality--;
            } else {
                item.quality = item.quality - 2;
            }
        }

    }

    public static void decreaseQuality(Item item) {

        if (item.quality > 0 && !Objects.equals(item.name, "Aged Brie") &&
            !Objects.equals(item.name, "Backstage passes to a TAFKAL80ETC concert") &&
            !Objects.equals(item.name, "Sulfuras, Hand of Ragnaros")) {
            if (item.sellIn > 0) {
                item.quality--;
                checkIsConjured(item);
            } else {
                item.quality = item.quality - 2;
                checkIsConjured(item);
            }
        }

    }

    public static void increaseQuality(Item item) {

        if (Objects.equals(item.name, "Backstage passes to a TAFKAL80ETC concert")) {
            if (item.sellIn > 10) {
                item.quality++;
                qualityCapCheck(item);
            } else if (item.sellIn > 5) {
                item.quality = item.quality + 2;
                qualityCapCheck(item);
            } else if (item.sellIn > 0) {
                item.quality = item.quality + 3;
                qualityCapCheck(item);
            }
        }

        if (Objects.equals(item.name, "Aged Brie")) {
            item.quality++;
            qualityCapCheck(item);
        }

    }

}
