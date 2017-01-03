package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import libraries.GenericUtils;

public class ProcurePage 
{
	WebDriver driver;
	//click on Bids
	@FindBy(xpath="//a[text()='Bids']")
	private WebElement bids;
	
	//select start date
	@FindBy(id="ctl00_MainContent_DateTextBox")
	private WebElement startdate;
	
	//select end date
	@FindBy(id="ctl00_MainContent_BidGoodUntilTextBox")
	private WebElement enddate;
	
	//date
	@FindBy(xpath="//div[@title='Tuesday, December 27, 2016']")
	private WebElement date;
		
	//select type
	@FindBy(id="ctl00_MainContent_ddlType")
	private WebElement type;
	
	//company name and decription
	@FindBy(id="ctl00_MainContent_BidCompanyNameTextBox")
	private WebElement cname;
	
	//total amount
	@FindBy(id="ctl00_MainContent_txtTotal")
	private WebElement total;
	
	//click on add
	@FindBy(id="ctl00_MainContent_InsertButton")
	private WebElement add;
	
	//click on aggregate
	@FindBy(xpath="//span[text()='TYss']/../..//img[@src='../Images/View.gif']")
	private WebElement agr;
	
	//email
	@FindBy(xpath="//div[@style='padding-left: 5px; padding-top: 10px;']/..//input[@id='btnEmailExcel']")
	private WebElement email;
	
	//emailid
	@FindBy(id="txtResourcesEmailExcel")
	private WebElement emailID;
	
	//subject
	@FindBy(id="txtSubject")
	private WebElement subject;
	
	//body
	@FindBy(id="txtBody")
	private WebElement body;
	
	//send
	@FindBy(id="Button6")
	private WebElement send;
	
	//download
	@FindBy(id="btnSave")
	private WebElement download;
	
	//checkbox
	@FindBy(xpath="//span[text()='TYss']/../..//input[@id='ctl00_MainContent_GridView1_ctl02_cbRows']")
	private WebElement chkbox;
	
	//delete icon
	@FindBy(xpath="//input[contains(@id,'MainContent_btnDelete')]")
	private WebElement delete;
	
	//confirm
	@FindBy(xpath="//input[contains(@id,'MainContent_btnMultipleRowDelete')]")
	private WebElement confirmdelte;
	
	//checkbox2
	@FindBy(id="ctl00_MainContent_GridView1_ctl03_cbRows")
	private WebElement chkbox2;
	
	//add to estimate
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement addtoestimate;
	
	//Edit procure
	@FindBy(id="ctl00_MainContent_GridView1_ctl02_lblBidCompanyName")
	private WebElement editProcure;
	
	//Bid details
	@FindBy(id="__tab_ctl00_MainContent_TabContainerEdit_TabPanelDetails")
	private WebElement biddetails;
	
	//status
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_DropDownList2")
	private WebElement status;
	
	//bid amout
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidAmountTextBox")
	private WebElement bidamt;
	
	//enter bid date
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidDateTextBox")
	private WebElement biddate;
	
	//enter bid until date
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidGoodUntilTextBox")
	private WebElement biduntil;

	//change company name
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidCompanyNameTextBox")
	private WebElement companyname;
	
	//contact name
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidContactNameTextBox")
	private WebElement contactname;
	
	//trade code
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_ddlTradeCode")
	private WebElement tradecode;
	
	//email
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidEmailTextBox")
	private WebElement emailID1;
	
	//address
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidAddressTextBox")
	private WebElement address;
	
	//city
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidCityTextBox")
	private WebElement city;
	
	//state 
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidStateTextBox")
	private WebElement state;
	
	//zipcode
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidZipCodeTextBox")
	private WebElement zipcode;

	//phone
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidPhoneTextBox")
	private WebElement phone;
	
	//cell phone
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidCellPhoneTextBox")
	private WebElement cellphone;
	
	//fax
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_BidFaxTextBox")
	private WebElement fax;
	
	//save
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelDetails_FormViewDetails_UpdateButton")
	private WebElement save;
	
	//click on work description
	@FindBy(xpath="//span[text()='Work Description']")
	private WebElement workdescription;
	
	//enter description
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelWorkDescription_FormViewWorkDescription_BidWorkDescriptionTextBox")
	private WebElement description;
	
	//click on save
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelWorkDescription_FormViewWorkDescription_UpdateButton")
	private WebElement save1;
	
	//click on spec
	@FindBy(xpath="//span[text()='Specs']")
	private WebElement specs;
		
	//enter text in specs
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_txtNotes")
	private WebElement specstext;
		
	//click on save
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelSpecs_FormViewSpecs_UpdateButton")		
	private WebElement save2;
	
