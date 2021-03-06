package tests;

import org.testng.annotations.Test;

import pages.HomeDashboardPage;
import pages.DrawingPage;
import pages.ProcurePage;
import pages.SignInPage;
import pages.WelcomePage;

public class ProcureMaterial extends SuperTest 
{
  @Test
  public void addItem() throws InterruptedException 
  {
	  WelcomePage wp= new WelcomePage(driver);
	  wp.clickSignIn();
	  
	  SignInPage si=new SignInPage(driver);
	  si.SignInMethod();
	  
	  HomeDashboardPage db=new HomeDashboardPage(driver);
	  db.clickOnProcure();
	  
	  DrawingPage dp=new DrawingPage(driver);
	  dp.selectDropDown();
	  
	  ProcurePage pp=new ProcurePage(driver);
	  pp.clickonMaterial();
	  pp.selectMatType();
	  pp.clickonaddItem();
	  pp.selectamaterial(18);
	  pp.materialDescription("nice quality");
	  pp.enterQuantity("5");
	  pp.selectUnit(3);
	  pp.clickonMatSave();
	  pp.clickonMaterial();
	  pp.selectMatType();
	  pp.selectoneMaterialType();
//	  pp.selectMatType();
//	  pp.selectItem();
	  pp.clickonDeleteIcon();
	  pp.clickonconfirmdeleteItem();
  }
}
