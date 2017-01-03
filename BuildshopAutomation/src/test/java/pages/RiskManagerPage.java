package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RiskManagerPage
{
public WebDriver driver;
    
    public RiskManagerPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[@class='btnProjetstxt']")
    public WebElement projects;  
    
    @FindBy(xpath="//a[@id='ctl00_GridViewNavigation_ctl14_btnProjectID']")
    public WebElement sprojects; 
    
    @FindBy(xpath="//a[text()='Risk Manager']")
    public WebElement riskmanager;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
    public WebElement addrisk;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewRiskManagementInsert_NameTextBox']")
    public WebElement risk;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewRiskManagementInsert_DateOpenedTextBox']")
    public WebElement dateopened;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewRiskManagementInsert_CalExtDateOpenedTextBox_day_3_3']")
    public WebElement dateopened1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewRiskManagementInsert_DateClosedTextBox']")
    public WebElement dateclosed;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewRiskManagementInsert_CalExtDateClosedTextBox_day_3_4']")
    public WebElement dateclosed1;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewRiskManagementInsert_ddlOwner']")
    public WebElement owneroftherisk;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewRiskManagementInsert_ddlAssignedTo']")
    public WebElement riskassignedto;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewRiskManagementInsert_DropDownList2']")
    public WebElement status;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewRiskManagementInsert_DropDownList1']")
    public WebElement priority;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewRiskManagementInsert_DropDownList3']")
    public WebElement probability;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewRiskManagementInsert_DropDownList5']")
    public WebElement impact;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewRiskManagementInsert_DropDownList4']")
    public WebElement severity;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_FormViewRiskManagementInsert_DropDownList7']")
    public WebElement sharewithcustomer;
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewRiskManagementInsert_DetailsTextBox']")
    public WebElement details;
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewRiskManagementInsert_TextBox1']")
    public WebElement mitigation;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewRiskManagementInsert_InsertButton']")
    public WebElement save;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
    public WebElement done;
    
    @FindBy(xpath="//span[@id='ctl00_MainContent_GridView1_ctl02_DescriptionLabel']")
    public WebElement risk1;
    
    @FindBy(xpath="//img[@id='ctl00_MainContent_GridView1_ctl02_imgEdit']")
    public WebElement editicon;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_GridView1_ctl02_btnViewDetailsProjectPlanStep']")
    public WebElement editlink;
    
    @FindBy(xpath="//select[@name='ctl00$MainContent$Tabs$PanelDetails$FormViewRiskEdit$DropDownList3']")
    public WebElement probability1;
    
    @FindBy(xpath="//select[@name='ctl00$MainContent$Tabs$PanelDetails$FormViewRiskEdit$DropDownList5']")
    public WebElement impact1;
    
    @FindBy(xpath="//select[@name='ctl00$MainContent$Tabs$PanelDetails$FormViewRiskEdit$DropDownList4']")
    public WebElement severity1;
    
    @FindBy(xpath="//input[@name='ctl00$MainContent$Tabs$PanelDetails$FormViewRiskEdit$UpdateButton']")
    public WebElement save1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
    public WebElement done1;
    
    @FindBy(xpath="//img[@id='ctl00_MainContent_GridView1_ctl02_imgEdit']")
    public WebElement editicon1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_GridView1_ctl02_LinkButton2']")
    public WebElement deletelink;
        
    /*@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueIns_ItemTextBox']")
    public WebElement addanitem;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueIns_DateTextBox']")
    public WebElement startdate;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormViewIssueIns_CalendarExtender_day_3_3']")
    public WebElement startdate1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewIssueIns_InsertButton']")
    public WebElement plusbutton;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
    public WebElement search;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
    public WebElement searchbutton;*/
    
    public void RiskManagerMethod() throws InterruptedException
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(projects).perform();
    	
    	Actions act1=new Actions(driver);
    	act1.moveToElement(sprojects).click().perform();
    	
    	riskmanager.click();
    	Thread.sleep(2000);
    	
    	addrisk.click();
    	Thread.sleep(2000);
    	
    	risk.sendKeys("Risk1");
    	Thread.sleep(2000);
    	
    	dateopened.click();
    	Thread.sleep(2000);
    	
    	dateopened1.click();
    	Thread.sleep(2000);
    	
    	dateclosed.click();
    	Thread.sleep(2000);
    	
    	dateclosed1.click();
    	Thread.sleep(2000);
    	
    	
    	Select select=new Select(owneroftherisk);
    	select.selectByVisibleText("Sam Bruce - Sam");				
    	Thread.sleep(2000);
    	
    	
    	Select select1=new Select(riskassignedto);
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
    	
    	
    	Select select4=new Select(probability);
    	select4.selectByVisibleText("Moderate");				
    	Thread.sleep(2000);
    	
    	Select select5=new Select(impact);
    	select5.selectByVisibleText("Moderate");				
    	Thread.sleep(2000);
    	
    	
    	Select select6=new Select(severity);
    	select6.selectByVisibleText("Medium");				
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,300)");			
    	Thread.sleep(2000);
    	   	
    	
    	Select select7=new Select(sharewithcustomer);
    	select7.selectByVisibleText("No");				
    	Thread.sleep(2000);
    	
    	details.sendKeys("Details");
    	Thread.sleep(2000);
    	
    	mitigation.sendKeys("Mitigation");
    	Thread.sleep(2000); 
    	
    	save.click();
    	Thread.sleep(2000); 
    	
    	done.click();
    	Thread.sleep(2000);  
    	
    	risk1.click();
    	Thread.sleep(2000); 
    	
    	editicon.click();
    	Thread.sleep(2000);
    	
    	editlink.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js2=(JavascriptExecutor)driver;
    	js2.executeScript("window.scrollBy(0,300)");			
    	Thread.sleep(2000);
    	    		
    	Select select8=new Select(probability1);
    	select8.selectByVisibleText("Likely");				
    	Thread.sleep(2000);
    	
    	Select select9=new Select(impact1);
    	select9.selectByVisibleText("Minor");				
    	Thread.sleep(2000);
    	    	
    	Select select10=new Select(severity1);
    	select10.selectByVisibleText("Low");				
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js3=(JavascriptExecutor)driver;
    	js3.executeScript("window.scrollBy(0,300)");			
    	Thread.sleep(2000);
    	
    	save1.click();
    	Thread.sleep(2000); 
    	
    	JavascriptExecutor js4=(JavascriptExecutor)driver;
    	js4.executeScript("window.scrollBy(0,-600)");			
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
    	
    	  	    	
    	/*addrisk.click();
    	Thread.sleep(2000);
    	
    	risk.sendKeys("Risk2");
    	Thread.sleep(2000);
    	
    	dateopened.click();
    	Thread.sleep(2000);
    	
    	dateopened1.click();
    	Thread.sleep(2000);
    	
    	dateclosed.click();
    	Thread.sleep(2000);
    	
    	dateclosed1.click();
    	Thread.sleep(2000);
    	
    	owneroftherisk.click();
    	Select select8=new Select(owneroftherisk);
    	select8.selectByVisibleText("Zee - Bill Thomas");				
    	Thread.sleep(2000);
    	
    	riskassignedto.click();
    	Select select9=new Select(riskassignedto);
    	select9.selectByVisibleText("Sam Bruce - Sambruce");				
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js2=(JavascriptExecutor)driver;
    	js2.executeScript("window.scrollBy(0,300)");			
    	Thread.sleep(2000);
    	
    	status.click();
    	Select select10=new Select(status);
    	select10.selectByVisibleText("Active");				
    	Thread.sleep(2000);
    	
    	priority.click();
    	Select select11=new Select(priority);
    	select11.selectByVisibleText("Medium");				
    	Thread.sleep(2000);
    	
    	probability.click();
    	Select select12=new Select(probability);
    	select12.selectByVisibleText("Moderate");				
    	Thread.sleep(2000);
    	
    	impact.click();
    	Select select13=new Select(impact);
    	select13.selectByVisibleText("Moderate");				
    	Thread.sleep(2000);
    	
    	severity.click();
    	Select select14=new Select(severity);
    	select14.selectByVisibleText("Medium");				
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js3=(JavascriptExecutor)driver;
    	js3.executeScript("window.scrollBy(0,300)");			
    	Thread.sleep(2000);
    	   	
    	sharewithcustomer.click();
    	Select select15=new Select(sharewithcustomer);
    	select15.selectByVisibleText("No");				
    	Thread.sleep(2000);
    	
    	details.sendKeys("Details");
    	Thread.sleep(2000);
    	
    	mitigation.sendKeys("Mitigation");
    	Thread.sleep(2000); 
    	
    	save.click();
    	Thread.sleep(2000); 
    	
    	done.click();
    	Thread.sleep(2000); 
    	
    	addanitem.sendKeys("Risk3");
    	Thread.sleep(2000); 
    	
    	startdate.click();
    	Thread.sleep(2000); 
    	
    	startdate1.click();
    	Thread.sleep(2000); 
    	
    	plusbutton.click();
    	Thread.sleep(2000); 
    	
    	search.sendKeys("Risk2");
    	Thread.sleep(2000); 
    	
    	searchbutton.click();;
    	Thread.sleep(2000);  
    	
    	search.clear();
    	Thread.sleep(2000);*/
    }
}