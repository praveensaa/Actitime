package com.actitime.generic;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasseClass {
	public static WebDriver driver; //  If use the Static web driver  used to captured the Screen Shot Automatically in FAilures Occurs
@BeforeClass
public void openbrowser()
{
	Reporter.log("open the browser ",true);
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterClass
public void closeBrowser()
{
	Reporter.log("close the Browser",true);
	driver.manage().window().minimize();
	driver.quit();
}
@BeforeMethod{
	public void login()
	{
		Reporter.log("Login ",true);
		FileLib f= new FileLib();
		f.g
		
	}
	
}


}
