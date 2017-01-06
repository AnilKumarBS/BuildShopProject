package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='ctl00_hylProjectProjects']")
	private WebElement projectsButton;
		
	@FindBy(xpath="//a[@id='ctl00_btnAddProject']")
	private WebElement addProjectsLink;
	
	@FindBy(xpath="//a[.='Messages']")
	private WebElement messagesModule;
	
	@FindBy(xpath="//a[.='Project Setup']")
	private WebElement projectSetupModule;
	
	@FindBy(xpath="//a[.='Plan']")
	private WebElement planModule;
	
	@FindBy(xpath="//a[.='Procure']")
	private WebElement procureModule;
	
	@FindBy(xpath="//a[.='Manage']")
	private WebElement manageModule;
	
	@FindBy(xpath="//a[.='Financial']")
	private WebElement financialModule;
	
	@FindBy(xpath="//a[.='Field 360']")
	private WebElement field360Module;
	
	@FindBy(xpath="//a[.='Inventory']")
	private WebElement inventoryModule;
	
	@FindBy(xpath="//a[.='Logs']")
	private WebElement logsModule;
	
	@FindBy(xpath="//a[.='Vehicle Logs']")
	private WebElement vehicleLogsModule;
	
	@FindBy(xpath="//a[.='Timesheet']")
	private WebElement timesheetModule;
	
	@FindBy(xpath="//a[.='Documents']")
	private WebElement documentsModule;
	
	@FindBy(xpath="//a[.='Design']")
	private WebElement designModule;
	
	@FindBy(xpath="//a[.='Contacts']")
	private WebElement contactsModule;
	
	@FindBy(xpath="//a[.='Reports']")
	private WebElement reportsModule;
	
	@FindBy(xpath="//a[.='Templates']")
	private WebElement templatesModule;
	
	@FindBy(xpath="//a[.='Warranty']")
	private WebElement warrantyModule;
	
	@FindBy(xpath="//a[.='Bid Center']")
	private WebElement bidCenterModule;
	
	
	//Account Signout....	
	@FindBy(xpath="//span[@id='ctl00_LoginViewProfessional_LoginName1']")
	private WebElement LoginNameDropDown;
		
	@FindBy(xpath="//a[@id='ctl00_lnkBtnLogout']")
	private WebElement LoginNameDropDownSignoutOption;
	
	public void Field360ModuleMethod()
	{
		field360Module.click();
	}
	
	public void selectProjectMethod() throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.moveToElement(projectsButton).perform();
		Thread.sleep(1000);
		addProjectsLink.click();		
	}
	
	public void signoutMethod() throws InterruptedException
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(LoginNameDropDown).perform();
		Thread.sleep(1000);
		LoginNameDropDownSignoutOption.click();
		Thread.sleep(2000);		
	}
	
}
