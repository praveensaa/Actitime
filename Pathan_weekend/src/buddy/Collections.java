package buddy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Collections {
	public static void main(String[] args) throws MalformedURLException, Throwable {
		
		
		WebDriver driver =new EdgeDriver();
		
	     driver.get("https://www.flipkart.com/");
	     
	     driver.manage().window().maximize();
	     
	     URL MainURL =new URL("https://seller.flipkart.com/");
	     
	    
	     
	     URL SellOnline = new URL(MainURL,"sell-online/pricing");
	     
	    
	    URL Services = new URL(MainURL,"sell-online/services-0");
	    
	    URL Resoures = new URL(MainURL,"sell-online/resources");
	    
	    URL Faq= new URL(MainURL,"sell-online/faq");
	    
	
	    driver.navigate().to(SellOnline);
	    
	    Thread.sleep(3000);
	 
	    driver.navigate().to(Services);
	    Thread.sleep(3000);
	    
	    driver.navigate().to(Faq);
	    Thread.sleep(3000);
	    
	    driver.navigate().to(Resoures);
	    Thread.sleep(3000);
	    
	  
	    
	    driver.quit();
	}

}
