package PathAndQueryParameter;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Basic {
	
	//https://reqres.in/api/users?page=2&id=7
	
	@Test
	void getData()
	{
		given()
		.pathParam("path","users")
		.queryParam("page",2)
		.queryParam("id",7)
		
		.when()
		.get("https://reqres.in/api/{path}")
		
		.then()
		.statusCode(200);

	}
	
}
