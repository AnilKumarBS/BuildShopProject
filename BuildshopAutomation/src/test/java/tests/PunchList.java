package tests;

import org.testng.annotations.Test;

import pages.MainPage;
import pages.ManageDashboardPage;
import pages.ManageHomePage;
import pages.PunchListPage;
import pages.ScheduleSubModulesPage;
import pages.SignInPage;
import pages.ToDoListPage;

public class PunchList extends BaseClass 
{
	  @Test
	  public void PunchListPage() throws InterruptedException 
	{
	      MainPage mp = new MainPage(driver);
	      mp.signinPage();
	      
	      SignInPage sp=new SignInPage(driver);
	      sp.SignInMethod();  
	      
	      ManageHomePage hp=new ManageHomePage(driver);
	      hp.ManageHomePageMethod();  
	      
	      ManageDashboardPage d=new ManageDashboardPage(driver);
	      d.ManageDashboardMethod();
	      
	      ScheduleSubModulesPage ssmp= new ScheduleSubModulesPage(driver);
	      ssmp.ScheduleSubModulesMethod();
	      
	      ToDoListPage tdlp=new ToDoListPage(driver);
	      tdlp.ToDoListMethod();
	      
	      /*PhotosPage pp=new PhotosPage(driver);
	      pp.PhotosMethod();
	      
	      ChangeOrdersPage cop=new ChangeOrdersPage(driver);
	      cop.ChangeOrdersMethod();*/
	      
	      PunchListPage plp=new PunchListPage(driver);
	      plp.PunchListMethod();
	}
}