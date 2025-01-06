package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints
{

	public static Response CreateteUser(User payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)

				.when().post(Routes.post_Url);

		return response;
	}

	public static Response ReadUser(String userName) 
	{
		Response response = given()
				.pathParam("username", userName)

				.when().get(Routes.get_Url);

		return response;
	}
	
	public static Response UpdateUser(String userName,User payload)
	{

		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("username",userName)
				.body(payload)

				.when().put(Routes.put_Url);

		return response;
	}
	
	public static Response DeleteUser(String userName) 
	{
		Response response = given()
				.pathParam("username", userName)

				.when().delete(Routes.delete_Url);

		return response;
	}

}
