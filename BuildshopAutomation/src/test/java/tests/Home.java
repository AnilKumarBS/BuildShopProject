package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;

public class Home extends BaseClass 
{
	  @Test
	  public void HomePage() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  
	      
//	      HomePage hp=new HomePage(driver);
//	      hp.HomePageMethod();    	      
	   
	}
}