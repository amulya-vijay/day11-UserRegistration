package com.userRegistrationTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.userRegistrationTest.InvalidInputException.error_type;

public class UserRegistration {
	
	
	
	public error_type validateFirstName(String firstName) throws InvalidInputException {
		

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		try {
		if(!matcher.find()) {
			throw new InvalidInputException();
		}
		}catch(InvalidInputException e) {
			return InvalidInputException.error_type.Invalid_first_name;
		}
		return null;
		
	}
	
	public error_type validateLastName(String lastName) throws InvalidInputException {
		
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		try {
		if(!matcher.find()) {
			throw new InvalidInputException();
		   }
		}catch(InvalidInputException e) {
			return InvalidInputException.error_type.Invalid_last_name; 	
			}
		return null;
	}

	public error_type validateEmailId(String emailId) throws InvalidInputException {
		
		Pattern pattern = Pattern.compile("^[a-z0-9+.-_]+@[a-z.]+[comin]$");
		Matcher matcher = pattern.matcher(emailId);
		try {
		if(!matcher.find()) {
			throw new InvalidInputException();
		}
		}catch(InvalidInputException e) {
			return InvalidInputException.error_type.Invalid_Email; 	
			}
		return null;
		
	}

	public error_type validatePhoneNumber(String phoneNum) throws InvalidInputException {
		Pattern pattern = Pattern.compile("[91]{2}[: :][6789]{1}[0-9]{9}$");
		Matcher matcher = pattern.matcher(phoneNum);
		
		try {
		if(!matcher.find()) {
			throw new InvalidInputException();}
		}catch(InvalidInputException e) {
			return InvalidInputException.error_type.Invalid_mobile_number; 	
			}
		return null;
	}

	public error_type validatePassword(String password) throws InvalidInputException {
		Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]){8,}");
		Matcher matcher = pattern.matcher(password);
	try {
		if(matcher.find()) {
			throw new InvalidInputException();}
		}catch(InvalidInputException e) {
			return InvalidInputException.error_type.Invalid_password; 	
			}
		return null;
	}
	
}




