package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//a[@class='hmenu-item' and .='Audible Audiobooks'])")).click();
		Thread.sleep(2000);
	   List<WebElement> alldisplay = driver.findElements(By.xpath("//ul[@class=\"hmenu hmenu-visible hmenu-translateX\"]/li/a"));
		Thread.sleep(3000);

	    for (WebElement total : alldisplay) {
	    	
			System.out.println(total.getText());
		}
	}

}
