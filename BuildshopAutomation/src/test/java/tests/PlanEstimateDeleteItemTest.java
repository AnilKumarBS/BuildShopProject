package tests;

import org.testng.annotations.Test;

import page.DashboardPage;
import page.DrawingPage;
import page.EstimatePage;
import page.SignInPage;
import page.WelcomePage;

public class PlanEstimateDeleteItemTest extends SuperTest
{
  @Test
  public void editItem() 
  {
	  WelcomePage wp= new WelcomePage(driver);
	  wp.clickSignIn();
	  
	  SignInPage si=new SignInPage(driver);
	  si.enterUsername();
	  si.enterPassword();
	  si.clickSignIn();
	  
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