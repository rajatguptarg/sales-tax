package com.tax;

public class SalesTaxApp {
    private Parser parser;
    private Input input;

    public SalesTaxApp(Parser parser, Input input) {
        this.parser = parser;
        this.input = input;
    }

    public boolean start() {
        while (true) {
            String item = input.getInput();
            if (item.equalsIgnoreCase("done")) {
                break;
            }
            parser.parse(item);
        }
        return true;
    }
}
