package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MainPage;
import pages.SignInPage;
import pages.Field360DashboardPage;

public class Field360Dashboard extends BaseClass
{
  @Test
  public void field360Dashboard() 
  {
	  MainPage mp = new MainPage(driver);
	  mp.signinPage();
	  
	  SignInPage sp=new SignInPage(driver);
	  sp.SignInMethod();
	  
	  HomePage hp=new HomePage(driver);
	  hp.Field360ModuleMethod();
	  
	  Field360DashboardPage fd=new Field360DashboardPage(driver);
	  fd.dashboardMethod();
  }
}
