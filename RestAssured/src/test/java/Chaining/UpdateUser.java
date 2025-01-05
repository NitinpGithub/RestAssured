package Chaining;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateUser {

	@Test
	void UpdateUser_(ITestContext context)
	{
		
		String id=(String) context.getAttribute("user_id");
		Faker f = new Faker();
		JSONObject ob = new JSONObject();
		ob.put("name",f.name().firstName());
		ob.put("job","HR");
		
		given()
		.contentType(ContentType.JSON)
		.pathParam("id",id)
		.body(ob.toString())
		
		.when()
		.put("https://reqres.in/api/users/{id}")
		
		.then()
		.statusCode(200);
	}
}
