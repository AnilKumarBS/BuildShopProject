package tests;

import org.testng.annotations.Test;

import page.DashboardPage;
import page.DrawingPage;
import page.EstimatePage;
import page.SignInPage;
import page.WelcomePage;

public class PlanEstimateTest extends SuperTest
{
  @Test
  public void estimate() 
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
//	  ep.enterItemNumber("15");
//	  ep.enterDescription("marbels");
//	  ep.clickonadd();
	  ep.searchforEstimate("marbels");
	  ep.clickonsearchbutton();
//	  ep.clickonadditem(3);
	  ep.clickonPlayIcon();
//	  ep.enterItemDescription("item 1");
//	  ep.enteritemUnit(4);
	  ep.clickonDeleteIcon();
	  
//	  ep.pagenum("2");
//	  ep.clickonadditem(5);
//	  ep.clickoncheckitem();
  }
}
