package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefreshFetchTitleUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//type casting
		js.executeScript("window.location=arguments[0]", "https://www.nykaa.com/");
		//to fetch title and url of the webpage
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
        driver.quit();
		

		
		
	}

}
