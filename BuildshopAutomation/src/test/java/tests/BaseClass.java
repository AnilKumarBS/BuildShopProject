package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class BaseClass 
{
 WebDriver driver;
     @BeforeClass
      public void beforeClass() 
      {
//    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tyss\\git\\BuildShopProject\\BuildshopAutomation\\driver\\chromedriver.exe");
//       driver=new  ChromeDriver();
         driver=new  FirefoxDriver();
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
      driver.quit();
  }

}