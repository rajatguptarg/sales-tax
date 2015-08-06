package com.tax;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        List<Item> itemList = new ArrayList<>();
        Basket basket = new Basket(itemList);
        Parser parser = new Parser(basket);
        SalesTaxApp salesTaxApp = new SalesTaxApp(parser, input);
        salesTaxApp.start();
    }
}
