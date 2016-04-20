package com.starbucks.kirk;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllenCalculatorTest {
	@Test
	public void testAdditionOfTwoNumber() {
		AllenCalculator allCalc = new AllenCalculator();
		assertEquals(9, allCalc.add(4, 5));
	}

	@Test
	public void testAdditionOfTwoNumber1(){
		AllenCalculator allCalc = new AllenCalculator();
		assertEquals(6, allCalc.add(3,3));
	}

	@Test
	public void testAdditionOfTwoNumber2(){
		AllenCalculator allCalc = new AllenCalculator();
		assertEquals(0, allCalc.add(0,0));
	}
	
	@Test
	public void testAdditionOfTwoNumber3(){
		AllenCalculator allCalc = new AllenCalculator();
		assertEquals(-12, allCalc.add(0,-12));
	}
}
