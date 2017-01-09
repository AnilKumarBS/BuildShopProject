package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateProjectPage
{
	@FindBy(xpath="//div[@class='btnProjetstxt']")
	private WebElement project;
	
	@FindBy(id="ctl00_btnAddProject")
	private WebElement addProject;
	
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement addaProject;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ddlProjectStatus")
	private WebElement projectStatus;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtProjectID")
	private WebElement projectName;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtFirstName")
	private WebElement fname;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtLastName")
	private WebElement lname;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_PhoneTextBox")
	private WebElement pnum;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ExtensionTextBox")
	private WebElement ext;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_CellPhoneTextBox")
	private WebElement cnum;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_FaxTextBox")
	private WebElement fax;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_EmailTextBox")
	private WebElement emailID;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_StreetTextBox")
	private WebElement streetAddress;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ddlCountries")
	private WebElement selCountry;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ddlStates")
	private WebElement selState;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ddlCities")
	private WebElement selCity;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_ZipTextBox")
	private WebElement zipcode;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtLongitude")
	private WebElement longitude;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_txtLongitude")
	private WebElement latitude;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_WorkDescriptionTextBox")
	private WebElement workDesc;
	
	@FindBy(id="ctl00_MainContent_FormViewPostJobNew_InsertButton")
	private WebElement save;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement done;
	
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement search;
	
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement searchButton;
	
	@FindBy(xpath="//span[text()='Test Yantra project']")
	private WebElement clickonaproject;
	
	@FindBy(xpath="//span[text()='Resources']")
	private WebElement resources;
	
	@FindBy(id="ctl00_MainContent_Tabs_TabPanel2_FormViewResources_hylProjectProjects")
	private WebElement addemp;
	
	@FindBy(id="ctl00_MainContent_Tabs_TabPanel2_FormViewResources_GridViewUsers_ctl08_btnUserName")
	private WebElement selemps;
	
	public CreateProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonproject()
	{
		project.click();
		addProject.click();
		addaProject.click();
	}
	public void selectprojectstatus(int s)
	{
		Select sel=new Select(projectStatus);
		sel.selectByIndex(s);
	}
	public void enterProjectname(String pname)
	{
		projectName.sendKeys(pname);
	}
	public void enterfname(String fn)
	{
		fname.sendKeys(fn);
	}
	public void enterlname(String ln)
	{
		lname.sendKeys(ln);
	}
	public void enterpnum(String p)
	{
		pnum.sendKeys(p);
	}
	public void enterext(String x)
	{
		ext.sendKeys(x);
	}
	public void enterCellNum(String c)
	{
		cnum.sendKeys(c);
	}
	public void enterFax(String fx)
	{
		fax.sendKeys(fx);
	}
	public void enterEmailId(String id)
	{
		emailID.sendKeys(id);
	}
	public void enterstreetaddress(String addr)
	{
		streetAddress.sendKeys(addr);
	}
	public void selectCountry(int c)
	{
		Select cou=new Select(selCountry);
		cou.selectByIndex(c);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectState(int st)
	{
		Select sta=new Select(selState);
		sta.selectByIndex(st);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectCity(int ct)
	{
		Select cit=new Select(selCity);
		cit.selectByIndex(ct);
	}
	public void enterZipcode(String zc)
	{
		zipcode.sendKeys(zc);
	}
	public void enterLongitude(String log)
	{
		longitude.sendKeys(log);
	}
	public void enterLatitude(String lat)
	{
		latitude.sendKeys(lat);
	}
	public void enterWorkDescription(String decs)
	{
		workDesc.sendKeys(decs);
		save.click();
	}
	public void clickondone()
	{
		done.click();
	}
	public void searchProject(String pro)
	{
		search.sendKeys(pro);
		searchButton.click();
		clickonaproject.click();
	}
	public void clickonresources()
	{
		resources.click();
	}
	public void clickonaddemp()
	{
		addemp.click();
		selemps.click();
	}
}
