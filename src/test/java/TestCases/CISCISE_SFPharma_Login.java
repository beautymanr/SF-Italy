package TestCases;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Components.SF_WebSearch;
import Components.UTL_SalesForce_Login;
import Components.UTL_Salesforce_LoginAll;

import ObjectRepository.Base;
public class CISCISE_SFPharma_Login extends Base{
	@Test
	public void CISCISE_SFPharma_Login() {
			driver=initialiseDriver();
		try {
			
			UTL_Salesforce_LoginAll sf1 = new UTL_Salesforce_LoginAll(driver);
			sf1.Login();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}

}
