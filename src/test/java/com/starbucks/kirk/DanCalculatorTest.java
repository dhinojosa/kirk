package com.starbucks.kirk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DanCalculatorTest {

	@Test
	public void testAdditionOfTwoNumbers() {
		DanCalculator danCalc = new DanCalculator();
		assertEquals(9, danCalc.add(4, 5));
	}

	@Test
	public void testAdditionOfTwoOtherNumbers() {
		DanCalculator danCalc = new DanCalculator();
		assertEquals(5, danCalc.add(0, 5));
	}

	@Test
	public void testAdditionOfTwoZeros() {
		DanCalculator danCalc = new DanCalculator();
		assertEquals(0, danCalc.add(0, 0));
	}

}
