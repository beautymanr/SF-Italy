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

public class SF_Dashboards 
{
	public static WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(UTL_SalesForce_Login.class.getName());
	JSONReader jreader;
	public  SF_Dashboards(WebDriver driver) throws IOException 
	{
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		jreader=new JSONReader();
		jreader.Reader();	
	}
	
	public WebElement getSP3_DashboardsLink()
	{
		System.out.println("In Component Method");
		return(driver.findElement(By.xpath(reader.getSP3_DashboardsLink())));
	}
	
	public WebElement getSP3_AllDashboards()
	{
		return(driver.findElement(By.xpath("//*[@class=\"slds-nav-vertical__action\" and @title=\"All Dashboards\"]")));
	}
	
	public WebElement getSP3_SearchAllDashboard()
	{
		return(driver.findElement(By.xpath("//input[@class=\"search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input\"]")));
	}
	
	public WebElement getSP3_StatusVisiteSALESREP()
	{
		return(driver.findElement(By.xpath("//span[contains(text(),' Visite SALES REP')]")));
	}
	public void MyDashboard()
	{
		System.out.println("In My dashboard method");
		getSP3_DashboardsLink().click();
		System.out.println("Dashboard Method");
		getSP3_AllDashboards().click();
		
	}
	
}
