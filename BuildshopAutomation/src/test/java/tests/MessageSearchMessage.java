package tests;

import org.testng.annotations.Test;

import pages.MainPage;
import pages.MessagesPage;
import pages.SignInPage;

public class MessageSearchMessage extends BaseClass
{
  @Test
  public void searchMessage() throws InterruptedException 
  {
	  MainPage mp = new MainPage(driver);
	  mp.signinPage();
	  
	  SignInPage sp=new SignInPage(driver);
	  sp.SignInMethod();
	  
	  MessagesPage msg=new MessagesPage(driver);
	  msg.searchMessageMethod();
  }
}
