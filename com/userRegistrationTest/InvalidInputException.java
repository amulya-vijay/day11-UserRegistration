package com.userRegistrationTest;

@SuppressWarnings("serial")
public class InvalidInputException extends Throwable {
	
	
	

	public enum error_type{
		
		Invalid_first_name,
		Invalid_last_name,
		Invalid_Email,
		Invalid_mobile_number,
		Invalid_password,
		No_error
	}
	
	
}
