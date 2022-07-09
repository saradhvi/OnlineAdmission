package com.capgemini.service;

import java.util.List;

import com.capgemini.UserException.InvalidUserException;
import com.capgemini.UserException.UserCreationException;
import com.capgemini.model.Login;
import com.capgemini.model.User;

public interface IUserService {
	public User addUserDetails(User user)throws UserCreationException;
	public Login addLoginDetails(Login login);
	public List<User> getAllUserDetails();
	public User getUserDetailsById(String userId);
	public Login getLoginDetailsById(String userId);
	public User deleteUserDetailsById(String userId);
	public Login deleteLoginDetailsById(String Id);
	public Login changePassword(Login login);
	public Login resetPassword(Login login);
	public User updateUserDetails(User user) throws InvalidUserException;
	
	

}