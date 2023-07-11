package com.indus.traning.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.traning.domain.CalciInput;
import com.indus.traning.domain.CalciOutput;
import com.indus.traning.exception.CalciException;
import com.indus.traning.service.ICalci;
import com.indus.traning.serviceimpl.Calci;

public class TestCalciSingleton {
	private static ICalci calObj = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calObj = Calci.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		calObj = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdditionSer() {
		// 1. input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(10.0);
		calInput.setPar2(20.0);
		// 2.Expected Output
		CalciOutput expOutput = new CalciOutput();
		expOutput.setOperations("addition");
		expOutput.setPar1(10.0);
		expOutput.setPar2(20.0);
		expOutput.setResult(30.0);
		// 3. Actual output
		CalciOutput actOutput = null;
		try {
			actOutput = calObj.addition(calInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. asserts
		assertEquals(expOutput, actOutput);
	}

	@Test
	public void testSubtractionSer() {
		// 1. input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(30.0);
		calInput.setPar2(20.0);
		// 2.Expected Output
		CalciOutput expOutput = new CalciOutput();
		expOutput.setOperations("subtraction");
		expOutput.setPar1(30.0);
		expOutput.setPar2(20.0);
		expOutput.setResult(10.0);
		// 3. Actual output
		CalciOutput actOutput = null;
		try {
			actOutput = calObj.subtraction(calInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. asserts
		assertEquals(expOutput, actOutput);
	}

	@Test
	public void testMultiplicationSer() {
		// 1. input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(5.0);
		calInput.setPar2(6.0);
		// 2.Expected Output
		CalciOutput expOutput = new CalciOutput();
		expOutput.setOperations("multiplication");
		expOutput.setPar1(5.0);
		expOutput.setPar2(6.0);
		expOutput.setResult(30.0);
		// 3. Actual output
		CalciOutput actOutput = null;
		try {
			actOutput = calObj.multiplication(calInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. asserts
		assertEquals(expOutput, actOutput);
	}

	@Test
	public void testDivisionSer() {
		// 1. input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(30.0);
		calInput.setPar2(6.0);
		// 2.Expected Output
		CalciOutput expOutput = new CalciOutput();
		expOutput.setOperations("division");
		expOutput.setPar1(30.0);
		expOutput.setPar2(6.0);
		expOutput.setResult(5.0);
		// 3. Actual output
		CalciOutput actOutput = null;
		try {
			actOutput = calObj.division(calInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. asserts
		assertEquals(expOutput, actOutput);
	}
}
