package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ScopePage 
{
	//scope module
	@FindBy(xpath="//a[text()='Scope']")
	private WebElement scopeModule;
	
	//add scope
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement addscope;
	
	//share with subs
	@FindBy(id="ctl00_MainContent_FormViewInsert_IsSharewithSubs")
	private WebElement sharewithsub;
	
	//add to estimate
	@FindBy(id="ctl00_MainContent_FormViewInsert_IsEstimate")
	private WebElement addtoestimate;
	
	//add to schedule
	@FindBy(id="ctl00_MainContent_FormViewInsert_IsSchedule")
	private WebElement addtoschedule;
	
	//description
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtDescription")
	private WebElement description;
	
	//scope
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtScopeofWork")
	private WebElement scope;
	
	//exclusions
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtExclusions")
	private WebElement exclusion;
	
	//save
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertButton")
	private WebElement save;
	
	//select scope
	@FindBy(xpath="//span[text()='Doors Type']/../..//input[@id='ctl00_MainContent_GridView1_ctl11_cbRows']")
	private WebElement selectscope;

	//delete scope
	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement clickondelete;
	
	//press delete
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement confirmdelete;
	
	//warning message
	@FindBy(xpath="//span[text()='Warning: Item(s) will be permanently deleted.']")
	private WebElement warning;
	
	//click on done
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement done;
	
	//click on share
	@FindBy(id="ctl00_MainContent_btnShare")
	private WebElement share;
	
	//click on email pdf
	@FindBy(id="ctl00_MainContent_btnEmailExcel2")
	private WebElement email;
	
	//select a mail id
	@FindBy(xpath="//label[text()='Miranda Jacob - Miranda']/../..//input")
	private WebElement mailid;
	
	//click on add
	@FindBy(id="ctl00_MainContent_btnAddSubtractContacts")
	private WebElement add;
	
	//enter subject
	@FindBy(id="ctl00_MainContent_txtSubject")
	private WebElement subject;
	
	//enter body
	@FindBy(id="ctl00_MainContent_txtBody")
	private WebElement body;
	
	//click on send
	@FindBy(id="ctl00_MainContent_Button6")
	private WebElement send;
		
	//constructor
	public ScopePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
	//to click on scope module
	public void clickonScopeModule()
	{
		scopeModule.click();
	}
	
	public void clickonaddscope()
	{
		addscope.click();
	}
	
	//to select on subs
	public void selectSubs()
	{
		sharewithsub.click();
	}
	
	//to add to estimate
	public void selectaddtoestimate()
	{
		addtoestimate.click();
	}
	
	//to add to schedule
	public void selectaddtoschedule()
	{
		addtoschedule.click();
	}
	
	//enter description
	public void enterDescription()
	{
		description.sendKeys("asdfasdfadfsa");
	}
	
	//enter scope
	public void enterScope()
	{
		scope.sendKeys("scope is too high");
	}
	
	//enter exclusions
	public void enterExclusions()
	{
		exclusion.sendKeys("i'm fine");
	}
	
	//click on save
	public void clickonSave()
	{
		save.click();
	}
	
	//click on done
	public void clickondone()
	{
		done.click();
	}
	
	//select scope
	public void selectascope()
	{
		selectscope.click();
		
	}
	
	//click on delete
	public void delete()
	{
		clickondelete.click();
		
	}
	
	//warning message should display
	public void displaywarning()
	{
		String text = warning.getText();
		System.out.println(text);
		String etext="Warning: Item(s) will be permanently deleted.";
		Assert.assertEquals(text, etext);
	}
	
	//confirm delete
	public void deleteconfirm()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		confirmdelete.click();
	}
	
	//click on share button
	public void clickonshare()
	{
		share.click();
		email.click();
	}

//	send email 
//	public void emailPDF()
//	{
//		email.click();
//	}
	
	//enter mail id
	public void entermailid()
	{
		mailid.click();
	}
	
	//add mailid
	public void addmailid()
	{
		add.click();
	}	
	
	//enter subject in field
	public void entersubject()
	{
		subject.sendKeys("scope of the project");
	}
	
	//enter text in body
	public void enterbody()
	{
		body.sendKeys("text mail");
	}

	//send mail
	public void sendmail()
	{
		send.click();
	}
}
