package com.tax;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalesTaxAppTest {

    @Test
    public void shouldBeAbleToStart() throws Exception {
        Parser parser = new Parser();
        SalesTaxApp salesTaxApp = new SalesTaxApp(parser);

        assertEquals(true, salesTaxApp.start());
    }
}