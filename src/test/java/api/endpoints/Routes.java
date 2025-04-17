package api.endpoints;

/* 
Swagger URI --> https://petstore.swagger.io

Create user(Post) : https://petstore.swagger.io/v2/user
Get user (Get): https://petstore.swagger.io/v2/user/{username}
Update user (Put) : https://petstore.swagger.io/v2/user/{username}
Delete user (Delete) : https://petstore.swagger.io/v2/user/{username}

*/

public class Routes {

	public static String base_url="https://petstore.swagger.io/v2" ;
	
	//User module
	
	public static String post_url=base_url+"/user";
    public static String get_url=base_url+"/user/{username}";
    public static String update_url=base_url+"/user/{username}";
    public static String delete_url=base_url+"/user/{username}";
    
    //Store module
    
    public static String store_post_url=base_url+"/store/order";
    public static String store_getOrderID_url=base_url+"/store/order/{orderid}";
    public static String store_getInventoryStatus_url=base_url+"/store/inventory";
    public static String store_deletePurchaseID_url=base_url+"/store/order/{orderid}";
    
		//Here you will create Store module URL's

    //Pet module
    		//Here you will create Pet module URL's
    
    
}
