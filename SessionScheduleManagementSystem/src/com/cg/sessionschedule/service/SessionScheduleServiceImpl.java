package com.cg.sessionschedule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.sessionschedule.bean.SessionSchedule;
import com.cg.sessionschedule.dao.SessionScheduleDAO;
import com.cg.sessionschedule.exception.InvalidInputException;

@Component(value = "sessionService")
public class SessionScheduleServiceImpl implements SessionScheduleService {

	@Autowired
	private SessionScheduleDAO sessionDao;

	@Override
	public List<SessionSchedule> getAllSessionDetails() throws InvalidInputException {
		List<SessionSchedule> sessionList = sessionDao.getAllSessions();

		return sessionList;
	}

}
