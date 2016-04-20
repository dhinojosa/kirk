package com.starbucks.kirk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class jjouCalculatorTest {
	
	@Test
	public void testAdditionOfTwoNumbers(){
	JJOUCalculator cal = new JJOUCalculator();
	assertEquals(9, cal.add(4,5));
	
	}

	@Test
	public void testAnotherAdditionOfTwoNumbers(){
	JJOUCalculator cal = new JJOUCalculator();
	assertEquals(5, cal.add(0,5));
	
	}


	@Test
	public void test3rdAdditionOfTwoNumbers(){
	JJOUCalculator cal = new JJOUCalculator();
	assertEquals(1999999998, cal.add(999999999,999999999));
	
	}
}
