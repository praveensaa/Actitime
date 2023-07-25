package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitles {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.actitime.com/");
		
		driver.findElement(By.linkText("//a[text()='Log in']")).click();
		
		driver.quit();
	}

}
