package tests;

import org.testng.annotations.Test;

import page.DashboardPage;
import page.DrawingPage;
import page.ProcurePage;
import page.SignInPage;
import page.WelcomePage;

public class ProcureTest extends SuperTest
{
  @Test
  public void ProcureModule() 
  {

	  WelcomePage wp= new WelcomePage(driver);
	  wp.clickSignIn();
	  
	  SignInPage si=new SignInPage(driver);
	  si.enterUsername();
	  si.enterPassword();
	  si.clickSignIn();
	  
	  DashboardPage db=new DashboardPage(driver);
	  db.clickOnProcure();
	  
	  DrawingPage dp=new DrawingPage(driver);
	  dp.selectDropDown();
	  
	  ProcurePage pp=new ProcurePage(driver);
	  pp.clickOnBids();
//	  pp.clickonstartdate();
//	  pp.selectdate();
//	  pp.clickonenddate("03/20/2017");
//	  pp.selecttype(12);
//	  pp.companyname("FR");
//	  pp.enterAmount("1000");
//	  pp.clickonAdd();
	  pp.agreement();
//	  pp.clickonEmail();
//	  pp.enterEmailID("rakeshsb313@gmail.com");
//	  pp.enterSubject("agreement");
//	  pp.enterBody("home agreement");
//	  pp.clickonsend();
	  pp.clickondownload();
  }
}
