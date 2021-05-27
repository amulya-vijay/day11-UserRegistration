package com.userRegistrationTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	
	
	public String validateFirstName(String firstName) {
		

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		if(matcher.find()) {
			return firstName;
		}else {
			return "Invalid First Name : First name should begin with a upper case letter and must contain minimum 3 letters.";
		}
		
	}
	
	public String validateLastName(String lastName) {
		
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		if(matcher.find()) {
			return lastName;
		}else {
			return "Invalid Last Name : last name should begin with a upper case letter and must contain minimum 3 letters.";
		}
	}

	public String validateEmailId(String emailId) {
		
		Pattern pattern = Pattern.compile("^[a-z0-9+.-_]+@[a-z.]+[comin]$");
		Matcher matcher = pattern.matcher(emailId);
		if(matcher.find()) {
			return emailId;
		}else {
			return "Invalid Email ID: valid format- example@domain.com";
		}
		
	}

	public String validatePhoneNumber(String phoneNum) {
		Pattern pattern = Pattern.compile("[91]{2}[: :][6789]{1}[0-9]{9}$");
		Matcher matcher = pattern.matcher(phoneNum);
		if(matcher.find()) {
			return phoneNum;
		}else {
			return "Invalid Phone Number: valid format- 91 [10-digit-number]";
		}
	}

	public String validatePassword(String password) {
		Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]){8,}");
		Matcher matcher = pattern.matcher(password);
	
		if(matcher.find()) {
			return "password set";
		}else {
			return "Invalid Password: Password should contain atleast 8 characters"+
					" with atleast one upper case letter,one numeric character and one special character.";
		}
	}
	
}




