package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;
import pages.HomePage;
import pages.ChangeOrdersPage;

public class ChangeOrders extends BaseClass 
{
	  @Test
	  public void ToDoListPage() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  
	      
	      HomePage hp=new HomePage(driver);
	      hp.HomePageMethod();    
	      
	      /*DashboardPage d=new DashboardPage(driver);
	      d.DashboardMethod();
	      
	      ScheduleSubModulesPage ssmp= new ScheduleSubModulesPage(driver);
	      ssmp.ScheduleSubModulesMethod();
	      
	      ToDoListPage tdlp=new ToDoListPage(driver);
	      tdlp.ToDoListMethod();
	      
	      PhotosPage pp=new PhotosPage(driver);
	      pp.PhotosMethod();*/
	      
	      ChangeOrdersPage cop=new ChangeOrdersPage(driver);
	      cop.ChangeOrdersMethod();
	}
}