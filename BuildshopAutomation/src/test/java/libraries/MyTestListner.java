package libraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;



public class MyTestListner extends TestListenerAdapter {	

	public void onTestFailure(ITestResult result)
    {
		Object currentClass = result.getInstance();
		String fileName = BackUp.path+"/screenshots/"+((BaseClass) currentClass).getClassName()+".jpg";
	    WebDriver webDriver = ((BaseClass) currentClass).getDriver();
//		Log.info("Failure --- Capturing screenshot");	
		
		if (webDriver != null)
        {
            File f = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            try {
            	FileUtils.copyFile(f, new File(fileName));
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }	
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Skipped");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Pass");
	}
}