package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassnameLocatorPractice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		// driver.findElement(By.className("Pke_EE")).sendKeys("Dyson airwrap");
		// driver.findElement(By.className("_2iLD__")).click();
		 
		// Thread.sleep(2000);
		 //driver.quit();
		 		
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.findElement(By.className("hbuyht")).click();
		driver.findElement(By.className("ilhhay")).sendKeys("maharshi");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
