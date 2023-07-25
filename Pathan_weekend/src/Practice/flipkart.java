package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	for(WebElement link:alllinks)
	{
	System.out.println(link.getText());
	}
	}

}

