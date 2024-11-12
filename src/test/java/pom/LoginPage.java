package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	
	@FindBy(name="email")
	private WebElement emailTF;
	@FindBy(id="password")
	private WebElement passwordTF;
	@FindBy(css="[type='checkbox']")
	private WebElement KeepMeLoggedIncheckbox;
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement forgotPWDlink;
	@FindBy(className="login_Btn")
	private WebElement lognBTN;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setEmail(String email)
	{
		emailTF.sendKeys(email);
		
	}
	public void setPassword(String password)
	{
		passwordTF.sendKeys(password);
	}
	public void clickcheckbox()
	{
		KeepMeLoggedIncheckbox.click();
	}
	public void clickforgotpwdlink()
	{
		forgotPWDlink.click();
	}
	public void clickloginBTn()
	{
		lognBTN.click();
	}
	
	
	
	

}
