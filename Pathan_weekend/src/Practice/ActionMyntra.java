package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMyntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[.='Men']"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(men).perform();
		Thread.sleep(2000);
		WebElement Sweatshirts = driver.findElement(By.xpath("//a[text()='Sweatshirts']"));
		Thread.sleep(2000);
		actions.moveToElement(Sweatshirts).perform();
		Thread.sleep(2000);
		driver.quit();
	}

	
	
}
