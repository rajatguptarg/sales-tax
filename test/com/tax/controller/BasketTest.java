package com.tax.controller;

import com.tax.controller.Basket;
import com.tax.model.Item;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Test
    public void shouldBeAbleToAddItems() throws Exception {
        List<Item> itemList =  new ArrayList<>();
        Item item = Mockito.mock(Item.class);
        Basket basket = new Basket(itemList);

        assertEquals(true, basket.addItem(item));
    }
}
