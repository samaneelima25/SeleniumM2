package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptjspromptpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
	    Alert a = driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.sendKeys("selenium");
	    a.accept();
	    Thread.sleep(3000);
	    System.out.println(driver.findElement(By.id("result")).getText());
	    driver.quit();
		
}
}
