package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[] args) throws Throwable {
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();;
		
		driver.get("https://demo.actitime.com/");
		
		WebElement check = driver.findElement(By.id("keepLoggedInCheckBox"));
		check.click();
		
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("trainee");
	
		 WebElement pass = driver.findElement(By.name("pwd"));
		 pass.sendKeys("trainee");
	
		check.click();
	
		
		WebElement button = driver.findElement(By.className("initial"));
		
		button.click();

		
		WebElement Switchtime = driver.findElement(By.className("productSwitcher"));
		Switchtime.click();
	
		
	WebElement Sechudle = driver.findElement(By.id("container_my_schedule"));
	Thread.sleep(1000);
	Sechudle.click();
	
	WebElement container = driver.findElement(By.id("container_tasks"));
	container.click();
	Thread.sleep(1000);
	
WebElement reports = driver.findElement(By.id("content reports"));
 reports.click();
	
	driver.quit();
	
	

		

	}

}
