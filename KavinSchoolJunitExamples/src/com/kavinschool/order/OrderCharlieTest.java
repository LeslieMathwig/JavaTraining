package com.kavinschool.order;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrderCharlieTest {
	
	@AfterClass
	public static void closeFile() throws Exception {
		System.out.println("OrderCharlieTest @AfterClass closeFile");
	}

	@BeforeClass
	public static void openFile() throws Exception {
		System.out.println("OrderCharlieTest @BeforeClass openFile");
	}

	@After
	public void closeBrowser() throws Exception {
		System.out.println("OrderCharlieTest @After closeBrowser");
	}

	@Before
	public void openBrowser() throws Exception {
		System.out.println("OrderCharlieTest @Before openBrowser");
	}

	@Test
	public void testApple() {
		System.out.println("OrderCharlieTest @Test testApple");
	}

	@Test
	public void testBanana() {
		System.out.println("OrderCharlieTest @Test testBanana");
	}

	@Test
	public void testCherry() {
		System.out.println("OrderCharlieTest @Test testCherry");
	}

}
