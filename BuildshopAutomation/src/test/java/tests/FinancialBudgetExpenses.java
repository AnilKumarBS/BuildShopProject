package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;
//import pages.HomePage;
import pages.HomePage1;
import pages.FinancialDashboardPage;
import pages.FinancialBudgetExpensesPage;

public class FinancialBudgetExpenses extends BaseClass 
{
	  @Test
	  public void FinancialBudgetExpensesPage() throws InterruptedException 
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
	}	
}