package com.userRegistrationTest;


import org.junit.Test;


import java.util.Arrays;
import java.util.Collection;


import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class UserRegistrationTest extends UserRegistration{
	
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNum;
	private String password;
	private UserRegistration userRegistration;
	
	
	@Before
	public void initialize() {
	 userRegistration = new UserRegistration();
	}
	
	public UserRegistrationTest(String fName, String lName, String email, String phoneNum, String password) {
		this.firstName=fName;
		this.lastName=lName;
		this.emailId=email;
		this.phoneNum=phoneNum;
		this.password=password;
	}
	
	@Parameterized.Parameters
	public static Collection userInfo() {
		
		return  Arrays.asList(new Object[][] {{"Amulya","Konangi","amulya@gmail.com","91 7013426250","amulyA9877#"},
				{"amulya","daeerN","amulya.com","701256389","15245"},
				{"8mulya","7contou","amulya8_vijay@gmail","3625748900","amulya87"},
				{"Aelin","Ashryver","aelin.87ashryver@yahoo.in","12584796300","amG87"}
				});
				
	}

	
	@Test
	public void firstNameValidation() throws InvalidInputException {
		
		System.out.println("First Name : "+firstName+" : "+Validation.exception(firstNameValidation.validate(firstName),InvalidInputException.error_type.Invalid_first_name));
		Assert.assertEquals(InvalidInputException.error_type.No_error,Validation.exception(firstNameValidation.validate(firstName),InvalidInputException.error_type.Invalid_first_name ));
		
	}
	
	@Test
	public void lastNameValidation() throws InvalidInputException {
		
		System.out.println("Last Name : "+lastName+" : "+Validation.exception(lastNameValidation.validate(lastName),InvalidInputException.error_type.Invalid_first_name));
		Assert.assertEquals(InvalidInputException.error_type.No_error,Validation.exception(lastNameValidation.validate(firstName),InvalidInputException.error_type.Invalid_last_name ));

	}
	
	@Test
	public void emailIdValidation() throws InvalidInputException {
		System.out.println("Email-Id : "+emailId+" : "+Validation.exception(emailIdValidation.validate(emailId),InvalidInputException.error_type.Invalid_Email));
		Assert.assertEquals(InvalidInputException.error_type.No_error,Validation.exception(emailIdValidation.validate(emailId),InvalidInputException.error_type.Invalid_Email ));

	}
	
	@Test
	public void phoneNumberValidation() throws InvalidInputException {
		System.out.println("Mobile Number : "+phoneNum+" : "+Validation.exception(phoneNumValidation.validate(phoneNum),InvalidInputException.error_type.Invalid_mobile_number));
		Assert.assertEquals(InvalidInputException.error_type.No_error,Validation.exception(phoneNumValidation.validate(phoneNum),InvalidInputException.error_type.Invalid_mobile_number ));

	}
	
	@Test
	public void passwordValidation() throws InvalidInputException {
		System.out.println("Password : "+password+" : "+Validation.exception(passwordValidation.validate(password),InvalidInputException.error_type.Invalid_password));
		Assert.assertEquals(InvalidInputException.error_type.No_error,Validation.exception(passwordValidation.validate(password),InvalidInputException.error_type.Invalid_password ));
	}

}
