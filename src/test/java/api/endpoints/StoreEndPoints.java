package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import io.restassured.response.Response;

public class StoreEndPoints {

	static ResourceBundle getURL()
	{
		ResourceBundle routes= ResourceBundle.getBundle("routes"); // Load properties file  // name of the properties file
		return routes;
	}

	public static Response returnInventoryByStatus() 
	{
		String store_geturl = getURL().getString("store_getInventoryStatus_url");
		
		Response response =given().when().get(store_geturl);
		
		return response;	
		
	}
	
}
