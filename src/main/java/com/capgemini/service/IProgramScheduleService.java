package com.capgemini.service;

import java.util.Date;
import java.util.List;

import com.capgemini.model.ProgramScheduleId;


public interface IProgramScheduleService {
	public ProgramScheduleId addProgramSchedule(ProgramScheduleId programSchedule);
	public List<ProgramScheduleId> viewAllProgramScheduleDetails();
	public List<ProgramScheduleId> getProgramScheduleByCollegeName(String collegeName);
	public List<ProgramScheduleId> getProgramScheduleByDate(String startDate);
	public int deleteProgramScheduleById(int scheduleId);
	public ProgramScheduleId getProgramScheduleById(int scheduledId);
	public int updateProgramSchedule(ProgramScheduleId ProgramScheduleId);

}
