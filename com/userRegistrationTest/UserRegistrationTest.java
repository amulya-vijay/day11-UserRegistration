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
	private UserRegistration userRegistration;
	
	
	@Before
	public void initialize() {
	 userRegistration = new UserRegistration();
	}
	
	public UserRegistrationTest(String fName) {
		this.firstName=fName;
		
		
	}
	
	@Parameterized.Parameters
	public static Collection userInfo() {
		
		return  Arrays.asList(new Object[][] {{"Amulyla"},{"amulya"},{"8mulya"},{"Aelin"}});
				
	}

	
	@Test
	public void firstNameValidation() {
		
		System.out.println("first Name : "+firstName+userRegistration.validateName(firstName));
		Assert.assertEquals(firstName,userRegistration.validateName(firstName));
		
	}

}
