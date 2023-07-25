package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dosa {
	public static void main(String[] args) throws Throwable {
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 
		 WebElement loginbutton=driver.findElement(By.id("loginbutton"));
		 
		 loginbutton.click();
		 Thread.sleep(5000);
		 
		 
		 driver.quit();
		 
	}

}

