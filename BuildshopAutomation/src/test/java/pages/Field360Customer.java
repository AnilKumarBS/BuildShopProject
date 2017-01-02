package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;


public class Field360Customer 
{
	public WebDriver driver;
	
	public Field360Customer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(xpath="//div[contains(text(),'Projects')]")
	private WebElement projectsButton;
	
	//xpath to select project = 'S-Project'.......
	@FindBy(xpath="//a[@id='ctl00_GridViewNavigation_ctl10_btnProjectID']")
	private WebElement selectProjectButton;
	*/
	@FindBy(xpath="//a[text()='Customers']")
	private WebElement customersLink;
	
	
	//Add Customer Button..... 
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
	private WebElement addCustomerButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_CompanyNameTextBox']")
	private WebElement companyNameTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtContactName']")
	private WebElement contactNameTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtFirstName']")
	private WebElement firstNameTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLastName']")
	private WebElement lastNameTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_PhoneTextBox']")
	private WebElement phoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ExtensionTextBox']")
	private WebElement phoneExtTB;	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_CellPhoneTextBox']")
	private WebElement cellPhoneTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_FaxTextBox']")
	private WebElement faxTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_EmailTextBox']")
	private WebElement emailTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_AddressTextBox']")
	private WebElement streetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlCountries']")
	private WebElement countryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlStates']")
	private WebElement stateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlCities']")
	private WebElement cityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_ZipCodeTextBox']")
	private WebElement zipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLongitude']")
	private WebElement longitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLatitude']")
	private WebElement latitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_InsertButton']")
	private WebElement saveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_InsertCancelButton']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement doneButton;
	
	@FindBy(xpath="//span[@id='ctl00_MainContent_GridView1_ctl02_lblCompanyName']")
	private WebElement cmpnyName;
	
	
	//Delete Customer.......................
		
	@FindBy(xpath="//td//div/a/span[text()='New Company1234']/../../../../preceding-sibling::td/input[@id='ctl00_MainContent_GridView1_ctl08_cbRows']")
	private WebElement customerChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement deleteConfirmationButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement deleteCancelConfirmationButton;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement showRowsLB;
	
	
	
	//Search Customer.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
	private WebElement searchCustomerTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
	private WebElement searchCustomerButton;
	
	
	
	
	//Update Customer......
	@FindBy(xpath="//td//div/a/span[text()='New Customer1234']")
	private WebElement selectExstngCustomer;
	
	
	//Update Customer Window.....
	@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit']")
	private WebElement updateEditLink;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CompanyNameTextBox']")
	private WebElement updateCompanyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtContactName']")
	private WebElement updateContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtFirstName']")
	private WebElement updateFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLastName']")
	private WebElement updateLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_PhoneTextBox']")
	private WebElement updatePhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ExtensionTextBox']")
	private WebElement updatePhoneExtTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CellPhoneTextBox']")
	private WebElement updateCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FaxTextBox']")
	private WebElement updateFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_EmailTextBox']")
	private WebElement updateEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_AddressTextBox']")
	private WebElement updateStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCountries']")
	private WebElement updateCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlStates']")
	private WebElement updateStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCities']")
	private WebElement updateCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ZipCodeTextBox']")
	private WebElement updateZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLongitude']")
	private WebElement updateLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLatitude']")
	private WebElement updateLatitudeTB;
	
