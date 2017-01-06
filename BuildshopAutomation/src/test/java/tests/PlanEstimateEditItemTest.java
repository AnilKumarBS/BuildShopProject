package tests;

import org.testng.annotations.Test;

import page.HomeDashboardPage;
import page.DrawingPage;
import page.EstimatePage;
import page.SignInPage;
import page.WelcomePage;

public class PlanEstimateEditItemTest extends SuperTest
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
	  
	  HomeDashboardPage db=new HomeDashboardPage(driver);
	  db.clickPlanButton();
	  
	  DrawingPage dp=new DrawingPage(driver);
	  dp.selectDropDown();
	  
	  EstimatePage ep=new EstimatePage(driver);
	  ep.clickonestimate();
	  ep.clickonediticon();
	  ep.clickonedititem();
	  ep.changeitemnum("151");
	  ep.changeDescription("marbels123");
	  ep.clickonaddtoscope();
	  ep.clickonaddtoschedule();
	  ep.clickonsaveestimate();
	  ep.clickonestimate();
	  ep.clickonediticon();
	  ep.clickondeleteEstimate();
  }
}