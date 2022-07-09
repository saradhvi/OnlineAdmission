package com.capgemini.dao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.ProgramScheduleId;
import com.capgemini.repository.IProgramScheduleIdRepository;
import com.capgemini.service.IProgramScheduleService;
@Service
public class IProgramScheduleIdDao implements  IProgramScheduleService{
@Autowired
private IProgramScheduleIdRepository repositoryschedule;
	@Override
	public ProgramScheduleId addProgramSchedule(ProgramScheduleId programSchedule) {
		// TODO Auto-generated method stub
		return repositoryschedule.save(programSchedule);
	}

	@Override
	public List<ProgramScheduleId> viewAllProgramScheduleDetails() {
		// TODO Auto-generated method stub
		return repositoryschedule.findAll();
	}

	@Override
	public List<ProgramScheduleId> getProgramScheduleByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		return repositoryschedule.getProgramScheduleByCollegeName(collegeName);
	}

	@Override
	public List<ProgramScheduleId> getProgramScheduleByDate(String startDate) {
		// TODO Auto-generated method stub
		Date sdate=null;
		try {
			sdate = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return repositoryschedule.getProgramScheduleByDate(sdate);
	}

	@Override
	public int deleteProgramScheduleById(int scheduleId) {
		// TODO Auto-generated method stub
		return repositoryschedule.deleteProgramScheduleById(scheduleId);
	}

	@Override
	public ProgramScheduleId getProgramScheduleById(int scheduleId) {
		// TODO Auto-generated method stub
		return repositoryschedule.findById(scheduleId).get();
	}

	
	@Override
	public int updateProgramSchedule(ProgramScheduleId ProgramScheduleId) {
		// TODO Auto-generated method stub
		int k= ProgramScheduleId.getScheduleId();
		Date p=ProgramScheduleId.getStartDate();
		int w=repositoryschedule.updateProgramSchedule(p,k);
		return w;
	}
}




