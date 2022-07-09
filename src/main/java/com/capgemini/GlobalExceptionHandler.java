package com.capgemini;
import java.time.LocalDateTime;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.UserException.ErrorMessage;
import com.capgemini.UserException.InvalidUserException;
import com.capgemini.UserException.UserCreationException;
@ControllerAdvice
public class GlobalExceptionHandler{
	
@ExceptionHandler(InvalidUserException.class)
public @ResponseBody ErrorMessage checkInvalidUserException(InvalidUserException e)

{
	ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
	return error1;
}
@ExceptionHandler(UserCreationException.class)
public @ResponseBody ErrorMessage checkUserCreationException(UserCreationException e)

{
	ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
	return error1;
}


	

//validation

@ExceptionHandler(MethodArgumentNotValidException.class)
public @ResponseBody ErrorMessage checkUserValidation(MethodArgumentNotValidException e)

{
	ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage(),e.getBindingResult().toString());
	return error1;
}
}
