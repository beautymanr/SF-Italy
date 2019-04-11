package Components;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import EnvirnomentSetup.ConfigReader;
import Resources.JSONReader;
public class SF_ExportReports {
	public static WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(UTL_Salesforce_LoginAll.class.getName());
	JSONReader jreader;
	public SF_ExportReports (WebDriver driver) throws IOException 
	{
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		jreader=new JSONReader();
		jreader.Reader();
		
	}

	public WebElement getSP_ReportsLink() {
		return(driver.findElement(By.xpath(reader.getSP_ReportsLink())));
	}
	public WebElement getSP_AllReportsLink() {
		return(driver.findElement(By.xpath(reader.getSP_AllReportsLink())));
	}
	public WebElement getSP2_SearchBox() {
		return(driver.findElement(By.xpath(reader.getSP2_SearchBox())));
	}
	
	/*public WebElement getSP2_ListaClientiLink() {
		return(driver.findElement(By.xpath("//*[@class= \"slds-grid slds-grid_align-spread\"]//a[@title=\"Lista Clienti\"]")));
	}*/
	
	
	public WebElement getSP2_ListaClientiLink() {
		return(driver.findElement(By.xpath(reader.getSP2_ListaClientiLink())));
	}
	
	public WebElement getSP2_DownArrow() {
		return(driver.findElement(By.xpath(reader.getSP2_DownArrow())));
	}
	public WebElement getSP2_ExportLink() {
		return(driver.findElement(By.xpath(reader.getSP2_ExportLink())));
	}
	public WebElement getSP2_FormattedReportLink() {
		return(driver.findElement(By.xpath(reader.getSP2_FormattedReportLink())));
	}
	public WebElement getSP2_ExportButton() {
		return(driver.findElement(By.xpath(reader.getSP2_ExportButton())));
	}
	public void ExportReports(){
		try {
			getSP_ReportsLink().click();
			Thread.sleep(5000);
			getSP_AllReportsLink().click();
			Thread.sleep(5000);
			getSP2_SearchBox().sendKeys(jreader.productmap.get("SearchLista"));
			Thread.sleep(5000);
			getSP2_ListaClientiLink().click();
			Thread.sleep(5000);
			
			getSP2_DownArrow().click();
			Thread.sleep(2000);
			getSP2_ExportLink().click();
			Thread.sleep(2000);
			getSP2_FormattedReportLink().click();
			Thread.sleep(2000);
			getSP2_ExportButton().click();
			Thread.sleep(2000);
		}
		 catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
