package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authanticationpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://<username>:<password>@domain.com syntax we have to used
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  String loginsuccess = driver.findElement(By.xpath("//p[contains(.,'Congratulations')]")).getText();
		  System.out.println(loginsuccess);
		  driver.quit();
	}
		
}
