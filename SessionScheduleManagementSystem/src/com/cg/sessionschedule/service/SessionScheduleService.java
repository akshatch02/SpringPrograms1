package com.cg.sessionschedule.service;

import java.util.List;

import com.cg.sessionschedule.bean.SessionSchedule;
import com.cg.sessionschedule.exception.InvalidInputException;


public interface SessionScheduleService {
	
	public List<SessionSchedule> getAllSessionDetails() throws InvalidInputException ;

}
