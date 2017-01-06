package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraries.ExcelLibrary;

public class PunchListPage
{
public WebDriver driver;
    
    public PunchListPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
           
    @FindBy(xpath="//a[text()='Punch List']")
    public WebElement punchlist;
    
    @FindBy(xpath="//a[text()='Add a Category']")
    public WebElement addacategory;
  
    @FindBy(xpath="//input[@id='ctl00_MainContent_AccordionPane1_content_FormViewAddCategory_CategoryTextBox']")
    public WebElement category;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_AccordionPane1_content_FormViewAddCategory_InsertButton']")
    public WebElement save;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_AccordionPane2_header']//a[@class='accordianLink']")
    public WebElement categories;
    
    @FindBy(xpath="//a[contains(text(),'Rooms')]")
    public WebElement rooms;
    
    /*@FindBy(xpath="//a[contains(text(),'Rooms')]/../../..//td[1]")
    public WebElement editicon;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl03_btnViewDetailsProjectPlanStep']")
    public WebElement editlink;
    
    @FindBy(xpath="//img[@id='ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl04_imgEdit']")
    public WebElement selectateammember;
    
    @FindBy(xpath="//select[@id='ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl03_ddlUser']")
    public WebElement selectateammember1;
    
    @FindBy(xpath="//img[@id='ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl04_Panel9']")
    public WebElement editicon1;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl03_btnViewDetailsProjectPlanStep']")
    public WebElement save1;
    
    @FindBy(xpath="//a[text()='Punch List']")
    public WebElement punchlist1;*/
    
    /*@FindBy(xpath="//img[@id='ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl03_imgEdit']")
    public WebElement editicon2;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl03_Button2']")
    public WebElement deletelink;*/
    
  
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_ItemTextBox']")
    public WebElement addatask;
  
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_DateTextBox']")
    public WebElement taskdueon;
    
    @FindBy(xpath="//div[@id='ctl00_MainContent_FormView1_CalExtDate_day_2_1']")
    public WebElement taskdueon1;
  
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormView1_InsertButton']")
    public WebElement plusbutton;
    
    /*@FindBy(xpath="//input[@id='ctl00_MainContent_txtSearch']")
    public WebElement search;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
    public WebElement searchbutton;*/
    
    public void PunchListMethod() throws InterruptedException
    {
    	punchlist.click();
    	Thread.sleep(2000);
    	
    	addacategory.click();
    	Thread.sleep(2000);
    	
//    	category.sendKeys("Rooms");
//    	Thread.sleep(2000);
    	
    	String cat = ExcelLibrary.getExcelData("datafile.xls","Manage",7,0);
        category.sendKeys(cat);
    	
    	save.click();
    	Thread.sleep(2000);
    	
    	categories.click();
    	Thread.sleep(2000);
    	
    	rooms.click();
    	Thread.sleep(2000);
    	
    	/*Actions act1=new Actions(driver);
    	act1.moveToElement(editicon).click().perform();
    	
    	editlink.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,200)");			
    	Thread.sleep(2000);
    	
    	selectateammember.click();
    	Thread.sleep(2000);
    	
    	
    	Select select1=new Select(selectateammember1);
		select1.selectByVisibleText("Sam Bruce - Sam");	
		Thread.sleep(2000);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,-400)");			
    	Thread.sleep(2000);
		
		editicon1.click();
		Thread.sleep(2000);
		
		save1.click();
		Thread.sleep(2000);*/
		
		JavascriptExecutor js2=(JavascriptExecutor)driver;
    	js2.executeScript("window.scrollBy(0,-300)");			
    	Thread.sleep(2000);
		
		/*punchlist1.click();
		Thread.sleep(2000);*/
		
		JavascriptExecutor js3=(JavascriptExecutor)driver;
    	js3.executeScript("window.scrollBy(0,200)");			
    	Thread.sleep(2000);
		
		/*editicon2.click();
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
    	
//    	addatask.sendKeys("Room1");
//    	Thread.sleep(2000);
    	
    	String addtask = ExcelLibrary.getExcelData("datafile.xls","Manage",7,1);
        addatask.sendKeys(addtask);
    	
    	taskdueon.click();
    	Thread.sleep(2000);
    	
    	taskdueon1.click();
    	Thread.sleep(2000);
    	
    	plusbutton.click();
    	Thread.sleep(2000);
    	
    	/*addatask.sendKeys("Room2");
    	Thread.sleep(2000);
    	
    	taskdueon.click();
    	Thread.sleep(2000);
    	
    	taskdueon1.click();
    	Thread.sleep(2000);
    	
    	plusbutton.click();
    	Thread.sleep(2000);
    	
    	search.sendKeys("Room1");
    	Thread.sleep(2000);
    	
    	searchbutton.click();
    	Thread.sleep(2000);   */ 	 	
    }
}