package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SchedulePage1
{
public WebDriver driver;
    
    public SchedulePage1(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    /*@FindBy(xpath="//div[@class='btnProjetstxt']")
    public WebElement projects;  
    
    @FindBy(xpath="//a[@id='ctl00_GridViewNavigation_ctl14_btnProjectID']")
    public WebElement sprojects;*/  
    
    @FindBy(xpath="//a[text()='Schedule']")
    public WebElement schedule;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
    public WebElement addtask; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProjectPlanInsert_TextBox1']")
    public WebElement itemnum; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProjectPlanInsert_txtDescription']")
    public WebElement desc; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProjectPlanInsert_IsEstimate']")
    public WebElement addtoestimate; 
    
    @FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_ddlDivision")
    public WebElement division;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProjectPlanInsert_ddlType']")
    public WebElement type;
    
    @FindBy(xpath="//select[@name='ctl00$MainContent$FormViewProjectPlanInsert$ddlStatus']")
    public WebElement status; 
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$FormViewProjectPlanInsert$ProjectPlanStartTextBox']")
    public WebElement start; 
    
    @FindBy(xpath="//div[text()='12']")
    public WebElement startdate; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProjectPlanInsert_ProjectPlanFinishTextBox']")
    public WebElement finish; 
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewProjectPlanInsert_CalendarExtender1_day_4_4']")
    public WebElement finishdate; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProjectPlanInsert_ProjectPlanPercentCompleteTextBox']")
    public WebElement percentcomplete; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProjectPlanInsert_IsScope']")
    public WebElement addtoscope; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProjectPlanInsert_IsSharewithSubs']")
    public WebElement sharewithsubs; 
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewProjectPlanInsert_txtScopeofWork']")
    public WebElement scope; 
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewProjectPlanInsert_txtExclusions']")
    public WebElement exclusions; 
    
    @FindBy(xpath="//input[@value='Save']")
    public WebElement save; 
    
    @FindBy(xpath="//input[@value='Done']")
    public WebElement done; 
    
    /*@FindBy(xpath="//input[@name='ctl00$MainContent$txtFilter']")
    public WebElement search; 
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$btnSearch']")
    public WebElement searchbutton; */
    
    @FindBy(xpath="//span[@id='ctl00_MainContent_GridView1_ctl02_DescriptionLabel']")
    public WebElement doorstype; 
    
    @FindBy(xpath="//span[contains(text(),'Doors Type 2')]/../..//td[1]//img  ")
    public WebElement editicon; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_GridView1_ctl02_btnViewDetailsProjectPlanStep']")
    public WebElement editlink; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_Tabs_PanelDetails_FormViewProjectPlanEdit_ProjectPlanInspectedDateTextBox']")
    public WebElement inspecteddate; 
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_Tabs_PanelDetails_FormViewProjectPlanEdit_CalendarExtender2_day_4_3']")
    public WebElement inspecteddate1; 
    
    @FindBy(xpath="//input[@value='Save']")
    public WebElement save1; 
    
    @FindBy(xpath="//input[@value='Done']")
    public WebElement done1; 
    
    @FindBy(xpath="//img[@id='ctl00_MainContent_GridView1_ctl02_imgEdit']")
    public WebElement editicon1; 
          
    @FindBy(xpath="//input[@id='ctl00_MainContent_GridView1_ctl02_LinkButton2']")
    public WebElement deletelink; 
    
    
    
    
  
    
    
																						    //@FindBy(xpath="//input[@id='ctl00_MainContent_btnSchedule']")
																						    //public WebElement views; 
																						    
																						    //@FindBy(xpath="//div[@class='HyperLinkButtonsSch']")
																						    //public WebElement multiview; 
																						    
																						    //@FindBy(xpath="//input[@id='ctl00_MainContent_btnSchedule']")
																						    //public WebElement views1; 
																						    
																						    //@FindBy(xpath="//div[@class='HyperLinkButtonsSch2']")
																						    //public WebElement gantt; 
    
    /*@FindBy(xpath="//input[@name='ctl00$MainContent$FormViewSchIns$ItemTextBox']")
    public WebElement addatask; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSchIns_DateTextBox']")
    public WebElement startdate1; 
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewSchIns_CalExtDate_day_1_2']")
    public WebElement startdate11; 
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSchIns_FinishDateTextBox']")
    public WebElement finishdate1; 
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewSchIns_CalendarExtenderFinishDate_day_4_5']")
    public WebElement finishdate11;   
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSchIns_InsertButton']")
    public WebElement plusbutton;  
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$txtFilter']")
    public WebElement search1; 
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$btnSearch']")
    public WebElement searchbutton1; */
                 
    public void SchedulePage1Method() throws InterruptedException
    {
    	
    	/*Actions act=new Actions(driver);
    	act.moveToElement(projects).perform();
    	
    	Actions act1=new Actions(driver);
    	act1.moveToElement(sprojects).click().perform();*/
    	
    	schedule.click();
    	Thread.sleep(2000);   
    	
    	addtask.click();
    	Thread.sleep(2000);   
    	
    	itemnum.sendKeys("001");
    	Thread.sleep(2000);   
    	
    	desc.sendKeys("Doors Type");
    	Thread.sleep(2000);   
    	
    	addtoestimate.click();
    	Thread.sleep(2000);   
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,400)");			
    	Thread.sleep(2000);
    	
    	
    	Select select=new Select(division);
    	select.selectByValue("General");				
    	Thread.sleep(2000);   
    	
    	
    	Select select1=new Select(type);
		select1.selectByValue("Asphalt Contractor");		
		Thread.sleep(2000);
		
		
		Select select2=new Select(status);
		select2.selectByValue("On Schedule");
		Thread.sleep(2000);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,400)");			
    	Thread.sleep(2000);
    	
    	start.click();
    	startdate.click();	
    	Thread.sleep(2000);
    	
    	finish.click();
    	finishdate.click();
    	Thread.sleep(2000);
    	
    	percentcomplete.clear();
    	percentcomplete.sendKeys("0.30");
    	Thread.sleep(2000);
    	
    	addtoscope.click();
    	Thread.sleep(2000);
    	
    	sharewithsubs.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,200)");		
		Thread.sleep(2000);
		
		scope.sendKeys("Scope");
		Thread.sleep(2000);
		
		exclusions.sendKeys("Nope");
		Thread.sleep(2000);
		
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,400)");		
		Thread.sleep(2000);
		
		save.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		done.click();
		Thread.sleep(2000);	
		
		doorstype.click();
		Thread.sleep(2000);	
		
		/*search.sendKeys("Doors Type");
		Thread.sleep(2000);	
		
		searchbutton.click();
		Thread.sleep(2000);	*/
			    	
    	Actions act1=new Actions(driver);
    	act1.moveToElement(editicon).click().perform();
				
		editlink.click();
		Thread.sleep(2000);	
		
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		inspecteddate.click();
		Thread.sleep(2000);	
		
		inspecteddate1.click();
		Thread.sleep(2000);	
		
		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		
		save1.click();
		Thread.sleep(2000);	
		
		JavascriptExecutor js7=(JavascriptExecutor)driver;
		js7.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		
		done1.click();
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
		
																						//views.click();
																						//Thread.sleep(2000);	
																						
																						//multiview.click();
																						//Thread.sleep(2000);	
																						
																						//driver.close();
																						//Thread.sleep(2000);	
																						
																						//views1.click();
																						//Thread.sleep(2000);	
																						
																						//gantt.click();
																						//Thread.sleep(2000);	
																						
																						//driver.close();
																						//Thread.sleep(2000);	
		/*addatask.sendKeys("Doors Type 2");
		Thread.sleep(2000);	
		
		startdate1.click();
		Thread.sleep(2000);
		
		startdate11.click();
		Thread.sleep(2000);
		
		finishdate1.click();
		Thread.sleep(2000);
		
		finishdate11.click();
		Thread.sleep(2000);	
		
		plusbutton.click();
		Thread.sleep(2000);	
		
		//search.clear();
		
		search1.sendKeys("Doors Type 2");
		Thread.sleep(2000);	
		
		searchbutton1.click();
		Thread.sleep(2000);	
		
		search1.clear();
		Thread.sleep(2000);	*/
		
		
	}
}