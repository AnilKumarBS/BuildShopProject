package tests;

import org.testng.annotations.Test;

import pages.Field360Customer;
import pages.HomePage;
import pages.MainPage;
import pages.SignInPage;

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
	  hp.Field360ModuleMethod();
	  
	  Field360Customer fc=new Field360Customer(driver);
	  fc.customerMethod();
	  
  }
}
