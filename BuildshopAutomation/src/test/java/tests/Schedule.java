package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.ManageDashboardPage;
import pages.ManageHomePage;
import pages.SignInPage;
import pages.SchedulePage;

public class Schedule extends BaseClass 
{
	  @Test
	  public void SchedulePage() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  
	      
	      ManageHomePage hp=new ManageHomePage(driver);
	      hp.ManageHomePageMethod();
	      
	      ManageDashboardPage d=new ManageDashboardPage(driver);
	      d.ManageDashboardMethod();
	      
	      SchedulePage s=new SchedulePage(driver);
	      s.ScheduleMethod();
	   
	}
}