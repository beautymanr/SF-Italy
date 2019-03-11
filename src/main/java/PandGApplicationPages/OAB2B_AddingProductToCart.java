package PandGApplicationPages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Envirnoment.Setup.ConfigReader;

public class OAB2B_AddingProductToCart 
{
	public static WebDriver driver;
	public static ConfigReader reader;
	public static Logger log = LogManager.getLogger(OAB2B_AddingProductToCart.class.getName());

	

	public OAB2B_AddingProductToCart(WebDriver driver) 
	{
		this.driver = driver;
		reader = new ConfigReader();
	}


	
	public WebElement goCart() 
	{
		return driver.findElement(By.xpath(reader.getgoCart()));
	}
	public WebElement clearCart() {
		return driver.findElement(By.xpath(reader.getClearCart()));
	}
	public WebElement continueBuying() {
		return driver.findElement(By.xpath(reader.getcontinueBuying()));
	}
	public WebElement ProductLink() {
		return driver.findElement(By.xpath(reader.getProductLink()));
	}
	public WebElement searchProduct() {
		return driver.findElement(By.xpath(reader.getsearchProduct()));
	}
	public List<WebElement> productList() {
		return  driver.findElements(By.xpath(reader.getproductList()));
	}
	public WebElement addQty() {
		return driver.findElement(By.xpath(reader.getaddQty()));
	}
	public WebElement addToCart() {
		return driver.findElement(By.xpath(reader.getaddToCart()));
	}
	public WebElement moveToShoppingCart() {
		return driver.findElement(By.xpath(reader.getmoveToShoppingCart()));
	}
	public WebElement verifyShoppingCartTitle() {
		return driver.findElement(By.xpath(reader.getverifyShoppingCartTitle()));
	}
	public WebElement addPurchaseOrder() {
		return driver.findElement(By.xpath(reader.getaddPurchaseOrder()));
	}
	public WebElement confirmation_Popup() {
		return driver.findElement(By.cssSelector(reader.getconfirmation_Popup()));
	}
	public WebElement truckwrapper() {
		return driver.findElement(By.xpath(reader.gettruckwrapper()));
	}
	public WebElement checkOut() {
		return driver.findElement(By.xpath(reader.getcheckOut()));
	}
	public WebElement box() {
		return driver.findElement(By.xpath(reader.getBox()));
	}
	public WebElement bed() {
		return driver.findElement(By.xpath(reader.getBed()));
	}
	public WebElement pallet() {
		return driver.findElement(By.xpath(reader.getPallet()));
	}
	
	public void addCart()
	{
		try {
			goCart().click();
			Thread.sleep(3000);
			continueBuying().click();
			log.info("Go to Cart and Continue Shopping");
		} 
		catch (InterruptedException e) 
		{
	
			e.printStackTrace();
		}
		
	}
	public void productSearch() throws InterruptedException 
	{
		ProductLink().click();
		Thread.sleep(3000);
		searchProduct().sendKeys("Ace Detergente Polvo 3 Kg" + Keys.ENTER);
		log.info("Search a Product");
		
	}
	public void selectRequiredProduct()
	{
		List<WebElement> products= productList();
		for(int k=0;k<products.size();k++)
        {
              
              WebElement ele =products.get(k);
              
              String ProductList = ele.getAttribute("innerText");
              
              if(ProductList.contentEquals("Ace Detergente En Polvo 3 Kg"))
                    
              {
                    ele.click();
  
                    break;
              }
              
              // Selecting a product from list of product   
        }
			try 
			{
				Thread.sleep(5000);
			} 
			
			catch (Exception e)
			{
				e.printStackTrace();
			}

			log.info("selected Required Product");
	}
	
	public void addToCart_MoveToShoppingCart()
	{ 
		
		//*Adding to Cart**/
        try 
        {
        	// Unit Selection 
        	
        	box().click();
        	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        	//***Enter the Quantity Number *******/
    		addQty().clear();
    		addQty().sendKeys("300" + Keys.ENTER);
        	//*Adding to Cart**
			addToCart().click();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			 //Move to Shopping Cart
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			 moveToShoppingCart().click();
			 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			//** Preview of the Shopping Cart page
			 boolean previewcart=verifyShoppingCartTitle().isDisplayed();
			 if(previewcart==true)
		        {  
		              System.out.println("Preview Shopping Cart page is displayed");
		              assertTrue(previewcart);
		        }
		        
		        else 
		        {
		        	System.out.println("Preview Shopping Cart Page not found");
		              assertFalse(previewcart);
		        }
		} 
        catch (Exception e)
        {
			e.printStackTrace();
        }

        log.info("Add To Cart Move To Shopping Cart");
	}
	
	public void previewShoppingCart()
	{
		//Entering Purchase Order Number
		
		addPurchaseOrder().clear();
		Random ram = new Random();
		int num= ram.nextInt(111111);
		addPurchaseOrder().sendKeys("12345"+num);
		addPurchaseOrder().sendKeys(Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		//Closing confirmation Pop up
			confirmation_Popup().click();
			addPurchaseOrder().sendKeys(Keys.ENTER);
			
		
		//Verify Truck Wrapper
		
		truckwrapper().isDisplayed();
		
		//Click on CheckOut
		
		checkOut().click();
		try {
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("preview Shopping Cart");
		
	}
	
	
	

}
