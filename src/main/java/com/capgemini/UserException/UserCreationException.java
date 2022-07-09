package com.capgemini.UserException;

public class UserCreationException extends Exception{
	public UserCreationException()
	{
		super();
	}
	public UserCreationException(String errorMsg)
	{
		super(errorMsg);
	}

}
