package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;
//import pages.HomePage;
import pages.HomePage1;
import pages.FinancialDashboardPage;
import pages.FinancialBudgetExpensesPage;
import pages.FinancialInvoicePage;
import pages.FinancialPurchaseOrdersPage;

public class FinancialPurchaseOrder extends BaseClass 
{
	  @Test
	  public void FinancialPurchaseOrdersPage() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  	      
	          
	      HomePage1 hp=new HomePage1(driver);
	      hp.HomePage1Method();  
	      
	      FinancialDashboardPage fdp=new FinancialDashboardPage(driver);
	      fdp.FinancialDashboardPageMethod();
	      
	      FinancialBudgetExpensesPage bep=new FinancialBudgetExpensesPage(driver);  
	      bep.FinancialBudgetExpensesPageMethod();
	      
	      FinancialInvoicePage fip=new FinancialInvoicePage (driver);
	      fip.FinancialInvoicePageMethod();	
	      
	      FinancialPurchaseOrdersPage fpop=new FinancialPurchaseOrdersPage (driver);
	      fpop.FinancialPurchaseOrdersPageMethod();
	}	
}