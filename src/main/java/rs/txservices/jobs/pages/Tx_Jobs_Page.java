package rs.txservices.jobs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import rs.txservices.jobs.elements.Tx_Jobs_Page_Elements;

public class Tx_Jobs_Page {

	WebDriver driver;
	Tx_Jobs_Page_Elements jobsPageElements;
	
	public Tx_Jobs_Page(WebDriver driver) {
		this.driver = driver;
		jobsPageElements = new Tx_Jobs_Page_Elements(driver);
	}
	
	
	// Is Search Button visible	
	public boolean isVisibleSearchButton() {
		return jobsPageElements.searchButton.isDisplayed();
	}
	
	
	// Send text for search and start search
	public void searchJobs(String searchText) {
		jobsPageElements.searchInputField.sendKeys(searchText, Keys.ENTER);
	}
	
	public void clearSearch() {
		jobsPageElements.searchInputField.clear();
	}
	
	public boolean searchMatch() {		
		return jobsPageElements.allSearchResults.isEmpty();
	}
	
	
	public void allFoundedJobs(String searchText) {		 
		for(WebElement link : jobsPageElements.allSearchResults) {
			String text=link.getText();
			System.out.println(text);
		}
	 }
	
	public boolean isExistChosenJob() {
		return jobsPageElements.chosenJob.isDisplayed();
	}
	
	public void openChosenJob(String chosenJob) {
		jobsPageElements.chosenJob.click();		
	}
}
