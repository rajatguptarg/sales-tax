package com.tax.helper;

import com.tax.controller.Basket;
import com.tax.model.Item;

import java.util.Arrays;
import java.util.List;

public class Parser {
    private Basket basket;

    public Parser(Basket basket) {
        this.basket = basket;
    }

    public boolean parse(String item) {
        tokenize(item);
        return true;
    }

    private void tokenize(String item) {
        List<String> localTokens = Arrays.asList(item.split("\\s+"));
        int size = localTokens.size();
        String value = (localTokens.get(size - 1));
        int requiredIndex = item.length() - value.length() - 4;

        if (localTokens.contains(Constant.IMPORT)) {
            basket.addItem(new Item(value, Constant.IMPORT, item.substring(0, requiredIndex)));
        }
        else if (localTokens.contains(Constant.BOOK)) {
            basket.addItem(new Item(value, Constant.BOOK, item.substring(0, requiredIndex)));
        }
        else if (localTokens.contains(Constant.MEDICINE)) {
            basket.addItem(new Item(value, Constant.MEDICINE, item.substring(0, requiredIndex)));
        }
        else if (localTokens.contains(Constant.FOOD)) {
            basket.addItem(new Item(value, Constant.FOOD, item.substring(0, requiredIndex)));
        }

    }
}
