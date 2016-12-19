package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
public class BaseClass 
	{
	 WebDriver driver;
	     @BeforeClass
	      public void beforeClass() 
	{
	         driver=new FirefoxDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	         driver.get("http://sv9487.si-servers.com/");
	      }
	     
	  @BeforeMethod
	  public void beforeMethod() 
	{
	      
	  }

	  @AfterMethod
	  public void afterMethod() 
	{
	  }

	 

	  @AfterClass
	  public void afterClass()
	 {
	      driver.close();
	  }

	}

