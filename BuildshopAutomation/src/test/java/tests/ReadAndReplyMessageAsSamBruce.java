package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MainPage;
import pages.MessagesPage;
import pages.SignInPage;

public class ReadAndReplyMessageAsSamBruce extends BaseClass
{
  @Test
  public void ReadAndReplyMessage() throws InterruptedException 
  {
	  MainPage mp = new MainPage(driver);
	  mp.signinPage();
	  
	  SignInPage sp=new SignInPage(driver);
	  sp.SignInMethod();
	  
	  MessagesPage msg=new MessagesPage(driver);
	  msg.newMessageMethod();
	  
	  HomePage hp=new HomePage(driver);
	  hp.signoutMethod();
	  
	  sp.SamBruceSignInMethod();
	  
	  msg.ReadMessageAsSamBruceMethod();
  }
}
