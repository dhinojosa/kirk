package com.starbucks.kirk;

import static org.junit.Assert.*;

import org.junit.Test;

public class mbCalculatorTest {
	@Test
	public void testAdditionOfTwoNumbers1(){
		mbCalculator mbCalc = new mbCalculator();
		assertEquals(9,mbCalc.add(4,5));
	}
	@Test
	public void testAdditionOfTwoNumbers2(){
		mbCalculator mbCalc = new mbCalculator();
		assertEquals(5,mbCalc.add(0,5));
	}
	@Test
	public void testAdditionOfTwoNumbers3(){
		mbCalculator mbCalc = new mbCalculator();
		assertEquals(0,mbCalc.add(0,0));
	}
	@Test
	public void testAdditionOfTwoNumbers4(){
		mbCalculator mbCalc = new mbCalculator();
		assertEquals(-1,mbCalc.add(-1,0));
	}
	@Test
	public void testAdditionOfTwoNumbers5(){
		mbCalculator mbCalc = new mbCalculator();
		assertEquals(-2,mbCalc.add(-1,-1));
	}

}
