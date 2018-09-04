package com.cg.sessionschedule.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cg.sessionschedule.bean.SessionSchedule;
@Controller
public class URIController {

	
	@ModelAttribute("sessions")
	public SessionSchedule getSessions() {
		return new SessionSchedule();
	}
}