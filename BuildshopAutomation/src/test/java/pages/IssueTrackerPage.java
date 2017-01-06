package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IssueTrackerPage
{
public WebDriver driver;
    
    public IssueTrackerPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[@class='btnProjetstxt']")
    public WebElement projects;  
    
    @FindBy(xpath="//a[@id='ctl00_GridViewNavigation_ctl14_btnProjectID']")
    public WebElement sprojects;  
    
    @FindBy(xpath="//a[text()='Issue Tracker']")
    public WebElement issuetracker;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
    public WebElement addissue;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueTrackerInsert_NameTextBox']")
    public WebElement issuename;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueTrackerInsert_DateOpenedTextBox']")
    public WebElement dateopened;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewIssueTrackerInsert_CalExtDateOpenedTextBox_day_3_4']")
    public WebElement dateopened1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueTrackerInsert_DateClosedTextBox']")
    public WebElement dateclosed;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewIssueTrackerInsert_CalExtDateClosedTextBox_day_4_3']")
    public WebElement dateclosed1;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewIssueTrackerInsert_ddlOwner']")
    public WebElement owneroftheissue;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewIssueTrackerInsert_ddlAssignedTo']")
    public WebElement issueassignedto;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewIssueTrackerInsert_DropDownList2']")
    public WebElement status;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewIssueTrackerInsert_DropDownList1']")
    public WebElement priority;
  
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewIssueTrackerInsert_DropDownList4']")
    public WebElement sharewithcustomer;
    
    @FindBy(xpath="//textarea[@name='ctl00$MainContent$FormViewIssueTrackerInsert$DetailsTextBox']")
    public WebElement issuedetails;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueTrackerInsert_InsertButton']")
    public WebElement save;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
    public WebElement done;
    
    @FindBy(xpath="//span[contains(text(),'Issue1')]/../..//td[1]//img")
    public WebElement editicon;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_GridView1_ctl02_btnViewDetailsProjectPlanStep']")
    public WebElement editlink;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_Tabs_PanelDetails_FormViewIssueEdit_DropDownList1']")
    public WebElement priority1;
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_Tabs_PanelDetails_FormViewIssueEdit_DetailsTextBox']")
    public WebElement issuedetails1;
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$Tabs$PanelDetails$FormViewIssueEdit$UpdateButton']")
    public WebElement save1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
    public WebElement done1;
      
    @FindBy(xpath="//span[@id='ctl00_MainContent_GridView1_ctl02_DescriptionLabel']")
    public WebElement issue1;
    
    @FindBy(xpath="//img[@id='ctl00_MainContent_GridView1_ctl02_imgEdit']")
    public WebElement editicon1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_GridView1_ctl02_LinkButton2']")
    public WebElement deletelink;
  
        
    /*@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
    public WebElement search;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
    public WebElement searchbutton;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueIns_ItemTextBox']")
    public WebElement addanitem; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueIns_DateTextBox']")
    public WebElement startdate; 
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewIssueIns_CalendarExtender_day_3_3']")
    public WebElement startdate1; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueIns_InsertButton']")
    public WebElement plusbutton;  */           
   
    public void IssueTrackerMethod() throws InterruptedException
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(projects).perform();
    	
    	Actions act1=new Actions(driver);
    	act1.moveToElement(sprojects).click().perform();
    	
    	issuetracker.click();
    	Thread.sleep(2000);
    	
    	addissue.click();
    	Thread.sleep(2000);
    	
    	issuename.sendKeys("Issue1");
    	Thread.sleep(2000);
    	
    	dateopened.click();
    	Thread.sleep(2000);
    	
    	dateopened1.click();
    	Thread.sleep(2000);
    	
    	dateclosed.click();
    	Thread.sleep(2000);
    	
    	dateclosed1.click();
    	Thread.sleep(2000);
    	
    	
    	Select select=new Select(owneroftheissue);
    	select.selectByVisibleText("Sam Bruce - Sam");				
    	Thread.sleep(2000); 
    	
    	
    	Select select1=new Select(issueassignedto);
    	select1.selectByVisibleText("Miranda Jacob - Miranda");				
    	Thread.sleep(2000); 
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,300)");			
    	Thread.sleep(2000);
    	
    	Select select2=new Select(status);
    	select2.selectByVisibleText("Active");				
    	Thread.sleep(2000); 
    	
    	
    	Select select3=new Select(priority);
    	select3.selectByVisibleText("Medium");				
    	Thread.sleep(2000);
    	
    	
    	Select select4=new Select(sharewithcustomer);
    	select4.selectByVisibleText("No");				
    	Thread.sleep(2000);
    	
    	issuedetails.sendKeys("Issue found is a medium priority");
    	Thread.sleep(2000);
    	
    	save.click();
    	Thread.sleep(2000);
    	
    	done.click();
    	Thread.sleep(2000);
    	
    	Actions act2=new Actions(driver);
    	act2.moveToElement(editicon).click().perform();
    	
    	editlink.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,400)");			
    	Thread.sleep(2000);
    	
    	Select select5=new Select(priority1);
    	select5.selectByVisibleText("High");	
    	Thread.sleep(2000);
    	
    	issuedetails1.clear();
    	issuedetails1.sendKeys("Issue found is a high priority");
    	Thread.sleep(2000);
    	
    	save1.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js2=(JavascriptExecutor)driver;
    	js2.executeScript("window.scrollBy(0,-400)");			
    	Thread.sleep(2000);
    	
    	done1.click();
    	Thread.sleep(2000);
    	
    	issue1.click();
    	Thread.sleep(2000);
    	
    	editicon1.click();
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
	    	
	    }
    	
    	
    	/*addissue.click();
    	Thread.sleep(2000);
    	
    	issuename.sendKeys("Issue2");
    	Thread.sleep(2000);
    	
    	dateopened.click();
    	Thread.sleep(2000);
    	
    	dateopened1.click();
    	Thread.sleep(2000);
    	
    	dateclosed.click();
    	Thread.sleep(2000);
    	
    	dateclosed1.click();
    	Thread.sleep(2000);
    	
    	owneroftheissue.click();
    	Select select5=new Select(owneroftheissue);
    	select5.selectByVisibleText("Zee - Bill Thomas");				
    	Thread.sleep(2000); 
    	
    	issueassignedto.click();
    	Select select6=new Select(issueassignedto);
    	select6.selectByVisibleText("Sam Bruce - Sambruce");				
    	Thread.sleep(2000); 
    	
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,300)");			
    	Thread.sleep(2000);
    	
    	status.click();
    	Select select7=new Select(status);
    	select7.selectByVisibleText("Active");				
    	Thread.sleep(2000); 
    	
    	priority.click();
    	Select select8=new Select(priority);
    	select8.selectByVisibleText("Low");				
    	Thread.sleep(2000);
    	
    	sharewithcustomer.click();
    	Select select9=new Select(sharewithcustomer);
    	select9.selectByVisibleText("No");				
    	Thread.sleep(2000);
    	
    	issuedetails.sendKeys("Issue found is a low priority");
    	Thread.sleep(2000);
    	
    	save.click();
    	Thread.sleep(2000);
    	
    	done.click();
    	Thread.sleep(2000);	*/
    	
    	/*search.sendKeys("Issue2");
    	Thread.sleep(2000);	
    	
    	searchbutton.click();
    	Thread.sleep(2000);	
    	
    	addanitem.sendKeys("Issue3");
    	Thread.sleep(2000);	
    	
    	startdate.click();
    	Thread.sleep(2000);	
    	
    	startdate1.click();
    	Thread.sleep(2000);	
    	
    	plusbutton.click();
    	Thread.sleep(2000);	
    	
    	search.clear();
    	search.sendKeys("Issue3");
    	Thread.sleep(2000);	
    	search.clear();*/
    }
}