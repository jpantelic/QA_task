package rs.txservices.jobs.pages;

import org.openqa.selenium.WebDriver;

import rs.txservices.jobs.elements.Tx_Home_Page_Elements;

public class Tx_Home_Page {

	WebDriver driver;
	Tx_Home_Page_Elements homePageElements;
	
	public Tx_Home_Page(WebDriver driver) {
		this.driver = driver;
		homePageElements = new Tx_Home_Page_Elements(driver);
	}
	
	// Click on menu button
	
	public void clickMenuButton() {
		homePageElements.menuButton.click();
	}
	
	
	public boolean isVisibleMenu() {
		return homePageElements.menuButton.isDisplayed();
	}
	
	//Is subMenu visible
	
	public boolean isVisibleSubMenu() {
		return homePageElements.subMenu.isDisplayed();
	}
	
	// Click on subMenu buttons
	
	public void clickJobsSubmenu() {
		homePageElements.jobsSubMenuButton.click();
	}
	
	public void clickLocationsSubmenu() {
		homePageElements.locationsSubMenuButton.click();
	}
	
	public void clickStartSubmenu() {
		homePageElements.startSubMenuButton.click();
	}
	
	public void clickDepartmentsSubmenu() {
		homePageElements.departmentsSubMenuButton.click();
	}
}
