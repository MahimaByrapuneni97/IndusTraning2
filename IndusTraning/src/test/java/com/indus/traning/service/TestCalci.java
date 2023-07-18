package com.indus.traning.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.pratice.basics.Calci;
import com.indus.traning.domain.CalciInput;
import com.indus.traning.domain.CalciOutput;

public class TestCalci {
	private static Calci calObj = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calObj = new Calci();
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
	public void testaddition() {
		// 1. input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(10.0);
		calInput.setPar2(20.0);
		// 2.Expected Output
		CalciOutput expOutput = new CalciOutput();
		expOutput.setOperation("addition");
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
// null 
		calInput.setPar1(null);
		calInput.setPar2(null);

	}

}
