package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;
//import pages.HomePage;
import pages.HomePage1;

public class Home1 extends BaseClass 
{
	  @Test
	  public void HomePage1() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  	      
	          
	      HomePage1 hp=new HomePage1(driver);
	      hp.HomePage1Method();    	      
	   
	}
}