	//********************************************************************
	//click on references and payment
	@FindBy(xpath="//span[text()='References and Payments']")
	private WebElement refandpay;
	
	//enter workers comp
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidHaveWormansCompTextBox")
	private WebElement workers;
	
	//enter workers number
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidWorkersCompNumberTextBox")
	private WebElement wnum;
	
	//enter plan number
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidPlanNumberTextBox")
	private WebElement pnum;
	
	//enter payments
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidPaymentsAsFollowsTextBox")
	private WebElement payment;
	
	//enter reference1
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidReference1TextBox")
	private WebElement ref1;
	
	//enter reference2
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidReference2TextBox")
	private WebElement ref2;
	
	//enter reference3
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidReference3TextBox")
	private WebElement ref3;
	
	//enter reference number1
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidReferenceNumber1TextBox")
	private WebElement refnum1;
	
	//enter reference number2
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidReferenceNumber2TextBox")
	private WebElement refnum2;
		
	//enter reference number3
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidReferenceNumber3TextBox")
	private WebElement refnum3;
	
	//notes
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_BidNotesTextBox")
	private WebElement note;
	
	//click on save4
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelReferences_FormViewReferences_UpdateButton")
	private WebElement save4;
		
	//click on notes
	@FindBy(xpath="//span[text()='Notes']")
	private WebElement notes;
			
	//enter text in note
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_txtNotes")
	private WebElement notetext;
			
	//click on save
	@FindBy(id="ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateButton")		
	private WebElement save3;
	
	//click on done
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement done;
	
	//enter cname to search
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement search;
	
	//click on search icon
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement searchButton;
	
	//click on share
	@FindBy(id="ctl00_MainContent_btnShare")
	private WebElement share;
	
	//click on email
	@FindBy(id="ctl00_MainContent_btnEmailExcel2")
	private WebElement emailprocure;
	
	//***************************************************************************************************
	//search for email ID
	@FindBy(id="ctl00_MainContent_txtBoxSearchReminder")
	private WebElement searchemailID;
	
	//click on search icon 
	@FindBy(id="ctl00_MainContent_Button4")
	private WebElement clicksearchicon;
	
	//click on learn more
	@FindBy(id="ctl00_MainContent_btnLearnMore")
	private WebElement learnmore;
	
	//***************************Material************************************************
	//click on material
	@FindBy(xpath="//a[text()='Materials']")
	private WebElement material;
	
	//click on add item
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement addItem;
	
	//select material to add
	@FindBy(id="ctl00_MainContent_FormViewEstimateInsert_ddlMaterialType")
	private WebElement selectMaterial;
	
	//enter material description
	@FindBy(id="ctl00_MainContent_FormViewEstimateInsert_txtDescription")
	private WebElement matDescription;
	
	//enter quantity
	@FindBy(id="ctl00_MainContent_FormViewEstimateInsert_txtQty")
	private WebElement quantity;
	
	//select unit
	@FindBy(id="ctl00_MainContent_FormViewEstimateInsert_txtUnit")
	private WebElement unit;
	
	//click on material save
	@FindBy(id="ctl00_MainContent_FormViewEstimateInsert_InsertButton")
	private WebElement matSave;
	
	//***************************Material************************************************
	//click on material type
	@FindBy(xpath="//a[text()='General']")
	private WebElement matType;
	
	//select item
	@FindBy(id="ctl00_MainContent_GridView1_ctl02_cbRows")
	private WebElement selectitem;
	
	//click on delete item icon
	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement deleteitemIcon;
	
	//confirm delete item
	@FindBy(id="ctl00_MainContent_btnMultipleRowDelete")
	private WebElement confirmdeleteItem;
	
	//select any material list
	@FindBy(xpath="//a[text()='Doors']")
	private WebElement selectMaterialtype;
	
	//click on item
	@FindBy(xpath="//span[text()='444444']")
	private WebElement item;
	
	//edit add material 
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_DropDownList3")
	private WebElement editAddmaterial;
	
	//edit decription
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_txtDescription")
	private WebElement editDescription;
	
	//edit quantity
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_txtQty")
	private WebElement editQuantity;
	
	//edit unit
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_txtUnit")
	private WebElement editUnit;
	
	//edit save
	@FindBy(id="ctl00_MainContent_FormViewEstimateEdit_UpdateButton")
	private WebElement editSave;
	
	//click on done
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement editDone;
	
	//constructor
	public ProcurePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
		
	//to click on Bids module
	public void clickOnBids()
	{
		bids.click();
	}
	//click on start date
	public void clickonstartdate()
	{
		startdate.click();
	}
	
	//select on start date
	public void selectdate()
	{
		date.click();
	}
	
