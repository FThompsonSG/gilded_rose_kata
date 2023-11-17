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
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
        new Item("Aged Brie", 5, 49),
        new Item("Aged Brie", 5, 50),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50),
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48),
        new Item("Conjured Aged Meat", 10, 48),
        new Item("Conjured Aged Meat", -2, 48)};


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

    @Test
    @DisplayName("Sulfuras sellIn Test")
    void sulfurasSellInTest() {
        app.updateQuality();
        assertEquals(0, items[3].sellIn);
    }

    @Test
    @DisplayName("Sulfuras Quality Test")
    void sulfurasQualityTest() {
        app.updateQuality();
        assertEquals(80, items[3].quality);
    }

    @Test
    @DisplayName("Backstage Pass sellIn Test")
    void backstagePassSellInTest() {
        app.updateQuality();
        assertEquals(14, items[5].sellIn);
    }

    @Test
    @DisplayName("Backstage Pass Quality Test")
    void backstagePassQualityTest() {
        app.updateQuality();
        assertEquals(21, items[5].quality);
    }

    @Test
    @DisplayName("Backstage Pass Quality Test to confirm increase by 2")
    void backstagePassTwoIncreaseQualityTest() {
        app.updateQuality();
        assertEquals(22, items[6].quality);
    }

    @Test
    @DisplayName("Backstage Pass Quality Test to confirm increase by 3")
    void backstagePassThreeIncreaseQualityTest() {
        app.updateQuality();
        assertEquals(23, items[7].quality);
    }

    @Test
    @DisplayName("Aged Brie Quality Limit Test")
    void brieQualityLimitTest() {
        app.updateQuality();
        assertEquals(50, items[9].quality);
    }

    @Test
    @DisplayName("Backstage Pass Quality Limit Test")
    void backstagePassQualityLimitTest() {
        app.updateQuality();
        assertEquals(50, items[10].quality);
    }

    @Test
    @DisplayName("Backstage Pass Quality Limit Second Test")
    void backstagePassQualityLimitSecondTest() {
        app.updateQuality();
        assertEquals(50, items[11].quality);
    }

    @Test
    @DisplayName("Backstage Pass Quality Limit Third Test")
    void backstagePassQualityLimitThirdTest() {
        app.updateQuality();
        assertEquals(50, items[12].quality);
    }

    @Test
    @DisplayName("Conjured Quality Test")
    void conjuredQualityTest() {
        app.updateQuality();
        assertEquals(46, items[13].quality);
    }

    @Test
    @DisplayName("Conjured Quality Past sellIn Test")
    void conjuredQualityPastSellInTest() {
        app.updateQuality();
        assertEquals(44, items[14].quality);
    }

}
