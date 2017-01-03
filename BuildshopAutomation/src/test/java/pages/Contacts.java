package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts 
{
	public WebDriver driver;
	
	public Contacts(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='btnProjetstxt']")
	private WebElement projectsLink;
	
	//xpath to select project = 'S-Project'.......
	@FindBy(xpath="//a[@id='ctl00_GridViewNavigation_ctl14_btnProjectID']")
	private WebElement selectProjectButton;
	
	@FindBy(xpath="//a[@class='btnMenuContacts']")
	private WebElement contactsModule;
	
	
	@FindBy(xpath="//div[@id='ctl00_CommunicationModule1_aContacts']")
	private WebElement contactsPage;
	
	@FindBy(xpath="//div[@id='ctl00_CommunicationModule1_aProspects']")
	private WebElement contactsProspectsPage;
	
	@FindBy(xpath="//div[@id='ctl00_CommunicationModule1_aNetworkWithPros']")
	private WebElement contactsSubDirectoryPage;
	
	public void contactsMethod() throws InterruptedException
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(projectsLink).perform();
		Thread.sleep(1000);
		selectProjectButton.click();
		Thread.sleep(2000);
		contactsModule.click();
		Thread.sleep(2000);
				
	}
	
	
	
	

}
