package TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Components.UTL_SalesForce_Login;
import Components.SF_WebSearch;
import Components.UTL_Salesforce_Logout;
import Components.SF_ExportReports;
import Components.SF_NewEventCreatedCalendarioScreen;
import Components.SF_NewEventCreatedOggiPage;
import Components.SF_NewEventCreationExistingAccount;
import ObjectRepository.Base;
public class CISCISE_SalesRep_Visit_Clienti extends Base{
	@Test
	public void CISCISE_SalesRep_Visit_Clienti() throws InterruptedException {
    driver = initialiseDriver();
    try {
		UTL_SalesForce_Login sf1 = new UTL_SalesForce_Login(driver);
		sf1.Login2();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		SF_WebSearch sfw= new SF_WebSearch(driver);
		sfw.webSearch3();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		SF_NewEventCreationExistingAccount sfn= new SF_NewEventCreationExistingAccount(driver);
		sfn.createAccount();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		sfw.webSearch5();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		SF_NewEventCreatedCalendarioScreen sfnc= new SF_NewEventCreatedCalendarioScreen(driver);
		sfnc.Calendario();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		sfw.webSearch6();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		SF_NewEventCreatedOggiPage snc= new SF_NewEventCreatedOggiPage(driver);
		snc.createOggi();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
		
}
}
