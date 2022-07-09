package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Course;

public interface ICourseService {
	public Course addCourse(Course course);
	public List<Course> viewAllCourseDetails();
	public List<Course> getCourseDetailsByCourseName(String courseName);
	public List<Course> getCourseDetailsByCollegeName(String collegeName);
	public List<Course> getCourseDetailsByEligibility(String Eligibility);
	public Course getCourseDetailsByCourse(int courseId);
	public int deleteCourseById(int courseById);
	public int deleteCourseByName(String courseName);
	public int updateCourseDetails(Course course);
	
	
	
	

}