	//Update - Add Contact button...
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAdditionalContact']")
	private WebElement updateAddContactButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_NameTextBox']")
	private WebElement updateAddContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_PhoneTextBox']")
	private WebElement updateAddContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_EmailTextBox']")
	private WebElement updateAddContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertButton']")
	private WebElement updateAddContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertCancelButton']")
	private WebElement updateAddContactCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_LinkButton3']")
	private WebElement updateAddContactCloseIcon;
	
	
	//Update - Add Site button....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAddNewSite']")
	private WebElement updateAddSiteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_NameTextBox']")
	private WebElement updateAddSiteLocationNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_Street1TextBox']")
	private WebElement updateAddSiteStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCountries']")
	private WebElement updateAddSiteCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlStates']")
	private WebElement updateAddSiteStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCities']")
	private WebElement updateAddSiteCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_ZipTextBox']")
	private WebElement updateAddSiteZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLongitude']")
	private WebElement updateAddSiteLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLatitude']")
	private WebElement updateAddSiteLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_InsertButton']")
	private WebElement updateAddSiteSaveButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
	private WebElement updateAddSiteCloseButton;
	
	
	
	
	//Update - Notes Link....
	
	@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit']")
	private WebElement updateExtCustNotesLink;
	
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_txtNotes']")
	private WebElement updateNotesTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateButton']")
	private WebElement updateNotesSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateCancelButton']")
	private WebElement updateNotesCancelButton;
	
	
	
	//Update Existing Customer.....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateButton']")
	private WebElement updateExtCustSaveButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateCancelButton']")
	private WebElement updateExtCustCancelButton;
	
		
		
	
	
	
	
	
	public void customerMethod() throws InterruptedException
	{
		/*Actions a1=new Actions(driver);
		a1.moveToElement(projectsButton).perform();
		Thread.sleep(1000);
		selectProjectButton.click();
		Thread.sleep(3000);*/
		customersLink.click();
		addCustomerButton.click();
		//companyNameTB.sendKeys("xyxyNew Company1234");
		contactNameTB.sendKeys("Demo Cust");
		firstNameTB.sendKeys("autoCust");
		//lastNameTB.sendKeys("demo2012");
		//phoneTB.sendKeys("22336655");
		//cellPhoneTB.sendKeys("9988665522");
		//faxTB.sendKeys("fax12345");
		//emailTB.sendKeys("xyxycust123@aaa.com");
		//streetTB.sendKeys("Some Street");		
		/*Select s1=new Select(countryLB);
		s1.selectByVisibleText("Australia");		
		Thread.sleep(3000);		
		Select s2=new Select(stateLB);
		s2.selectByVisibleText("Auckland");		
		Thread.sleep(3000);		
		Select s3=new Select(cityLB);
		s3.selectByValue("6555");		
		Thread.sleep(3000);*/		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,600)");		
		Thread.sleep(2000);		
		/*zipCodeTB.sendKeys("666333");
		longitudeTB.sendKeys("120");
		latitudeTB.sendKeys("80");*/		
		saveButton.click();
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		doneButton.click();
		Thread.sleep(2000);
		/*String s=cmpnyName.getText();
		AssertJUnit.assertEquals("aaaaaNew Company1234", s);
		Thread.sleep(2000);
		Reporter.log("True",true);
		Thread.sleep(2000);*/
		
