package Chaining;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;

public class CreateUser {

   
	@Test
	void createUser_(ITestContext context)
	{
		Faker f = new Faker();
		JSONObject ob = new JSONObject();
		ob.put("name",f.name().firstName());
		ob.put("job","Manager");
		 String id="";
		id = given()
		.contentType(ContentType.JSON)
		.body(ob.toString())
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getString(id);
		
		context.setAttribute("user_id", id);// Accessable only for test level
		// if we want to make it for suite level then we have to use .setSuite() method
		//context.getSuite().setAttribute("user_id", id);
		
	}
	
}
