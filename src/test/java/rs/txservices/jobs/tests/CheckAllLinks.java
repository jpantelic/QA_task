package rs.txservices.jobs.tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckAllLinks extends Config{

		
	@Test
	public void checkMenuButton() {	
		
		
		App().Flow().navifateToUrl("https://jobs.txservices.rs/");		
		sAss().assertTrue(App().Pages().HomePage().isVisibleMenu(), "Check is home page open");		
		manageAlerts();	
		App().Pages().HomePage().clickMenuButton();			
		sAss().assertTrue(App().Pages().HomePage().isVisibleSubMenu(), "Check is subMenu open");		
		sAss().assertAll();
	}
	

	@Test
	public void checkJobsLink() {
		
		String expectedUrl = "https://jobs.txservices.rs/jobs";		
		String newUrl=null;
		
		App().Flow().navifateToUrl("https://jobs.txservices.rs/");		
		sAss().assertTrue(App().Pages().HomePage().isVisibleMenu(), "Check is home page open");		
		manageAlerts();	
		App().Pages().HomePage().clickMenuButton();		
		App().Pages().HomePage().clickJobsSubmenu();		
		newUrl = App().Flow().getCurrentPageUrl();
		//System.out.println(expectedUrl);
		//System.out.println(newUrl);			
		sAss().assertEquals(expectedUrl, newUrl,"Verify URL of the new page" );		
		sAss().assertAll();
	}
	
	// write TC for rest subMenu links...
}
