package rs.txservices.jobs.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tx_Home_Page_Elements {

	WebDriver driver;
	@FindBy(css="div.sliding-menu-button") public WebElement menuButton;
	
	@FindBy(css="nav.sliding-menu-content") public WebElement subMenu;
	
	@FindBy(linkText="Start") public WebElement startSubMenuButton;
	
	@FindBy(linkText="Jobs") public WebElement jobsSubMenuButton;
	
	@FindBy(linkText="Departments") public WebElement departmentsSubMenuButton;
	
	@FindBy(linkText="Locations") public WebElement locationsSubMenuButton;
	
	
	public Tx_Home_Page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
