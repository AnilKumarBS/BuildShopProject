package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.MainPage;
import pages.ManageHomePage;
import pages.SignInPage;

public class Dashboard extends BaseClass 
{
	  @Test
	  public void DashboardPage() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  
	      
	      ManageHomePage hp=new ManageHomePage(driver);
	      hp.ManageHomePageMethod();    
	      
	      DashboardPage d=new DashboardPage(driver);
	      d.DashboardMethod();
	   
	}
}