package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraries.ExcelLibrary;

public class MessagesPage 
{
public WebDriver driver;
	
	public MessagesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='Messages']")
	private WebElement messagesModule;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSendMessage']")
	private WebElement newMessageButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_SendMessage1_txtBoxSearchReminder']")
	private WebElement newMessageSearchContactTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_SendMessage1_btnSearch']")
	private WebElement newMessageSearchContactButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_SendMessage1_txtSearchProjects']")
	private WebElement newMessageSearchProjectTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_SendMessage1_btnSearchProjects']")
	private WebElement newMessageSearchProjectButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_SendMessage1_lbViewAllContacts']")
	private WebElement newMessageViewContactsLink;
	
	@FindBy(xpath="//label[contains(text(),'Sam Bruce')]/..//input")
	private WebElement newMessageViewContactsSelectContactCheckBox;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_SendMessage1_lbViewTeam']")
	private WebElement newMessageViewTeamLink;
	
	@FindBy(xpath="//label[contains(text(),'xyxyCust')]/..//input")
	private WebElement newMessageViewTeamSelectContactCheckBox;
	
	@FindBy(xpath="//label[contains(text(),'S-Project')]/..//input")
	private WebElement newMessageSelectProjectCheckBox;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_SendMessage1_txtSubject']")
	private WebElement newMessageTopicTextBox;
	
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_SendMessage1_txtBody']")
	private WebElement newMessageBodyTextArea;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_SendMessage1_txtSubmit']")
	private WebElement newMessageSendButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_SendMessage1_btnCancel']")
	private WebElement newMessageCancelButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnShowGrid']")
	private WebElement newMessageDoneButton;
	
	
	//Search Message	
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilterCompanies']")
	private WebElement searchMessageSearchCompanyTextBox;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearchCompanies']")
	private WebElement searchMessageSearchCompanyButton;
	
	//Select a company name - SeaWorld..
	@FindBy(xpath="//a[contains(text(),'SeaWorld')]")
	private WebElement searchMessageSearchCompanySelectCompany;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilterProjects']")
	private WebElement searchMessageSearchProjectTextBox;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearchProjects']")
	private WebElement searchMessageSearchProjectButton;
	
	//Select a project name - S-Project..
	@FindBy(xpath="//a[contains(text(),'S-Project')]")
	private WebElement searchMessageSearchProjectSelectProject;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilterMessages']")
	private WebElement searchMessageSearchMessageTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearchMessages']")
	private WebElement searchMessageSearchMessageButton;
	
	//To Select amessage by topic name - 'New Year Wishes'.....
	@FindBy(xpath="//a[contains(text(),'New Year Wishes')]")
	private WebElement searchMessageSelectMessage;
		
	
	//Read Message....
	@FindBy(xpath="//a[@id='ctl00_MainContent_NewItemsControl1_lblUnreadMessages']")
	private WebElement SelectUnreadMessage;
	
	//Reply for Message...
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_txtEmailReply']")
	private WebElement ReplyMessageTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_lbEmailReply']")
	private WebElement ReplyMessageSendButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_imgButton']")
	private WebElement ReplyMessageUploadImageIcon;
	
	
	public void newMessageMethod() throws InterruptedException
	{
		messagesModule.click();
		Thread.sleep(2000);
		newMessageButton.click();
		Thread.sleep(2000);
		
		if(newMessageViewContactsLink.isDisplayed())
		{
			newMessageViewContactsSelectContactCheckBox.click();
		}
		else
		{
			newMessageViewContactsLink.click();
			newMessageViewTeamSelectContactCheckBox.click();
		}
		newMessageSelectProjectCheckBox.click();
		Thread.sleep(2000);
		String  newMessageTopicText= ExcelLibrary.getExcelData("datafile.xls","Messages",4,3);
		newMessageTopicTextBox.sendKeys(newMessageTopicText);
		String  newMessageBodyText= ExcelLibrary.getExcelData("datafile.xls","Messages",4,4);
		newMessageBodyTextArea.sendKeys(newMessageBodyText);
		Thread.sleep(2000);
		newMessageSendButton.click();
		Thread.sleep(2000);
		newMessageDoneButton.click();
	}

	public void searchMessageMethod() throws InterruptedException
	{
		messagesModule.click();
		Thread.sleep(2000);
		String  searchMessageSearchCompanyText= ExcelLibrary.getExcelData("datafile.xls","Messages",9,0);
		searchMessageSearchCompanyTextBox.sendKeys(searchMessageSearchCompanyText);
		searchMessageSearchCompanyButton.click();
		Thread.sleep(2000);
		searchMessageSearchCompanySelectCompany.click();
		Thread.sleep(2000);
		String  searchMessageSearchProjectText= ExcelLibrary.getExcelData("datafile.xls","Messages",9,1);
		searchMessageSearchProjectTextBox.sendKeys(searchMessageSearchProjectText);
		searchMessageSearchProjectButton.click();
		Thread.sleep(2000);
		searchMessageSearchProjectSelectProject.click();
		Thread.sleep(2000);
		String  searchMessageSearchMessageText= ExcelLibrary.getExcelData("datafile.xls","Messages",9,2);
		searchMessageSearchMessageTextBox.sendKeys(searchMessageSearchMessageText);
		searchMessageSearchMessageButton.click();
		Thread.sleep(2000);
		searchMessageSelectMessage.click();
		Thread.sleep(2000);
		
	}
	
	
	public void ReadMessageAsSamBruceMethod() throws InterruptedException
	{
		SelectUnreadMessage.click();
		Thread.sleep(2000);
		searchMessageSearchCompanySelectCompany.click();
		Thread.sleep(2000);
		searchMessageSearchProjectSelectProject.click();
		Thread.sleep(2000);
		searchMessageSelectMessage.click();
		Thread.sleep(2000);
		String replyMessage = ExcelLibrary.getExcelData("datafile.xls","SignIN",6,3);
		ReplyMessageTextBox.sendKeys(replyMessage);	
		ReplyMessageSendButton.click();
	}
	
	
}
