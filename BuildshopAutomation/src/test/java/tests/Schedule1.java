package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.ManageDashboardPage;
import pages.ManageHomePage;
import pages.SignInPage;

import pages.SchedulePage1;

public class Schedule1 extends BaseClass 
{
	  @Test
	  public void SchedulePage1() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  
	      
	      ManageHomePage hp=new ManageHomePage(driver);
	      hp.ManageHomePageMethod();
	      
	      ManageDashboardPage d=new ManageDashboardPage(driver);
	      d.ManageDashboardMethod();
	      
	      SchedulePage1 s=new SchedulePage1(driver);
	      s.SchedulePage1Method();	   
	}
}