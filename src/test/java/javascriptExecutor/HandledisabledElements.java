package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledisabledElements {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement loginBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].removeAttribute('disabled')", loginBtn);
		  Thread.sleep(2000);
		  loginBtn.click();
		  Thread.sleep(2000);
		  driver.quit();
		  
}
}
