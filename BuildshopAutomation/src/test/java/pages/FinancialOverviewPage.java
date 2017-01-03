package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancialOverviewPage 
{
public WebDriver driver;
    
    public FinancialOverviewPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[text()='Overview']")
    public WebElement overview;  
    
    public void FinancialOverviewPageMethod() throws InterruptedException
    {
    	overview.click();
    	Thread.sleep(2000); 
    }
}