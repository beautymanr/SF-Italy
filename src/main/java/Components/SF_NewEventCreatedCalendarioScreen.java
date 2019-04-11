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
public class SF_NewEventCreatedCalendarioScreen {
	public static WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(UTL_Salesforce_LoginAll.class.getName());
	JSONReader jreader;
	public  SF_NewEventCreatedCalendarioScreen(WebDriver driver) throws IOException 
	{
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		jreader=new JSONReader();
		jreader.Reader();
		
	}
	public WebElement getSP_CalendarioLink() {
		return(driver.findElement(By.xpath(reader.getSP_CalendarioLink())));
	}
	public void Calendario() throws InterruptedException {
		getSP_CalendarioLink().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
	
