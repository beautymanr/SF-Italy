package PandGApplicationPages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Envirnoment.Setup.ConfigReader;
import junit.framework.Assert;

public class OAB2B_ChooseCustomerShipToProductMix 
{
	public static WebDriver driver;
	public static ConfigReader reader;
	public static Logger log = LogManager.getLogger(OAB2B_ChooseCustomerShipToProductMix.class.getName());

	public OAB2B_ChooseCustomerShipToProductMix(WebDriver driver) 
	{
		this.driver = driver;
		log.info("Got chrome driver instance");
		reader = new ConfigReader();
	}
	public WebElement client_Click() 
	{
		return driver.findElement(By.xpath(reader.getClientClick()));
	}
	public static List<WebElement> selectClient_Config() 
	{
		return driver.findElements(By.xpath(reader.getSelectClient()));
	}
	public WebElement delivery_Click() 
	{
		return driver.findElement(By.cssSelector(reader.getDeliveryClick()));
	}
	public List<WebElement> selectDelivery_config() 
	{
		return driver.findElements(By.xpath(reader.getSelectDelivery()));
	}

	
	
	public void selectClient() throws InterruptedException
	{
		client_Click().click();
		List<WebElement> client=(List<WebElement>) selectClient_Config();

        for(int i=0;i<client.size();i++)
        {
              Thread.sleep(3000);
              WebElement element =client.get(i);
              
              String innerHTML = element.getAttribute("innerHTML");
              
              if(innerHTML.contentEquals("CASA AYALA"))
                    
              {
                    element.click();
                    break;
              }
        }
        log.info("Selected Client !!!!!");
             
        
	}
	
	
	public void selectDelivery() throws InterruptedException
    {
		Thread.sleep(3000);
		delivery_Click().click();
		    List<WebElement> delivery = (List<WebElement>) selectDelivery_config();
		    
		    for(int i=0;i<delivery.size();i++)
		    {
		          
		          WebElement element =delivery.get(i);
		          
		          String innerText = element.getAttribute("innerText");
		          
		          if(innerText.contentEquals("CARR INTERNACIONAL KM 1845 CAJEME"))
		                
		          {
		                element.click();
		                break;
		          }
		    }
		    log.info("Select Delivery !!!!!");
 }
	public void verifyHomePage() 
	{
		Assert.assertEquals(driver.getTitle(), "Home page");	
		log.info("Verified Homes !!!!!");

	}
}
