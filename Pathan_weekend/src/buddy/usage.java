package buddy;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class usage {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en");
		
		
		
		URL mainUrl=new URL("https://www.dassault-aviation.com/en");
		
		
		URL grouppage=new URL(mainUrl,"group/");
	
		
	
		driver.navigate().to(grouppage);
		Thread.sleep(2000);
		

	
		
		
	
		
		
		
		
		
		
	
		driver.quit();
		
		
	}

}
