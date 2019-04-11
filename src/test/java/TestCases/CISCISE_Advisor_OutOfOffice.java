package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Components.UTL_SalesForce_Login;
import Components.SF_WebSearch;
import Components.UTL_Salesforce_Logout;
import ObjectRepository.Base;
import Components.SF_Dashboards;

public class CISCISE_Advisor_OutOfOffice extends Base
{
	@Test
  public void CISCISE_Advisor_OutOfOffice() throws IOException
  {
	  driver=initialiseDriver();
	  UTL_SalesForce_Login sf1 = new UTL_SalesForce_Login(driver);
		sf1.Login3();
	  SF_WebSearch web=new SF_WebSearch(driver);
	  web.webSearch4();
	  SF_Dashboards sfd=new SF_Dashboards(driver);
	  sfd.MyDashboard();
  }
}
