package listenerPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	@BeforeSuite
	public void suiteconfig()
	{
	 Reporter.log("@BeforeSuite",true);
	}
	@BeforeTest
	public void Testconfig()
	{
	 Reporter.log("@BeforeTest",true);
	}
	@BeforeClass
	public void Classconfig()
	{
	 Reporter.log("@BeforeClass",true);
	}
	@BeforeMethod
	public void Methodconfig()
	{
	 Reporter.log("@BeforeMethod",true);
	}
	
	@AfterMethod
	public void MethodTearDown()
	{
		Reporter.log("@AfterMethod",true);
	}
	@AfterClass
	public void ClassTearDown()
	{
		Reporter.log("@AfterClass",true);
	}
	@AfterTest
	public void TestTearDown()
	{
		Reporter.log("@AfterTest",true);
	}
	@AfterSuite
	public void SuiteTearDown()
	{
		Reporter.log("@AfterSuite",true);
	}

}
