package com.userRegistrationTest;


import org.junit.Test;


import java.util.Arrays;
import java.util.Collection;


import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class UserRegistrationTest {
	
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNum;
	private UserRegistration userRegistration;
	
	
	@Before
	public void initialize() {
	 userRegistration = new UserRegistration();
	}
	
	public UserRegistrationTest(String fName, String lName, String email, String phoneNum) {
		this.firstName=fName;
		this.lastName=lName;
		this.emailId=email;
		this.phoneNum=phoneNum;
	}
	
	@Parameterized.Parameters
	public static Collection userInfo() {
		
		return  Arrays.asList(new Object[][] {{"Amulyla","Konangi","amulya@gmail.com","91 7013426250"},
				{"amulya","daeerN","amulya.com","701256389"},
				{"8mulya","7contou","amulya8_vijay@gmail","3625748900"},
				{"Aelin","Ashryver","aelin.87ashryver@yahoo.in","12584796300"}
				});
				
	}

	
	@Test
	public void firstNameValidation() {
		
		System.out.println("first Name : "+firstName+" : "+userRegistration.validateFirstName(firstName));
		Assert.assertEquals(firstName,userRegistration.validateFirstName(firstName));
	}
	
	@Test
	public void lastNameValidation() {
		
		System.out.println("last Name : "+lastName+" : "+userRegistration.validateLastName(lastName));
		Assert.assertEquals(lastName,userRegistration.validateLastName(lastName));
	}
	
	@Test
	public void emailIdValidation() {
		System.out.println("Email-Id : "+emailId+" : "+userRegistration.validateEmailId(emailId));
		Assert.assertEquals(emailId,userRegistration.validateEmailId(emailId));
	}
	
	@Test
	public void phoneNumberValidation() {
		System.out.println("Mobile Number : "+phoneNum+" : "+userRegistration.validatePhoneNumber(phoneNum));
		Assert.assertEquals(phoneNum,userRegistration.validatePhoneNumber(phoneNum));
	}
	

}
