package com.tax;

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
        if (localTokens.contains(Constant.BOOK)) {
            basket.addItem(new Item(value, Constant.BOOK, item.substring(0, requiredIndex)));
        }
    }
}