	//click on end date
	public void clickonenddate(String dt)
	{
		enddate.sendKeys(dt);
	}
	
	//select type
	public void selecttype(int n)
	{
		Select sel=new Select(type);
		sel.selectByIndex(n);
	}
	
	//enter company name n decription
	public void companyname(String str)
	{
		cname.sendKeys(str);
	}
	
	//enter total amout
	public void enterAmount(String amt)
	{
		total.sendKeys(amt);
	}
	
	//click on add
	public void clickonAdd()
	{
		add.click();
	}
	
	//clik on agr
	public void agreement()
	{
		agr.click();
		GenericUtils.switchToWindow("Sub Agreement", driver);
	}
	
	//click on email
	public void clickonEmail()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		email.click();
	}
	
	//enter email ID
	public void enterEmailID(String str1)
	{
		emailID.sendKeys(str1);
	}
	
	//subject
	public void enterSubject(String str2)
	{
		subject.clear();
		subject.sendKeys(str2);
	}
	
	//enter body
	public void enterBody(String str3)
	{
		body.sendKeys(str3);
	}
	
	//click on send
	public void clickonsend()
	{
		send.click();
	}
	
	//click on download
	public void clickondownload()
	{
		download.click();
	}
	
	//click on checkbox
	public void clickoncheckbox()
	{
		chkbox.click();
	}
	
	//click on delete icon
	public void clickondeleteicon()
	{
		delete.click();
	}
	//confirm delete
	public void clickonconfirmdelete()
	{
		confirmdelte.click();
	}
	
	//click on checkbox to add to estimate
	public void clickoncheckbox2()
	{
		chkbox2.click();
	}
	
	//click on add to estimate
	public void clickonaddtoEstimate()
	{
		addtoestimate.click();
	}
	
	//click on edit procure
	public void clickoneditprocure()
	{
		editProcure.click();
	}
	
	//click on bid details
	public void clickonbidDetails()
	{
		biddetails.click();
	}
	
	//select on status
	public void selectStatus(int m)
	{
		Select sel1=new Select(status);
		sel1.selectByIndex(m);
	}
	
	//enter bid amount
	public void enterBidAmount(String a)
	{
		bidamt.clear();
		bidamt.sendKeys(a);
	}
	
	//enter bid date
	public void enterBidDate(String date1)
	{
		biddate.clear();
		biddate.sendKeys(date1);
	}
	
	//enter bid until date
	public void enterBidUntilDate(String date2)
	{
		biduntil.clear();
		biduntil.sendKeys(date2);
	}
	
	//edit company name
	public void editcompanyname(String c)
	{
		companyname.clear();
		companyname.sendKeys(c);
	}
	
	//enter contact name
	public void contactname(String name)
	{
		contactname.clear();
		contactname.sendKeys(name);
	}
	
	//enter trade date
	public void entertradecode(int tcode)
	{
		Select sel3=new Select(tradecode);
		sel3.selectByIndex(tcode);
	}
	
	//enter email id1
	public void enterEmailId1(String eid1)
	{
		emailID1.sendKeys(eid1);
	}
	
	//enter address
	public void enterAddress(String add)
	{
		address.sendKeys(add);
	}
	
	//enter city
	public void enterCity(String cityname)
	{
		city.sendKeys(cityname);
	}
	
	//enter state 
	public void enterState(String statename)
	{
		state.sendKeys(statename);
	}
	
	//enter zipcode
	public void enterZipCode(String zc)
	{
		zipcode.sendKeys(zc);
	}
	
	//phone 
	public void enterPhone(String num)
	{
		phone.sendKeys(num);
	}
	
	//cell phone 
	public void enterCellPhone(String cp)
	{
		cellphone.sendKeys(cp);
	}
	
	//fax
	public void enterfax(String fx)
	{
		fax.sendKeys(fx);
	}
	
	//click on save
	public void clickonsave()
	{
		save.click();
	}
	
	//click on work description
	public void clickonworkdescription()
	{
		workdescription.click();
	}
	
	//enter description
	public void enterDescription(String des)
	{
		description.clear();
		description.sendKeys(des);
	}
	
	//click on save1
	public void clickonsave1()
	{
		save1.click();
	}
	
	//click on work specs
	public void clickonspecs()
	{
		specs.click();
	}
		
	//enter description
	public void entertext(String txt)
	{
		specstext.sendKeys(txt);
	}
		
	//click on save2
	public void clickonsave2()
	{
		save2.click();
	}
	
	//click on notes
	public void clickonnotes()
	{
		notes.click();
	}
			
	//enter notetext
	public void enternotetext(String ntxt)
	{
		specstext.sendKeys(ntxt);
	}
			
	//click on save3
	public void clickonsave3()
	{
		save3.click();
	}
	
	//click on reference and payments
	public void clickonrefandpay()
	{
		refandpay.click();
	}
	
	//enter workers comp
	public void enterWorkercomp(String comp)
	{
		workers.sendKeys(comp);
	}
	
	//enter worker number
	public void enterWorkerNum(String worNum)
	{
		wnum.sendKeys(worNum);
	}
	
	//enter plan number
	public void enterPlanNumber(String plannum)
	{
		pnum.sendKeys(plannum);
	}
	
	//enter payments
	public void enterpayments(String pay)
	{
		payment.sendKeys(pay);
	}
	
	//enter reference1
	public void enterref1(String reff1)
	{
		ref1.sendKeys(reff1);
	}
	
	//enter reference1
	public void enterref2(String reff2)
	{
		ref2.sendKeys(reff2);
	}
		
	//enter reference1
	public void enterref3(String reff3)
	{
		ref3.sendKeys(reff3);
	}
	
	//enter reference number1
	public void enterreferenceNumber1(String reffnum1)
	{
		refnum1.sendKeys(reffnum1);
	}
	
	//enter reference number2
	public void enterreferenceNumber2(String reffnum2)
	{
		refnum2.sendKeys(reffnum2);
	}
		
	//enter reference number3
	public void enterreferenceNumber3(String reffnum3)
	{
		refnum3.sendKeys(reffnum3);
	}
	
	//enter note
	public void enterNote(String txtnote)
	{
		note.sendKeys(txtnote);
	}
	
	//click on save4
	public void clickonSave4()
	{
		save4.click();
	}
	
	//click on done
	public void clickondone()
	{
		done.click();
	}
	
	//enter text to search
	public void enterTexttosearch(String sear)
	{
		search.sendKeys(sear);
	}
	
	//click on search button
	public void clickonsearch()
	{
		searchButton.click();
	}
	
	//click on share
	public void clickonShare()
	{
		share.click();
	}
	
	//click on email procure
	public void clickonemail()
	{
		emailprocure.click();
		GenericUtils.switchToWindow("Email PDF", driver);
	}
	
	//enter Id to search 
	public void searchmailid(String id)
	{
		searchemailID.sendKeys(id);
	}
	//click on search icon
	public void clickonsearchid()
	{
		clicksearchicon.click();
	}
	//click on learnmore
	public void clickonLearnMore()
	{
		learnmore.click();
	}
	
	//click on material
	public void clickonMaterial()
	{
		material.click();
	}
	
	//click on add item
	public void clickonaddItem()
	{
		addItem.click();
	}
	//select material
	public void selectamaterial(int z)
	{
		Select mat=new Select(selectMaterial);
		mat.selectByIndex(z);
	}
	
	//material description
	public void materialDescription(String mdes)
	{
		matDescription.sendKeys(mdes);
	}
	
	//enter quantity
	public void enterQuantity(String qty)
	{
		quantity.clear();
		quantity.sendKeys(qty);
	}
	//select unit
	public void selectUnit(int u)
	{
		Select uni=new Select(unit);
		uni.selectByIndex(u);
	}
	//click on material save
	public void clickonMatSave()
	{
		matSave.click();
	}
	//*****************************************material methods*******************************************
	//select material type
	public void selectMatType()
	{
		matType.click();
	}
	//select item
	public void selectItem()
	{
		selectitem.click();
	}
	//click on delete item icon
	public void clickonDeleteIcon()
	{
		deleteitemIcon.click();
	}
	//click on confirm delete
	public void clickonconfirmdeleteItem()
	{
		confirmdeleteItem.click();
	}
	//select any material
	public void selectoneMaterialType()
	{
		selectMaterialtype.click();
	}
	//click on item
	public void clickonitem()
	{
		item.click();
	}
	//edit add material
	public void clickoneditAddMaterial(int m1)
	{
		Select mat1=new Select(editAddmaterial);
		mat1.selectByIndex(m1);
	}
	
	//edit description
	public void clickoneditDescription(String des)
	{
		editDescription.clear();
		editDescription.sendKeys(des);
	}
	//edit quantity
	public void clickonEditQuantity(String q)
	{
		editQuantity.clear();
		editQuantity.sendKeys(q);
	}
	//edit unit
	public void clickoneditUnit(int u)
	{
		Select usel=new Select(editUnit);
		usel.selectByIndex(3);
		int txtr = usel.getOptions().size();
		System.out.println(txtr);
	}
	//click on save
	public void clickoneditsave()
	{
		editSave.click();
	}
	//click on done edit
	public void clickonDoneEdit()
	{
		editDone.click();
	}
}
