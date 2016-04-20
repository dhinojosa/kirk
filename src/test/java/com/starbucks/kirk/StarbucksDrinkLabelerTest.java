package com.starbucks.kirk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StarbucksDrinkLabelerTest {


    @Test
    public void testBlankLine() {
        StarbucksDrinkLabeler labeler = new StarbucksDrinkLabeler();
        assertEquals("", labeler.getLabel());
    }


    @Test
    public void testCoffeeOfTheDay() {
        StarbucksDrinkLabeler labeler = new StarbucksDrinkLabeler();
        labeler.addItem("Coffee of the Day");
        assertEquals("Coffee of the Day", labeler.getLabel());
    }

    @Test
    public void testGrandeCoffeeOfTheDay() {
        StarbucksDrinkLabeler labeler = new StarbucksDrinkLabeler();
        labeler.addItem("Coffee of the Day");
        labeler.addItem("Grande");
        assertEquals("Grande, Coffee of the Day", labeler.getLabel());
    }
}
