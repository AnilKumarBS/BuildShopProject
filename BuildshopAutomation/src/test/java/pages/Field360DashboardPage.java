package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Field360DashboardPage 
{
	public WebDriver driver;
	
	public Field360DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Dashboard']")
	private WebElement dashboardLink;
	
	@FindBy(xpath="//a[text()='Schedule']")
	private WebElement scheduleLink;
	
	@FindBy(xpath="//div[contains(text(),'aaaJob')]")
	private WebElement scheduledJobName;
	
	@FindBy(xpath="//span[contains(text(),'aaaJob')]")
	private WebElement dashboardJobName;
	
	public void dashboardMethod()
	{
		scheduleLink.click();
		String actual = scheduledJobName.getText();
		dashboardLink.click();
		String expected = dashboardJobName.getText();
		Assert.assertEquals(actual, expected);
		Reporter.log(actual,true);
		Reporter.log(expected,true);
	}
	
	
}
