package tests;

import org.testng.annotations.Test;

import pages.Contacts;
import pages.ContactsProspects;
import pages.MainPage;
import pages.SignInPage;

public class ContactsAddProspect extends BaseClass
{
  @Test
  public void addProspect() throws InterruptedException 
  {
	  MainPage mp = new MainPage(driver);
	  mp.signinPage();
	  
	  SignInPage sp=new SignInPage(driver);
	  sp.SignInMethod();
	  
	  Contacts c=new Contacts(driver);
	  c.contactsMethod();
	  
	  ContactsProspects cp=new ContactsProspects(driver);
	  cp.addProspectMethod();
  }
}
