package rs.txservices.jobs.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import rs.txservices.jobs.lib.AppLib;

public class Config {

	WebDriver driver;	
	private AppLib app;
	SoftAssert sAssert=new SoftAssert();
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 app = new AppLib(driver);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	public AppLib App() {
		return app;
	}
	
	public SoftAssert sAss() {
		return sAssert;
	}
	
	public void manageAlerts() {
		if ( App().Pages().AlertsPopUp().IsExistAllert())		
			App().Pages().AlertsPopUp().clickAcceptAllButton();	
	}	
	
}
