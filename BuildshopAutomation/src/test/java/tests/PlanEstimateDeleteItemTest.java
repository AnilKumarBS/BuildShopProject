package tests;

import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.DrawingPage;
import pages.EstimatePage;
import pages.SignInPage;
import pages.WelcomePage;

public class PlanEstimateDeleteItemTest extends SuperTest
{
  @Test
  public void editItem() 
  {
	  WelcomePage wp= new WelcomePage(driver);
	  wp.clickSignIn();
	  
	  SignInPage si=new SignInPage(driver);
	  si.SignInMethod();
	  
	  DashboardPage db=new DashboardPage(driver);
	  db.clickPlanButton();
	  
	  DrawingPage dp=new DrawingPage(driver);
	  dp.selectDropDown();
	  
	  EstimatePage ep=new EstimatePage(driver);
	  ep.clickonestimate();
	  ep.clickonediticon();
	  ep.clickonedititem();
	  ep.clickonediticon();
	  ep.clickondeleteEstimate();
  }
}