package rs.txservices.jobs.tests;

import org.testng.annotations.Test;

public class SearchAndApplyJobs extends Config{
	
	String wantedJob="Quality Analyst  @Doodle";
	String openedJob=null;
	
	@Test
	public void searchJobs() {
		
		App().Flow().navifateToUrl("https://jobs.txservices.rs/jobs");		
		sAss().assertFalse(App().Pages().JobsPage().isVisibleSearchButton(), "Jobs page is open");		
		manageAlerts();	
		App().Pages().JobsPage().clearSearch();
		App().Pages().JobsPage().searchJobs("Quality Analyst");		
		sAss().assertFalse(App().Pages().JobsPage().searchMatch(), "Exists jobs in search results");		
		sAss().assertAll();
	}
	
	@Test
	public void sendEmailReminder()  {
		
		App().Flow().navifateToUrl("https://jobs.txservices.rs/jobs");		
		sAss().assertFalse(App().Pages().JobsPage().isVisibleSearchButton(), "Jobs page is open");	
		manageAlerts();	
		App().Pages().JobsPage().searchJobs("Quality Analyst");		
		sAss().assertTrue(App().Pages().JobsPage().isExistChosenJob());
		App().Pages().JobsPage().openChosenJob("Quality Analyst");	
		if(App().Pages().chosenJob().isClickableRemindMeLater())
			openedJob=App().Pages().chosenJob().getTitleChosenJob();
		sAss().assertEquals(wantedJob, openedJob, "Open page with description of wanted job");
		App().Pages().chosenJob().clickRemindMeLater();		
		sAss().assertTrue(App().Pages().reminderPage().isEmailExists(), "Reminder page is open");
		App().Pages().reminderPage().emptyEmail();
		App().Pages().reminderPage().writeAndSendEmail("jecap86@gmail.com"); //this mail addrees will get an reminder email		
		sAss().assertTrue((App().Pages().reminderPage().existsSuccessMesages()), "Success message exists"); 
		sAss().assertAll();
	}

	@Test
	public void sendIncorrectEmail() {
		App().Flow().navifateToUrl("https://jobs.txservices.rs/jobs");		
		sAss().assertFalse(App().Pages().JobsPage().isVisibleSearchButton(), "Jobs page is open");	
		manageAlerts();	
		App().Pages().JobsPage().searchJobs("Quality Analyst");		
		sAss().assertTrue(App().Pages().JobsPage().isExistChosenJob());
		App().Pages().JobsPage().openChosenJob("Quality Analyst");	
		//System.out.println(App().Pages().chosenJob().getTitleChosenJob());
		if(App().Pages().chosenJob().isClickableRemindMeLater())
			openedJob=App().Pages().chosenJob().getTitleChosenJob();
		sAss().assertEquals(wantedJob, openedJob, "Open page with description of wanted job");
		App().Pages().chosenJob().clickRemindMeLater();		
		sAss().assertTrue(App().Pages().reminderPage().isEmailExists(), "Reminder page is open");
		App().Pages().reminderPage().emptyEmail();
		App().Pages().reminderPage().writeAndSendEmail("xxx"); 	
		sAss().assertTrue((App().Pages().reminderPage().existsErrorMessages()), "Error message exists"); 
		sAss().assertAll();
	}
}
