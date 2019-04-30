package com.kavinschool.advanced;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedParameterExample {
	
	private String strUserID;
	private String strPassword;

	@Parameters
	public static Collection<Object[]> UserInfo() {
		return Arrays.asList(new Object[][] { 
				{ "Student1", "Student1@Kavin~School" },
				{ "Student2", "Student2@Kavin~School" }, 
				{ "Student3", "Student3@Kavin~School" } });
	}

	public ParameterizedParameterExample(String strUserID, String strPassword) {
		super();
		this.strUserID = strUserID;
		this.strPassword = strPassword;
	}
	
	@Test
	public void testZenPhotoLogin() throws Exception {
		System.out.println(this.strUserID);
		System.out.println(this.strPassword);
	}

}
