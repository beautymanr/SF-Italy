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
public class SF_FrequenzaVisiteFYTD {
	public static WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(UTL_Salesforce_LoginAll.class.getName());
	JSONReader jreader;
	public  SF_FrequenzaVisiteFYTD(WebDriver driver) throws IOException 
	{
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		jreader=new JSONReader();
		jreader.Reader();
		
	}
	 public WebElement getSP2_FrequenzaVisiteFYTDLink() {
		 return(driver.findElement(By.xpath(reader.getSP2_FrequenzaVisiteFYTDLink())));
	 }
	 public WebElement getSP2_VistaRepPieChartImage() {
		 return(driver.findElement(By.xpath(reader.getSP2_VistaRepPieChartImage())));
	 }
	 public WebElement getSP2_Names() {
		 return(driver.findElement(By.xpath(reader.getSP2_Names())));
	 }
	 public WebElement getSP2_NameLink() {
		 return(driver.findElement(By.xpath(reader.getSP2_NameLink())));
	 }
	 public WebElement getSP2_AccountViewScreen() {
		 System.out.println("in account view sceeen window");
		 return(driver.findElement(By.xpath(reader.getSP2_AccountViewScreen())));
	 }
	 public WebElement getSP2_DropDownsDisplay() {
		 System.out.println("in dropdown window");
		 return(driver.findElement(By.xpath(reader.getSP2_DropDownsDisplay())));
	 }
	 public WebElement getSP2_StatusDropDown() {
		 return(driver.findElement(By.xpath(reader.getSP2_StatusDropDown())));
	 }
	 public void FrequenzaVisiteFYTD() {
		 getSP2_FrequenzaVisiteFYTDLink().click();
		 getSP2_VistaRepPieChartImage().isDisplayed();
		 getSP2_Names().isDisplayed();
		 getSP2_NameLink().click();
		 getSP2_AccountViewScreen().isDisplayed();
		 driver.navigate().back();
		 getSP2_DropDownsDisplay().isDisplayed();
		 getSP2_StatusDropDown().click();
		 
	 }
	 
}
