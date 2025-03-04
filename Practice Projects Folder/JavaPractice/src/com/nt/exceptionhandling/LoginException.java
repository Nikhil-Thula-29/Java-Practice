package com.nt.exceptionhandling;

public class LoginException extends Exception{

	//create constructor with message parameter and super 
	public LoginException(String message) {
		super(message);
	}
}
