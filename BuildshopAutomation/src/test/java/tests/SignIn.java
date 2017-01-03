package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;

public class SignIn extends BaseClass 
{
  @Test
  public void signInPage() 
{
      MainPage mp = new MainPage(driver);
      mp.signinPage();
      
      SignInPage sp=new SignInPage(driver);
      sp.SignInMethod();   
      
      
      
  }
}