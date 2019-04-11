package EnvirnomentSetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfigReader
{
	Properties pro;
	public ConfigReader()
	{
		File file = new File("F:\\selenium\\Revathi\\SalesForce\\SalesForce\\SalesForce\\src\\main\\java\\ObjectRepository\\BrowserSetting_Objects.properties");
		try {
			FileInputStream FIS = new FileInputStream(file);
			pro = new Properties();
			pro.load(FIS);
	
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	public String getchromePath()
	{
	return pro.getProperty("chromePath");
	}
	public String getLoginPage_UserName() {
		return pro.getProperty("LoginPage_UserName");
	}
	public String getLoginPage_password() {
		return pro.getProperty("LoginPage_password");
		
	}
	public String getLoginPage_LoginButton()
	{
		return pro.getProperty("LoginPage_LoginButton");
	}
	
	public String getHP_SandBoxLabel()
	{
		return pro.getProperty("HP_SandBoxLabel");
	}
	public String getHP_FaceButton() {
		return pro.getProperty("HP_FaceButton");
	}
    public String getHP_NameLink() {
    	return pro.getProperty("HP_NameLink");
    }
    public String getHP_LogOutButton() {
    	return pro.getProperty("HP_LogOutButton");
    }
    public String getHP_NineDotBox() {
    	return pro.getProperty("HP_NineDotBox");
    }
    public String getSP_SearchBox() {
    	return pro.getProperty("SP_SearchBox");
    }
    public String getSP_ReportsLink() {
    	return pro.getProperty("SP_ReportsLink");
    }
    public String getSP_AllReportsLink(){
    	return pro.getProperty("SP_AllReportsLink");
    }
    public String getSP2_SearchBox() {
    	return pro.getProperty("SP2_SearchBox");
    }
    public String getSP2_ListaClientiLink() {
    	System.out.println("Click on list client");
    	return pro.getProperty("SP2_ListaClientiLink");
    }
    public String getSP2_DownArrow() {
    	return pro.getProperty("SP2_DownArrow");
    }
    public String getSP2_ExportLink() {
    	return pro.getProperty("SP2_ExportLink");
    }
    public String getSP2_FormattedReportLink() {
    	return pro.getProperty("SP2_FormattedReportLink");
    }
    public String getSP2_ExportButton() {
    	return pro.getProperty("SP2_ExportButton");
    }
    public String getSP3_DashboardsLink()
    {
    	System.out.println("In Config Method");
    	return pro.getProperty("SP3_DashboardsLink");
    }
    
    public String getSP3_AllDashboards()
    {
    	return pro.getProperty("SP3_AllDashboards");
    }
    
    public String getSP3_SearchAllDashboard()
    {
    	return pro.getProperty("SP3_SearchAllDashbaord");
    }
    
    public String getSP3_StatusVisiteSALESREP()
    {
    	return pro.getProperty("getSP3_StatusVisiteSALESREP");
    }
    public String getSP2_FrequenzaVisiteFYTDLink() {
    	return pro.getProperty("SP2_FrequenzaVisiteFYTDLink");
    }
    public String getSP2_VistaRepPieChartImage() {
    	return pro.getProperty("SP2_VistaRepPieChartImage");
    }
    public String getSP2_Names() {
    	return pro.getProperty("SP2_Names");
    }
    public String getSP2_NameLink() {
    	return pro.getProperty("SP2_NameLink");
    }
    public String getSP2_AccountViewScreen() {
    	return pro.getProperty("SP2_AccountViewScreen");
    }
    public String getSP2_DropDownsDisplay() {
    	return pro.getProperty("SP2_DropDownsDisplay");
    }
    public String getSP2_StatusDropDown() {
    	return pro.getProperty("SP2_StatusDropDown");
    }
    public String getSP_ClientiLink() {
	    return pro.getProperty("SP_ClientiLink");
    }
    public String getSP_FiltroLink() {
    	return pro.getProperty("SP_FiltroLink");
    }
    public String getSP_ClusterDropDown() {
    	return pro.getProperty("SP_ClusterDropDown");
    }
    public String getSP_ClickNameAfterFiltro() {
    	return pro.getProperty("SP_ClickNameAfterFiltro");
    }
    public String getSP_NewVisitLink() {
    	System.out.println("in config");
    	return pro.getProperty("SP_NewVisitLink");
    }
    public String getSP_TypeIndependentLabel() {
    	return pro.getProperty("SP_TypeIndependentLabel");
    }
    public String getSP_StatoVisitaDropDown() {
    	return pro.getProperty("SP_StatoVisitaDropDown");
    }
    public String getSP_SaveButton() {
    	return pro.getProperty("SP_SaveButton");
    }
    public String getSP_FACCIOLink() {
    	return pro.getProperty("SP_FACCIOLink");
    }
    public String getSP_NessunoLink() {
    	return pro.getProperty("SP_NessunoLink");
    }
    public String getSP_OralBLink() {
    	return pro.getProperty("SP_OralBLink");
    }
    public String getSP_OralBGSLink(){
    	return pro.getProperty("SP_OralBGSLink");
    }
    public String getSP_OralBDropDown() {
    	return pro.getProperty("SP_OralBDropDown");
    }
    public String getSP_GSDropDown() {
    	return pro.getProperty("SP_GSDropDown");
    }
    public String getSP_FloorStandLink() {
    	return pro.getProperty("SP_FloorStandLink");
    }
    public String getSP_VicksDropDown() {
    	return pro.getProperty("SP_VicksDropDown");
    }
    public String getSP_OrdineLink() {
    	return pro.getProperty("SP_OrdineLink");
    }
    public String getSP_NoteVisitaTextArea() {
    	return pro.getProperty("SP_NoteVisitaTextArea");
    }
    public String getSP_CalendarioLink() {
    	return pro.getProperty("SP_CalendarioLink");
    }
    public String getSP_OggiLink() {
    	return pro.getProperty("SP_OggiLink");
    }
    public String getSP_OggiPage() {
    	return pro.getProperty("SP_OggiPage");
    }
    public String getOP_NameLink() {
    	return pro.getProperty("OP_NameLink");
    }
    public String getFACCIOLinkArrow() {
    	return pro.getProperty("FACCIOLinkArrow");
    }
}

