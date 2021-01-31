package rs.txservices.jobs.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tx_Jobs_Page_Elements {

	WebDriver driver;
	
	@FindBy(css="input.js-jobs-filters-search-input") public WebElement searchInputField;
	
	@FindBy(css="button.js-jobs-filters-search-button") public WebElement searchButton;
	
	@FindBy(css="a div span.title") public List<WebElement> allSearchResults;
	
	@FindBy(css="a div span.title[title*='Quality Analyst']") public WebElement chosenJob;
	
	
	public Tx_Jobs_Page_Elements(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
