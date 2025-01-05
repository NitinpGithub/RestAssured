package ParsingData;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;

import io.restassured.response.Response;
import io.restassured.http.ContentType;

public class ParsingJsonResponseData {
	
	@Test
	void t1()
	{
		Response res = given()
				.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/employee");
		
		JSONObject ob = new JSONObject(res.asString());
		
		boolean b=false;
		int Totalsalary=0;
		for(int i=0;i<ob.getJSONArray("employees").length();i++)
		{
			String n = ob.getJSONArray("employees").getJSONObject(i).get("name").toString();
			if(n.equals("Emily Davis"))
			{
				b=true;
				break;
			}
		}
		
		for(int i=0;i<ob.getJSONArray("employees").length();i++)
		{
			String p = ob.getJSONArray("employees").getJSONObject(i).get("salary").toString();
			Totalsalary+=Integer.parseInt(p);
		}
		
		Assert.assertEquals(b, true);
		Assert.assertEquals(Totalsalary, 363000);
		
	}
	

}
