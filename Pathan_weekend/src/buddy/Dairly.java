package buddy;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dairly {  
	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jio.com/");
		
		driver.manage().window().maximize();
		
	
		
		driver.navigate().refresh();
		URL mainurl = new URL("https://www.jio.com/");
		Thread.sleep(1000);

		URL  mobilefu =new URL(mainurl,"/mobile");
		Thread.sleep(1000);

	
		URL true5G =new URL(mainurl,"/5g");
		Thread.sleep(1000);
		
		URL jiofiber = new URL(mainurl,"/fiber");
		Thread.sleep(1000);
	
		
		URL business= new URL(mainurl,"business/");
		Thread.sleep(1000);
		
		
		URL shophomepage =new URL(mainurl,"shop/homepage");
		Thread.sleep(1000);
		
		
		URL jcmsapps =new URL(mainurl,"jcms/apps/");
	
		
		URL helphome =new URL(mainurl,"help/home#/");
		
		
		driver.navigate().to(mobilefu);
		
		
		
		
		driver.navigate().to(true5G);
		
		
		driver.navigate().to(jiofiber);
		
		driver.navigate().to(business);
	
		driver.navigate().to(shophomepage);
	
		driver.navigate().to(jcmsapps);
		
		driver.navigate().to(helphome);
		
		driver.quit();
	}
	
	
	
	
	
	

}
