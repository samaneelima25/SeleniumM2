package annotations;

import org.testng.annotations.Test;

public class Testclassforlogin extends BaseclassforLogin{
	@Test
	public void loginTest()
	{
		login.setPassword("admin");
		login.setPassword("admin");
		login.clickcheckbox();
		login.clickloginBTn();
		
	}

}
