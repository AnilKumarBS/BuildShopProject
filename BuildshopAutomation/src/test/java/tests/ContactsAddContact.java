package tests;

import org.testng.annotations.Test;

import pages.Contacts;
import pages.ContactsPage;
import pages.MainPage;
import pages.SignInPage;

public class ContactsAddContact extends BaseClass
{
  @Test
  public void addContactMethod() throws InterruptedException 
  {
	  MainPage mp = new MainPage(driver);
	  mp.signinPage();
	  
	  SignInPage sp=new SignInPage(driver);
	  sp.SignInMethod();
	  
	  Contacts c=new Contacts(driver);
	  c.contactsMethod();
	  
	  ContactsPage cp=new ContactsPage(driver);
	  cp.addContactMethod();
	  
  }
}
