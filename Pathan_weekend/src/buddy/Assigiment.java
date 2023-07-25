//write a script close all the browser without using quit methods
package buddy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigiment {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.indeed.com/auth");
		Thread.sleep(1000);
		
		driver.findElement(By.id("login-google-button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(1000);
		
		Set<String> multiple = driver.getWindowHandles();
		System.out.println("The mutiple windows id"+ multiple);
		
		for(String s: multiple)
		{
			driver.switchTo().window(s);
			Thread.sleep(1000);
			driver.close();
		}						
	}

}
