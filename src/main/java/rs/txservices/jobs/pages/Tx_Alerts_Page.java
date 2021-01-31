package rs.txservices.jobs.pages;

import org.openqa.selenium.WebDriver;

import rs.txservices.jobs.elements.Tx_Alerts_Page_Elements;

public class Tx_Alerts_Page {

	WebDriver driver;
	Tx_Alerts_Page_Elements alertsPageElements;
	
	public Tx_Alerts_Page(WebDriver driver){
		this.driver = driver;
		alertsPageElements = new Tx_Alerts_Page_Elements(driver);
	}
	
	// Click on Accept all
	public void clickAcceptAllButton() {
		alertsPageElements.AccetpButton.click();
	}
	
	// Click on 
	public void clickCookiePreferencesButton() {
		alertsPageElements.preferencesButton.click();
	}
	
	public boolean IsExistAllert() {
		return alertsPageElements.existAlert.isDisplayed();
	}
}
