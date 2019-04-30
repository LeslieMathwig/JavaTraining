package TestMe;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.kavinschool.order.AllOrderSuiteTests;
import com.kavinschool.order.AllOrderTests;
import com.kavinschool.order.OrderAlphaTest;
import com.kavinschool.order.OrderBetaTest;
import com.kavinschool.order.OrderCharlieTest;
import com.kavinschool.order.OrderDeltaTest;

@RunWith(Suite.class)
@SuiteClasses({ AllOrderSuiteTests.class, AllOrderTests.class, OrderAlphaTest.class, OrderBetaTest.class,
		OrderCharlieTest.class, OrderDeltaTest.class })
public class AllOfTheTests {

}
