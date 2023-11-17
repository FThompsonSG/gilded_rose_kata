package com.gildedrose;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    Item[] items = new Item[]{
        new Item("+5 Dexterity Vest", 10, 20), //
        new Item("Aged Brie", 2, 0), //
        new Item("Elixir of the Mongoose", 5, 7), //
        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};

    GildedRose app = new GildedRose(items);

//    @BeforeAll
//    static void setup() {
//        Item[] items = new Item[] {
//            new Item("+5 Dexterity Vest", 10, 20), //
//            new Item("Aged Brie", 2, 0), //
//            new Item("Elixir of the Mongoose", 5, 7), //
//            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
//            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
//            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
//            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
//            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
//    }

    @Test
    @DisplayName("Standard Item Name Test")
    void nameTest() {
        app.updateQuality();
        assertEquals("+5 Dexterity Vest", items[0].name);
    }

    @Test
    @DisplayName("Standard Item sellIn Test")
    void sellInTest() {
        app.updateQuality();
        assertEquals(9, items[0].sellIn);
    }

    @Test
    @DisplayName("Standard Item Quality Test")
    void qualityTest() {
        app.updateQuality();
        assertEquals(19, items[0].quality);
    }

    @Test
    @DisplayName("Aged Brie sellIn Test")
    void brieSellInTest() {
        app.updateQuality();
        assertEquals(1, items[1].sellIn);
    }

    @Test
    @DisplayName("Aged Brie Quality Test")
    void brieQualityTest() {
        app.updateQuality();
        assertEquals(1, items[1].quality);
    }

}
