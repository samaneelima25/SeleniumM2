package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorpractice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("samaneelima25@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("absvhdjdj");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("button.selected")).click();
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
