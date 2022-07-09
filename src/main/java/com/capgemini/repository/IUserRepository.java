package com.capgemini.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.Login;
import com.capgemini.model.User;

public interface IUserRepository extends JpaRepository <User, String>{
	
	@Transactional
	@Modifying
	@Query(value="delete from User u where u.Id=?1")
	public int deleteUserDetailsById(String Id);

	@Query(value="select * from user1_table where id=?1",nativeQuery=true)
	public User getUserDetailsById(String Id);
	@Transactional
	@Modifying
	@Query(value="update User u set u.firstName=?1 where u.Id=?2")
	public int UpdateUser(String firstName,String Id);
	
}
