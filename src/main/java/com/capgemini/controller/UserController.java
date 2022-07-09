package com.capgemini.controller;

import java.util.List;


import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.UserException.InvalidUserException;
import com.capgemini.UserException.UserCreationException;
import com.capgemini.dao.IUserDao;
import com.capgemini.model.Login;
import com.capgemini.model.User;

@RestController
public class UserController {
@Autowired 
private IUserDao userdao;
Logger log=LoggerFactory.getLogger(UserController.class);


@PostMapping(path="/createUser")
public User addUser(@Valid @RequestBody User user) throws UserCreationException {
	User k= userdao.addUserDetails(user);
	if(k!=null)
    {
  	  
  	  System.out.println("User is added");
  	log.info("User is added ");
  	     }
    else
    {
  	  
  	  System.out.println("User is not added");
  	  log.error("User is not added");
    }
    return k;
}
@PostMapping(path="/createLogin")
public Login addLoginDetails(@Valid @RequestBody Login login) {
	
	return userdao.addLoginDetails(login);
}
@GetMapping("/getUserdetailsByName/{Id}")
public User getUserDetailsById(@PathVariable String Id){
	log.info("view user details");
	return userdao.getUserDetailsById(Id);
}
@GetMapping("/getLogindetailsById/{userid}")
public Login getLoginDetailsById(@PathVariable String userid){
	return userdao.getLoginDetailsById(userid);
}
@DeleteMapping("/deleteUserdetailsById/{Id}")
public User deleteUserDetailsById(@PathVariable String Id) {
	return userdao.deleteUserDetailsById(Id);
}
@DeleteMapping("/deleteLogindetailsById/{userid}")
public Login deleteLoginDetailsById(@PathVariable String userid) {
	return userdao.deleteLoginDetailsById(userid);
}
@PutMapping("/UpdatePassword/{userid}")
public Login changePassword(@Valid @RequestBody Login login,@PathVariable String userid) {
	return userdao.changePassword(login);
}
@PutMapping("/ResetPassword/{userid}")
public Login resetPassword(@Valid @RequestBody Login login,@PathVariable String userid) {
	return userdao.resetPassword(login);
}
@PutMapping("/UpdateUserdetails/{Id}")
public User updateUserDetails(@Valid @RequestBody User user,@PathVariable String Id) throws InvalidUserException{
	User k1=userdao.updateUserDetails(user);
	if(k1!=null)
	{
		System.out.println("User details updated");
		log.info("User details updated");
	}
	else {
		System.out.println("user details not updated");
		log.error("user details not updated");
	}
	return k1;
}
}