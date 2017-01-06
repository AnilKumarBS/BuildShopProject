package tests;

import org.testng.annotations.Test;

import page.HomeDashboardPage;
import page.DrawingPage;
import page.ProcurePage;
import page.SignInPage;
import page.WelcomePage;

public class ProcureMaterial extends SuperTest 
{
  @Test
  public void addItem() 
  {
	  WelcomePage wp= new WelcomePage(driver);
	  wp.clickSignIn();
	  
	  SignInPage si=new SignInPage(driver);
	  si.enterUsername();
	  si.enterPassword();
	  si.clickSignIn();
	  
	  HomeDashboardPage db=new HomeDashboardPage(driver);
	  db.clickOnProcure();
	  
	  DrawingPage dp=new DrawingPage(driver);
	  dp.selectDropDown();
	  
	  ProcurePage pp=new ProcurePage(driver);
	  pp.clickonMaterial();
	  pp.clickonaddItem();
	  pp.selectamaterial(5);
	  pp.materialDescription("nice quality");
	  pp.enterQuantity("5");
	  pp.selectUnit(3);
	  pp.clickonMatSave();
	  pp.selectMatType();
	  pp.selectItem();
	  pp.clickonDeleteIcon();
	  pp.clickonconfirmdeleteItem();
  }
}
