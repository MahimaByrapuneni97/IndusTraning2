package com.indus.traning.service;

import junit.framework.TestCase;

public class TestCalci extends TestCase {

	CalciInhertiance calObj = null;

	protected void setUp() throws Exception {
		calObj = new CalciInhertiance();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}
	public void testadditionSer1() {
		// 1.input
		double par1 = 20.0;
		double par2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 30.0;
		// 3.Actual Output
		double actualOutput = calObj.addition(par1, par2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}

	public void testSubtractionSer1() {
		// 1.input
		double par1 = 20.0;
		double par2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 10.0;
		// 3.Actual Output
		double actualOutput = calObj.subtraction(par1, par2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}
	public void testMultiplicationSer1() {
		// 1.input
		double par1 = 2.0;
		double par2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 20.0;
		// 3.Actual Output
		double actualOutput = calObj.multiplication(par1, par2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}
	public void testDivisionSer1() {
		// 1.input
		double par1 = 20.0;
		double par2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 2.0;
		// 3.Actual Output
		double actualOutput = calObj.division(par1, par2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}
	public void testSquareroot() {
		//1.input
		double par1 = 25.0;
		//2.expected Output
		double expectedOutput = 5.0;
		//3.Actual Output
		double actualOutput = calObj.square(par1);
		//asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}
}
