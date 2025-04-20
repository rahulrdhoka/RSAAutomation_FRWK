package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import api.endpoints.UserEndPoints2;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

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
		
		ValidatableResponse res = response.then();
		
		//System.out.println(res.statusCode(200));
		
		res.statusLine("HTTP/1.1 200 OK");
		
		res.log().all();

		System.out.println();
	  
	  SoftAssert softAssert = new SoftAssert();
	  
	 // softAssert.assertEquals(response.getStatusCode(), 201);

	  softAssert.assertEquals(response.getStatusCode(), 201, "Status code mismatch");
       
       //Assert.assertEquals(response.getStatusCode(), 201);
		


		
			//	readUser(this.userPayload.getUsername());
	
		
		logger.info("**********Return Pet Inventory by Status***************");
		
	}


}
	
	

