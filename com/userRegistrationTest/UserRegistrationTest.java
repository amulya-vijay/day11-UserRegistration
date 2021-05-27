package com.userRegistrationTest;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class UserRegistrationTest {
	
	private String firstName;
	private String lastName;
	private String emailId;
	private UserRegistration userRegistration;
	
	
	@Before
	public void initialize() {
	 userRegistration = new UserRegistration();
	}
	
	public UserRegistrationTest(String fName, String lName, String email) {
		this.firstName=fName;
		this.lastName=lName;
		this.emailId=email;
		
	}
	
	@Parameterized.Parameters
	public static Collection userInfo() {
		
		return  Arrays.asList(new Object[][] {{"Amulyla","Konangi","amulya@gmail.com"},
				{"amulya","daeerN","amulya.com"},
				{"8mulya","7contou","amulya8_vijay@gmail"},
				{"Aelin","Ashryver","aelin.87ashryver@yahoo.in"}
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
		Assert.assertEquals(lastName,userRegistration.validateEmailId(emailId));
	
	}

}
