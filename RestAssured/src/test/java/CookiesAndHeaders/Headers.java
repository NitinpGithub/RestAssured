package CookiesAndHeaders;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.http.*;
public class Headers {

	@Test
	void t1()
	{
		Response res = given()
				
				.when()
				.get("https://www.google.co.in/");
		
		
		io.restassured.http.Headers h = res.getHeaders();
		for(Header h1:h)
		{
			System.out.println(h1.getName()+"    "+h1.getValue());
		}
		
	}
}
