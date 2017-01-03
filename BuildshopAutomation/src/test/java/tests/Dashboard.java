package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;
import pages.HomePage;
import pages.DashboardPage;

public class Dashboard extends BaseClass 
{
	  @Test
	  public void DashboardPage() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  
	      
	      HomePage hp=new HomePage(driver);
	      hp.HomePageMethod();    
	      
	      DashboardPage d=new DashboardPage(driver);
	      d.DashboardMethod();
	   
	}
}