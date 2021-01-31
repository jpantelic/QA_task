package rs.txservices.jobs.lib;

import org.openqa.selenium.WebDriver;

import rs.txservices.jobs.pages.Tx_Alerts_Page;
import rs.txservices.jobs.pages.Tx_Chosen_Job_Page;
import rs.txservices.jobs.pages.Tx_Home_Page;
import rs.txservices.jobs.pages.Tx_Jobs_Page;
import rs.txservices.jobs.pages.Tx_Reminder_Page;

public class PageLib {
	
	private WebDriver driver;
	private Tx_Home_Page homePage;
	private Tx_Jobs_Page jobsPage;
	private Tx_Alerts_Page alertsPage;
	private Tx_Chosen_Job_Page chosenJobPage;
	private Tx_Reminder_Page reminderPage;
	
	public PageLib(WebDriver driver) {
		this.driver = driver;
		homePage = new Tx_Home_Page(this.driver);
		jobsPage = new Tx_Jobs_Page(this.driver);
		alertsPage = new Tx_Alerts_Page(this.driver);
		chosenJobPage = new Tx_Chosen_Job_Page(this.driver);
		reminderPage = new Tx_Reminder_Page(this.driver);
	}
	
	
	public Tx_Home_Page HomePage() {
		return homePage;
	}
	
	public Tx_Jobs_Page JobsPage() {
		return jobsPage;
	}
	
	public Tx_Alerts_Page AlertsPopUp() {
		return alertsPage;
	}

	public Tx_Chosen_Job_Page chosenJob() {
		return chosenJobPage;
	} 
	
	public Tx_Reminder_Page reminderPage() {
		return reminderPage;
	}
}