		String actual=driver.findElement(By.xpath("//span[contains(text(),'Demo Cust')]")).getText();
		AssertJUnit.assertEquals("Demo Cust", actual);	

	}
	
	public void deleteCustomerMethod() throws InterruptedException
	{
		customersLink.click();
		Thread.sleep(3000);
		
		//To Delete particular customer.......
		/*customerChkbox.click();
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		deleteButton.click();
		Thread.sleep(2000);
		deleteConfirmationButton.click();
		Thread.sleep(10000);*/
		
		
		//To Delete last customer......
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		Select s1=new Select(showRowsLB);
		s1.selectByValue("100");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		
		List<WebElement> l = driver.findElements(By.xpath("//td//div/a/span[text()='New Customer1234']/../../../../preceding-sibling::td/input"));
		l.get(l.size()-1).click();
		Thread.sleep(3000);
		deleteButton.click();
		Thread.sleep(3000);
		deleteConfirmationButton.click();
		Thread.sleep(3000);
			
	}
	
	
	public void searchCustomerMethod() throws InterruptedException
	{
		customersLink.click();
		Thread.sleep(3000);
		searchCustomerTB.sendKeys("New Company1234");    //Search by Company Name
		searchCustomerButton.click();
		Thread.sleep(5000);
				
	}
	
	
	
	public void updateCustomerMethod() throws InterruptedException
	{		
		
		customersLink.click();
		Thread.sleep(3000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		Select s1=new Select(showRowsLB);
		s1.selectByValue("100");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		
		//If there are any duplicate customer names, It will select the first one by Default............
		selectExstngCustomer.click();
		Thread.sleep(3000);
		updateCompanyNameTB.clear();
		updateCompanyNameTB.sendKeys("xyxyNew Company1234");
		updateContactNameTB.clear();
		updateContactNameTB.sendKeys("xyxyCust");
		updateFirstNameTB.clear();
		updateFirstNameTB.sendKeys("xycust");
		updateLastNameTB.clear();
		updateLastNameTB.sendKeys("xy123");
		updatePhoneTB.clear();
		updatePhoneTB.sendKeys("87845456");
		updatePhoneExtTB.clear();
		updatePhoneExtTB.sendKeys("0011");
		updateCellPhoneTB.clear();
		updateCellPhoneTB.sendKeys("9988563251");
		updateFaxTB.clear();
		updateFaxTB.sendKeys("a4s5df");
		updateEmailTB.clear();
		updateEmailTB.sendKeys("as34ffd@ert.asd");
		updateStreetTB.clear();
		updateStreetTB.sendKeys("");
		Select s2=new Select(updateCountryLB);
		s2.selectByIndex(9);
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		Select s3=new Select(updateStateLB);
		s3.selectByIndex(1);
		Thread.sleep(2000);
		Select s4=new Select(updateCityLB);
		s4.selectByIndex(1);
		Thread.sleep(2000);
		updateZipCodeTB.clear();
		updateZipCodeTB.sendKeys("666333");
		updateLongitudeTB.clear();
		updateLongitudeTB.sendKeys("45");
		updateLatitudeTB.clear();
		updateLatitudeTB.sendKeys("30");
		j.executeScript("window.scrollBy(0,600)");
		updateAddContactButton.click();
		Thread.sleep(2000);
		updateAddContactNameTB.sendKeys("contact demo");
		updateAddContactPhoneTB.sendKeys("89999664");
		updateAddContactEmailTB.sendKeys("adsf@ewr.jkmn");
		updateAddContactSaveButton.click();
		Thread.sleep(2000);
		updateAddContactCloseIcon.click();
		Thread.sleep(3000);
		updateAddSiteButton.click();
		Thread.sleep(5000);
		updateAddSiteLocationNameTB.sendKeys("asdfeqwrw");
		updateAddSiteStreetTB.sendKeys("cvsdf");
		Select s5=new Select(updateAddSiteCountryLB);
		s5.selectByIndex(9);
		Thread.sleep(2000);
		Select s6=new Select(updateAddSiteStateLB);
		s6.selectByIndex(1);
		Thread.sleep(2000);
		Select s7=new Select(updateAddSiteCityLB);
		s7.selectByIndex(1);
		Thread.sleep(2000);
		updateAddSiteZipCodeTB.sendKeys("666333");
		updateAddSiteLongitudeTB.sendKeys("55");
		updateAddSiteLatitudeTB.sendKeys("32");
		updateAddSiteSaveButton.click();
		Thread.sleep(2000);
		updateAddSiteCloseButton.click();
		Thread.sleep(2000);
		updateExtCustNotesLink.click();
		Thread.sleep(2000);
		updateNotesTB.sendKeys("jasgf ilajsluweiop xcm,nvm,nw wryiowhncx, ihiwekl");
		updateNotesSaveButton.click();
		Thread.sleep(2000);
		updateEditLink.click();
		Thread.sleep(2000);

		updateExtCustSaveButton.click();
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		doneButton.click();
		Thread.sleep(5000);
		
	}
		
}
