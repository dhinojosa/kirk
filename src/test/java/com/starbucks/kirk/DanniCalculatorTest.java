package com.starbucks.kirk;

import static org.junit.Assert.*;

import org.junit.Test;

public class DanniCalculatorTest {

	@Test
	public void testAdditionOfTwoNumbers() {
		DanniCalculator cal = new DanniCalculator();
		assertEquals(9, cal.add(4,5));
	}
	
	@Test
	public void testAdditionOfTwoOtherNumbers() {
		DanniCalculator cal = new DanniCalculator();
		assertEquals(5, cal.add(1,4));
	}
	
	@Test
	public void testAdditionOfTwoOther2Numbers() {
		DanniCalculator cal = new DanniCalculator();
		assertEquals(-1, cal.add(-5,4));
	}
}
