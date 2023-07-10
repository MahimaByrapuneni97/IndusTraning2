package com.indus.traning.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.traning.domain.CalciInput;
import com.indus.traning.domain.CalciOutput;
import com.indus.traning.service.ICalci;
import com.indus.traning.serviceimpl.Calci;

public class TestCalci {
	private static  ICalci calObj = null;

	@BeforeClass
	public static void setUpForAllMethods() throws Exception {
		calObj = new Calci();
	}

	@AfterClass
	public static void cleanUpAfterAllMethodsExecuted() throws Exception {
		calObj = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void cleanUp() throws Exception {
	}

	@Test
	public void testAdditionSer() {
		// 1. Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(10.0);
		calInput.setPar2(20.0);
		// 2. Expected Output
		CalciOutput expCalOut = new CalciOutput();
		expCalOut.setOperations("addition");
		expCalOut.setPar1(10.0);
		expCalOut.setPar2(20.0);
		expCalOut.setResult(30.0);
		// 3. Actual Output
		CalciOutput actCalOut = null;
		try {
			actCalOut = calObj.addition(calInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Asserts
		assertEquals(expCalOut, actCalOut);
	}

	@Test
	public void testSubtractionSer() {
		// 1. Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(30.0);
		calInput.setPar2(20.0);
		// 2. Expected Output
		CalciOutput expCalOut = new CalciOutput();
		expCalOut.setOperations("subtraction");
		expCalOut.setPar1(30.0);
		expCalOut.setPar2(20.0);
		expCalOut.setResult(10.0);
		// 3. Actual Output
		CalciOutput actCalOut = null;
		try {
			actCalOut = calObj.subtraction(calInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Asserts
		assertEquals(expCalOut, actCalOut);
	}

	@Test
	public void testMultiplicationSer() {
		// 1. Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(10.0);
		calInput.setPar2(20.0);
		// 2. Expected Output
		CalciOutput expCalOut = new CalciOutput();
		expCalOut.setOperations("multiplication");
		expCalOut.setPar1(10.0);
		expCalOut.setPar2(20.0);
		expCalOut.setResult(200.0);
		// 3. Actual Output
		CalciOutput actCalOut = null;
		try {
			actCalOut = calObj.multiplication(calInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Asserts
		assertEquals(expCalOut, actCalOut);
	}

	@Test
	public void testDivisionSer() {
		// 1. Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(100.0);
		calInput.setPar2(50.0);
		// 2. Expected Output
		CalciOutput expCalOut = new CalciOutput();
		expCalOut.setOperations("division");
		expCalOut.setPar1(100.0);
		expCalOut.setPar2(50.0);
		expCalOut.setResult(2.0);
		// 3. Actual Output
		CalciOutput actCalOut = null;
		try {
			actCalOut = calObj.division(calInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Asserts
		assertEquals(expCalOut, actCalOut);
	}
}
