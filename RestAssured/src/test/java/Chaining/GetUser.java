package Chaining;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;
public class GetUser 
{
	
	
	@Test
	void GetUser_(ITestContext context)
	{
		String id = (String) context.getAttribute("user_id");
		// for getting suite level parameter
		//String id = (String) context.getSuite().getAttribute("user_id");
		
		given()
		.pathParam("id",id)
		
		.when()
		.get("https://reqres.in/api/users/{id}")
		
		.then()
		.log().all();
	}

}
