package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicelogin {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./src/test/resources/practice.properties");
		Properties property=new Properties();
		property.load(fis);
		WebDriver driver=new ChromeDriver();
		
		driver.get(property.getProperty("url"));
		         long time = Long.parseLong(property.getProperty("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.findElement(By.id("Email")).sendKeys(property.getProperty("email")+Keys.TAB+property.getProperty("password")
		                                        +Keys.ENTER);
		
		 long sleep = Long.parseLong(property.getProperty("sleep"));
		Thread.sleep(sleep);
		driver.quit();
		
		
	}


	}


