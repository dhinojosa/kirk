package com.starbucks.kirk;

import static org.junit.Assert.*;

import org.junit.Test;

public class TCCalculatorTest {
	@Test
	public void testAdditionSet1(){
		TCCalculator calc = new TCCalculator();
		assertEquals(14, calc.add(9,5));
	}
	@Test
	public void testAdditionSet2() {
		TCCalculator calc = new TCCalculator();
		assertNotEquals(9, calc.add(3, 5));
	}
}
