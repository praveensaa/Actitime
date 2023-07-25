package buddy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountFile {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://timetracker.ctepl.com/actitime/login.do");
	Thread.sleep(2000);
	 //WebElement data = driver.findElement(By.linkText("//a[text()='Actimind Inc.']"));
	WebElement data =driver.findElement(By.id("licenseLink"));
	 data.click();
	Thread.sleep(2000);
	
	

	String parentid = driver.getWindowHandle();
	System.out.println("parent id=="+parentid);
	
	 Set<String> totalid = driver.getWindowHandles();
	 System.out.println("totaliid=="+totalid);
	 
	 int count = totalid.size();
	 System.out.println("total count id "+ count);
	 
	 driver.quit();
	

	
}
}
