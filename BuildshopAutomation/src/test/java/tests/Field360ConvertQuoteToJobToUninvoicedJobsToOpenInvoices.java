package com.tests;

import org.testng.annotations.Test;

import com.pages.Field360Quotes;
import com.pages.HomePage;
import com.pages.MainPage;
import com.pages.SignInPage;

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
	  hp.homePageMethod();
	  
	  Field360Quotes fq=new Field360Quotes(driver);
	  fq.convertToJobMethod();
	  
  }
}
