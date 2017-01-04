package tests;

import org.testng.annotations.Test;

import pages.Field360Quotes;
import pages.HomePage;
import pages.MainPage;
import pages.SignInPage;

public class Field360ConvertQuoteToJobToUninvoicedJobsToOpenInvoices extends BaseClass 
{
  @Test
  public void Convert() throws InterruptedException 
  {
	  MainPage mp = new MainPage(driver);
	  mp.signinPage();
	  
	  SignInPage sp=new SignInPage(driver);
	  sp.SignInMethod();
	  
	  HomePage hp=new HomePage(driver);
	  hp.Field360ModuleMethod();
	  
	  Field360Quotes fq=new Field360Quotes(driver);
	  fq.convertToJobMethod();
	  
  }
}
