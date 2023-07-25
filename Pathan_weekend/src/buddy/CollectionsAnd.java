package buddy;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsAnd {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		 Set<String> count = driver.getWindowHandles();
		 int allcount = count .size();
		 System.out.println("Total Count "+allcount);
		
		for(WebElement link:alllinks)
		{
			System.out.println(link.getText());
		}
	}

}
