package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpkart {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("span[class='B_NuCI']"));
		Thread.sleep(10000);
		
		driver.quit();
	}

}
