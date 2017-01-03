package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{
	//Plan button
	@FindBy(xpath="//a[text()='Plan']")
	private WebElement planButton;
	
	//Drawing button
	@FindBy(xpath="//a[text()='Drawings']")
	private WebElement drawingbutton;
		
	//click on procure module
	@FindBy(xpath="//a[text()='Procure']")
	private WebElement procure;

	//constructor
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//click on plan button
	public void clickPlanButton()
	{
		planButton.click();
	}
	
	//click on drawing button
	public void clickDrawingButton()
	{
		drawingbutton.click();
	}
	
	//to click on procure module
	public void clickOnProcure()
	{
		procure.click();
	}
}
