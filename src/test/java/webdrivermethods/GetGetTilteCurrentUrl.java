package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGetTilteCurrentUrl 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(title+ " \n"+url);
		
		
	}

}
