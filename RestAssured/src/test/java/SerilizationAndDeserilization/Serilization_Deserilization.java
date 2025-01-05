package SerilizationAndDeserilization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serilization_Deserilization {
	
	/* converting POJO object to JSON called serilization
	   converting JSON object to POJO called de-serilization
	 */
	
	@Test
	void _Serilization() throws JsonProcessingException
	{
		Employee_POJO emp = new Employee_POJO();
		emp.setName("JAVA");
		emp.setAddress("PYTHON");
		emp.setEmployee_id("8");
		emp.setPincode("11223344");
		emp.setSalary(20000);
		
		ObjectMapper mapper = new ObjectMapper();
		String data = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		System.out.println(data);
		
		
	}
	@Test
	void _De_Serilization() throws JsonMappingException, JsonProcessingException
	{
		String json = "{\r\n"
				+ "			  \"employee_id\" : \"8\",\r\n"
				+ "			  \"name\" : \"JAVA\",\r\n"
				+ "			  \"address\" : \"PYTHON\",\r\n"
				+ "			  \"pincode\" : \"11223344\",\r\n"
				+ "			  \"salary\" : 20000\r\n"
				+ "			}";
		
		ObjectMapper mp = new ObjectMapper();
		Employee_POJO stdpojo = mp.readValue(json, Employee_POJO.class);
		
		System.out.println(stdpojo.getAddress());
		System.out.println(stdpojo.getEmployee_id());
		System.out.println(stdpojo.getName());
		System.out.println(stdpojo.getPincode());
		System.out.println(stdpojo.getSalary());
		
	}
}
