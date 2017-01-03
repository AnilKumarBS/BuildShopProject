package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;
import pages.HomePage;
import pages.DashboardPage;
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
	      
	      HomePage hp=new HomePage(driver);
	      hp.HomePageMethod();    
	      
	      //DashboardPage d=new DashboardPage(driver);
	      //d.DashboardMethod();
	      
	      SchedulePage1 s=new SchedulePage1(driver);
	      s.SchedulePage1Method();	   
	}
}