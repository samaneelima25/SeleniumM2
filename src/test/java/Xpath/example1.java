package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("dyson airwrap");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		int sum=0;
		for(;;)
		{
			Thread.sleep(5000);
			List<WebElement> list = driver.findElements(By.className("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
			
			sum=sum+list.size();
			try
			{
				driver.findElement(By.xpath("//a[text()='Next']")).click();
				
			}catch(Exception e)
			{
				break;
			}
			
		}
		String header=driver.findElement(By.xpath("//span[text()='1-48 of 659 results for']")).getText();
	    String[] str=header.split(" ");
	    int actualNumber=Integer.parseInt(str[5]);
		if(sum==actualNumber)
		{
			System.out.println("given number is matched");}
			else
			{
				System.out.println("not matched");
			}
				
			driver.quit();
		}
		
	



	
	}
	


