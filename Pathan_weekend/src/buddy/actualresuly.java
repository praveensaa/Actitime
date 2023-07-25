package buddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actualresuly {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	String 	getitle = driver.getTitle();
	System.out.println("the title of  actual result------------------------------------------------->"+getitle );
	
		
		
		
		
	}

}
