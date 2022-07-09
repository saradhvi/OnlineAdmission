package com.capgemini.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.model.Login;
import com.capgemini.model.User;


@Repository
public interface ILoginRepository extends JpaRepository<Login,String> {
	@Query(value="select * from login_table where userid=?1",nativeQuery=true)
	public Login getloginDetailsById(String userid);
	@Transactional
	@Modifying
	@Query(value="delete from Login l where l.userid=?1")
	public int deleteLoginDetailsById(String userid);
	@Transactional
	@Modifying
	@Query(value="update Login l set l.password=?1 where l.userid=?2")
	public int ChangePassword(String password,String userid);
}


		


