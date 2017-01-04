package tests;

import org.testng.annotations.Test;

import page.CreateProjectPage;
import page.SignInPage;
import page.WelcomePage;

public class CreateProjectTest extends SuperTest 
{
  @Test
  public void creatingproject() 
  {

	  WelcomePage wp= new WelcomePage(driver);
	  wp.clickSignIn();
	  
	  SignInPage si=new SignInPage(driver);
	  si.enterUsername();
	  si.enterPassword();
	  si.clickSignIn();
	  
	  CreateProjectPage cp=new CreateProjectPage(driver);
	  cp.clickonproject();
	  cp.selectprojectstatus(1);
	  cp.enterProjectname("Test Yantra project");
	  cp.enterfname("Rakesh");
	  cp.enterlname("SB");
	  cp.enterpnum("9916780313");
	  cp.enterext("+91");
	  cp.enterCellNum("9632237006");
	  cp.enterFax("1234567890");
	  cp.enterEmailId("rakeshsb313@gmail.com");
	  cp.enterstreetaddress("Basavanagudi");
	  cp.selectCountry(2);
	  cp.selectState(2);
	  cp.selectCity(1);
	  cp.enterZipcode("560001");
	  cp.enterLongitude("90");
	  cp.enterLatitude("45");
	  cp.enterWorkDescription("constructing a new building");
	  cp.clickondone();
	  cp.searchProject("Test Yantra project");
	  cp.clickonresources();
	  cp.clickonaddemp();
	  cp.clickondone();
  }
}
