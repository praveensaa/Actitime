package buddy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrl {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
//		WebElement username=driver.findElement(By.id("email"));
//		username.sendKeys("praveeennnnnnn");
		 driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	WebElement emailid= driver.findElement(By.id("identify_email"));
	Thread.sleep(3000);
	emailid.sendKeys("7010964901");	
	driver.findElement(By.name("did_submit")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(4000);
	WebElement name =driver.findElement(By.name("recovery_code_entry"));
	name.sendKeys("5780");
	Thread.sleep(4000);
	

		driver.quit();

	}

}
