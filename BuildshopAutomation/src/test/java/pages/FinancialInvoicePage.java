package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import libraries.ExcelLibrary;

public class FinancialInvoicePage 
{
public WebDriver driver;
    
    public FinancialInvoicePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[@class='btnProjetstxt']")
    public WebElement projects;  
    
    @FindBy(xpath="//a[@id='ctl00_GridViewNavigation_ctl15_btnProjectID']")
    public WebElement sprojects;  
    
    /*@FindBy(xpath="//table[@id='ctl00_GridViewNavigation']//a[contains(text(),'S-Project')]")
    public WebElement sprojects;  */
    
    @FindBy(xpath="//a[text()='Invoices']")
    public WebElement invoices;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnAddInvoice']")
    public WebElement addinvoice;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_ItemTextBox']")
    public WebElement invoicetitle;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_DateTextBox']")
    public WebElement invoicedate;  
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormView1_CalendarExtender_day_1_1']")
    public WebElement invoicedate1;  
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormView1_ddlVendor']")
    public WebElement selectacustomer;  
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormView1_ddlProject']")
    public WebElement selectaproject;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_InsertButton']")
    public WebElement save; 
    
    @FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
    public WebElement close;   
    
    /*@FindBy(xpath="//span[contains(text(),'John cena')]/../../..//input")
    public WebElement checkbox; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
    public WebElement delete; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
    public WebElement delete1; */
         
    /*@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
    public WebElement search; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
    public WebElement searchbutton;  */ 
  
    public void FinancialInvoicePageMethod() throws InterruptedException
    {
    	
    	Actions act=new Actions(driver);
    	act.moveToElement(projects).perform();
    	
    	Actions act1=new Actions(driver);
    	act1.moveToElement(sprojects).click().perform();
    	
    	invoices.click();
    	Thread.sleep(2000);     	
    	
    	addinvoice.click();
    	Thread.sleep(2000); 
    	
//    	invoicetitle.sendKeys("Invoice1");
//    	Thread.sleep(2000); 
    	
    	String invoicetitl = ExcelLibrary.getExcelData("datafile.xls","Financial",4,0);
        invoicetitle.sendKeys(invoicetitl);
    	
    	invoicedate.click();
    	Thread.sleep(2000); 
    	
    	invoicedate1.click();
    	Thread.sleep(2000);
    	
    	Select select=new Select(selectacustomer);
    	select.selectByVisibleText("John cena");				
    	Thread.sleep(2000); 
    	
    	Select select1=new Select(selectaproject);
    	select1.selectByVisibleText("S-Project");				
    	Thread.sleep(2000); 
    	
    	save.click();
    	Thread.sleep(2000);
    	
    	close.click();
    	Thread.sleep(2000);
    	
    	/*addinvoice.click();
    	Thread.sleep(2000); 
    	
    	invoicetitle.sendKeys("Invoice2");
    	Thread.sleep(2000); 
    	
    	invoicedate.click();
    	Thread.sleep(2000); 
    	
    	invoicedate1.click();
    	Thread.sleep(2000);
    	
    	
    	Select select2=new Select(selectacustomer);
    	select2.selectByVisibleText("Miranda");				
    	Thread.sleep(2000); 
    	
    	
    	Select select3=new Select(selectaproject);
    	select3.selectByVisibleText("S-Project");				
    	Thread.sleep(2000); 
    	
    	save.click();
    	Thread.sleep(2000); 
    	
    	close.click();
    	Thread.sleep(2000);*/
    	
    	/*checkbox.click();
    	Thread.sleep(2000);
    	
    	delete.click();
    	Thread.sleep(2000);
    	
    	delete1.click();
    	Thread.sleep(2000);
    	
    	
    	try
	    {
	    	Alert alt=driver.switchTo().alert();
	    	alt.accept();
	    }
	   catch(Exception e)
	    {
	    	
	    }*/
    	   	
    	/*search.sendKeys("Invoice2");
    	Thread.sleep(2000); 
    	
    	searchbutton.click();
    	Thread.sleep(2000); */
    }
}
    	
    	
    	