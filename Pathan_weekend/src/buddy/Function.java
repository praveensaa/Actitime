package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Function {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("email");
		email.clear();
		
		email.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(10000
				
				);
		
		email.sendKeys(Keys.CONTROL+"X");
		
		
	WebElement password	= driver.findElement(By.id("pass"));
	
	password.sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
		Thread.sleep(1000);
		
		
		driver.quit();
		
		
		
	}

}
