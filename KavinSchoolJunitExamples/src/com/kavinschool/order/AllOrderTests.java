package com.kavinschool.order;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OrderAlphaTest.class, OrderBetaTest.class, OrderCharlieTest.class, OrderDeltaTest.class })
public class AllOrderTests {

}
