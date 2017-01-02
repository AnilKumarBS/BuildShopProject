package libraries;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


@Listeners({MyTestListner.class})
public class BaseClass {
	public static  String brVersion=" ";
	protected WebDriver wdriver;
	protected EventFiringWebDriver driver;
	static String path = System.getProperty("user.dir").replace("\\", "\\");
	private String testScenarioName;
	public WebDriver getDriver() {
        return wdriver;
	}
	public String getClassName(){
		return testScenarioName;
	}
	public void getBrowserOsInfo(WebDriver driver){
		 Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		 String os = System.getProperty("os.name").toLowerCase();
		 brVersion=cap.getBrowserName()+","+cap.getVersion()+","+os;
		 
		 File file = new File(path+"\\basicinfo.txt");
		 FileWriter fw;
		try {
			fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(BaseClass.brVersion);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	@BeforeSuite
	public void executeCleanUpFile()
	{
		File file_to_delete = new File(path+"\\target\\surefire-reports");
		File screen_shot_dir = new File(path+"\\screenshots");
		try
		{
			FileUtils.deleteDirectory(file_to_delete);
			FileUtils.deleteDirectory(screen_shot_dir);
			new File(path+"\\screenshots").mkdir();
		}
		catch(Exception e)
		{	
			
		}		
	}
	
	@BeforeTest
	public void initializeLogger(){
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@BeforeClass
	public void launchApplication(){		
		testScenarioName = this.getClass().getSimpleName();
		try{
				ProfilesIni ini = new ProfilesIni();
				if(ExcelLibrary.getExcelData(path+"\\config\\config.xls", "config", 1, 0).equals("Local"))
				{
					if(ExcelLibrary.getExcelData(path+"\\config\\config.xls", "Local", 1, 0).equals("Firefox"))
							//driver = new FirefoxDriver(ini.getProfile("Selenium"));
							wdriver = new FirefoxDriver();					
					else if(ExcelLibrary.getExcelData(path+"\\config\\config.xls", "Local", 1, 0).equals("Chrome")){
							System.setProperty("webdriver.chrome.driver", "browser_driver/chromedriver.exe");
							//driver = new ChromeDriver((Capabilities) ini.getProfile("Selenium"));
							wdriver = new ChromeDriver();
					}
					else if(ExcelLibrary.getExcelData(path+"\\config\\config.xls", "Local", 1, 0).equals("IE")){
						System.setProperty("webdriver.ie.driver", "browser_driver/IEDriverServer.exe");
						//driver = new ChromeDriver((Capabilities) ini.getProfile("Selenium"));
						wdriver = new InternetExplorerDriver();
					}
					else
						wdriver = new InternetExplorerDriver((Capabilities) ini.getProfile("Selenium"));
				} 
				else if(ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "config", 1, 0).equals("Sauce"))
				{
					DesiredCapabilities capabilities = new DesiredCapabilities();
			        capabilities.setBrowserName(ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Sauce", 1, 0));			     
			        capabilities.setCapability("name", ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Sauce", 1, 2));
			        capabilities.setCapability("platform", ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Sauce", 1, 3));				 
					wdriver=new RemoteWebDriver(new URL(ExcelLibrary.getExcelData(path+"\\config\\config.xlsx", "Sauce", 1, 4)), capabilities);
				}  
			        getBrowserOsInfo(wdriver);
			        driver = new EventFiringWebDriver(wdriver);
			        MyEventListener m = new MyEventListener();
			        driver.register(m);
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.get(ExcelLibrary.getExcelData(path+"\\config\\config.xls", "config", 1, 1));
					Log.startTestCase(this.getClass().getSimpleName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.err.println("--------------------------------------------------------------------------------------------------");
			System.err.println("Please Check The Configuration Excel file under config folder and make sure to fill all the fields");
			System.err.println("--------------------------------------------------------------------------------------------------");
			System.exit(0);
		}
	}
	@AfterClass
	public void quit(){
//		Log.endTestCase(this.getClass().getSimpleName());
		driver.quit();
	}
	
	
}
