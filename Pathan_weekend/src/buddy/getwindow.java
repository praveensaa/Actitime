package buddy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindow {
	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(1000);
	

		driver.get("https://parivahan.gov.in/");
		Dimension targetWindowsize=new Dimension(500,500);
		driver.manage().window().setSize(targetWindowsize);
		
		
		Point targetWindowPosition=new Point(150,200);
		driver.manage().window().setPosition(targetWindowPosition);
		Thread.sleep(10000);
		
		
		Dimension windowSize=driver.manage().window().getSize();
		
		int windowWidth=windowSize.getWidth();
		System.out.println("window Width---->"+windowWidth);
		
		int windowHeight=windowSize.getHeight();
		System.out.println("window Height---->"+windowHeight);
		driver.quit();
		
		Point windowPosition = driver.manage().window().getPosition();
		
		int windowStartX = windowPosition.getX();
		System.out.println("windowStartX------->"+windowStartX);
		
		int windowStartY = windowPosition.getY();
		System.out.println("windowStartY------->"+windowStartY);
		
		
		
		
	}

}
