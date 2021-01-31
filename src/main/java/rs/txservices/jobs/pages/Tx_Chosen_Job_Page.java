package rs.txservices.jobs.pages;

import org.openqa.selenium.WebDriver;

import rs.txservices.jobs.elements.Tx_Chosen_Job_Page_Elements;

public class Tx_Chosen_Job_Page {
	
	WebDriver driver;
	Tx_Chosen_Job_Page_Elements chosenJobPageElements;
	
	public Tx_Chosen_Job_Page(WebDriver driver) {		
		this.driver = driver;
		chosenJobPageElements = new Tx_Chosen_Job_Page_Elements(driver);	}
	
	public void clickApplyToday() {	
			chosenJobPageElements.applyTodayButton.click();
	}
	
	public boolean isClickableApplyToday() {
		return chosenJobPageElements.applyTodayButton.isEnabled();
	}
	
	public boolean isClickableRemindMeLater() {
		return chosenJobPageElements.remindMeLater.isEnabled();
	}
	
	public void clickRemindMeLater() {		
			chosenJobPageElements.remindMeLater.click();
	}
	
	public String getTitleChosenJob() {
		return chosenJobPageElements.chosenJobHeader.getText();
	}
	
		

}
