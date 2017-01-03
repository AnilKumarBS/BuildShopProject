package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancialBudgetExpensesPage 
{
public WebDriver driver;
    
    public FinancialBudgetExpensesPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[@class='btnProjetstxt']")
    public WebElement projects;  
    
    @FindBy(xpath="//a[@id='ctl00_GridViewNavigation_ctl14_btnProjectID']")
    public WebElement sprojects;  
    
    @FindBy(xpath="//a[text()='Budget/Expenses']")
    public WebElement budgetexpenses; 
        
    @FindBy(xpath="//a[text()='Add Business Category']")
    public WebElement addbusinesscategory;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_AccordionPane1_content_AccountIDTextBox']")
    public WebElement businesscategory;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_AccordionPane1_content_InsertButton']")
    public WebElement save;  
    
    @FindBy(xpath="//a[text()='Business Categories ']")
    public WebElement businesscategories;  
    
    @FindBy(xpath="//a[contains(text(),'Car')]")
    public WebElement car;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEstIns_DateTextBox']")
    public WebElement additem;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEstIns_ItemTextBox']")
    public WebElement addadescription;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEstIns_TotalTextBox']")
    public WebElement budget;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEstIns_InsertButton']")
    public WebElement plusbutton;  
  
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEstIns_SaveButton']")
    public WebElement save1;  
    
    /*@FindBy(xpath="//span[contains(text(),'Volkswagen')]/../..//td[4]")
    public WebElement volkswagendelete;  
    
    @FindBy(xpath="//a[contains(text(),'Car')]/../..//div")
    public WebElement cardelete;  
              
    @FindBy(xpath="//a[text()='Business Categories ']")
    public WebElement businesscategory1;   */
    
    /*@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
    public WebElement search;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
    public WebElement searchbutton;*/
    
    public void FinancialBudgetExpensesPageMethod() throws InterruptedException
    {
    	budgetexpenses.click();
    	Thread.sleep(2000);  
    	
    	Actions act=new Actions(driver);
    	act.moveToElement(projects).perform();
    	
    	Actions act1=new Actions(driver);
    	act1.moveToElement(sprojects).click().perform();
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,400)");			
    	Thread.sleep(2000);
    	
    	addbusinesscategory.click();
    	Thread.sleep(2000);
    	
    	businesscategory.sendKeys("Car");
    	Thread.sleep(2000);
    	
    	save.click();
    	Thread.sleep(2000);
    	
    	businesscategories.click();
    	Thread.sleep(2000);
    	
    	car.click();
    	Thread.sleep(2000);
    	
    	additem.sendKeys("5");
    	Thread.sleep(2000);
    	
    	addadescription.sendKeys("Volkswagen");
    	Thread.sleep(2000);
    	
    	budget.click();
    	budget.sendKeys("600000");
    	Thread.sleep(2000);
    	
    	plusbutton.click();
    	Thread.sleep(2000);
    	
    	save1.click();
    	Thread.sleep(2000); 
    	
    	/*volkswagendelete.click();
    	Thread.sleep(2000); 
    	    	    	
    	try
	    {
	    	Alert alt=driver.switchTo().alert();
	    	alt.accept();
	    }
	   catch(Exception e)
	    {
	    	
	    }
    	
    	cardelete.click();
    	Thread.sleep(2000); 
           	   	
    	try
	    {
	    	Alert alt=driver.switchTo().alert();
	    	alt.accept();
	    }
	   catch(Exception e)
	    {
	    	
	    }
    	
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,-600)");			
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js2=(JavascriptExecutor)driver;
    	js2.executeScript("window.scrollBy(0,-600)");			
    	Thread.sleep(2000);
    	
    	businesscategory1.click();
    	Thread.sleep(2000);  */      	
    	
    	/*additem.sendKeys("5");
    	Thread.sleep(2000);
    	
    	addadescription.sendKeys("Nissan");
    	Thread.sleep(2000);
    	
    	budget.click();
    	budget.sendKeys("600000");
    	Thread.sleep(2000);
    	
    	plusbutton.click();
    	Thread.sleep(2000);
    	
    	save1.click();
    	Thread.sleep(2000);  
    	
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,-400)");			
    	Thread.sleep(2000);
    	
    	search.sendKeys("Nissan");
    	Thread.sleep(2000);	
    	
    	searchbutton.click();
    	Thread.sleep(2000);	*/
    }
}