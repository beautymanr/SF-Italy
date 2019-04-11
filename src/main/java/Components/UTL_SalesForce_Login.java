package Components;
import java.io.FileInputStream;
import Components.SF_GenericSalesforceandMyDomainURL;
import Components.UTL_Salesforce_Logout;
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

public class  UTL_SalesForce_Login {

	public static WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(UTL_Salesforce_LoginAll.class.getName());
	JSONReader jreader;
	public  UTL_SalesForce_Login(WebDriver driver) throws IOException 
	{
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		jreader=new JSONReader();
		jreader.Reader();
		
	}
	public WebElement getUserName()
	{
		log.info("Got Email ID ");
		return driver.findElement(By.xpath(reader.getLoginPage_UserName()));
	}
	
	public WebElement getPassword() 
	{
		log.info("Got Password");
		return driver.findElement(By.xpath(reader.getLoginPage_password()));
	}
	public WebElement getGO() 
	{
		log.info("Clicked on go");
		return driver.findElement(By.xpath(reader.getLoginPage_LoginButton()));

	}
	public void Login1() throws IOException 
	{  		
			driver.get(jreader.productmap.get("URL"));
			getUserName().sendKeys("italypharma_adv@pg.com.autotest");
			getPassword().sendKeys(jreader.productmap.get("Password"));
			getGO().click();
	}
	public void Login2() throws IOException 
	{  		
			driver.get(jreader.productmap.get("URL"));
			getUserName().sendKeys("italypharma_sr@pg.com.autotest");
			getPassword().sendKeys(jreader.productmap.get("Password"));
			getGO().click();
	}
	public void Login3() throws IOException 
	{  		
			driver.get(jreader.productmap.get("URL"));
			getUserName().sendKeys(jreader.productmap.get("UserName3"));
			getPassword().sendKeys(jreader.productmap.get("Password"));
			getGO().click();
	}
	}
