package PandGApplicationPages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Envirnoment.Setup.ConfigReader;
import ObjectRepo.Base;
import junit.framework.Assert;

public class OAB2B_PriceVerification extends Base
{
	public static WebDriver driver;
	public static ConfigReader reader;
	public static Logger log = LogManager.getLogger(OAB2B_AddingProductToCart.class.getName());
	
	public OAB2B_PriceVerification(WebDriver driver)
	{
		this.driver=driver;
		reader = new ConfigReader();
	}
	
	public WebElement billingSection() 
	{
		return driver.findElement(By.xpath(reader.getbillingSection()));
	}
	
	public WebElement deliveryAddress() 
	{
		return driver.findElement(By.xpath(reader.getdeliveryAddress()));
	}
	
	public WebElement deliveryDetails() 
	{
		return driver.findElement(By.xpath(reader.getdeliveryDetails()));
	}
	
	public WebElement excelSummary() 
	{
		return driver.findElement(By.xpath(reader.getexcelSummary()));
	}
	
	public WebElement pdfSummary() 
	{
		return driver.findElement(By.xpath(reader.getpdfSummary()));
	}
	
	public WebElement subTotal() 
	{
		return driver.findElement(By.xpath(reader.getsubTotal()));
	}
	
	public WebElement agreementCheckbox() 
	{
		return driver.findElement(By.xpath(reader.getagreementCheckbox()));
	}
	
	public WebElement makeOrder() 
	{
		return driver.findElement(By.xpath(reader.getmakeOrder()));
	}
	
	public WebElement checkPriceHeader() 
	{
		return driver.findElement(By.xpath(reader.getcheckPriceHeader()));
	}
	
	public WebElement arrivalDate() 
	{
		return driver.findElement(By.xpath(reader.getarrivalDate()));
	}
	
	public WebElement verifyPriceSection() 
	{
		return driver.findElement(By.xpath(reader.getverifyPriceSection()));
	}
	
	public WebElement subTotalSection() 
	{
		return driver.findElement(By.xpath(reader.getsubTotalSection()));
	}
	
	public WebElement taxSection() 
	{
		return driver.findElement(By.xpath(reader.gettaxSection()));
	}
	
	public WebElement grandTotal() 
	{
		return driver.findElement(By.xpath(reader.getgrandTotal()));
	}
	
	public WebElement orderSuccessMessage() 
	{
		return driver.findElement(By.xpath(reader.getorderSuccessMessage()));
	}
	
	public WebElement returnStore() 
	{
		return driver.findElement(By.xpath(reader.getreturnStore()));
	}
	
	public WebElement goOut() 
	{
		return driver.findElement(By.xpath(reader.getgoOut()));
	}
	
