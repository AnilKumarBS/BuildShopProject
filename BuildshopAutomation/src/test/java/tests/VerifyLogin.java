package tests;
import org.testng.annotations.Test;

import pages.LoginPage;
public class VerifyLogin {
	public class SignIn extends BaseClass 
	{
	  @Test
	  public void verifySignIn() 
	{
	      
	     LoginPage lp = new LoginPage(driver);
	     lp.SignInMethod();
	  }
}
}