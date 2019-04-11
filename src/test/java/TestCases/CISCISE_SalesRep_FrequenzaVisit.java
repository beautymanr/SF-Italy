package TestCases;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Components.SF_FrequenzaVisiteFYTD;
import Components.UTL_Salesforce_LoginAll;
import Components.SF_WebSearch;
import Components.UTL_SalesForce_Login;
import Components.UTL_Salesforce_Logout;
import ObjectRepository.Base;
public class CISCISE_SalesRep_FrequenzaVisit extends Base {
	@Test
	public void CISCISE_SalesRep_FrequenzaVisit() {
		driver=initialiseDriver();
		try {
			UTL_SalesForce_Login sfl= new UTL_SalesForce_Login(driver);
			sfl.Login2();
			SF_WebSearch ws= new SF_WebSearch(driver);
			ws.webSearch2();
			SF_FrequenzaVisiteFYTD fv= new SF_FrequenzaVisiteFYTD(driver);
			fv.FrequenzaVisiteFYTD();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}


}
