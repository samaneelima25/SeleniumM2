package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSubmitPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		  WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		  text.sendKeys("toys");
		  Thread.sleep(2000);
		  text.clear();
		  Thread.sleep(2000);
		  text.sendKeys("redmi tv");
		  Thread.sleep(2000);
		  driver.findElement(By.id("nav-search-submit-button")).submit();
		  Thread.sleep(2000);
	}
     
}

