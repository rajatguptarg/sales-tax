package com.tax;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldBeAbleToParseString() throws Exception {
        List<Item> itemList = new ArrayList<>();
        Basket basket = new Basket(itemList);
        Parser parser = new Parser(basket);

        assertEquals(true, parser.parse("1 book at 12.49"));
    }
}
