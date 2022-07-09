package com.capgemini.UserException;

public class InvalidUserException extends Exception {
	public InvalidUserException()
	{
		super();
	}
	public InvalidUserException(String errorMsg)
	{
		super(errorMsg);
	}
	

}
