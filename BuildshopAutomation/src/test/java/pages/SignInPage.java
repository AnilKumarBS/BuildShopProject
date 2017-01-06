package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraries.ExcelLibrary;

public class SignInPage 
{
public WebDriver driver;
    
    public SignInPage(WebDriver driver)
    {
        this.driver=driver;
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
    	String username = ExcelLibrary.getExcelData("datafile.xls","SignIN",2,0);
        un.sendKeys(username);
        String password = ExcelLibrary.getExcelData("datafile.xls","SignIN",2,1);
        pw.sendKeys(password);
        signinButton.click();
    }
    
    public void SamBruceSignInMethod()
    {
    	String username = ExcelLibrary.getExcelData("datafile.xls","SignIN",6,0);
        un.sendKeys(username);
        String password = ExcelLibrary.getExcelData("datafile.xls","SignIN",6,1);
        pw.sendKeys(password);
        signinButton.click();    	
    }
    
    public void MirandaJacobSignInMethod()
    {
    	String username = ExcelLibrary.getExcelData("datafile.xls","SignIN",10,0);
        un.sendKeys(username);
        String password = ExcelLibrary.getExcelData("datafile.xls","SignIN",10,1);
        pw.sendKeys(password);
        signinButton.click();    	
    }

}