package com.indus.pratice.basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestLockKey {
	private static Lock lockObj = null;
	private static Lock.Key keyObj = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		lockObj = new Lock();
		keyObj = new Lock.Key();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		lockObj = null;
		keyObj = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testLockKeySer() {
        // 1. Input
        String fullname = "MahimaByrapuneni";
        String password = "Mahi@123";

        // 2. Expected Output
        lockObj.setFullName(fullname);
        keyObj.setPassword(password);

        // 3. Actual Output
        String actualFullname = lockObj.getFullName();
        String actualPassword = keyObj.getPassword();

        // 4. Asserts
        assertEquals("Full Name should match", fullname, actualFullname);
        assertEquals("Password should match", password, actualPassword);
    }
		
	}


