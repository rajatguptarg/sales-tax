package com.tax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void shouldBeAbleToTellValue() throws Exception {
        Item item = new Item("12.5", Constant.BOOK, "My Item");

        assertEquals(12.5, item.getValue(), 0);
    }

    @Test
    public void shouldBeAbleToTellType() throws Exception {
        Item item = new Item("12.5", Constant.BOOK, "My Item");

        assertEquals(Constant.BOOK, item.getType());
    }

    @Test
    public void shouldBeAbleToTellName() throws Exception {
        Item item = new Item("12.5", Constant.BOOK, "My Item");

        assertEquals("My Item", item.getName());
    }
}
