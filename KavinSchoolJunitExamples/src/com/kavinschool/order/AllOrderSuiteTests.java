package com.kavinschool.order;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OrderAlphaTest.class, OrderBetaTest.class, OrderCharlieTest.class, OrderDeltaTest.class })
public class AllOrderSuiteTests {
	private static String testClassName = new AllOrderSuiteTests().getClass().getName();

	@BeforeClass
	public static void loginOneDrive() throws Exception {
		System.out.println(testClassName + " @BeforeClass loginOneDrive");
	}

	@BeforeClass
	public static void loginDropBox() throws Exception {
		System.out.println(testClassName + " @BeforeClass loginDropBox");
	}

	@AfterClass
	public static void logoutOneDrive() throws Exception {
		System.out.println(testClassName + " @AfterClass logoutOneDrive");
	}

	@AfterClass
	public static void logoutDropBox() throws Exception {
		System.out.println(testClassName + " @AfterClass logoutDropBox");
	}
	
	/* @After and @Before not usable in Suite */
	
	/*@After
	public void checkOutFileOneDrive() throws Exception {
		System.out.println(testClassName + " @After checkOutFileOneDrive");
	}

	@Before
	public void checkInFileOneDrive() throws Exception {
		System.out.println(testClassName + " @After checkInFileOneDrive");
	}*/
}
