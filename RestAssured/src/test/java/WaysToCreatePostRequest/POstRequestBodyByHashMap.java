package WaysToCreatePostRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class POstRequestBodyByHashMap {
	/*
	 * 
	 * { "student_id": 5, "first_name": "deville", "last_name": "head", "email":
	 * "deville.head@example.com", "courses": [ { "course_id": 109, "course_name":
	 * "Economics", "grade": "A" }, { "course_id": 110, "course_name": "Psychology",
	 * "grade": "B" } ], "id": "4bea"
	 * 
	 */
	
	@Test
	void PostRequestBodyUsingHashMap() {
		/*
		 * HashMap map = new HashMap(); map.put("student_id", 6); map.put("first_name",
		 * "Dana"); map.put("last_name", "Mata"); map.put("email",
		 * "dana.mata@example.com");
		 * 
		 * String [][]course = {{"113","Physics","C"},{"114","Eco","A"}};
		 * map.put("courses",course);
		 * 
		 * given() .contentType("application/json") .body(map)
		 * 
		 * .when() .post("http://localhost:3000/students")
		 * 
		 * .then() .statusCode(201) .log().all();
		 * 
		 */

		HashMap map = new HashMap();
		map.put("ID", 6);
		map.put("Name", "Fiona Clark");
		map.put("Location", "Austin");
		map.put("Department", "Product");
		map.put("Designation", "Product Manager");

		HashMap sal = new HashMap();
		sal.put("Fixed", 95000);
		sal.put("Variable", 14000);
		sal.put("Bonus", 7000);

		map.put("Salary", sal);

				 given().contentType("application/json")
				.body(map)

				.when().post("http://localhost:3000/employees")

				.then()
				.statusCode(201)
				.body("Name", equalTo("Fiona Clark"))
				.time(lessThan(2000L))
				.log().all();
	}
	
//	@Test(dependsOnMethods ="PostRequestBodyUsingHashMap")
//	void deleteUser()
//	{
//		given()
//		
//		.when()
//		.delete("http://localhost:3000/employees/")
//		
//		.then()
//		.statusCode(200)
//		.log().all();
//	}

}
