package Components;
import java.io.FileInputStream;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import EnvirnomentSetup.ConfigReader;
import Resources.JSONReader;
public class SF_NewEventCreationExistingAccount {
	
	public static WebDriver driver;
	ConfigReader reader;
	public static Logger log = LogManager.getLogger(UTL_SalesForce_Login.class.getName());
	JSONReader jreader;
	public  SF_NewEventCreationExistingAccount(WebDriver driver) throws IOException 
	{
		 
		
		this.driver = driver;
		log.info("Chrome Browser driver started");
		reader = new ConfigReader();
		jreader=new JSONReader();
		jreader.Reader();
		
	}
	public WebElement getSP_ClientiLink() {
		return(driver.findElement(By.xpath(reader.getSP_ClientiLink())));
	}
	public WebElement getSP_FiltroLink() {
		return(driver.findElement(By.xpath(reader.getSP_FiltroLink())));
	}
	public WebElement getSP_ClusterDropDown() {
		return(driver.findElement(By.xpath(reader.getSP_ClusterDropDown())));
	}
	public WebElement getSP_ClickNameAfterFiltro() {
		System.out.println("in name Method");
		return(driver.findElement(By.xpath(reader.getSP_ClickNameAfterFiltro())));
	}
	public WebElement getSP_NewVisitLink() {
		return(driver.findElement(By.xpath("//a[@class=\"forceActionLink\"][@title=\"New Visit\"]")));
	}
	public WebElement getSP_TypeIndependentLabel() {
		return(driver.findElement(By.xpath(reader.getSP_TypeIndependentLabel())));
	}
	public WebElement getSP_StatoVisitaDropDown() {
		return(driver.findElement(By.xpath(reader.getSP_StatoVisitaDropDown())));
	}
	public WebElement getSP_SaveButton() {
		return(driver.findElement(By.xpath(reader.getSP_SaveButton())));
	}
	public WebElement getSP_FACCIOLink() {
		return(driver.findElement(By.xpath(reader.getSP_FACCIOLink())));
	}
	public WebElement getSP_NessunoLink() {
		return(driver.findElement(By.xpath(reader.getSP_NessunoLink())));
	}
	public WebElement getSP_OralBLink() {
		return(driver.findElement(By.xpath(reader.getSP_OralBLink())));
	}
	public WebElement getSP_OralBGSLink() {
		return(driver.findElement(By.xpath(reader.getSP_OralBGSLink())));
	}
	public WebElement getSP_OralBDropDown()
	{
		return(driver.findElement(By.xpath(reader.getSP_OralBDropDown())));
	}
	public WebElement getSP_GSDropDown() {
		return(driver.findElement(By.xpath(reader.getSP_GSDropDown())));
	}
	public WebElement getSP_FloorStandLink() {
		return(driver.findElement(By.xpath(reader.getSP_FloorStandLink())));
	}
	public WebElement getSP_VicksDropDown() {
		return(driver.findElement(By.xpath(reader.getSP_VicksDropDown())));
	}
	public WebElement getSP_OrdineLink() {
		return(driver.findElement(By.xpath(reader.getSP_OrdineLink())));
	}
	public WebElement getSP_NoteVisitaTextArea() {
		return(driver.findElement(By.xpath(reader.getSP_NoteVisitaTextArea())));
	}
	public WebElement getFACCIOLinkArrow() {
		return(driver.findElement(By.cssSelector(reader.getFACCIOLinkArrow())));
	}
   public void createAccount() {
	try {
	 getSP_ClientiLink().click(); 
	 Thread.sleep(5000);
	 
	 getSP_FiltroLink().click();
	 Thread.sleep(5000);
	
	 Select rg= new Select(getSP_ClusterDropDown());
	 rg.selectByVisibleText(jreader.productmap.get("Select_RetailsGolden"));
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
     getSP_FiltroLink().click(); 
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     try {
    	 getSP_ClickNameAfterFiltro().click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         
    	}
    	catch(org.openqa.selenium.StaleElementReferenceException e)
    	{
    		getSP_ClickNameAfterFiltro().click();
    	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	     
    	}
     getSP_ClickNameAfterFiltro().click();
     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     
    /* Actions action = new Actions(driver);
     action.moveToElement(getSP_NewVisitLink());*/

     WebDriverWait wait = new WebDriverWait(driver, 5);
    // wait.until(ExpectedConditions.visibilityOf(element)); 
     wait.until(ExpectedConditions.elementToBeClickable(getSP_NewVisitLink()));
     
     Thread.sleep(2000);
     getSP_NewVisitLink().click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 
     

     for ( String handle : driver.getWindowHandles()) {

        driver.switchTo().window(handle);
        }
     
     String Label= getSP_TypeIndependentLabel().getText();
     System.out.println(Label);
     getSP_TypeIndependentLabel().isDisplayed();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     Select Completata = new Select(getSP_StatoVisitaDropDown());
     Completata.selectByVisibleText(jreader.productmap.get("Select_Completata"));
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     getSP_SaveButton().click();
     driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
     Thread.sleep(5000);
    /* 
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("scroll(250, 0)");
*/
  /*   Actions actions = new Actions(driver);
     actions.moveToElement(getSP_FACCIOLink()).perform();*/
     ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+getSP_FACCIOLink().getLocation().y+")");

     getSP_FACCIOLink().click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     getFACCIOLinkArrow().click();
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     
     getSP_NessunoLink().click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     getSP_OralBLink().click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     getSP_OralBGSLink().click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     Select SA= new Select(getSP_OralBDropDown());
     SA.selectByVisibleText(jreader.productmap.get("Select_SiA"));
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     Select FR= new Select(getSP_GSDropDown());
     FR.selectByVisibleText(jreader.productmap.get("Select_FR"));
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     getSP_FloorStandLink().click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     Select scsg= new Select(getSP_VicksDropDown());
     scsg.selectByVisibleText(jreader.productmap.get("Select_scsg"));
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     getSP_OrdineLink().click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     getSP_NoteVisitaTextArea().sendKeys(jreader.productmap.get("Test"));
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
     getSP_SaveButton().click();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     
	    }
	   catch(InterruptedException e) {
		   e.printStackTrace();
	   }
   }
}