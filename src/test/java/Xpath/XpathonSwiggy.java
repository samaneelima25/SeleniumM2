package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathonSwiggy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		driver.findElement(By.xpath("//img[@alt='restaurants curated for biryani']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Pure veg']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Less than 30 mins']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Hotel Murari']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\'sc-eCzpMH omRnt\']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
