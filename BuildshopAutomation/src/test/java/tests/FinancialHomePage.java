package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancialHomePage 
{
public WebDriver driver;
    
    public FinancialHomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[text()='Financial']")
    public WebElement financial;    
     
    public void FinancialHomePageMethod() throws InterruptedException
    {
    	financial.click();
    	Thread.sleep(2000);
    }
}