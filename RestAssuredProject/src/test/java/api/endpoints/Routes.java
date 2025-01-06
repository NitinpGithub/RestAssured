package api.endpoints;

public class Routes {
	
		/*
		 Swagger URL - https://petstore.swagger.io
		 
		 Get User(Get) - https://petstore.swagger.io/v2/user/{username}
		 Create User(Post) - https://petstore.swagger.io/v2/user
		 					
		 Update User(Put) - https://petstore.swagger.io/v2/user/{username}
		 Delete User(Delete) - https://petstore.swagger.io/v2/user/{username}
		 */
	
	public static String base_Url = "https://petstore.swagger.io/v2";
	public static String get_Url = base_Url+"/user/{username}";
	public static String post_Url = base_Url+"/user";
	public static String put_Url = base_Url+"/user/{username}";
	public static String delete_Url =base_Url+"/user/{username}";
	

}
