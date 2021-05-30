package com.userRegistrationTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.userRegistrationTest.InvalidInputException.error_type;

@FunctionalInterface
interface Validation {
	boolean validate(String input);
	static error_type exception(boolean function, error_type invalidinput) throws InvalidInputException {
		
		try {
			if(!(function)){
				throw new InvalidInputException();
			}
			}catch(InvalidInputException e) {
				return invalidinput;
			}
			return InvalidInputException.error_type.No_error;
	}
}


public class UserRegistration {
	
	//Validating First Name
		Validation firstNameValidation = user -> {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(user);
		return matcher.find();
		};
		
		
		
		
		
	
		//Validating Last Name
		Validation lastNameValidation = user -> {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(user);
		return matcher.find();
		};
		
		// Validating Email-Id
		Validation emailIdValidation = user -> {
		Pattern pattern = Pattern.compile("^[a-z0-9+.-_]+@[a-z.]+[comin]$");
		Matcher matcher = pattern.matcher(user);
		return matcher.find();
		};
		
		// Validating Phone Number
		Validation phoneNumValidation = user -> {
		Pattern pattern = Pattern.compile("[91]{2}[: :][6789]{1}[0-9]{9}$");
		Matcher matcher = pattern.matcher(user);
		return matcher.find();
		};
	

		//Validating Password
		Validation passwordValidation = user -> {
		Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]){8,}");
		Matcher matcher = pattern.matcher(user);
		return matcher.find();
		};
	
	
}




