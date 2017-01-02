package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage 
{
	
	public WebDriver driver;
	
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='alignRight']//a[contains(@class,'headerLinksHP')][6]")
	private WebElement signinpage;
	
	public void signinPage()
	{
		signinpage.click();
	}
	
}
