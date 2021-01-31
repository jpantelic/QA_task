package rs.txservices.jobs.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tx_Reminder_Page_Elements {

	WebDriver driver;
	
	@FindBy(id="remind_email") public WebElement emailInput;
	
	@FindBy(css="tt-button--filled") public WebElement remindMeLaterButton;
	
	@FindBy(css="div.error_notification") public WebElement errorMessages;
	
	@FindBy(css="div.reminds__emoji") public WebElement successMessage;
		
	public Tx_Reminder_Page_Elements(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
