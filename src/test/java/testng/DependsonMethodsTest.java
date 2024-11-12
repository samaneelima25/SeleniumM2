package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethodsTest {
	@Test
	public void registrationTest()
	{
		Reporter.log("register to App", true);
		//Assert.fail(); if we want to fail the test case we have to use this
	}
	@Test(dependsOnMethods ="registrationTest")
	public void loginTest()
	{
		Reporter.log("login to App" , true);
	}
	@Test(dependsOnMethods ="loginTest")
	public void updateProfileTest()
	{
		Reporter.log("updateProfileTest");
	}
	
	

}
