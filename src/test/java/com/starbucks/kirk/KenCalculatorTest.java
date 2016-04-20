package com.starbucks.kirk;

import static org.junit.Assert.*;

import org.junit.Test;

public class KenCalculatorTest {
	
	@Test
	public void testAdditionOfTwoNubmers(){
	KenCalculator kencalc = new KenCalculator();
		assertEquals(9, kencalc.add(4,5));

	}

	@Test
	public void testAdditionOfTwoOtherNubmers(){
	KenCalculator kencalc = new KenCalculator();
		assertEquals(2, kencalc.add(2,0));
	}

}