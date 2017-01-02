package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Field360Quotes 
{
	public WebDriver driver;
	
	public Field360Quotes(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[text()='Quotes']")
	private WebElement quotesLink;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
	private WebElement addQuotesButton;

	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtService']")
	private WebElement jobNameTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewNewQuote_ddlQuoteStatus']")
	private WebElement jobStatusLB;
	
	
	
	//client
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewNewQuote_ddlClient']")
	private WebElement clientLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_btnFind']")
	private WebElement findButton;	
	
	//find client window..........
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearchContact']")
	private WebElement findSearchClientButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_GridViewFindCustomers_ctl02_btnSelectContact']")
	private WebElement findSelectClientButton;
	
	@FindBy(xpath="//span[@id='ctl00_MainContent_lblContactSavedSuccessfully']")
	private WebElement findConfirmationMessage;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton4']")
	private WebElement findCloseButton;
	
	
	//Add Client window
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_btnAddContact']")
	private WebElement addCustButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_CompanyNameTextBox']")
	private WebElement clientCompNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtContactName']")
	private WebElement clientContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtFirstName']")
	private WebElement clientFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtLastName']")
	private WebElement clientLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_PhoneTextBox']")
	private WebElement clientPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_ExtensionTextBox']")
	private WebElement clientPhoneExtnsnTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_CellPhoneTextBox']")
	private WebElement clientCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_FaxTextBox']")
	private WebElement clientFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_EmailTextBox']")
	private WebElement clientEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_AddressTextBox']")
	private WebElement clientStreetTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_ddlCountries']")
	private WebElement clientCountryLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_ddlStates']")
	private WebElement clientStateLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_ddlCities']")
	private WebElement clientCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_ZipCodeTextBox']")
	private WebElement clientZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtLongitude']")
	private WebElement clientLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtLatitude']")
	private WebElement clientLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_InsertButton']")
	private WebElement clientSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_InsertCancelButton']")
	private WebElement clientCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton6']")
	private WebElement clientCloseButton;
	
	
	
	//View Client Button...................
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_btnView']")
	private WebElement viewCustButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_CompanyNameTextBox']")
	private WebElement viewCompNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtContactName']")
	private WebElement viewContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtFirstName']")
	private WebElement viewFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLastName']")
	private WebElement viewLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_PhoneTextBox']")
	private WebElement viewPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_ExtensionTextBox']")
	private WebElement viewPhoneExtnsnTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_CellPhoneTextBox']")
	private WebElement viewCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_FaxTextBox']")
	private WebElement viewFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_EmailTextBox']")
	private WebElement viewEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_AddressTextBox']")
	private WebElement viewStreetTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ddlCountries']")
	private WebElement viewCountryLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ddlStates']")
	private WebElement viewStateLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ddlCities']")
	private WebElement viewCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ZipCodeTextBox']")
	private WebElement viewZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLongitude']")
	private WebElement viewLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLatitude']")
	private WebElement viewLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_UpdateButton']")
	private WebElement viewSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_UpdateCancelButton']")
	private WebElement viewCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton6']")
	private WebElement viewCloseButton;
	
	
	
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtCompanyName']")
	private WebElement companyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtFirstName']")
	private WebElement firstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtLastName']")
	private WebElement lastNameTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtEmail']")
	private WebElement emailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_PhoneTextBox']")
	private WebElement phoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_CellPhoneTextBox']")
	private WebElement cellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_FaxTextBox']")
	private WebElement faxTB;
	
	
	
	
	//Location...........
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewNewQuote_ddlSelectSite']")
	private WebElement siteLB;
	
	
	//Add Site Button
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_btnAddAddSite']")
	private WebElement addSiteButton;
	
	//Additional Site Window.....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_NameTextBox']")
	private WebElement addSiteLocationNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_Street1TextBox']")
	private WebElement addSiteStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_ddlCountries']")
	private WebElement addSiteCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_ddlStates']")
	private WebElement addSiteStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_ddlCities']")
	private WebElement addSiteCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_ZipTextBox']")
	private WebElement addSiteZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_txtLongitude']")
	private WebElement addSiteLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_txtLatitude']")
	private WebElement addSiteLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_InsertButton']")
	private WebElement addSiteSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_InsertCancelButton']")
	private WebElement addSiteCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
	private WebElement addSiteCloseButton;
	
	
	
	//View Site Button........
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_btnViewSite']")
	private WebElement viewSiteButton;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtSite']")
	private WebElement siteNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtStreet']")
	private WebElement streetTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtCity']")
	private WebElement cityTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtState']")
	private WebElement stateTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtZip']")
	private WebElement zipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtCountry']")
	private WebElement countryTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtLatitude']")
	private WebElement latitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_txtLongitude']")
	private WebElement longitudeTB;
	
	
	
	
	//Additional Contact Information..........
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewNewQuote_ddlAdditionalContacts']")
	private WebElement aciContactLB;
	
	//ACI - Add Additional Contact Button......
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_btnAddAdditionalContact']")
	private WebElement aciAddContactButton;
	
	//ACI - Additional Contact Window......
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_NameTextBox']")
	private WebElement aciAddContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_PhoneTextBox']")
	private WebElement aciAddContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_EmailTextBox']")
	private WebElement aciAddContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_InsertButton']")
	private WebElement aciAddContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_InsertCancelButton']")
	private WebElement aciAddContactCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton3']")
	private WebElement aciAddContactCloseTB;
	
	
	
	//ACI - View Button
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_btnViewAdditionalContact']")
	private WebElement aciViewButton;
	
	
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewNewQuote_txtContact']")
	private WebElement aciContactNameTB;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewNewQuote_AdditionalContactPhoneTextBox']")
	private WebElement aciPhoneTB;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewNewQuote_AdditionalContactEmailTextBox']")
	private WebElement aciEmailTB;
	
	
	
	
	//Appointment Info...
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_IsScheduled']")
	private WebElement appInfoCheckBoxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteStartDate_dateInput']")
	private WebElement appInfoStartTimeTB;
		
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteStartDate_popupButton']")
	private WebElement appInfoStartDateButton;
	
	//xpath to Select Start Date as 20 December 2016.....
	@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteStartDate_calendar_Top']//a[contains(text(),'20')]")
	private WebElement appInfoStartDateSelectButton;
	
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteStartDate_timePopupLink']")
	private WebElement appInfoStartTimeButton;
	
	//xpath to Select Start Time as 10:30am .....
	@FindBy(xpath="//table[contains(@id,'StartDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'10:00 AM')]")
	private WebElement appInfoStartTimeSelectButton;
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteFinishDate_dateInput']")
	private WebElement appInfoFinishTimeTB;
		
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteFinishDate_popupButton']")
	private WebElement appInfoFinishDateButton;
	
	//xpath to Select Finish Date as 26 December 2016.....
	@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteFinishDate_calendar_Top']//a[contains(text(),'26')]")
	private WebElement appInfoFinishDateSelectButton;
	
	
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteFinishDate_timePopupLink']")
	private WebElement appInfoFinishTimeButton;
	
	//xpath to Select Finish Time as 4:00pm .....
	@FindBy(xpath="//table[contains(@id,'FinishDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'4:00 PM')]")
	private WebElement appInfoFinishTimeSelectButton;
	
	
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewNewQuote_txtServiceDetails']")
	private WebElement appInfoJobDetailsTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_InsertButton']")
	private WebElement quoteSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewNewQuote_InsertCancelButton']")
	private WebElement quoteCancelButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement doneButton;
	
	
	//Delete Quote......
	
	@FindBy(xpath="//span[contains(text(),'aaaaNewCustomer12')]/../../preceding-sibling::td[last()]/input")
	private WebElement quoteChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement deleteConfirmationButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement deleteCancelConfirmationButton;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement showRowsLB;
	
	
	

	//Search Employee.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
	private WebElement searchQuoteTB;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
	private WebElement searchQuoteButton;
		
	

	//Update Quote......
	@FindBy(xpath="//span[text()='aaaJob']")
	private WebElement selectExstngQuote;
	
	
	//Update Quote Window.....
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtService']")
	private WebElement updateJobNameTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewEdit_ddlQuoteStatus']")
	private WebElement updateJobStatusLB;
	
	
	
	//client
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewEdit_ddlClient']")
	private WebElement updateClientLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_btnFind']")
	private WebElement updateFindButton;	
	
	
	
	//Add Client window
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_btnAddContact']")
	private WebElement updateAddCustButton;
	
	
	//View Client Button...................
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_btnView']")
	private WebElement updateViewCustButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_CompanyNameTextBox']")
	private WebElement updateViewCompNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtContactName']")
	private WebElement updateViewContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtFirstName']")
	private WebElement updateViewFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLastName']")
	private WebElement updateViewLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_PhoneTextBox']")
	private WebElement updateViewPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_ExtensionTextBox']")
	private WebElement updateViewPhoneExtnsnTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_CellPhoneTextBox']")
	private WebElement updateViewCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_FaxTextBox']")
	private WebElement updateViewFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_EmailTextBox']")
	private WebElement updateViewEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_AddressTextBox']")
	private WebElement updateViewStreetTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ddlCountries']")
	private WebElement updateViewCountryLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ddlStates']")
	private WebElement updateViewStateLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ddlCities']")
	private WebElement updateViewCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ZipCodeTextBox']")
	private WebElement updateViewZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLongitude']")
	private WebElement updateViewLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLatitude']")
	private WebElement updateViewLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_UpdateButton']")
	private WebElement updateViewSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_UpdateCancelButton']")
	private WebElement updateViewCancelButton;

	
	
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtCompanyName']")
	private WebElement updateCompanyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtFirstName']")
	private WebElement updateFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtLastName']")
	private WebElement updateLastNameTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtEmail']")
	private WebElement updateEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_PhoneTextBox']")
	private WebElement updatePhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_ExtensionTextBox']")
	private WebElement updatePhoneExtTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_CellPhoneTextBox']")
	private WebElement updateCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_FaxTextBox']")
	private WebElement updateFaxTB;
	
	
	
	
	//Location...........
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewEdit_ddlSelectSite']")
	private WebElement updatesiteLB;
	
	
	//Add Site Button
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_btnAddAddSite']")
	private WebElement updateAddSiteButton;
	
	
	
	//View Site Button........
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_btnViewSite']")
	private WebElement updateViewSiteButton;
	
	
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtSite']")
	private WebElement updateSiteNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtStreet']")
	private WebElement updateStreetTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtCity']")
	private WebElement updateCityTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtState']")
	private WebElement updateStateTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtZip']")
	private WebElement updateZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtCountry']")
	private WebElement updateCountryTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtLatitude']")
	private WebElement updateLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_txtLongitude']")
	private WebElement updateLongitudeTB;
	
	
	
	
	//Additional Contact Information..........
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewEdit_ddlAdditionalContacts']")
	private WebElement updateAciContactLB;
	
	//ACI - Add Additional Contact Button......
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_btnAddAdditionalContact']")
	private WebElement updateAciAddContactButton;
	
	
	
	//ACI - View Button
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_btnViewAdditionalContact']")
	private WebElement updateAciViewButton;
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_NameTextBox']")
	private WebElement updateAciContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_PhoneTextBox']")
	private WebElement updateAciPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_EmailTextBox']")
	private WebElement updateAciEmailTB;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_UpdateButton']")
	private WebElement updateAciSaveButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_UpdateCancelButton']")
	private WebElement updateAciCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton3']")
	private WebElement updateAciCloseIcon;
	
	
	
	
	
	
	
	//Appointment Info...
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_IsScheduled']")
	private WebElement updateAppInfoCheckBoxTB;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewEdit_dtpQuoteStartDate_dateInput']")
	private WebElement updateAppInfoStartTimeTB;
		
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewEdit_dtpQuoteStartDate_popupButton']")
	private WebElement updateAppInfoStartDateButton;
	
	//xpath to Select Start Date as 20 December 2016.....
	@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewEdit_dtpQuoteStartDate_calendar_Top']//a[contains(text(),'22')]")
	private WebElement updateAppInfoStartDateSelectButton;
	
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewEdit_dtpQuoteStartDate_timePopupLink']")
	private WebElement updateAppInfoStartTimeButton;
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_dtpQuoteFinishDate_dateInput']")
	private WebElement updateAppInfoFinishTimeTB;
		
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewEdit_dtpQuoteFinishDate_popupButton']")
	private WebElement updateAppInfoFinishDateButton;
	
	//xpath to Select Finish Date as 26 December 2016.....
	@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewEdit_dtpQuoteFinishDate_calendar_Top']//a[contains(text(),'26')]")
	private WebElement updateAppInfoFinishDateSelectButton;
	
	
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewEdit_dtpQuoteFinishDate_timePopupLink']")
	private WebElement updateAppInfoFinishTimeButton;
	
	
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewEdit_txtServiceDetails']")
	private WebElement updateAppInfoJobDetailsTB;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_UpdateButton']")
	private WebElement updateQuoteSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_UpdateCancelButton']")
	private WebElement updateQuoteCancelButton;
	
	
	//update - Items page...................
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnItems']")
	private WebElement updateQuoteItemsPage;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_FormViewServiceCallItemsInsert_DescriptionTextBox']")
	private WebElement updateItemsDescriptionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_FormViewServiceCallItemsInsert_txtQTY']")
	private WebElement updateItemsQuantityTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_FormViewServiceCallItemsInsert_txtPrice']")
	private WebElement updateItemsPriceTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_FormViewServiceCallItemsInsert_InsertButton']")
	private WebElement updateItemsAddIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_FormViewServiceCallItemsInsert_InsertCancelButton']")
	private WebElement updateItemsAddCancelIcon;
	
	
	//Update - Items - Add Items Button.....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_FormViewServiceCallItemsInsert_btnAddInventoryItems']")
	private WebElement updateItemsAddItemsButton;
	
	//Add Inventory Items window......
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ItemsControl1_ddlCategory']")
	private WebElement updateItemsCategoryLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_txtFilterItems']")
	private WebElement updateItemsSearchTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_btnSearchItems']")
	private WebElement updateItemsSearchIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewInventoryItems_ctl02_cbRows']")
	private WebElement updateItemsExistingItemsChkbox1;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewInventoryItems_ctl02_txtQuantity']")
	private WebElement updateItemsExistingItemsQuantityTB1;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewInventoryItems_ctl03_cbRows']")
	private WebElement updateItemsExistingItemsChkbox2;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewInventoryItems_ctl03_txtQuantity']")
	private WebElement updateItemsExistingItemsQuantityTB2;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewInventoryItems_ctl04_cbRows']")
	private WebElement updateItemsExistingItemsChkbox3;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewInventoryItems_ctl04_txtQuantity']")
	private WebElement updateItemsExistingItemsQuantityTB3;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewInventoryItems_ctl05_cbRows']")
	private WebElement updateItemsExistingItemsChkbox4;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewInventoryItems_ctl05_txtQuantity']")
	private WebElement updateItemsExistingItemsQuantityTB4;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_ImageButton2']")
	private WebElement updateItemsExistingItemsAddItemsButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_LinkButton7']")
	private WebElement updateItemsAddItemsCloseIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_FormViewServiceCallItemsInsert_chkBoxisTaxable']")
	private WebElement updateItemsTaxableItemsChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl02_imgEdit']")
	private WebElement updateItemsEditIcon1;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl02_LinkButton2']")
	private WebElement updateItemsEditIconDelete1;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl03_imgEdit']")
	private WebElement updateItemsEditIcon2;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl03_LinkButton2']")
	private WebElement updateItemsEditIconDelete2;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl04_imgEdit']")
	private WebElement updateItemsEditIcon3;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl04_LinkButton2']")
	private WebElement updateItemsEditIconDelete3;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl05_imgEdit']")
	private WebElement updateItemsEditIcon4;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl05_LinkButton2']")
	private WebElement updateItemsEditIconDelete4;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl06_imgEdit']")
	private WebElement updateItemsEditIcon5;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ItemsControl1_GridViewServiceCallItems_ctl02_LinkButton2']")
	private WebElement updateItemsEditIconDelete5;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ItemsControl1_FormViewTotals_ddlTaxRate']")
	private WebElement updateItemsTaxRateLB;
	
	
	
	//Update Quote - Team Page............
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnTeam']")
	private WebElement updateQuoteTeamPage;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TeamControl1_FormViewResources_hylProjectProjects']")
	private WebElement updateTeamAddIcon;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_TeamControl1_FormViewResources_GridViewUsers_ctl12_btnUserName']")
	private WebElement updateTeamAddIconSelectContact; 
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_TeamControl1_FormViewResources_GridViewAddedUsers_ctl02_LinkButton1']")
	private WebElement updateTeamRemoveFromProjectLink1;
	
	
	
	//Update Quote - Email Page...........
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnEmail']")
	private WebElement updateQuoteEmailPage;
	
	//Email To.....
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtTo']")
	private WebElement updateEmailToTB;
	
	//To Address Add Icon...........
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnAddTo']")
	private WebElement updateEmailToAddIcon;


	//Add Icon Window for Email To, CC, BC.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtBoxSearchReminder']")
	private WebElement updateEmailToSearchTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnSearchPopulateEmails']")
	private WebElement updateEmailToSearchButton;
	
	//xpath to checkbox contact's first name:xycust..
	@FindBy(xpath="//label[contains(text(),'xycust')]/..//input")
	private WebElement updateEmailToExistingChkbox;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_EmailControl1_lbCancelPopulateEmail']")
	private WebElement updateEmailToWindowCloseIcon;
	
	
	
	
	//Email CC......
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtCC']")
	private WebElement updateEmailCcTB;
	
	//Email CC - add Icon.....
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnAddToCC']")
	private WebElement updateEmailCcAddIcon;
	
	
	
	//Email BC.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtBC']")
	private WebElement updateEmailBcTB;
	
	//Email BC - Add Icon.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnAddToBC']")
	private WebElement updateEmailBcAddIcon;
	
	
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtSubject']")
	private WebElement updateEmailSubjectTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtBody']")
	private WebElement updateEmailBodyTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnCancelEmailExcel']")
	private WebElement updateEmailCancelButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_Button6']")
	private WebElement updateEmailSendButton;
	
	
	
	
	//Update - Documents Page......
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDocuments']")
	private WebElement updateQuoteDocumentsPage;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_DocumentsControl1_Button2']")
	private WebElement updateDocumentsUploadDocButton;
	
	@FindBy(xpath="//span[text()='Select']")
	private WebElement updateDocumentsUploadDocSelectButton;
	
	@FindBy(xpath="//span[text()='Remove']")
	private WebElement updateDocumentsUploadDocRemoveButton;  //It works only if any files are uploaded at present.....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_DocumentsControl1_btnSaveDocs']")
	private WebElement updateDocumentsUploadDocSaveButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_DocumentsControl1_LinkButton8']")
	private WebElement updateDocumentsUploadDocCloseButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_DocumentsControl1_GridViewDocuments_ctl02_lnkDownload']")
	private WebElement updateDocumentsOpenExistingImage1;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_DocumentsControl1_GridViewDocuments_ctl02_lnkDelete']")
	private WebElement updateDocumentsDeleteExistingImage1;
	
	
	
	
	//Update - History Page..........
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnHistory']")
	private WebElement updateQuoteHistoryPage;
	
	
	
	
	//Update - Photos Page..........
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnPhotos']")
	private WebElement updateQuotePhotosPage;
	
	//Add Photo Button....
	@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_btnAddPhotos']")
	private WebElement updatePhotoAddPhotoButton;
	
	//Add Photo Page.....
	@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_TitleTextBox']")
	private WebElement updatePhotoAddPhotoTitleTB;
	
	@FindBy(xpath="//input[@class='file-upload365-h35']")
	private WebElement updatePhotoAddPhotoBrowseButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_btnAddPicture']")
	private WebElement updatePhotosAddPhotoUploadButton;
	
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_DescriptionTextBox']")
	private WebElement updatePhotosAddPhotoDescriptionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_InsertButton']")
	private WebElement updatePhotosAddPhotoSaveButton;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_InsertCancelButton']")
	private WebElement updatePhotosAddPhotoCancelButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_btnBacktoPhotos']")
	private WebElement updatePhotosAddPhotoDoneButton;
	
	
	
	
	//Update - Notes Page.......
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnNotes']")
	private WebElement updateQuoteNotesPage;
	
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_NotesControl1_FormViewNotes1_Editor']")
	private WebElement updateNotesDescriptionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_NotesControl1_FormViewNotes1_UpdateButton']")
	private WebElement updateNotesSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_NotesControl1_FormViewNotes1_UpdateCancelButton']")
	private WebElement updateNotesCancelButton;
	
	
	
	
	//Convert to Job.....
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnCreateJob']")
	private WebElement CreateJobButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnYes']")
	private WebElement createConfirmationButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement createCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_btnCloseCreate']")
	private WebElement createCloseButton;
	
	//Jobs Page..
	@FindBy(xpath="//a[text()='Jobs']")
	private WebElement jobsLink;
	
	//invoices Page...
	@FindBy(xpath="//a[text()='Invoices']")
	private WebElement invoicesLink;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnUninvoicedJobs']")
	private WebElement unInvoicedJobsButton;
	
	@FindBy(xpath="//span[contains(text(),'aaaaNewCustomer12')]/../..//input")
	private WebElement unInvoicedJobChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_JobsControl1_btnConvertToInvoice']")
	private WebElement InvoicesConvertToInvoiceButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnOpenInvoices']")
	private WebElement openInvoiceButton;
	
	
	
	
	public void quotesMethod() throws InterruptedException
	{
		quotesLink.click();
		Thread.sleep(2000);
		addQuotesButton.click();
		jobNameTB.sendKeys("aaaJob");
		jobStatusLB.click();		
		Select s1=new Select(jobStatusLB);
		s1.selectByIndex(1);
		Thread.sleep(3000);		
		findButton.click();
		Thread.sleep(3000);		
		findSearchClientButton.click();
		Thread.sleep(3000);		
		findSelectClientButton.click();
		Thread.sleep(3000);		
		findCloseButton.click();
		Thread.sleep(3000);		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);		
		Select s2=new Select(aciContactLB);
		s2.selectByIndex(1);
		Thread.sleep(3000);		
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);		
		appInfoCheckBoxTB.click();
		Thread.sleep(1000);	
		appInfoStartTimeTB.sendKeys("1/2/2017 10:00 PM");
		/*appInfoStartDateButton.click();
		Thread.sleep(2000);		
		appInfoStartDateSelectButton.click();
		Thread.sleep(2000);		
		appInfoStartTimeButton.click();
		Thread.sleep(2000);		
		appInfoStartTimeSelectButton.click();*/
		Thread.sleep(2000);	
		appInfoFinishTimeTB.sendKeys("1/26/2017 4:00 PM");
		/*appInfoFinishDateButton.click();
		Thread.sleep(2000);		
		appInfoFinishDateSelectButton.click();
		Thread.sleep(2000);		
		appInfoFinishTimeButton.click();
		Thread.sleep(2000);		
		appInfoFinishTimeSelectButton.click();
		Thread.sleep(2000);		*/
		appInfoJobDetailsTB.sendKeys("asdf asnfkkfw wejrjwek");		
		quoteSaveButton.click();
		Thread.sleep(3000);		
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);		
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);		
		doneButton.click();
		Thread.sleep(5000);
		
	}
	
	
	public void deleteQuoteMethod() throws InterruptedException
	{
		for(int i=1;i<=3;i++)
		{
			quotesLink.click();
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
			
			List<WebElement> l = driver.findElements(By.xpath("//span[contains(text(),'aaaaNewCustomer12')]/../../preceding-sibling::td[last()]/input"));
			l.get(l.size()-1).click();
			Thread.sleep(3000);
			deleteButton.click();
			Thread.sleep(3000);
			deleteConfirmationButton.click();
			Thread.sleep(3000);
		}
		
		
		quotesLink.click();
		
		//To Delete particular Quote.......
		quoteChkbox.click();
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		deleteButton.click();
		Thread.sleep(2000);
		deleteConfirmationButton.click();
		Thread.sleep(10000);
		
		
		//To Delete last Quote from duplicates......		
	
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
		
		List<WebElement> l = driver.findElements(By.xpath("//span[contains(text(),'aaaaNewCustomer12')]/../../preceding-sibling::td[last()]/input"));
		l.get(l.size()-1).click();
		Thread.sleep(3000);
		deleteButton.click();
		Thread.sleep(3000);
		deleteConfirmationButton.click();
		Thread.sleep(3000);
		
	}
	
	
	public void searchQuoteMethod() throws InterruptedException
	{
		quotesLink.click();
		Thread.sleep(3000);
		searchQuoteTB.sendKeys("aaaJob"); //Search by Job Name
		searchQuoteButton.click();
		Thread.sleep(5000);
				
	}
		

	public void updateQuoteMethod() throws InterruptedException, IOException
	{
		quotesLink.click();
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
		
		//If there are any duplicate Quotes, It will select the first one by Default............
		selectExstngQuote.click();
		Thread.sleep(5000);
		updateJobNameTB.clear();
		updateJobNameTB.sendKeys("xyxyJob");
		Select s2=new Select(updateJobStatusLB);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		updateFindButton.click();
		Thread.sleep(2000);
		findSearchClientButton.click();
		Thread.sleep(2000);
		findSelectClientButton.click();
		Thread.sleep(2000);
		findCloseButton.click();
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		updateCompanyNameTB.clear();
		updateCompanyNameTB.sendKeys("xyxyNew Company1234");
		updateFirstNameTB.clear();
		updateFirstNameTB.sendKeys("xyxyemp");
		updateLastNameTB.clear();
		updateLastNameTB.sendKeys("xy123");
		updateEmailTB.clear();
		updateEmailTB.sendKeys("as34ffd@ert.asd");
		updatePhoneTB.clear();
		updatePhoneTB.sendKeys("87845456");
		updatePhoneExtTB.clear();
		updatePhoneExtTB.sendKeys("0011");
		updateCellPhoneTB.clear();
		updateCellPhoneTB.sendKeys("9988563251");
		updateFaxTB.clear();
		updateFaxTB.sendKeys("a4s5df");		
		
		//Locations Fields are all Read-Only, Cannot Update........
		//updateStreetTB.clear();
		//updateStreetTB.sendKeys("d street");  //Street is Read Only, Cannot update.........
		
//		j.executeScript("window.scrollBy(0,600)");
//		Thread.sleep(1000);
		Select s3=new Select(updateAciContactLB);
		s3.selectByIndex(1);
		Thread.sleep(1000);
		updateAciViewButton.click();
		Thread.sleep(2000);
		updateAciContactNameTB.clear();
		updateAciContactNameTB.sendKeys("demo additional 1");
		updateAciPhoneTB.clear();
		updateAciPhoneTB.sendKeys("9966885577");
		updateAciEmailTB.clear();
		updateAciEmailTB.sendKeys("demoxyxy@aci.com");
		updateAciSaveButton.click();
		Thread.sleep(2000);
		updateAciCloseIcon.click();
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		//String str = updateAppInfoCheckBoxTB.getAttribute("checked");
		//System.out.println(str);
		if(updateAppInfoCheckBoxTB.getAttribute("checked")==null)
		{
			updateAppInfoCheckBoxTB.click();
		}
		Thread.sleep(2000);
		
		updateAppInfoStartDateButton.click();
		Thread.sleep(2000);
		updateAppInfoStartDateSelectButton.click();
		Thread.sleep(2000);
		updateAppInfoStartTimeButton.click();
		Thread.sleep(2000);
		appInfoStartTimeSelectButton.click();
		Thread.sleep(2000);
		updateAppInfoFinishDateButton.click();
		Thread.sleep(2000);
		updateAppInfoFinishDateSelectButton.click();
		Thread.sleep(2000);
		updateAppInfoFinishTimeButton.click();
		Thread.sleep(2000);
		appInfoFinishTimeSelectButton.click();
		Thread.sleep(2000);
		updateAppInfoJobDetailsTB.clear();
		updateAppInfoJobDetailsTB.sendKeys("Job Description...........");
		updateQuoteSaveButton.click();
		Thread.sleep(3000);
		
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		
		//Update Items page....
		updateQuoteItemsPage.click();
		Thread.sleep(2000);
		updateItemsDescriptionTB.clear();
		updateItemsDescriptionTB.sendKeys("Item 1");
		updateItemsQuantityTB.clear();
		updateItemsQuantityTB.sendKeys("2");		
		updateItemsPriceTB.clear();
		updateItemsPriceTB.sendKeys("2000");
		updateItemsAddIcon.click();
		Thread.sleep(3000);
		
		updateItemsAddItemsButton.click();
		Thread.sleep(2000);
		Select s6=new Select(updateItemsCategoryLB);
		s6.selectByIndex(1);
		Thread.sleep(2000);
		updateItemsExistingItemsQuantityTB1.clear();
		updateItemsExistingItemsQuantityTB1.sendKeys("3");
		updateItemsExistingItemsChkbox1.click();
		Thread.sleep(2000);
		updateItemsExistingItemsAddItemsButton.click();
		Thread.sleep(2000);
		updateItemsAddItemsCloseIcon.click();
		Thread.sleep(2000);
		updateItemsTaxableItemsChkbox.click();
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.moveToElement(updateItemsEditIcon1);
		Thread.sleep(2000);
		updateItemsEditIconDelete1.click();
		Select s7=new Select(updateItemsTaxRateLB);
		s7.selectByIndex(1);
		Thread.sleep(3000);		
		
		//Update Team Page........
		
		updateQuoteTeamPage.click();
		Actions a2=new Actions(driver);
		a2.moveToElement(updateTeamAddIcon);
		Thread.sleep(1000);
		updateTeamAddIconSelectContact.click();
		Thread.sleep(3000);
		//updateTeamRemoveFromProjectLink1.click();
		
		//Update Email Page......
		
		updateQuoteEmailPage.click();
		Thread.sleep(3000);
		//updateEmailToTB.clear();
		//updateEmailToTB.sendKeys("");
		updateEmailToAddIcon.click();
		//updateEmailToSearchTB.sendKeys("");
		//updateEmailToSearchButton.click();
		updateEmailToExistingChkbox.click();
		updateEmailToWindowCloseIcon.click();
		
		//updateEmailCcTB.clear();
		//updateEmailCcTB.sendKeys("");
		updateEmailCcAddIcon.click();
		updateEmailToExistingChkbox.click();
		updateEmailToWindowCloseIcon.click();
		
		//updateEmailBcTB.clear();
		//updateEmailBcTB.sendKeys("");
		updateEmailBcAddIcon.click();
		updateEmailToExistingChkbox.click();
		updateEmailToWindowCloseIcon.click();
		
			
		//Update Documents Page......
		updateQuoteDocumentsPage.click();
//		updateDocumentsUploadDocButton.click();
//		WebDriverWait wait=new WebDriverWait(driver,40);
//		wait.until(ExpectedConditions.elementToBeClickable(updateDocumentsUploadDocSelectButton));
//		Thread.sleep(3000);
//		updateDocumentsUploadDocSelectButton.click();
//		Thread.sleep(20000);
//		Runtime.getRuntime().exec("C:\\Users\\Tyss\\Desktop\\AutoIT Scripts\\QuoteFileUpload.exe");
//		
//		updateDocumentsOpenExistingImage1.click();
		updateDocumentsDeleteExistingImage1.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		Thread.sleep(3000);
		
		//Update History Page......
		updateQuoteHistoryPage.click();
		Thread.sleep(5000);
		
		
		//Update Photos Page........
		updateQuotePhotosPage.click();
		Thread.sleep(3000);
		updatePhotoAddPhotoButton.click();
		updatePhotoAddPhotoTitleTB.sendKeys("Photo1");
		Thread.sleep(2000);
		driver.findElement(By.className("file-upload365-h35")).sendKeys("‪C:\\Users\\Tyss\\Desktop\\Photo1.jpg");
		Thread.sleep(5000);
		updatePhotosAddPhotoUploadButton.click();
		Thread.sleep(3000);
		updatePhotosAddPhotoDescriptionTB.clear();
		updatePhotosAddPhotoDescriptionTB.sendKeys("Photo description....");
		Thread.sleep(3000);
		updatePhotosAddPhotoSaveButton.click();
		Thread.sleep(3000);
		updatePhotosAddPhotoDoneButton.click();
		Thread.sleep(3000);

		//Update Notes Page......
		updateQuoteNotesPage.click();
		Thread.sleep(3000);
		updateNotesDescriptionTB.clear();
		updateNotesDescriptionTB.sendKeys("Photo Description ");
		Thread.sleep(3000);
		updateNotesSaveButton.click();
		Thread.sleep(3000);
		//updateNotesCancelButton.click();
	
		
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
		doneButton.click();
		Thread.sleep(5000);
			
	}
	
	
	public void convertToJobMethod() throws InterruptedException
	{
		quotesLink.click();
		Thread.sleep(2000);
		addQuotesButton.click();
		jobNameTB.sendKeys("aaaJob");
		jobStatusLB.click();		
		Select s1=new Select(jobStatusLB);
		s1.selectByIndex(1);
		Thread.sleep(2000);		
		findButton.click();
		Thread.sleep(2000);		
		findSearchClientButton.click();
		Thread.sleep(2000);		
		findSelectClientButton.click();
		Thread.sleep(2000);		
		findCloseButton.click();
		Thread.sleep(2000);		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);		
		Select s2=new Select(aciContactLB);
		s2.selectByIndex(1);
		Thread.sleep(1000);		
		j.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);		
		appInfoCheckBoxTB.click();
		Thread.sleep(1000);	
		appInfoStartTimeTB.sendKeys("1/2/2017 10:00 PM");
		appInfoFinishTimeTB.sendKeys("1/26/2017 4:00 PM");
		appInfoJobDetailsTB.sendKeys("Job Description.....");		
		quoteSaveButton.click();
		Thread.sleep(2000);		
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(1000);		
		j.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(1000);		
		doneButton.click();
		Thread.sleep(2000);
		
		//Convert to job.......
		quoteChkbox.click();
		Thread.sleep(2000);
		CreateJobButton.click();
		Thread.sleep(2000);
		createConfirmationButton.click();
		Thread.sleep(2000);
		createCloseButton.click();
		Thread.sleep(2000);
		
		//Go to Jobs Page.
		jobsLink.click();
		Thread.sleep(3000);
		
		String actual = driver.findElement(By.xpath("//span[contains(text(),'aaaaNewCustomer12')]")).getText();
		Assert.assertEquals(actual, "aaaaNewCustomer12");
		Thread.sleep(2000);
		
		invoicesLink.click();
		Thread.sleep(2000);
		unInvoicedJobsButton.click();
		Thread.sleep(2000);
		unInvoicedJobChkbox.click();
		Thread.sleep(2000);
		InvoicesConvertToInvoiceButton.click();
		Thread.sleep(2000);
		openInvoiceButton.click();
		Thread.sleep(2000);
		Assert.assertEquals(actual, "aaaaNewCustomer12");
		Thread.sleep(2000);
		quotesLink.click();
				
	}
	
	
	
	
}
