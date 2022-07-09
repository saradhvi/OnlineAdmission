package com.capgemini.dao;
import java.util.List;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.UserException.InvalidUserException;
import com.capgemini.UserException.UserCreationException;
import com.capgemini.model.Login;
import com.capgemini.model.User;
import com.capgemini.repository.ILoginRepository;
import com.capgemini.repository.IUserRepository;
import com.capgemini.service.IUserService;


@Service
public class IUserDao implements IUserService{
@Autowired
private IUserRepository userrepository;
@Autowired
private ILoginRepository loginrepository;
@Autowired
IUserDao dao;
@Override
public User addUserDetails(User user)throws UserCreationException{
	if(userrepository.existsById(user.getId()))
    {
        throw new UserCreationException("User is added");
    }
    else
    {
    return userrepository.save(user);
}
}
@Override
public Login addLoginDetails(Login login) {
	// TODO Auto-generated method stub
	return loginrepository.save(login);
}
@Override
public List<User> getAllUserDetails() {
	// TODO Auto-generated method stub
	return userrepository.findAll();
}
@Override
public User getUserDetailsById(String Id) {
	// TODO Auto-generated method stub
	return  userrepository.getUserDetailsById(Id);
}
@Override
public Login getLoginDetailsById(String userid) {
	// TODO Auto-generated method stub
	return loginrepository.getloginDetailsById(userid);
}
@Override
public User deleteUserDetailsById(String Id) {
	// TODO Auto-generated method stub
	int k=userrepository.deleteUserDetailsById(Id);
if(k==1) {
	return userrepository.getUserDetailsById(Id);
}else {
	return null;
}
}
@Override
public Login deleteLoginDetailsById(String userid) {
	// TODO Auto-generated method stub
	int k=loginrepository.deleteLoginDetailsById(userid);
	if(k==1) {
		return loginrepository.getloginDetailsById(userid);
	}else {
		return null;
	}
}
@Override
public Login changePassword(Login login) {
	// TODO Auto-generated method stub
	String k=login.getUserid();
	String w=login.getPassword();
	int e=loginrepository.ChangePassword(w,k);
	if(e==1) {
		return login;
	}else {
		return null;
	}
}
@Override
public Login resetPassword(Login login) {
	// TODO Auto-generated method stub
	String k=login.getUserid();
	String w=login.getPassword();
	int e=loginrepository.ChangePassword(w,k);
	if(e==1) 
	{
		return login;
	}else 
	{
		return null;
	}
	}
@Override
public User updateUserDetails(User user) throws InvalidUserException{
	// TODO Auto-generated method stub
	if(userrepository.existsById(user.getId())) {
		
	String id=user.getId();
	String name=user.getFirstName();
	int k=userrepository.UpdateUser(name, id);
	if(k==1) 
	{
		return user;
	}else 
	{
		throw new InvalidUserException("user id is not available");
	}
	}
	return user;
}
}




	





