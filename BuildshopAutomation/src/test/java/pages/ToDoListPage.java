package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ToDoListPage
{
public WebDriver driver;
    
    public ToDoListPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        
    }
    @FindBy(xpath="//a[text()='To Do List']")
    public WebElement todolist;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
    public WebElement additem;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewInsert_ddlSchedule']")
    public WebElement scheduledtask;
    
    @FindBy(xpath="//select[@name='ctl00$MainContent$FormViewInsert$ddlUser']")
    public WebElement assignedto;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInsert_DateTextBox']")
    public WebElement date;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewInsert_CalendarExtender1_day_1_1']")
    public WebElement date1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInsert_TaskTextBox']")
    public WebElement task;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewInsert_ddlStatus']")
    public WebElement status;
    
    @FindBy(xpath="//option[@value='Active']")
    public WebElement active;
    
    @FindBy(xpath="//textarea[@class='txtbhw six-hundred h100']")
    public WebElement location;
    
    @FindBy(xpath="//input[@value='Save']")
    public WebElement save;
        
    @FindBy(xpath="//input[@value='Done']")
    public WebElement done;  
    
    /*@FindBy(xpath="//span[contains(text(),'task1')]/../..//td[1]//img")
    public WebElement editicon;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_GridView1_ctl02_btnViewDetailsProjectPlanStep']")
    public WebElement editlink; 
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_Tabs_PanelDetails_FormViewEdit_DetailsTextBox']")
    public WebElement editicon1; 
    
    @FindBy(xpath="//input[@value='Save']")
    public WebElement save1;
    
    @FindBy(xpath="//input[@value='Done']")
    public WebElement done1; 
    
    @FindBy(xpath="//span[contains(text(),'task1')]/../..//td[1]//img")
    public WebElement editicon2;  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_GridView1_ctl02_LinkButton2']")
    public WebElement deletelink;*/
  
    
    /*@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
    public WebElement search;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
    public WebElement searchbutton;
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$FormView1$ItemTextBox']")
    public WebElement addatask;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_DateTextBox']")
    public WebElement taskdueon;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormView1_CalendarExtender_day_4_4']")
    public WebElement taskdueon1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_InsertButton']")
    public WebElement plusbutton;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
    public WebElement search1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
    public WebElement searchbutton1;*/
  
    public void ToDoListMethod() throws InterruptedException
    {
    	todolist.click();
    	
    	additem.click();
    	
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,100)");			
    	Thread.sleep(2000);
    	
    	
    	Select select=new Select(scheduledtask);
    	select.selectByVisibleText("Doors Type");				
    	Thread.sleep(2000); 
    	
    	
    	Select select1=new Select(assignedto);
    	select1.selectByVisibleText("Sam Bruce - Sam");				
    	Thread.sleep(2000); 
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,400)");			
    	Thread.sleep(2000);
    	
    	date.click();
    	Thread.sleep(2000); 
    	
    	date1.click();
    	Thread.sleep(2000); 
    	
    	task.sendKeys("task1");
    	Thread.sleep(2000);

    	status.click();
    	Thread.sleep(2000);
    	
    	active.click();
    	Thread.sleep(2000);
    	
    	location.sendKeys("Bangalore");
    	Thread.sleep(2000);
    	
    	save.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js2=(JavascriptExecutor)driver;
    	js2.executeScript("window.scrollBy(0,-400)");			
    	Thread.sleep(2000);
    	
    	done.click();
    	Thread.sleep(2000);
    	
    	/*Actions act1=new Actions(driver);
    	act1.moveToElement(editicon).click().perform();
    	
    	editlink.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js3=(JavascriptExecutor)driver;
    	js3.executeScript("window.scrollBy(0,400)");			
    	Thread.sleep(2000);
    	    	
    	editicon1.clear();
    	editicon1.sendKeys("Pune");
    	Thread.sleep(2000);
    	
		save1.click();
		Thread.sleep(2000);	
    	
    	JavascriptExecutor js4=(JavascriptExecutor)driver;
    	js4.executeScript("window.scrollBy(0,-400)");			
    	Thread.sleep(2000);
    	
    	done1.click();
		Thread.sleep(2000);	
		
		editicon2.click();
		Thread.sleep(2000);	
    	
    	deletelink.click();
    	Thread.sleep(2000);
    	
    	try
	    {
	    	Alert alt=driver.switchTo().alert();
	    	alt.accept();
	    }
	   catch(Exception e)
	    {
	    	
	    }*/
    	
    	/*search.sendKeys("task1");
    	Thread.sleep(2000);
    	
    	searchbutton.click();
    	Thread.sleep(2000);
    	
    	addatask.sendKeys("task2");
    	Thread.sleep(2000);
    	
    	taskdueon.click();
    	Thread.sleep(2000);
    	
    	taskdueon1.click();
    	Thread.sleep(2000);
    	
    	plusbutton.click();
    	Thread.sleep(2000);
    	
    	search.clear();
    	
    	search1.sendKeys("task2");
    	Thread.sleep(2000);
    	
    	searchbutton1.click();
    	Thread.sleep(2000); 	*/
   }
}    