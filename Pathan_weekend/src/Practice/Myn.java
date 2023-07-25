package Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myn {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Thread.sleep(10000);
	 WebDriver as = driver.switchTo().newWindow(WindowType.TAB);

	driver.get("https://www.myntra.com/jeans/levis/levis-men-blue-511-slim-fit-heavy-fade-stretchable-jeans/18074928/buy");
	 Set<String> all = driver.getWindowHandles();
	 for( String a:all)
	 {
		 driver.switchTo().window(a).getTitle();
		 System.out.println(a);
	 }
	 
}



}
