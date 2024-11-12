package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pomuseingtest

{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pomuseing p1=new pomuseing(driver);
		p1.Setusername("samaneelima");
		p1.setpassword("Sbittu8910");
		p1.clicklogin();
		
				
	}

}
