package WaysToCreatePostRequest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class ByUsingExternalJsonFile {
	
	@Test
	void PostRequestBodyUsingHashMap() throws FileNotFoundException {
		File file = new File("C:\\Users\\SWAPNALI\\Desktop\\Selenium\\RestAssured\\body.json");
		FileReader fr = new FileReader(file);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject object = new JSONObject();
		
		given().contentType("application/json")
				.body(object.toString())

				.when().post("http://localhost:3000/employees")

				.then()
				.statusCode(201)
				.log().all();
	}
	

}
