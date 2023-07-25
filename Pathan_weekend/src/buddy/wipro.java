package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wipro {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		WebElement send = driver.findElement(By.id("APjFqb"));
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Wipro");
		
		//send.sendKeys("Wipro");
		
		
		
		
		
		driver.quit();
		
		

	}

}
