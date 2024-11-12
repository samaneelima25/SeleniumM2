package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandSetwindowposition {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		    Point actpoint =driver.manage().window().getPosition();
		    System.out.println(actpoint);
		Thread.sleep(2000);
		Point reqpoint=new Point(500,500);
		driver.manage().window().setPosition(reqpoint);
		Thread.sleep(2000);
		driver.close();
		
	}

}
