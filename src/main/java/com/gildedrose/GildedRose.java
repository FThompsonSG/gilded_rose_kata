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

            QualityAdjuster.decreaseQuality(item);
            QualityAdjuster.increaseQuality(item);

        }
    }
}
