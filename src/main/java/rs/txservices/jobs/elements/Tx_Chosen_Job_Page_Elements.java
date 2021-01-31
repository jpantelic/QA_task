package rs.txservices.jobs.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tx_Chosen_Job_Page_Elements {

	WebDriver driver;
	
	@FindBy(css="a.btn-apply") public WebElement applyTodayButton;
	
	@FindBy(css="a.btn-remind-me") public WebElement remindMeLater;
	
	@FindBy(css="h1.u-fit-text") public WebElement chosenJobHeader;
	
		
	public Tx_Chosen_Job_Page_Elements(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
