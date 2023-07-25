package buddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws Throwable {
		 WebDriver  driver=new  ChromeDriver();
		 
		 driver.get("https://www.tnstc.in/");
		 driver.manage().window().fullscreen();

		 Thread.sleep(1000);
	}

}
