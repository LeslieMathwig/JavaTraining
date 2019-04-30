package com.kavinschool.order;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

public class CalculatorTest {
	
	Calculator myCalc = new Calculator ();
		int a = 3;
		int b = 5;
		int c = 30;
		String s1 = "Leslie ";
		String s2 = " ";
		String s3 = "Mathwig";
	

	@Test
	public void additionTest() {
		Assert.assertEquals(8, myCalc.addition(a, b));
	}
	
	@Test
	public void firstLast() {
		Assert.assertNotSame("Leslie Mathwig", myCalc.firstLast(s1, s2));			
	}

	@Test
	public void sameValue() {
		Assert.assertSame(17, myCalc.addition(5, 12));
	}

	@Test
	public void trueTest() {
		Assert.assertTrue(22 < myCalc.trueTest(c));
	}
	
	@Test
	public void falseTest() {
		int result = myCalc.falseTest(c);
		Assert.assertFalse(45 < result);
	}
	
	@Test
	public void testSsnRemoval() {
		int [] arr = {1, 2, 3};
		Assert.assertArrayEquals(arr, myCalc.ssnRemoval());
		
	}
	
	@Test
	public void testBlankMI() {
		String result =  myCalc.firstLast(s1, s2);
		Assert.assertNotNull(s2, myCalc.firstLast(s1, s2));
	}
	
	
}
