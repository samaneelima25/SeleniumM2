package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
		if(loginBtn.isEnabled())
		{
		  loginBtn.click();
		}else
		{
			System.out.println("Disabled");
		}
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("samaneelima@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sbabli2014");
		if(loginBtn.isEnabled())
			loginBtn.click();
		else
			System.out.println("Disabled");
		driver.quit();
	}
	
}
