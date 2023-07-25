package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class incomplte {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		
		WebElement Forgottenpassword = driver.findElement(By.partialLinkText("Forgotten "));
		Forgottenpassword.click();
		Thread.sleep(10000);
		
		
		
		
		driver.quit();
	}

}
