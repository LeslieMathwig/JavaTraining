package com.kavinschool.order;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrderDeltaTest {

	@AfterClass
	public static void closeEmployeeFile() throws Exception {
		System.out.println("OrderDeltaTest @AfterClass closeEmployeeFile");
	}

	@AfterClass
	public static void closeManagerFile() throws Exception {
		System.out.println("OrderDeltaTest @AfterClass closeManagerFile");
	}

	@BeforeClass
	public static void openEmployeeFile() throws Exception {
		System.out.println("OrderDeltaTest @BeforeClass openEmployeeFile");
	}

	@BeforeClass
	public static void openManagerFile() throws Exception {
		System.out.println("OrderDeltaTest @BeforeClass openManagerFile");
	}

	@After
	public void closeBrowser() throws Exception {
		System.out.println("OrderDeltaTest @After closeBrowser");
	}

	@After
	public void disconnectHrDatabase() throws Exception {
		System.out.println("OrderDeltaTest @After connectHrDatabase");
	}

	@Before
	public void connectHrDatabase() throws Exception {
		System.out.println("OrderDeltaTest @Before disconnectHrDatabase");
	}

	@Before
	public void openBrowser() throws Exception {
		System.out.println("OrderDeltaTest @Before openBrowser");
	}

	@Test
	public void testApple() {
		System.out.println("OrderDeltaTest @Test testApple");
	}

	@Test
	public void testBanana() {
		System.out.println("OrderDeltaTest @Test testBanana");
	}

	@Test
	public void testCherry() {
		System.out.println("OrderDeltaTest @Test testCherry");
	}

}
