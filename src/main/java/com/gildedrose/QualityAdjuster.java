package com.gildedrose;

import java.util.Objects;

public class QualityAdjuster {

    public static void decreaseQuality(Item item) {

        if (item.quality > 0 && !Objects.equals(item.name, "Aged Brie") &&
            !Objects.equals(item.name, "Backstage passes to a TAFKAL80ETC concert") &&
            !Objects.equals(item.name, "Sulfuras, Hand of Ragnaros")) {
            if (item.sellIn > 0) {
                item.quality--;
            } else {
                item.quality--;
                item.quality--;
            }
        }

    }

    public static void increaseQuality(Item item) {

        if (Objects.equals(item.name, "Backstage passes to a TAFKAL80ETC concert")) {
            if (item.sellIn > 10) {
                item.quality++;
            } else if (item.sellIn > 5) {
                item.quality++;
                item.quality++;
            } else if (item.sellIn > 0) {
                item.quality++;
                item.quality++;
                item.quality++;
            }
        }

        if (Objects.equals(item.name, "Aged Brie")) {
            item.quality++;
        }

    }

}
