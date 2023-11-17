package com.gildedrose;

class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn--;
            }

//            if (!item.name.equals("Aged Brie")
//                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (item.quality > 0) {
//                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            QualityAdjuster.decreaseQuality(item);
            QualityAdjuster.increaseQuality(item);
//                    }
//                }
//            } else {
//                if (item.quality < 50) {
//                    QualityAdjuster.increaseQuality(item);
//
//                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (item.sellIn < 11) {
//                            if (item.quality < 50) {
//                                QualityAdjuster.increaseQuality(item);
//                            }
//                        }
//
//                        if (item.sellIn < 6) {
//                            if (item.quality < 50) {
//                                QualityAdjuster.increaseQuality(item);
//                            }
//                        }
//                    }
//                }
//            }


//            if (item.sellIn < 0) {
//                if (!item.name.equals("Aged Brie")) {
//                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (item.quality > 0) {
//                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
//                                QualityAdjuster.decreaseQuality(item);
//                            }
//                        }
//                    }
//                } else {
//                    if (item.quality < 50) {
//                        QualityAdjuster.increaseQuality(item);
//                    }
//                }
//            }
        }
    }
}
