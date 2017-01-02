package com.tests;

import org.testng.annotations.Test;

import com.pages.Field360Customer;
import com.pages.HomePage;
import com.pages.MainPage;
import com.pages.SignInPage;

public class Field360Cust extends BaseClass
{
  @Test
  public void customer() throws InterruptedException 
  {
	  MainPage mp = new MainPage(driver);
	  mp.signinPage();
	  
	  SignInPage sp=new SignInPage(driver);
	  sp.SignInMethod();
	  
	  HomePage hp=new HomePage(driver);
	  hp.homePageMethod();
	  
	  Field360Customer fc=new Field360Customer(driver);
	  fc.customerMethod();
	  
  }
}
