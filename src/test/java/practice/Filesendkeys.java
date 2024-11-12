package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filesendkeys {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/file-upload-test.html");
		driver.findElement(By.id("fileinput")).sendKeys("C:\\Users\\saman\\OneDrive\\Pictures\\Screenshots\\Screenshot (10).png");
	
	}

}
