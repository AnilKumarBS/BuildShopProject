package tests;

import org.testng.annotations.Test;

import pages.MainPage;
import pages.MessagesPage;
import pages.SignInPage;

public class MessagesNewMessage extends BaseClass
{
  @Test
  public void newMessage() throws InterruptedException 
  {
	  MainPage mp = new MainPage(driver);
	  mp.signinPage();
	  
	  SignInPage sp=new SignInPage(driver);
	  sp.SignInMethod();
	  
	  MessagesPage msg=new MessagesPage(driver);
	  msg.newMessageMethod();	  
  }
}
