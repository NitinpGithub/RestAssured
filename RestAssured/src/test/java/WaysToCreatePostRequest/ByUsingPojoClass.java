package WaysToCreatePostRequest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;

public class ByUsingPojoClass {
	
	void PostRequestBodyUsingHashMap() {
//		JSONObject jsono = new JSONObject();
//		jsono.put("ID", 6);
//		jsono.put("Name", "Fiona Clark");
//		jsono.put("Location", "Austin");
//		jsono.put("Department", "Product");
//		jsono.put("Designation", "Product Manager");
//
//		JSONObject sal = new JSONObject();
//		sal.put("Fixed", 95000);
//		sal.put("Variable", 14000);
//		sal.put("Bonus", 7000);
//
//		jsono.put("Salary", sal);
		
		POJOClass pojo = new POJOClass();
		pojo.setID(1000);
		pojo.setName("");
		pojo.setLocation("");
		pojo.setDesignation("");
		pojo.setDepartment("");
		

		given().contentType("application/json")
				.body(pojo)

				.when().post("http://localhost:3000/employees")

				.then()
				.statusCode(201)
				.body("Name", equalTo("Fiona Clark"))
				.log().all();
	}
	

}
