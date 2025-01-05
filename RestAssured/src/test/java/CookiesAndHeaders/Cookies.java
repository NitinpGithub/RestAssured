package CookiesAndHeaders;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import io.restassured.response.Response;

public class Cookies {
	
	@Test
	void cookie1()
	{
		Response res = given()
		
		.when()
		.get("https://www.google.co.in/");
		
		Map<String,String> map = res.getCookies();
		
		System.out.println(res.getCookie("AEC"));
//		map.forEach((keys,values)->
//				{
//					System.out.println(keys+"  "+values);
//				});
	}

}
