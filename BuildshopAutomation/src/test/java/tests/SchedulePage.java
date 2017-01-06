package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchedulePage
{
public WebDriver driver;
    
    public SchedulePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[text()='Schedule']")
    public WebElement schedule;    
     
    public void ScheduleMethod() throws InterruptedException
    {
    	schedule.click();
    	Thread.sleep(5000);
    }
}