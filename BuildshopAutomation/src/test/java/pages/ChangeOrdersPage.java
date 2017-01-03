package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChangeOrdersPage
{
public WebDriver driver;
    
    public ChangeOrdersPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[text()='Change Orders']")
    public WebElement changeorders;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_CODescriptionTextBox']")
    public WebElement addadescription;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_DateTextBox']")
    public WebElement addadate;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_CalExtDate_day_1_1']")
    public WebElement addadate1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_InsertButton']")
    public WebElement plusbutton;
    
    /*@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
    public WebElement search;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
    public WebElement searchbutton;*/
    
    @FindBy(xpath="//span[@id='ctl00_MainContent_GridView1_ctl02_lblDescription']")
    public WebElement changeorders1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_ShareWithCustomer']")
    public WebElement sharewithcustomer;
  
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_IsSchedule']")
    public WebElement addtoschedule;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_IsEstimate']")
    public WebElement approved;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewChangeOrderEdit_ddlChoStatus']")
    public WebElement status;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewChangeOrderEdit_ddlType']")
    public WebElement type;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_txtCurrentCompletionDate']")
    public WebElement currentcompletiondate;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_ChoIncreasedDaysTextBox']")
    public WebElement increaseddays;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_ChoNewCompletionDateTextBox']")
    public WebElement newcompletiondate;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewChangeOrderEdit_CalendarExtender5_day_2_2']")
    public WebElement newcompletiondate1;
    
  
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_imgButtonAdd']")
    public WebElement additem;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_OrderNumberTextBox']")
    public WebElement order;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_DescriptionTextBox']")
    public WebElement desp;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewChangeOrderEdit_Unit']")
    public WebElement unit;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_QuantityTextBox']")
    public WebElement qty;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_LaborTextBox']")
    public WebElement labor;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_MaterialTextBox']")
    public WebElement material;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_EquipmentTextBox']")
    public WebElement equipment;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_OPTextBox']")
    public WebElement op;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_InsertButton']")
    public WebElement save1;
    
    @FindBy(xpath="//a[@id='ctl00_MainContent_FormViewChangeOrderEdit_LinkButton1']")
    public WebElement close;            
           
    @FindBy(xpath="//textarea[@name='ctl00$MainContent$FormViewChangeOrderEdit$ChoDescriptionTextBox']")
    public WebElement description;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_IsScope']")
    public WebElement addtoscope;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_IsSharewithSubs']")
    public WebElement sharewithsubs;
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewChangeOrderEdit_txtScopeofWork']")
    public WebElement scope;
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewChangeOrderEdit_txtExclusions']")
    public WebElement exclusions;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewChangeOrderEdit_UpdateButton']")
    public WebElement save;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
    public WebElement done;                    
   
    public void ChangeOrdersMethod() throws InterruptedException
    {
    	changeorders.click();
    	Thread.sleep(2000);
    	
    	addadescription.sendKeys("Change Order 4");
    	Thread.sleep(2000);
    	
    	addadate.click();
    	Thread.sleep(2000);
    	
    	addadate1.click();
    	Thread.sleep(2000);
    	
    	plusbutton.click();
    	Thread.sleep(2000);
    	
    	/*search.sendKeys("Change Order 3");
    	Thread.sleep(2000);
    	
    	searchbutton.click();
    	Thread.sleep(2000);*/
    	
    	changeorders1.click();
    	Thread.sleep(2000);
    	
    	sharewithcustomer.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,200)");			
    	Thread.sleep(2000);
    	
    	addtoschedule.click();
    	Thread.sleep(2000);
    	
    	approved.click();
    	Thread.sleep(2000);
    	
    	
    	Select select=new Select(status);
    	select.selectByVisibleText("In Progress");				
    	Thread.sleep(2000); 
    	
    	
    	Select select1=new Select(type);
    	select1.selectByVisibleText("Architect");				
    	Thread.sleep(2000); 
    	
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,300)");			
    	Thread.sleep(2000);
    	
    	currentcompletiondate.clear();
    	currentcompletiondate.sendKeys("01/09/2017");
    	Thread.sleep(2000); 
    	
    	increaseddays.sendKeys("1");
    	Thread.sleep(2000); 
    	
    	newcompletiondate.click();
    	Thread.sleep(2000);
    	    	
    	newcompletiondate1.click();
    	Thread.sleep(2000); 
    	
    	JavascriptExecutor js3=(JavascriptExecutor)driver;
    	js3.executeScript("window.scrollBy(0,100)");			
    	Thread.sleep(2000);    	   	    	 		
    	 
    	additem.click();
    	Thread.sleep(2000); 
    	
    	order.clear();
    	order.sendKeys("1");
    	Thread.sleep(2000); 
    	
    	desp.sendKeys("order");
    	Thread.sleep(2000); 
    	
    	Select select3=new Select(unit);
    	select3.selectByVisibleText("Acre");				
    	Thread.sleep(2000);
    	
    	qty.clear();
    	qty.sendKeys("3");
    	Thread.sleep(2000);
    	
    	labor.clear();
    	labor.sendKeys("10000");
    	Thread.sleep(2000);
    	
    	material.clear();
    	material.sendKeys("5000");
    	Thread.sleep(2000);
    	
    	equipment.clear();
    	equipment.sendKeys("5000");
    	Thread.sleep(2000);
    	
    	op.clear();
    	op.sendKeys("2000");
    	Thread.sleep(2000);
    	
    	save1.click();
    	Thread.sleep(2000);
    	
    	close.click();
    	Thread.sleep(2000);
    	
    	
    	
    	
    	
    	
    	JavascriptExecutor js2=(JavascriptExecutor)driver;
    	js2.executeScript("window.scrollBy(0,600)");			
    	Thread.sleep(2000);
    	
    	description.sendKeys("Delayed by a day");
    	Thread.sleep(2000);
    	
    	addtoscope.click();
    	Thread.sleep(2000);
    	
    	sharewithsubs.click();
    	Thread.sleep(2000);
    	
    	scope.sendKeys("Scope");
    	Thread.sleep(2000);
    	
    	exclusions.sendKeys("Nope");
    	Thread.sleep(2000);
    	
    	save.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js4=(JavascriptExecutor)driver;
    	js4.executeScript("window.scrollBy(0,-600)");			
    	Thread.sleep(2000);
    	
    	done.click();
    	Thread.sleep(2000);       	    	   	  	
    }
}