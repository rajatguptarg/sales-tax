package com.tax;

import com.tax.controller.Basket;
import com.tax.helper.Parser;
import com.tax.io.Input;
import com.tax.model.Item;

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
