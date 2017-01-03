package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
public WebDriver driver;
    
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[text()='Manage']")
    public WebElement manage;    
     
    public void HomePageMethod() throws InterruptedException
    {
    	manage.click();
    	Thread.sleep(5000);
    }
}