package PandGApplicationPages;

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

import Envirnoment.Setup.ConfigReader;

public class OAB2B_Login 
{
	public WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(OAB2B_Login.class.getName());
	public OAB2B_Login(WebDriver driver) throws IOException 
	{
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		
	}
	public WebElement getEmail()
	{
		log.info("Got Email ID ");
		return driver.findElement(By.xpath(reader.getemail()));
	}
	
	public WebElement getPassword() 
	{
		log.info("Got Password");
		return driver.findElement(By.xpath(reader.getpassword()));
	}
	public WebElement getGO() 
	{
		log.info("Clicked on go");
		return driver.findElement(By.xpath(reader.getEnter()));
	}
	/*public OAB2B_Login(String go, String Email, String Password) 
	{
		try {
			getEmail().sendKeys(Email);
			Thread.sleep(5000);
			getPassword().sendKeys(Password);
			Thread.sleep(5000);
			getGO().click();
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}*/

}
