package com.tax;

import java.util.List;

public class Basket {
    private List<Item> itemList;

    public Basket(List<Item> itemList) {
        this.itemList = itemList;
    }

    public boolean addItem(Item item) {
        return itemList.add(item);
    }
}
