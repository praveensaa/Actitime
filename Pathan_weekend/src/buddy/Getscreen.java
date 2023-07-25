package buddy;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getscreen {
	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.tcs.com/");
		driver.manage().window().fullscreen();
		
		 URL MainURL=new URL("https://www.tcs.com/");
		 
		URL What_WE_Do= new URL(MainURL ,"what-we-do");
		
		URL Who_We_Are=new URL(MainURL,"who-we-are");
		
		URL Insigthts =new URL(MainURL,"insights");
		
		  URL Careres=new URL(MainURL,"careers");
		  
		  URL Investorrelations=new URL (MainURL,"investor-relations");
		  
		  
		  
		  
		  driver.navigate().to(What_WE_Do);
		  
		  driver.navigate().to(Who_We_Are);
		  
		  driver.navigate().to(Insigthts);
		  
		  driver.navigate().to(Careres);
		  
		  driver.navigate().to(Investorrelations);
		  
		  

		driver.quit();
		
	
		
	}

}
