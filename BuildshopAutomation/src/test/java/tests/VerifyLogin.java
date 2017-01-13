package tests;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainPage;
public class VerifyLogin 
{
	public class SignIn extends BaseClass 
	{
	  @Test
	  public void verifySignIn()
	  {
		  MainPage mp=new MainPage(driver);
		  mp.signinPage();
		  
		  LoginPage lp = new LoginPage(driver);
		  lp.SignInMethod();     
	  }
	}
}