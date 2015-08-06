package com.tax;

import com.tax.helper.Parser;
import com.tax.io.Input;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class SalesTaxAppTest {

    @Test
    public void shouldBeAbleToStart() throws Exception {
        Parser parser = Mockito.mock(Parser.class);
        Input input = Mockito.mock(Input.class);
        SalesTaxApp salesTaxApp = new SalesTaxApp(parser, input);

        Mockito.when(input.getInput()).thenReturn("done");

        assertEquals(true, salesTaxApp.start());
    }
}