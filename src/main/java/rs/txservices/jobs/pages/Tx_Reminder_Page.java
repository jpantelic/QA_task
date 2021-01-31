package rs.txservices.jobs.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import rs.txservices.jobs.elements.Tx_Reminder_Page_Elements;

public class Tx_Reminder_Page {

	WebDriver driver;
	Tx_Reminder_Page_Elements reminderPageElements;
	
	public Tx_Reminder_Page(WebDriver driver) {		
		this.driver = driver;
		reminderPageElements = new Tx_Reminder_Page_Elements(driver);
	}
	
	public boolean existsErrorMessages() {
		return reminderPageElements.errorMessages.isDisplayed();
	}
	
	public boolean existsSuccessMesages() {
		return reminderPageElements.successMessage.isDisplayed();
	}
	
	public boolean isEmailExists() {
		return reminderPageElements.emailInput.isEnabled();
	}
	
	public void sendWithoutEmail() {
		reminderPageElements.remindMeLaterButton.click();
	}
	
	public void emptyEmail() {
		reminderPageElements.emailInput.clear();
	}
	public void writeAndSendEmail(String email) {
		reminderPageElements.emailInput.sendKeys(email, Keys.ENTER);
	}
}
