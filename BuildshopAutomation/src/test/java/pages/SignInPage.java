package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage 
{
	@FindBy(xpath="//input[contains(@id,'UserName')]/following-sibling::input")
	private WebElement username;
	
	@FindBy(xpath= "//input[contains(@id,'Password')]/following-sibling::input")
	private WebElement password;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_Login101_Submit2")
	private WebElement signin;
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername()
	{
		username.sendKeys("Bill Thomas");
	}
	
	public void enterPassword()
	{
		password.sendKeys("Bill1234");
	}
	
	public void clickSignIn()
	{
		signin.click();
	}
	
}
