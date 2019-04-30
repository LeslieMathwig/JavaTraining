package com.kavinschool.order;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderBetaTest {
	
	@Before
	public void setUp() throws Exception {
		System.out.println("OrderBetaTest @Before setUp");
	}
	
	
	@Test
	public void testApple() {
		System.out.println("OrderBetaTest @Test testApple");
	}
	
	@Test
	public void testBanana() {
		System.out.println("OrderBetaTest @Test testBanana");
	}

	@Test
	public void testCherry() {
		System.out.println("OrderBetaTest @Test testCherry");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("OrderBetaTest @After tearDown");
	}

}
