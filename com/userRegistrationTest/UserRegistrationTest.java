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
	private UserRegistration userRegistration;
	
	
	@Before
	public void initialize() {
	 userRegistration = new UserRegistration();
	}
	
	public UserRegistrationTest(String fName, String lName) {
		this.firstName=fName;
		this.lastName=lName;
		
	}
	
	@Parameterized.Parameters
	public static Collection userInfo() {
		
		return  Arrays.asList(new Object[][] {{"Amulyla","Konangi"},{"amulya","daeerN"},{"8mulya","7contou"},{"Aelin","Ashryver"}});
				
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
	

}
