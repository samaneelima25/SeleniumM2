package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomuseing {
	@FindBy(xpath="//span[text()='Phone number, username, or email']")
	private WebElement usernameTf;
	@FindBy(xpath="//span[text()='Password']")
	private WebElement passwordTf;
	@FindBy(xpath="//button[contains(@class, '_acap')] ")
	private WebElement LoginBTN;
	@FindBy(css="_ab37")
	private WebElement loginlink;

	
	public pomuseing(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Setusername(String username)
	{
		usernameTf.sendKeys(username);
	}
	public void setpassword(String password)
	{
		passwordTf.sendKeys(password);
	}
	public void clicklogin()
	{
		LoginBTN.click();
	}
	
	
	

}
