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
import pages.FinancialOverviewPage;

public class FinancialOverview extends BaseClass 
{
	  @Test
	  public void FinancialOverviewPage() throws InterruptedException 
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
	      
	      FinancialOverviewPage fop=new FinancialOverviewPage (driver);
	      fop.FinancialOverviewPageMethod();
	}	
}