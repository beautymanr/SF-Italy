package Components;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import EnvirnomentSetup.ConfigReader;
import Resources.JSONReader;
public class SF_NewEventCreatedOggiPage {
	public static WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(UTL_Salesforce_LoginAll.class.getName());
	JSONReader jreader;
	public  SF_NewEventCreatedOggiPage(WebDriver driver) throws IOException 
	{
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		jreader=new JSONReader();
		jreader.Reader();
		
	}
	public WebElement getSP_OggiLink() {
		return(driver.findElement(By.xpath(reader.getSP_OggiLink())));
	}
	public WebElement getSP_OggiPage() {
		return(driver.findElement(By.xpath(reader.getSP_OggiPage())));
	}
	public WebElement getOP_NameLink() {
		return(driver.findElement(By.xpath(reader.getOP_NameLink())));
	}
	public void createOggi() {
		getSP_OggiLink().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		getSP_OggiPage().isDisplayed();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String Name= getOP_NameLink().getText();
		System.out.println(Name);
		
		getOP_NameLink().click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
}
