package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributesTextPractice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//input[@aria-label=\'Search Amazon\']")).sendKeys("handbags");
		driver.findElement(By.xpath("//input[@value=\'Go\']")).click();
		
		driver.findElement(By.xpath("//span[text()='Michael Kors']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Michael Kors Shoulder Bag, Electric Pink Multi']")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
