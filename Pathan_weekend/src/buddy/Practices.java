package buddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practices {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW8qmP12mCr8Dj-qRzO_7CvUwu0KT5W6XY58F4zOf4QXZCZXLsjcdOQaAt-9EALw_wcB");
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		
		 WebElement websubmit=driver.findElement(By.name("websubmit"));
		 Thread.sleep(1000);
		 websubmit.click();
		 
		WebElement firstname= driver.findElement(By.name("firstname"));
		
		 firstname.sendKeys("praveen");
		 Thread.sleep(10000);
		  WebElement lastname = driver.findElement(By.name("lastname"));
		 
		 lastname.sendKeys("kumar");
		 Thread.sleep(2000);
		 
		  WebElement reg_email__= driver.findElement(By.name("reg_email__"));
		  reg_email__.sendKeys("praveenprakasam007@gmail.com");
		  Thread.sleep(2000);
		  
		   WebElement reg_passwd__ = driver.findElement(By.name("reg_passwd__"));
		   reg_passwd__.sendKeys("passward@321");
		   Thread.sleep(5000);
		   
		    WebElement birthday_day =driver.findElement(By.name("birthday_day"));
		    birthday_day.sendKeys("21");
		    Thread.sleep(3000);
		    
		   WebElement birthday_month = driver.findElement(By.name("birthday_month"));
		   birthday_month.sendKeys("Jan");
		   Thread.sleep(200);
		    WebElement birthday_year=driver.findElement(By.name("birthday_year"));
		    birthday_year.sendKeys("1998");
		    Thread.sleep(2000);
		    
		    WebElement Male= driver.findElement(By.name("sex"));
		    Male.click();
		    
		    Thread.sleep(200);
		    
		
		  WebElement confirmmail=  driver.findElement(By.name("reg_email_confirmation__"));
		  confirmmail.sendKeys("praveenprakasam007@gmail.com");
		   Thread.sleep(200);
		   
		    WebElement  submit= driver.findElement(By.name("websubmit"));
		    submit.click();
		    Thread.sleep(10000);
		    
		  
		  
		  
		  
		  
		driver.quit();
		
		
		
		
	}
	
	

}
