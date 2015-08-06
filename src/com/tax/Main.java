package com.tax;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Basket basket = new Basket();
        Parser parser = new Parser(basket);
        SalesTaxApp salesTaxApp = new SalesTaxApp(parser, input);
        salesTaxApp.start();
    }
}
