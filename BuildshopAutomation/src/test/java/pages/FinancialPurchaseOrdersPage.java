package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import libraries.ExcelLibrary;

public class FinancialPurchaseOrdersPage 
{
public WebDriver driver;
    
    public FinancialPurchaseOrdersPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[@class='btnProjetstxt']")
    public WebElement projects;  
    
    @FindBy(xpath="//table[@id='ctl00_GridViewNavigation']//a[contains(text(),'S-Project')]")
    public WebElement sproject; 
    
    @FindBy(xpath="//a[text()='Purchase Orders']")
    public WebElement purchaseorders;  
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$FormView1$ItemTextBox']")
    public WebElement createapurchaseorder; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_DateTextBox']")
    public WebElement pleaseaddadate; 
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormView1_CalendarExtender_day_1_1']")
    public WebElement pleaseaddadate1; 
    
    @FindBy(xpath="//select[@name='ctl00$MainContent$FormView1$ddlVendor']")
    public WebElement selectavendor; 
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormView1_ddlProject']")
    public WebElement selectaproject;     
     
    @FindBy(xpath="//input[@text='Insert']")
    public WebElement plusbutton;  
    
    /*@FindBy(xpath="//span[contains(text(),'Purchase Order 1')]/../../..//input")
    public WebElement checkbox; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
    public WebElement delete; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
    public WebElement delete1; */
      
    public void FinancialPurchaseOrdersPageMethod() throws InterruptedException
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(projects).perform();
    	
    	Actions act1=new Actions(driver);
    	act1.moveToElement(sproject).click().perform();
    	
    	purchaseorders.click();
    	Thread.sleep(2000); 
    	
//    	createapurchaseorder.sendKeys("Purchase Order 1");
//    	Thread.sleep(2000); 
    	
    	String createapurchaseordr = ExcelLibrary.getExcelData("datafile.xls","Financial",7,0);
    	createapurchaseorder.sendKeys(createapurchaseordr);
    	
    	pleaseaddadate.click();
    	Thread.sleep(2000); 
    	
    	pleaseaddadate1.click();
    	Thread.sleep(2000); 
    	
    	Select select=new Select(selectavendor);
    	select.selectByVisibleText("Sunny");				
    	Thread.sleep(2000); 
    	    	
    	Select select1=new Select(selectaproject);
    	select1.selectByVisibleText("S-Project");				
    	Thread.sleep(2000); 
    	
    	plusbutton.click();
    	Thread.sleep(2000); 
    	
    	/*checkbox.click();
    	Thread.sleep(2000);
    	
    	delete.click();
    	Thread.sleep(2000);
    	
    	delete1.click();
    	Thread.sleep(2000);*/
    	
    	
    }
}