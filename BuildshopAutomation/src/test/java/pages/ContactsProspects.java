package com.pages;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class ContactsProspects 
{
	public WebDriver driver;
	
	public ContactsProspects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='ctl00_CommunicationModule1_aProspects']")
	private WebElement contactsProspectsPage;
	
	
	//Add Prospect....
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
	private WebElement ProspectsAddProspectButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_CompanyNameTextBox']")
	private WebElement addProspectCompanyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtFirstName']")
	private WebElement addProspectFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtLastName']")
	private WebElement addProspectLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_DateTextBox']")
	private WebElement addProspectCallDateTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlStatus']")
	private WebElement addProspectContactStatusLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtAppointmentDate']")
	private WebElement addProspectAppointmentDateTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlAppointmentTime']")
	private WebElement addProspectAppointmentTimeLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_PhoneTextBox']")
	private WebElement addProspectPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_ExtensionTextBox']")
	private WebElement addProspectPhoneExtensionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_CellPhoneTextBox']")
	private WebElement addProspectCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_FaxTextBox']")
	private WebElement addProspectFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_EmailTextBox']")
	private WebElement addProspectEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_AddressTextBox']")
	private WebElement addProspectStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlCountries']")
	private WebElement addProspectContryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlStates']")
	private WebElement addProspectStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlCities']")
	private WebElement addProspectCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_ZipCodeTextBox']")
	private WebElement addProspectZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtLongitude']")
	private WebElement addProspectLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtLatitude']")
	private WebElement addProspectLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtProjectDescription']")
	private WebElement addProspectDescriptionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_InsertButton']")
	private WebElement addProspectSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_InsertCancelButton']")
	private WebElement addProspectCancelButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement addProspectDoneButton;
	
	
	
	//Delete Prospect.........
	@FindBy(xpath="//span[text()='custom home']/../../../../..//input")
	private WebElement prospectSelectChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement prospectDeleteButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement prospectDeleteConfirmButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement prospectDeleteCancelButton;
	
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement ContactShowRowsLB;
	
	
	
	

	public void addProspectMethod() throws InterruptedException
	{
		contactsProspectsPage.click();
		Thread.sleep(2000);
		ProspectsAddProspectButton.click();
		Thread.sleep(2000);
		addProspectCompanyNameTB.sendKeys("ABCD Company");
		addProspectFirstNameTB.sendKeys("CustABCD");
		addProspectLastNameTB.sendKeys("1234");
		/*addProspectCallDateTB.sendKeys("1/2/2016");
		Thread.sleep(2000);
		Select s1=new Select(addProspectContactStatusLB);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		addProspectAppointmentDateTB.sendKeys("1/26/2016");
		Thread.sleep(2000);
		Select s2=new Select(addProspectAppointmentTimeLB);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		addProspectPhoneTB.sendKeys("22336644");
		addProspectPhoneExtensionTB.sendKeys("0101");
		addProspectCellPhoneTB.sendKeys("9966558745");
		addProspectFaxTB.sendKeys("fx453");
		addProspectEmailTB.sendKeys("newcompany1234@new.com");
		addProspectStreetTB.sendKeys("Street 2");
		Thread.sleep(2000);
		Select s3=new Select(addProspectContryLB);
		s3.selectByIndex(1);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Select s4=new Select(addProspectStateLB);
		s4.selectByIndex(1);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Select s5=new Select(addProspectCityLB);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		addProspectZipCodeTB.sendKeys("666000");
		addProspectLongitudeTB.sendKeys("50");
		addProspectLatitudeTB.sendKeys("40");*/
		addProspectDescriptionTB.sendKeys("aaaa custom home");
		Thread.sleep(2000);
		addProspectSaveButton.click();
		Thread.sleep(2000);
		addProspectDoneButton.click();
		
		String actual=driver.findElement(By.xpath("//span[contains(text(),'CustABCD 1234')]")).getText();
		AssertJUnit.assertEquals("CustABCD 1234", actual);
		
	}
	
	public void deleteProspectMethod() throws InterruptedException
	{
		contactsProspectsPage.click();
		Thread.sleep(2000);
		prospectSelectChkbox.click();
		Thread.sleep(1000);
		prospectDeleteButton.click();
		Thread.sleep(2000);
		prospectDeleteCancelButton.click();
	}
	
	
}
