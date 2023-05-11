package com.bikkadit.firstjunit.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorsTest {

	@Test
	public void testAddition() {

		Calculators calculators = new Calculators();

		int actualResult = calculators.addition(10, 10);

		int expextedResult = 20;

		assertEquals(expextedResult, actualResult);
	}

	@Test
	public void testSubtraction() {

		Calculators calculators = new Calculators();

		int actualResult = calculators.subtraction(100, 50);

		int expectedResult = 50;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testMultiplication() {

		Calculators calculators = new Calculators();

		int actualResult = calculators.multiplication(10, 10);

		int expectedResult = 100;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testDivistion() {

		Calculators calculators = new Calculators();

		int actualResult = calculators.divistion(12, 2);

		int expectedResult = 6;

		assertEquals(expectedResult, actualResult);

	}
}
