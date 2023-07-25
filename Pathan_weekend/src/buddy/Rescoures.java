//was to go to vitiger.com
//using mouse over to Resoures in customer to click to drop down menu 
//double click on login button
//and verify the homepage should be display are not

package buddy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rescoures {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.vtiger.com/");

		Actions a=new Actions(driver);

		WebElement Res = driver.findElement(By.linkText("Resources"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		a.moveToElement(Res).perform();

		driver.findElement(By.xpath("//span[text()='Login']")).click();

		driver.quit();




	}

}
