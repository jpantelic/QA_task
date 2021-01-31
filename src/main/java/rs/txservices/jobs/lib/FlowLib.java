package rs.txservices.jobs.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class FlowLib {

	private WebDriver driver;
	
	public FlowLib(WebDriver driver) {
		this.driver=driver;
	}
	
	public void navifateToUrl(String url) {
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		this.driver.get(url);
		this.driver.manage().window().maximize();		
	}
	
	public String getJobsTitle() {
		return this.driver.getTitle();
	}
	
	public String getCurrentPageUrl() {
		return this.driver.getCurrentUrl();
	}
	
	
}
