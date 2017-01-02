package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import libraries.GenericUtils;


public class EstimatePage 
{
	@FindBy(xpath="//a[text()='Estimate']")
	private WebElement estimateModule;
	
	@FindBy(xpath="//input[contains(@id,'MainContent_EstInsertOrderNumberTextBox')]")
	private WebElement addItem;
	
	@FindBy(xpath="//input[contains(@id,'MainContent_ItemTextBox')]")
	private WebElement addDescription;
	
	@FindBy(xpath="//input[contains(@id,'ctl00_MainContent_InsertButton')]")
	private WebElement add;
	
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_lbAddNewItem")
	private WebElement additem;
	
	@FindBy(xpath="//span[text()='cement']/../../..//a[@id='ctl00_MainContent_DataPagerGridView1_ctl06_lbAddNewItem']")
	private WebElement checkitem;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtPageNum']")
	private WebElement page;
	
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement searchEstimate;
	
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement searchButton;
	
	@FindBy(xpath="//span[text()='marbels']/../../..//input[@id='ctl00_MainContent_DataPagerGridView1_ctl02_imgBtnShow']")
	private WebElement playIcon;
	
	@FindBy(xpath="(//table[@id='ctl00_MainContent_DataPagerGridView1_ctl02_GridView1']//td[@class='MyGridView hundred-percent align-left'])[1]")
	private WebElement itemdesc;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_Unit']")
	private WebElement itemUnit;
	
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl06_imgEdit")
	private WebElement delItem;
	
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl06_LinkButton2")
	private WebElement selDelete;
	
	@FindBy(id="ctl00_MainContent_btnQuote")
	private WebElement quote;
	
	@FindBy(id="ctl00_MainContent_HyperLink1")
	private WebElement coverSheet;
	
	@FindBy(id="ctl00_MainContent_btnLineQuote")
	private WebElement proposal;
	
	@FindBy(id="ctl00_MainContent_btnProvisions")
	private WebElement provisions;
	
	@FindBy(id="ctl00_MainContent_FormViewVendorRegisterEdit_ProposalGeneralProvisionsTextBox")
	private WebElement generalProvisions;
	
	@FindBy(id="ctl00_MainContent_FormViewVendorRegisterEdit_ProposalNoticesTextBox")
	private WebElement proposalNotices;
	
	@FindBy(id="ctl00_MainContent_FormViewVendorRegisterEdit_UpdateButton")
	private WebElement provisionSave;
	
	@FindBy(id="btnEmailExcel")
	private WebElement proposalMail;
	
	@FindBy(id="txtResourcesEmailExcel")
	private WebElement emailTo;
	
	@FindBy(id="txtSubject")
	private WebElement proSubject;
	
	@FindBy(id="txtBody")
	private WebElement proBody;
	
	@FindBy(id="Button6")
	private WebElement prosend;
	
	@FindBy(id="btnSave")
	private WebElement prodownload;
	
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_imgEditSum")
	private WebElement editicon;
	
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_btnViewDescription")
	private WebElement edititem;	
	
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_txtOrderNumber")
	private WebElement changeItemNum;
	
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_txtDescription")
	private WebElement editDescription;
	
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_IsScope")
	private WebElement seladdtoscope;
	
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_IsEstimate")
	private WebElement seladdtoestimate;
	
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_IsSchedule")
	private WebElement seladdtoschedule;
	
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_UpdateButton")
	private WebElement saveEditedstimate;
	
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_btnDelete")
	private WebElement deleteEstimate;
	
	WebDriver driver;
	
	public EstimatePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void clickonestimate()
	{
		estimateModule.click();
	}
	
	public void enterItemNumber(String inum)
	{
		addItem.sendKeys(inum);
	}
	
	public void enterDescription(String idesc)
	{
		addDescription.sendKeys(idesc);
	}
	
	public void clickonadd()
	{
		add.click();
	}
	
	public void searchforEstimate(String ser)
	{
		searchEstimate.sendKeys(ser);
	}
	
	public void clickonsearchbutton()
	{
		searchButton.click();
	}
	
	public void clickonadditem(int count)
	{
		for(int i=0;i<count;i++)
		{
			additem.click();	
		}
	}
	
	public void clickoncheckitem()
	{
		checkitem.click();
	}
	
	public void pagenum(String pnum)
	{
		page.clear();
		page.sendKeys(pnum);
		page.submit();
	}
	 public void clickonPlayIcon()
	 {
		 playIcon.click();
	 }
	 public void enterItemDescription(String itemdes)
	 {
		 Actions act=new Actions(driver);
		 act.moveToElement(itemdesc).click().perform();
		 itemdesc.sendKeys(itemdes);
	 }
	 
	 public void enteritemUnit(int u)
	 {
		 itemUnit.click();
		 Select usel=new Select(itemUnit);
		 usel.selectByIndex(u);
	 }
	 public void clickonDeleteIcon()
	 {
		 delItem.click();
		 selDelete.click();
		 driver.switchTo().alert().accept();
	 }
	 public void clickonquote()
	 {
		 quote.click();
	 }
	 public void clickoncoversheet()
	 {
		 coverSheet.click();
	 }
	 public void clickonproposal()
	 {
		 proposal.click();
		 GenericUtils.switchToWindow("Proposal", driver); 
	 }
	 public void clickonproposalMail()
	 {
		 proposalMail.click();
	 }
	 public void clickonprovisions()
	 {
		 provisions.click();
	 }
	 public void entergeneralprovisons(String gp)
	 {
		 generalProvisions.clear();
		 generalProvisions.sendKeys(gp);
	 }
	 public void enterproposalNotices(String pn)
	 {
		 proposalNotices.clear();
		 proposalNotices.sendKeys(pn);
		 provisionSave.click();
	 }
	 public void enterEmailto(String emailID)
	 {
		 emailTo.clear();
		 emailTo.sendKeys(emailID);
	 }
	 public void enterProSubject(String sub)
	 {
		 proSubject.sendKeys(sub);
	 }
	 public void enterProBody(String pbody)
	 {
		 proBody.sendKeys(pbody);
	 }
	 public void clickonprosend()
	 {
		 prosend.click();
	 }
	 public void clickonproDownload()
	 {
		 GenericUtils.switchToWindow("Proposal", driver);
		 prodownload.click();
	 }
	 public void clickonediticon()
	 {
		 editicon.click();
	 }
	 public void clickonedititem()
	 {
		 edititem.click();
	 }
	 public void changeitemnum(String changeIN)
	 {
		 changeItemNum.clear();
		 changeItemNum.sendKeys(changeIN);
	 }
	 public void changeDescription(String changeDesc)
	 {
		 editDescription.clear();
		 editDescription.sendKeys(changeDesc);
	 }
	 public void clickonaddtoscope()
	 {
		 seladdtoscope.click();
	 }
	 public void clickonaddtoestimate()
	 {
		 if(seladdtoestimate.isSelected())
		 {
			 System.out.println("Add to Estimate is selected");
		 }
		 else
		 {
			 seladdtoestimate.click();
		 }
	 }
	 public void clickonaddtoschedule()
	 {
		 seladdtoschedule.click();
	 }
	 public void clickonsaveestimate()
	 {
		 saveEditedstimate.click();
	 }
	 public void clickondeleteEstimate()
	 {
		 deleteEstimate.click();
		 driver.switchTo().alert().accept();

	 }
}
