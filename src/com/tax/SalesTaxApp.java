package com.tax;

import com.tax.helper.Parser;
import com.tax.io.Input;

public class SalesTaxApp {
    private Parser parser;
    private Input input;

    public SalesTaxApp(Parser parser, Input input) {
        this.parser = parser;
        this.input = input;
    }

    public boolean start() {
        while (true) {
            System.out.print("Enter Item: \n");
            String item = input.getInput();
            if (item.equalsIgnoreCase("done")) {
                break;
            }
            parser.parse(item);
        }
        return true;
    }
}
