package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLoactorPractice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("forgotten password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("samaneelima25@gmail.com");
		driver.findElement(By.name("did_submit")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
