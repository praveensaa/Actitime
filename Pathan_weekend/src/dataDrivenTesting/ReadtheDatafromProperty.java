package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class ReadtheDatafromProperty {
	static WebDriver  driver ;
public static void main(String[] args) throws IOException {
	FileInputStream	fis =new FileInputStream("./testdata/Commondata.properties");
		Properties probj=new Properties();
		probj.load(fis);
		String browsername =probj.getProperty("Browsername");
		if (browsername.equals("Chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
    String Url  =probj.getProperty("Url");
    driver.get(Url);
    WebElement usernamefiled=driver.findElement(By.id("email"));
    usernamefiled.sendKeys(probj.getProperty("Email"));
}

}
