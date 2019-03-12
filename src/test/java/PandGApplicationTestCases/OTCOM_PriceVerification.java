package PandGApplicationTestCases;

import org.testng.annotations.Test;

import ObjectRepo.Base;
import PandGApplicationPages.OAB2B_AddingProductToCart;
import PandGApplicationPages.OAB2B_ChooseCustomerShipToProductMix;
import PandGApplicationPages.OAB2B_Login;
import PandGApplicationPages.OAB2B_PriceVerification;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;

public class OTCOM_PriceVerification extends Base
{

  @Test(dataProvider = "loginData")
  public void startBrowser(String URL , String Email , String password) throws IOException, InterruptedException {
    
	    driver=initialiseDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		OAB2B_Login PandGlogin = new OAB2B_Login(driver);
		waitForPage();
		highLightElement(driver, PandGlogin.getEmail());
		PandGlogin.getEmail().sendKeys(Email);
		waitForPage();
		PandGlogin.getPassword().sendKeys(password);
		waitForPage();
		PandGlogin.getGO().click();
		waitForPage();
		OAB2B_ChooseCustomerShipToProductMix OAB2B = new OAB2B_ChooseCustomerShipToProductMix(driver);
		waitForPage();
		OAB2B.selectClient();
		waitForPage();
		OAB2B.selectDelivery();
		waitForPage();
		OAB2B.selectProductMixture();
		OAB2B.verifyHomePage();
		OAB2B_AddingProductToCart add = new OAB2B_AddingProductToCart(driver);
		add.addCart();
		add.productSearch();
		add.selectRequiredProduct();
		add.addToCart_MoveToShoppingCart();
		add.previewShoppingCart();
		OAB2B_PriceVerification pVerification = new OAB2B_PriceVerification(driver);
		pVerification.purchaseSummaryVerification();
		pVerification.detailPriceVerification();
		System.out.println("Done");
		driver.close();
  }
  @DataProvider(name="loginData")
  public Object[][] getDataLogin()
	{
		Object[][]	obj = new Object[1][3];
		obj[0][0]=  "https://mx.rc.uat.online.pg.com/";
		obj[0][1]="b2batestselenium.im@pg.com";
		obj[0][2]="fpnxtwSp9C2DTFC6";
		return obj;
	}

}
