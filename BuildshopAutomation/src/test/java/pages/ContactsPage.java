package pages;


import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ContactsPage 
{
public WebDriver driver;
	
	public ContactsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='ctl00_CommunicationModule1_aContacts']")
	private WebElement contactsPage;
	
	@FindBy(xpath="//input[@name='ctl00$MainContent$btnNew']")
	private WebElement AddContactButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_CompanyNameTextBox']")
	private WebElement AddContactCompanyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_PhoneTextBox']")
	private WebElement AddContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_ExtensionTextBox']")
	private WebElement AddContactPhoneExtensionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_CellPhoneTextBox']")
	private WebElement AddContactcellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_FaxTextBox']")
	private WebElement AddContactFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_EmailTextBox']")
	private WebElement AddContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtContactName']")
	private WebElement AddContactContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtFirstName']")
	private WebElement AddContactFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLastName']")
	private WebElement AddContactLastNameTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_DropDownList1']")
	private WebElement AddContactTypeLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlType']")
	private WebElement AddContactProfessionLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_AddressTextBox']")
	private WebElement AddContactStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlCountries']")
	private WebElement AddContactCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlStates']")
	private WebElement AddContactStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlCities']")
	private WebElement AddContactCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_ZipCodeTextBox']")
	private WebElement AddContactZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLongitude']")
	private WebElement AddContactLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLatitude']")
	private WebElement AddContactLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_InsertButton']")
	private WebElement AddContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_InsertCancelButton']")
	private WebElement AddContactCancelButton;
	
	
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement ContactDoneButton;
	
	
	
	//Search Contact.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
	private WebElement ContactSearchTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
	private WebElement ContactSearchButton;
	
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement ContactShowRowsLB;
	
	
	//Delete Contact.........
	@FindBy(xpath="//span[text()='xyxyEmployee']/../../../../..//input")
	private WebElement ContactSelectChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement ContactDeleteButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement ContactDeleteConfirmButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement ContactDeleteCancelButton;
	
	
	
	//Modify Contact...........
	@FindBy(xpath="//span[text()='xyxyEmployee']")
	private WebElement SelectExistingContact;
	
	@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit']")
	private WebElement EditContactEditLink;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CompanyNameTextBox']")
	private WebElement EditContactCompanyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_PhoneTextBox']")
	private WebElement EditContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ExtensionTextBox']")
	private WebElement EditContactPhoneExtensionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CellPhoneTextBox']")
	private WebElement EditContactCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FaxTextBox']")
	private WebElement EditContactFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_EmailTextBox']")
	private WebElement EditContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtContactName']")
	private WebElement EditContactContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtFirstName']")
	private WebElement EditContactFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLastName']")
	private WebElement EditContactLastNameTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_DropDownList1']")
	private WebElement EditContactTypeLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlType']")
	private WebElement EditContactProfessionLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_AddressTextBox']")
	private WebElement EditContactStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCountries']")
	private WebElement EditContactCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlStates']")
	private WebElement EditContactStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCities']")
	private WebElement EditContactCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ZipCodeTextBox']")
	private WebElement EditContactZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLongitude']")
	private WebElement EditContactLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLatitude']")
	private WebElement EditContactLatitudeTB;
	
	
	//Modify Contact - Add Contact..
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAdditionalContact']")
	private WebElement EditContactAddContactButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_NameTextBox']")
	private WebElement EditContactAddContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_PhoneTextBox']")
	private WebElement EditContactAddContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_EmailTextBox']")
	private WebElement EditContactAddContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertButton']")
	private WebElement EditContactAddContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertCancelButton']")
	private WebElement EditContactAddContactCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_LinkButton3']")
	private WebElement EditContactAddContactCloseIcon;
	
	@FindBy(xpath="//img[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_GridViewAdditionalContacts_ctl02_imgEdit']")
	private WebElement EditContactAdditionalContactEditIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_GridViewAdditionalContacts_ctl02_LinkButton2']")
	private WebElement EditContactAdditionalContactDeleteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_GridViewAdditionalContacts_ctl02_LinkButton2']")
	private WebElement EditContactAdditionalContactDeleteConfirmButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_GridViewAdditionalContacts_ctl02_LinkButton2']")
	private WebElement EditContactAdditionalContactDeleteCancelButton;


	//Modify Contact - Add Site..
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAddNewSite']")
	private WebElement EditContactAddSiteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_NameTextBox']")
	private WebElement EditContactAddSiteLocationTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_Street1TextBox']")
	private WebElement EditContactAddSiteStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCountries']")
	private WebElement EditContactAddSiteCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlStates']")
	private WebElement EditContactAddSiteStatesLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCities']")
	private WebElement EditContactAddSiteCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_ZipTextBox']")
	private WebElement EditContactAddSiteZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLongitude']")
	private WebElement EditContactAddSiteLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLatitude']")
	private WebElement EditContactAddSiteLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_InsertButton']")
	private WebElement EditContactAddSiteSaveButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
	private WebElement EditContactAddSiteCloseIcon;
	
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateButton']")
	private WebElement EditContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateCancelButton']")
	private WebElement EditContactCancelButton;
	
	
	
	public void addContactMethod() throws InterruptedException
	{
		contactsPage.click();
		Thread.sleep(2000);
		AddContactButton.click();
		Thread.sleep(2000);
		AddContactCompanyNameTB.sendKeys("ABCD Company");
		/*AddContactPhoneTB.sendKeys("22336644");
		AddContactPhoneExtensionTB.sendKeys("02012");
		AddContactcellPhoneTB.sendKeys("9988665544");
		AddContactFaxTB.sendKeys("fx1234");
		AddContactEmailTB.sendKeys("ABCDcompany@new.com");*/
		AddContactContactNameTB.sendKeys("Cust ABCD");
		AddContactFirstNameTB.sendKeys("Cust");
		AddContactLastNameTB.sendKeys("ABCD");
		Thread.sleep(1000);
		Select s1=new Select(AddContactTypeLB);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		Select s2=new Select(AddContactProfessionLB);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		/*AddContactStreetTB.sendKeys("Street 1");
		Thread.sleep(2000);
		Select s3=new Select(AddContactCountryLB);
		s3.selectByIndex(12);
		Thread.sleep(2000);
		Select s4=new Select(AddContactStateLB);
		s4.selectByIndex(1);
		Thread.sleep(2000);
		Select s5=new Select(AddContactCityLB);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		AddContactZipCodeTB.sendKeys("000666");
		AddContactLongitudeTB.sendKeys("60");
		AddContactLatitudeTB.sendKeys("50");
		Thread.sleep(1000);*/
		AddContactSaveButton.click();
		Thread.sleep(2000);
		ContactDoneButton.click();
		
		String actual=driver.findElement(By.xpath("//span[contains(text(),'Cust ABCD')]")).getText();
		AssertJUnit.assertEquals("Cust ABCD", actual);
		
	}
	
	public void searchContactMethod() throws InterruptedException
	{
		contactsPage.click();
		Thread.sleep(2000);
		Select s1=new Select(ContactShowRowsLB);
		s1.selectByIndex(3);
		Thread.sleep(2000);		
		ContactSearchTB.clear();
		ContactSearchTB.sendKeys("aaaaaNew Company1234");  //search by company name only....
		ContactSearchButton.click();
	}
	
	public void deleteContactMethod() throws InterruptedException
	{
		contactsPage.click();
		Thread.sleep(2000);
		ContactSelectChkbox.click();
		Thread.sleep(1000);
		ContactDeleteButton.click();
		Thread.sleep(1000);
		ContactDeleteCancelButton.click();
		//ContactDeleteConfirmButton.click();			
	}
	
	public void modifyContactMethod() throws InterruptedException
	{
		contactsPage.click();
		Thread.sleep(2000);
		SelectExistingContact.click();
		Thread.sleep(2000);
		EditContactCompanyNameTB.clear();
		EditContactCompanyNameTB.sendKeys("xyxy Company");
		EditContactPhoneTB.clear();
		EditContactPhoneTB.sendKeys("25631478");
		EditContactPhoneExtensionTB.clear();
		EditContactPhoneExtensionTB.sendKeys("0101");
		EditContactCellPhoneTB.clear();
		EditContactCellPhoneTB.sendKeys("9988665533");
		EditContactFaxTB.clear();
		EditContactFaxTB.sendKeys("fax5214");
		EditContactEmailTB.clear();
		EditContactEmailTB.sendKeys("xycust1@xy.com");
		EditContactContactNameTB.clear();
		EditContactContactNameTB.sendKeys("xy cust");
		EditContactFirstNameTB.clear();
		EditContactFirstNameTB.sendKeys("xycust");
		EditContactLastNameTB.clear();
		EditContactLastNameTB.sendKeys("xy123");
		Thread.sleep(1000);
		Select s1=new Select(EditContactTypeLB);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		Select s2=new Select(EditContactProfessionLB);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		EditContactStreetTB.clear();
		EditContactStreetTB.sendKeys("Street 12");
		Thread.sleep(1000);
		Select s3=new Select(EditContactCountryLB);
		s3.selectByIndex(1);
		Thread.sleep(2000);
		Select s4=new Select(EditContactStateLB);
		s4.selectByIndex(1);
		Thread.sleep(2000);
		Select s5=new Select(EditContactCityLB);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		EditContactZipCodeTB.clear();
		EditContactZipCodeTB.sendKeys("635241");
		EditContactLongitudeTB.clear();
		EditContactLongitudeTB.sendKeys("60");
		EditContactLatitudeTB.clear();
		EditContactLatitudeTB.sendKeys("50");
		Thread.sleep(1000);
		EditContactAddContactButton.click();
		Thread.sleep(1000);
		EditContactAddContactNameTB.sendKeys("xyxy Cust");
		EditContactAddContactPhoneTB.sendKeys("23568987");
		EditContactAddContactEmailTB.sendKeys("xyxycust@xy.com");
		Thread.sleep(1000);
		EditContactAddContactSaveButton.click();
		Thread.sleep(1000);
		EditContactAddContactCloseIcon.click();
		Thread.sleep(1000);
		Actions a1=new Actions(driver);
		a1.moveToElement(EditContactAdditionalContactEditIcon).perform();
		Thread.sleep(1000);
		EditContactAdditionalContactDeleteButton.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//EditContactAdditionalContactDeleteConfirmButton.click();
		Thread.sleep(1000);
		//EditContactAdditionalContactDeleteCancelButton.click();
		EditContactAddSiteButton.click();
		Thread.sleep(1000);
		EditContactAddSiteLocationTB.sendKeys("Location xyxy");
		EditContactAddSiteStreetTB.sendKeys("xy street");
		Select s6=new Select(EditContactAddSiteCountryLB);
		s6.selectByIndex(1);
		Thread.sleep(2000);
		Select s7=new Select(EditContactAddSiteStatesLB);
		s7.selectByIndex(1);
		Thread.sleep(2000);
		Select s8=new Select(EditContactAddSiteCityLB);
		s8.selectByIndex(1);
		Thread.sleep(2000);
		EditContactAddSiteZipCodeTB.sendKeys("556321");
		EditContactAddSiteLongitudeTB.sendKeys("65");
		EditContactAddSiteLatitudeTB.sendKeys("50");
		Thread.sleep(1000);
		EditContactAddSiteSaveButton.click();
		Thread.sleep(1000);
		EditContactAddSiteCloseIcon.click();
		Thread.sleep(1000);
		EditContactSaveButton.click();
		Thread.sleep(2000);
		ContactDoneButton.click();
		
	}
	
	
}
