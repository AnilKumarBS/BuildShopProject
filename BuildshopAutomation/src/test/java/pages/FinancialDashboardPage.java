package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancialDashboardPage 
{
public WebDriver driver;
    
    public FinancialDashboardPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[text()='Dashboard']")
    public WebElement dashboard;  
    
    @FindBy(xpath="//div[@class='btnProjetstxt']")
    public WebElement projects;  
    
    @FindBy(xpath="//a[@id='ctl00_GridViewNavigation_ctl14_btnProjectID']")
    public WebElement sprojects;  
     
    public void FinancialDashboardPageMethod() throws InterruptedException
    {
    	dashboard.click();
    	Thread.sleep(2000); 
    	
    	Actions act=new Actions(driver);
    	act.moveToElement(projects).perform();
    	
    	Actions act1=new Actions(driver);
    	act1.moveToElement(sprojects).click().perform(); 	
    }
}