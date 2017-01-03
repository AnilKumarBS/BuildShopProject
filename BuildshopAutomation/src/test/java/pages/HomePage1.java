package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 
{
public WebDriver driver;
    
    public HomePage1(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[text()='Financial']")
    public WebElement financial;    
     
    public void HomePage1Method() throws InterruptedException
    {
    	financial.click();
    	Thread.sleep(2000);
    }
}