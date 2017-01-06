package tests;

import org.testng.annotations.Test;

import pages.MainPage;
import pages.ManageDashboardPage;
import pages.ManageHomePage;
import pages.ScheduleSubModulesPage;
import pages.SignInPage;

public class ScheduleSubModules extends BaseClass 
{
	  @Test
	  public void ScheduleSubModulesPage() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  
	      
	      ManageHomePage hp=new ManageHomePage(driver);
	      hp.ManageHomePageMethod();
	      
	      ManageDashboardPage d=new ManageDashboardPage(driver);
	      d.ManageDashboardMethod();
	      
	      ScheduleSubModulesPage ssmp= new ScheduleSubModulesPage(driver);
	      ssmp.ScheduleSubModulesMethod();
	   
	}
}