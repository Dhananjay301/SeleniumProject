package fakerLibrary;

import com.github.javafaker.Faker;

public class FakerExample {

	public static void main(String[] args) {
		
		 Faker faker = new Faker();

	        String fullName = faker.name().fullName();
	        String firstName = faker.name().firstName(); 
	        String lastName = faker.name().lastName(); 
	        String phoneNumber = faker.phoneNumber().cellPhone(); 
	        String mobileNum = faker.numerify("##########");
	        String email = faker.internet().emailAddress(); 
	        String address = faker.address().fullAddress(); 
	        
	        System.out.println(fullName);
	        System.out.println(firstName);
	        System.out.println(lastName);
	        System.out.println(phoneNumber);
	        System.out.println(mobileNum);	        
	        System.out.println(email);
	        System.out.println(address);
	        

	}

}
