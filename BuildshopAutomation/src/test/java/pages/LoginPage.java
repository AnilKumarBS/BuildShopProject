package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='txt-sign-in'])[2]")
    public WebElement un;
    
    @FindBy(xpath="(//input[@class='txt-sign-in'])[4]")
    public WebElement pw;
    
    @FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Login101_Submit2']")
    public WebElement signinButton;
    
    public void SignInMethod()
    {
        un.sendKeys("Bill Thomas");
        pw.sendKeys("Bill1234");
        signinButton.click();
    }
	
}
