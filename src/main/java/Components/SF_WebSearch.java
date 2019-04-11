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
public class SF_WebSearch {

	public static WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(UTL_Salesforce_LoginAll.class.getName());
	JSONReader jreader;
	public  SF_WebSearch(WebDriver driver) throws IOException 
	{
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		jreader=new JSONReader();
		jreader.Reader();
		
	}
	
	public WebElement getHP_NineDotBox() {
		return(driver.findElement(By.xpath(reader.getHP_NineDotBox())));
	}
	 
	public WebElement getSP_SearchBox() {
		System.out.println("in search box element");
		return(driver.findElement(By.xpath(reader.getSP_SearchBox())));
	}
	
	public void webSearch1() {
		try {
			getHP_NineDotBox().click();
			System.out.println("Clicked NineDotBox");
			Thread.sleep(5000);
			getSP_SearchBox().sendKeys(jreader.productmap.get("SearchReports"));
			Thread.sleep(5000);
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void webSearch2() {
		try {
			getHP_NineDotBox().click();
			Thread.sleep(5000);
			getSP_SearchBox().sendKeys(jreader.productmap.get("SearchFreq"));
			Thread.sleep(5000);
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void webSearch3() {
		try {
			getHP_NineDotBox().click();
			Thread.sleep(5000);
			getSP_SearchBox().sendKeys(jreader.productmap.get("SearchClienti"));
			Thread.sleep(5000);
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void webSearch4() {
		try {
			getHP_NineDotBox().click();
			Thread.sleep(5000);
			getSP_SearchBox().sendKeys(jreader.productmap.get("SearchDashboards"));
			Thread.sleep(5000);
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void webSearch5() {
		try {
			getHP_NineDotBox().click();
			Thread.sleep(5000);
			getSP_SearchBox().sendKeys(jreader.productmap.get("SearchCalendario"));
			Thread.sleep(5000);
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void webSearch6() {
		try {
			getHP_NineDotBox().click();
			Thread.sleep(5000);
			getSP_SearchBox().sendKeys(jreader.productmap.get("SearchOggi"));
			Thread.sleep(5000);
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void webSearch7() {
		try {
			getHP_NineDotBox().click();
			Thread.sleep(5000);
			getSP_SearchBox().sendKeys(jreader.productmap.get("SearchPharma"));
			Thread.sleep(5000);
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void webSearch8() {
		try {
			getHP_NineDotBox().click();
			Thread.sleep(5000);
			getSP_SearchBox().sendKeys(jreader.productmap.get("SearchLightning"));
			Thread.sleep(5000);
			
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
