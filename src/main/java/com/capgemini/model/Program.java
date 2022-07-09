package com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Program_Table")
public class Program {
	@Id
	public int programId;
	public String programName;
	public String eligibility;
	public String duration;
	public String degreeOffered;
	public int getProgramId() {
		return programId;
	}
	public void setProgramId(int programId) {
		this.programId = programId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDegreeOffered() {
		return degreeOffered;
	}
	public void setDegreeOffered(String degreeOffered) {
		this.degreeOffered = degreeOffered;
	}
	
	

}
