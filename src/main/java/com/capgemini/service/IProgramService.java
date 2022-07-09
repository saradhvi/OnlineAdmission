package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Program;

public interface IProgramService {
	public Program addProgram(Program program);
	public List<Program> viewAllProgramDetails();
	public List<Program> getApplicationDetailsByCollegeName(String collegeName);
	public List<Program> getProgramDetailsByNameByEligibility(String programName);
	public int deleteProgramById(int programId);
	public int deleteProgramByName(String programName);
	public Program getProgramById(int programId);
	public int updateProgramStatus(Program program);

}
