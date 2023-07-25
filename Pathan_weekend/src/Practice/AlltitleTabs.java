package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlltitleTabs {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://demo.actitime.com/login.do");
	WebElement activeTime =driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
	activeTime.click();
	String activeLogin=driver.getTitle();
	System.out.println("activeLogin"+activeLogin);
	 Set<String> allWindowid = driver.getWindowHandles();
	 for(String s:allWindowid)
	 {
		 driver.switchTo().window(s);
		 String secondId = driver.getTitle();
		 System.out.println("secondId"+secondId);
	 }
	driver.quit();
	}
}
