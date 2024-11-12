package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadrobotclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=11496&wExp=N&msg=0&URL=https%3A%2F%2Fmy.naukri.com%3A80");
	    driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		driver.findElement(By.className("uploadResume")).click();

	    Thread.sleep(2000);
	    StringSelection str=new StringSelection("C:\\Users\\saman\\Downloads\\skand oci.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
	Robot r=new Robot();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	driver.quit();

	


	
	}
	

}
