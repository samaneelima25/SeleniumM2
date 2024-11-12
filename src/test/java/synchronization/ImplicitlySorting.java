package synchronization;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ImplicitlySorting {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/city/hyderabad");
		 List<WebElement> topRestaurants = driver.findElements(By.xpath("//h2[text()='Top restaurant chains in Hyderabad']//ancestor::div[@class='sc-jPQLIr iAeVkw']//descendant::div[@class='sc-beySbM iKLEMo']"));

	  for ( WebElement restaurant : topRestaurants) {
		  
		  
    List<String> Originallist=   restaurant.getText().collect(Collectors.toList());
		
		
		
	
	
	
	driver.quit();
	}

	
	}
            

	

