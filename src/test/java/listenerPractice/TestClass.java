package listenerPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerPractice.listenersimplementation.class)
public class TestClass extends Baseclass{
	@Test
	public void testMethod1()
	{
		Reporter.log("@test1",true);
		Assert.fail();
	}
		@Test(dependsOnMethods="testMethod1")
		public void testMethod2() {
		Reporter.log("@test2",true);
			
		}
	}


