package tests;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SuperTest 
{
	WebDriver driver;
	@BeforeClass
	public void beforeClass() 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:/sel softwares/chromedriver_win32/geckodriver.exe");
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf");
		driver=new FirefoxDriver(prof);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://sv9487.si-servers.com/");
	}

//  @AfterClass
//  public void afterClass() 
//  {
//	  driver.close();
//  }

}
