package com.kavinschool.advanced;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class DataPointsAndTheoriesExample {

	@DataPoint
	public static User user1 = new User("Student1", "Student1@Kavin~School");
	@DataPoint
	public static User user2 = new User("Student2", "Student2@Kavin~School");
	@DataPoint
	public static User user3 = new User("Student3", "Student3@Kavin~School");
	

	@Theory
	public void testUserInfo(User curUser) throws Exception {
		System.out.println(curUser.getUserId());
		System.out.println(curUser.getPassword());
	}
	
}
