package api.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import api.endpoints.UserEndPoints2;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class StoreTests {

public Logger logger; // for logs
	
	@BeforeClass
	public void setup()
	{
		
		//logs
		logger= LogManager.getLogger(this.getClass());
		
		logger.debug("debugging.....");
		
	}
	
	
	@Test(priority=1)
	public void testPetInvetoryStatus()
	{
		logger.info("********** Returns a map of status codes to quantities ***************");
		
	   Response response = UserEndPoints2.returnInventoryByStatus();

	  // response.then().log().all();

	  System.out.println(response.body().asPrettyString());
	  
	  SoftAssert softAssert = new SoftAssert();
	  
	 // softAssert.assertEquals(response.getStatusCode(), 201);

	  softAssert.assertEquals(response.getStatusCode(), 201, "Status code mismatch");
       
       //Assert.assertEquals(response.getStatusCode(), 201);
		


		
			//	readUser(this.userPayload.getUsername());
	
		
		logger.info("**********Return Pet Inventory by Status***************");
		
	}


	private ResponseAwareMatcher<Response> equalTo(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
