package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Application;

public interface IApplicationService {
	public List<Application> viewAllApplicationDetails();
	public List<Application> getApplicationDetailsByEmail(String email);
	public Application addApplication(Application application);
	public List<Application> getApplicationDetailsByStatus(String status);
	public int deleteApplicationById(int applicationId);
	public int deleteApplicationByEmail(String emailId);
	public int getApplicationById(int applicationId);
	public String updateApllicationStatus(Application app);
	


}
