package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocatorPractice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	WebElement usernameTf=driver.findElement(By.id("email"));
	usernameTf.sendKeys("skandsama@gmail.com");
	
	WebElement passwordTf=driver.findElement(By.id("pass"));
	passwordTf.sendKeys("Sbittu080910");
	WebElement loginTf=driver.findElement(By.name("login"));
	loginTf.click();
	


	
	Thread.sleep(4000);
	driver.quit();
	
	
	}

}
