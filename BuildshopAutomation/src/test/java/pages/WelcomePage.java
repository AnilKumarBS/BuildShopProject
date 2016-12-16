package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	WebDriver driver;
	@FindBy(xpath="//a[@class='headerLinksHP']")
	private WebElement signInBUtton;
}
