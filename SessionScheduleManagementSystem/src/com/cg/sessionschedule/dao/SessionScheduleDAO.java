package com.cg.sessionschedule.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.sessionschedule.bean.SessionSchedule;

public interface SessionScheduleDAO extends JpaRepository<SessionSchedule, Integer> {

	@Query(value = "from SessionSchedule sessionobj")
	public List<SessionSchedule> getAllSessions();
}
