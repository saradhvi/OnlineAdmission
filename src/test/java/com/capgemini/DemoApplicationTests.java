package com.capgemini;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.UserException.InvalidUserException;
import com.capgemini.UserException.UserCreationException;
import com.capgemini.model.Login;
import com.capgemini.model.User;
import com.capgemini.repository.IUserRepository;
import com.capgemini.service.IUserService;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class DemoApplicationTests {

		@Autowired
		private IUserRepository userrepository;
		@Autowired
		IUserService service;

		@Test
		public void testUserSave() {
			User u=new User();
			u.setId("49");
			u.setAadharcardNo("12345678908");
			u.setEmail("sarah@gmail.com");
			u.setFirstName("saram");
			u.setLastName("ullinkala");
			u.setMobileNumber("9390393436");
			u.setMiddleName("ra");
			Login l=new Login();
			l.setPassword("sharon");
			l.setRole("Student");
			l.setUserid("97");
			u.setLogin(l);
			 User t=null;
			try {
			 	t= service.addUserDetails(u);
			} catch (UserCreationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		assertNotNull(t);
			}
        @Test
		public  void viewAllUserDetails()
		{
			
		List<User> list=service.getAllUserDetails();
		assertThat(list).size().isGreaterThan(0);
		}
        @Test
        public void UpdateUserDetails() {
        	
		User u=userrepository.findById("256").get();
        u.setFirstName("siri");
        userrepository.save(u);
        //assertNotEquals("xyz", trainRepos.findById(1144).get().getTarinName());
    assertNotEquals("adfd", userrepository.findById("256").get().getFirstName());  
			 
		
}
}




