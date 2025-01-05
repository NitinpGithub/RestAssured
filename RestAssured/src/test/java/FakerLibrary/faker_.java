package FakerLibrary;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class faker_ {
	
	@Test
	void DummyData()
	{
		Faker f = new Faker();
		System.out.println(f.name().fullName());
		System.out.println(f.name().firstName());
		System.out.println(f.name().lastName());
		System.out.println(f.internet().domainName());
		System.out.println(f.internet().emailAddress());
		System.out.println(f.phoneNumber().phoneNumber());
		System.out.println(f.number().digits(10));
	}


}
