package com.userRegistrationTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	
	
	public String validateName(String firstName) {
		

		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher(firstName);
		if(matcher.find()) {
			return firstName;
		}else {
			return "Invalid First Name : First name should begin with a upper case letter and must contain minimum 3 letters.";
		}
		
	}

	}

