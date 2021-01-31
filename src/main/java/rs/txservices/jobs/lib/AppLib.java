package rs.txservices.jobs.lib;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AppLib {

	private WebDriver driver;
	private PageLib page;
	private FlowLib flow;
	
	
	public AppLib(WebDriver driver) {
		this.driver = driver;
		page = new PageLib(this.driver);
		flow = new FlowLib(this.driver);
		
	}
	
	public PageLib Pages() {
		return page;
	}
	
	public FlowLib Flow() {
		return flow;
	}
	
	
}