	public void purchaseSummaryVerification() throws InterruptedException
    {
          System.out.println("In side purchaseSummaryVerification");
          boolean bill=billingSection().isDisplayed();
          if(bill==true)
          {
                Assert.assertTrue(bill);
                System.out.println("BillingSection is Displayed");
          }
          else
          {
                Assert.assertFalse(bill);
          }
          boolean deliveryAddress=deliveryAddress().isDisplayed();
          if(deliveryAddress==true)
          {
                Assert.assertTrue(deliveryAddress);
                System.out.println("deliveryAddress is displayed");
          }
          else
          {
                Assert.assertFalse(deliveryAddress);
          }
          
          boolean deliveryDetails=deliveryDetails().isDisplayed();
          if(deliveryDetails==true)
          {
                Assert.assertTrue(deliveryDetails);
                System.out.println("deliveryDetails section is displayed");
          }
          else
          {
                Assert.assertFalse(deliveryDetails);
          }
          
          boolean excelSummary=excelSummary().isDisplayed();
          if(excelSummary==true)
          {
                Assert.assertTrue(excelSummary);
                System.out.println("excelSummary link is available");
          }
          else
          {
                Assert.assertFalse(excelSummary);
                System.out.println("excelSummary link is  not available");
          }
          
          boolean pdfSummary=pdfSummary().isDisplayed();
          if(pdfSummary==true)
          {
                Assert.assertTrue(pdfSummary);
                System.out.println("pdfSummary link is available");
          }
          else
          {
                Assert.assertFalse(pdfSummary);
                System.out.println("pdfSummary link is not available");
          }
          
          boolean subTotal=subTotal().isDisplayed();
          if(subTotal==true)
          {
                Assert.assertTrue(subTotal);
                System.out.println("subTotal section is available");
          }
          else
          {
                Assert.assertFalse(subTotal);
          }
          
          boolean makeOrder=makeOrder().isDisplayed();
          if(makeOrder==true)
          {
                Assert.assertTrue(makeOrder);
                System.out.println("MakeOrder button is available");
          }
          else
          {
                Assert.assertFalse(makeOrder);
          }
          
          boolean checkPriceHeader=checkPriceHeader().isDisplayed();
          if(checkPriceHeader==true)
          {
                Assert.assertTrue(checkPriceHeader);
                System.out.println("checkPriceHeader section is available");
          }
          else
          {
                Assert.assertFalse(checkPriceHeader);
          }
          
          boolean verifyPriceSection=verifyPriceSection().isDisplayed();
          if(verifyPriceSection==true)
          {
                Assert.assertTrue(verifyPriceSection);
                System.out.println("Price Check/Verify button is available()");
          }
          else
          {
                Assert.assertFalse(verifyPriceSection);
          }
          
          
          System.out.println("enter Date inside purchaseSummaryVerificatio");
          
          
          
          
          driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
          System.out.println(" yet to Click");
          arrivalDate().sendKeys("15/04/2019" +Keys.ENTER);
         Thread.sleep(80000);
         arrivalDate().sendKeys(Keys.ENTER);
          verifyPriceSection().click();
          Thread.sleep(20000);
          agreementCheckbox().click();
   
          
          
    }
    
    public void detailPriceVerification()
    {
          boolean subTotalSection= subTotalSection().isDisplayed();
          if(subTotalSection==true)
          {
                Assert.assertTrue(subTotalSection);
                System.out.println("SubTotal Section is Available");
          }
          else
          {
                Assert.assertFalse(subTotalSection);
                System.out.println("SubTotal Section is not Available");
          }
          boolean taxSection= taxSection().isDisplayed();
          if(taxSection==true)
          {
                Assert.assertTrue(taxSection);
                System.out.println("Tax Section is Available");
          }
          else
          {
                Assert.assertFalse(taxSection);
                System.out.println("Tax Section is not Available");
          }
          boolean grandTotal= grandTotal().isDisplayed();
          if(grandTotal==true)
          {
                Assert.assertTrue(grandTotal);
                System.out.println("GrandTotal Section is Available");
          }
          else
          {
                Assert.assertFalse(grandTotal);
                System.out.println("GrandTotal Section is not Available");
          }
          driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
          System.out.println("About to click on makeOrder");
          makeOrder().click();
          driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
          boolean orderSuccessMessage= orderSuccessMessage().isDisplayed();
          if(orderSuccessMessage) {
                Assert.assertTrue(orderSuccessMessage);
                System.out.println("Order is Successfully placed");
                
          }
          else
          {
                Assert.assertFalse(orderSuccessMessage);
          }
          boolean returnStore= returnStore().isDisplayed();
          if(returnStore) {
                Assert.assertTrue(returnStore);
                System.out.println("Return Store is Visible");
          }
          else
          {
                Assert.assertFalse(returnStore);
          }
          boolean goOut=goOut().isDisplayed();
          if(goOut) {
                Assert.assertTrue(goOut);
                System.out.println("go Out is Visible");
                goOut().click();
          }
          else
          {
                Assert.assertFalse(goOut);
          }
    
    
    
    
}

	
	
	
}
