package TestCases;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Components.UTL_SalesForce_Login;
import Components.SF_ExportReports;
import Components.SF_WebSearch;
import Components.UTL_Salesforce_Logout;
import ObjectRepository.Base;
public class CISCISE_Advisor_ExportReports extends Base{
	
	@Test
	public void CISCISE_Advisor_ExportReports() {
		driver = initialiseDriver();
		try {
			UTL_SalesForce_Login sf1 = new UTL_SalesForce_Login(driver);
			sf1.Login1();
			SF_WebSearch sfw= new SF_WebSearch(driver);
			sfw.webSearch1();
			SF_ExportReports sfe= new SF_ExportReports(driver);
			sfe.ExportReports();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
