package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass extends Baseclass{
	@Test
	public void testMethod()
	{
		Reporter.log("@test",true);
	}

}
