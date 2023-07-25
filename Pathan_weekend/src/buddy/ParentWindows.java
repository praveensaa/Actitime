// write the script for close the parent windows Only

package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ParentWindows {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://secure.indeed.com/auth");
	
	driver.manage().window().maximize();
	
	Thread.sleep(10000);
	
	driver.get("https://secure.indeed.com/auth");
	Thread.sleep(1000);
	
	driver.findElement(By.id("login-google-button")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("apple-signin-button")).click();
	Thread.sleep(1000);
	
	String parent = driver.getWindowHandle();
	System.out.println("Parent id"+parent);
	driver.close();
 }
}
