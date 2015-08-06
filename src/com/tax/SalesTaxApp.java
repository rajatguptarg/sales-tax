package com.tax;

public class SalesTaxApp {
    private Parser parser;

    public SalesTaxApp(Parser parser) {
        this.parser = parser;
    }

    public boolean start() {
        return true;
    }
}
