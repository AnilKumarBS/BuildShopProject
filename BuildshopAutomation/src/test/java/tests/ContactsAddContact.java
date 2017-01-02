package com.tests;

import org.testng.annotations.Test;

import com.pages.Contacts;
import com.pages.ContactsPage;
import com.pages.MainPage;
import com.pages.SignInPage;

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
