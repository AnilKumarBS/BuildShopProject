package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FieldPage 
{
	public WebDriver driver;
	
	public FieldPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Sub Modules..........................
	
	@FindBy(xpath="//a[text()='Customers']")
	private WebElement customersLink;
	
	@FindBy(xpath="//a[text()='Dashboard']")
	private WebElement dashboardLink;
	
	@FindBy(xpath="//a[text()='Employees']")
	private WebElement employeesLink;
	
	@FindBy(xpath="//a[text()='Vendors']")
	private WebElement vendorsLink;
	
	@FindBy(xpath="//a[text()='Quotes']")
	private WebElement quotesLink;
	
	@FindBy(xpath="//a[text()='Jobs']")
	private WebElement jobsLink;
	
	@FindBy(xpath="//a[text()='Schedule']")
	private WebElement scheduleLink;
	
	@FindBy(xpath="//a[text()='Routing']")
	private WebElement routingLink;
	
	@FindBy(xpath="//a[text()='Purchase Orders']")
	private WebElement purchaseOrdersLink;
	
	@FindBy(xpath="//a[text()='Invoices']")
	private WebElement invoicesLink;
	
	@FindBy(xpath="//a[text()='Reports']")
	private WebElement reportsLink;
	
	
	public void field360Method()
	{
		customersLink.click();
	}
	
	
	
	
	
}
