package AuthenticationAndAuthorization;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/*
 Authentication - Valid or not
 Authorization -  having access or not/check permission
 
 
 types of Authentication - 
 Basic
 Digest
 OAuth 1.0,2.0
 Preempive
 Bearer Token
 API Key
 
 */

@Test
public class Authentication
{
	@Test(priority=1)
	void BasicAuthentication()
	{
		given()
		.auth()
		.basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true));
	}
	
	@Test(priority=2)
	void DigestAuthentication()
	{
		given()
		.auth()
		.digest("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true));
	}
	
	@Test(priority=3)
	void PreemptiveAuthentication()
	{
		given()
		.auth()
		.preemptive().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true));
	}
	

}











