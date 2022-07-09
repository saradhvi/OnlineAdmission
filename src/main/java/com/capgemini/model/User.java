package com.capgemini.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
@Table(name="user1_table")
public class User {
	@Id
	@NotNull(message="Id cannot be null")
	private String Id;
	@NotBlank(message="firstName cannot be null")
	private String firstName;
	@NotBlank(message="middleName cannot be null")
	private String middleName;
	@NotBlank(message="lastName cannot be null")
	private String lastName;
	@NotBlank(message="email cannot be blank")
	private String email;
	@NotBlank(message="Id cannot be blank")
	private String mobileNumber;
	@NotBlank(message="Id cannot be blank")
	private String aadharcardNo;
	
	 @OneToOne(cascade=CascadeType.ALL)
	private Login login;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAadharcardNo() {
		return aadharcardNo;
	}
	public void setAadharcardNo(String aadharcardNo) {
		this.aadharcardNo = aadharcardNo;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	 
	 
	 }
	
	