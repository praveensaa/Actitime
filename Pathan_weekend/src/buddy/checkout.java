package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkout {
	
	public static void main(String[] args) throws Throwable {
		
		
		ChromeDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("	https://www.indianbank.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.className("spEffBlink")).click();
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
