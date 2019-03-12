package ObjectRepo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Envirnoment.Setup.ConfigReader;

public class Base 
{
	public static WebDriver driver;
	public WebDriver initialiseDriver()
	{
		ConfigReader reader = new ConfigReader();
		
		String browswerName = reader.getBrowser();
		if(browswerName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", reader.getchromePath());
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
		
		}
		else if(browswerName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browswerName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\b.n.3\\EndToEndDigitalization\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browswerName.equals("safari"))
		{
			//code for safari
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	public static void highLightElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 
	try 
	{
		Thread.sleep(500);
	} 
	catch (InterruptedException e) 
	{
	 
		System.out.println(e.getMessage());
	} 
	 
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	 
	}
	public static void waitForPage()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
	public WebDriver closeBroswer()
	{
		driver.close();
		 return driver;
		
		
	}

}
