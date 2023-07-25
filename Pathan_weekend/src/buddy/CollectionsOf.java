package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsOf {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		WebElement heart = driver.findElement(By.className("eX72wL"));
		heart.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		

		Thread.sleep(2000);

	}
}
