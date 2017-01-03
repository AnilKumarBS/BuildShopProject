package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotosPage
{
public WebDriver driver;
    
    public PhotosPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[text()='Photos']")
    public WebElement photos;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnAddPhototoAlbum']")
    public WebElement addalbum;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewPhotoAlbumInsert_TitleTextBox']")
    public WebElement albumname;
    
																	    //@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewPhotoAlbumInsert_FileUpload1']")
																	    //public WebElement browse;
    
    @FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewPhotoAlbumInsert_DescriptionTextBox']")
    public WebElement description;
  
    @FindBy(xpath="//input[@id='ctl00_MainContent_FormViewPhotoAlbumInsert_InsertButton']")
    public WebElement save;
  
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnBackToAlbum']")
    public WebElement done;
    
    public void PhotosMethod() throws InterruptedException
    {
    	photos.click();
    	Thread.sleep(2000);
    	
    	addalbum.click();
    	Thread.sleep(2000);
    	
    	albumname.sendKeys("Album1");
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,400)");			
    	Thread.sleep(2000);
    	
    	description.sendKeys("Very beautiful album");
    	Thread.sleep(2000);
    	
    	save.click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	js1.executeScript("window.scrollBy(0,-400)");			
    	Thread.sleep(2000);
    	
    	done.click();
    	Thread.sleep(2000);
																    	//browse.click();    	   	
																    	//browse.sendKeys("C:/path/to/Album1.jpg");
																    	//Thread.sleep(2000); 
    }
}
    
    