package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraries.GenericUtils;

public class DrawingPage
{
	@FindBy(xpath="//div[@class='btnProjetstxt']")
	private WebElement project;
	
	//Upload button
	@FindBy(id="ctl00_MainContent_btnUpload")
	private WebElement uploadButton;
	
	//select file button
	@FindBy(id="ctl00_MainContent_AjaxFileUpload1_Html5InputFile")
	private WebElement select;
	
	//upload file button
	@FindBy(id="ctl00_MainContent_AjaxFileUpload1_UploadOrCancelButton")
	private WebElement fileuploadButton;
	
	//done button
	@FindBy(id="ctl00_MainContent_Button1")
	private WebElement done;
	
	@FindBy(xpath="//a[text()='My Project']")
	private WebElement projectname;
	
	@FindBy(id="ctl00_LoginViewProfessional_LoginName1")
	private WebElement profilename;
	
	@FindBy(id="ctl00_lnkBtnLogout")
	private WebElement signOut;
	
	@FindBy(xpath="//span[text()='TYss']/../..//input[@id='ctl00_MainContent_GridView1_ctl02_cbRows']")
	private WebElement checkbox;
	
	
	
	//constructor
	public DrawingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//click on upload button
	public void clickuploadbutton()
	{
		uploadButton.click();
	}
	
	//click on select button
	public void clickselectbutton()
	{
		select.click();
		GenericUtils genericUtils = new GenericUtils();
		genericUtils.robotSendKeys("C:\\Users\\Rakesh\\Downloads\\12-12-2016-12-34-PM-Proposal-Test-project-1.pdf");
		genericUtils.robotSendEnter();						
	}
	
	//click on file upload button
	public void clickfileuploadbutton()
	{
		fileuploadButton.click();
	}
		
	//click on done button
	public void clickondone()
	{
		done.click();
	}
	
	//select in dropdown list
	public void selectDropDown()
	{
		project.click();
		projectname.click();
	}	
	
	//upload
	public void fileUpload()
	{
		fileuploadButton.click();
	}
	
	//done
	public void doneButton()
	{
		done.click();
	}
	
	//profile
	public void profileAccount()
	{
		profilename.click();
	}
	
	//logout
	public void signOutAccount()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		signOut.click();
	}
	
	//click on checkbox
	public void clickoncheckbox()
	{
		checkbox.click();
	}
}
