package com.starbucks.kirk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jmalmin on 4/20/16.
 */


public class JohnCalculatorTest {

    @Test
    public void testAdditionOfTwoNumber() {
        JohnCalculator johnCalc = new JohnCalculator();
        assertEquals(9, johnCalc.add(4, 5));
    }
    @Test
    public void testAdditionOfTwoNumber2() {
        JohnCalculator johnCalc = new JohnCalculator();
        assertEquals(5, johnCalc.add(0, 5));
    }
}
