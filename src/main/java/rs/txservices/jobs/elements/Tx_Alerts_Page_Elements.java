package rs.txservices.jobs.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tx_Alerts_Page_Elements {

	WebDriver driver;
	
	@FindBy(id="tt-cookie-alert__accept-all") public WebElement AccetpButton;
	
	@FindBy(id="tt-cookie-alert__preferences") public WebElement preferencesButton;
	
	@FindBy(id="tt-cookie-alert") public WebElement existAlert;
	
	
	public Tx_Alerts_Page_Elements(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
