package com.tax;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        SalesTaxApp salesTaxApp = new SalesTaxApp(parser);
        salesTaxApp.start();
    }
}
