package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Testdemo {
 
	static WebDriver driver;

	@BeforeSuite
	public void Setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Assignment10.1\\driver\\chromedriver.exe" );
	driver=new ChromeDriver();
	
	}
		
}
