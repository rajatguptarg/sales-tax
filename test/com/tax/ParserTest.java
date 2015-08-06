package com.tax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldBeAbleToParseString() throws Exception {
        Basket basket = new Basket();
        Parser parser = new Parser(basket);

        assertEquals(true, parser.parse("hello"));
    }
}
