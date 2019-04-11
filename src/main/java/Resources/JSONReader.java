package Resources;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader
{
                public static Map<String,String> productmap = new HashMap<String,String>();
    @SuppressWarnings("unchecked")
    public static ArrayList productName=new ArrayList();
    public static void Reader()
    {
    	
    	//JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        
        
        try (FileReader reader = new FileReader(".//TestData/SFPharma_Data.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray productList = (JSONArray) obj;
            System.out.println(productList);
             
            //Iterate over product array
            productList.forEach( emp -> parseProductObject( (JSONObject) emp ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseProductObject(JSONObject product)
    {
        //Get product object within list
        JSONObject productObject = (JSONObject) product.get("SalesForceLogin");
                 productmap.put("URL",(String) productObject.get("URL"));  
                 productmap.put("productName",(String) productObject.get("productName"));  
                 productName.add((String) productObject.get("UserName1"));
                 productName.add((String) productObject.get("UserName2"));
                 productName.add((String) productObject.get("UserName3"));
                 productmap.put("Password", (String) productObject.get("Password"));
                 productmap.put("SearchReports",(String) productObject.get("SearchReports"));
                 productmap.put("SearchLista",(String) productObject.get("SearchLista"));
                 productmap.put("SearchDashboards",(String) productObject.get("SearchDashboards"));
                 productmap.put("SearchStatus",(String) productObject.get("SearchStatus"));
                 productmap.put("SearchFreq",(String) productObject.get("SearchFreq"));
                 productmap.put("SearchClienti",(String) productObject.get("SearchClienti"));
                 productmap.put("SearchCalendario",(String) productObject.get("SearchCalendario"));
                 productmap.put("SearchOggi",(String) productObject.get("SearchOggi"));
                 productmap.put("SearchPharma",(String) productObject.get("SearchPharma"));
                 productmap.put("SearchLightning",(String) productObject.get("SearchLightning"));
                 productmap.put("Select_RetailsGolden",(String) productObject.get("Select_RetailsGolden"));
                 productmap.put("Select_Completata",(String) productObject.get("Select_Completata"));
                 productmap.put("Select_SiA",(String) productObject.get("Select_SiA"));
                 productmap.put("Select_FR",(String) productObject.get("Select_FR"));
                 productmap.put("Select_scsg",(String) productObject.get("Select_scsg"));
                 productmap.put("Test",(String) productObject.get("Test"));
                 
    }
}
