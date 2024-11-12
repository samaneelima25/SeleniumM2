package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverDoubleclick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cousetab = driver.findElement(By.id("course"));
		Actions action=new Actions(driver);
		action.moveToElement(cousetab).perform();
		driver.findElement(By.xpath("//span/a[text()='Selenium']")).click();
		      WebElement quantity = driver.findElement(By.id("quantity"));
		      int initialvalue=Integer.parseInt(quantity.getAttribute("value"));
		     WebElement plusBTN = driver.findElement(By.id("add"));
		// wrapper class and parseing method
		     action.doubleClick(plusBTN).perform();
		     int finalvalue=Integer.parseInt(quantity.getAttribute("value"));
		    
		     if(initialvalue+1==finalvalue)
		    	 System.out.println("pass");
		     else
		    	 System.out.println("fail");
		     driver.quit();
		     
	}

}
