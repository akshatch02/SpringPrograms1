package com.cg.sessionschedule.controllers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.sessionschedule.bean.SessionSchedule;
import com.cg.sessionschedule.exception.InvalidInputException;
import com.cg.sessionschedule.service.SessionScheduleService;
@Controller
public class ActionController {
	@Autowired
	private SessionScheduleService sessionService;
	@RequestMapping(value="/")
	public ModelAndView showAllSessions(){
		List<SessionSchedule> session = new ArrayList<>();
		try {
			session = sessionService.getAllSessionDetails();
		} catch (InvalidInputException e) {
			return new ModelAndView("errorPage");
		}
		return new ModelAndView("ScheduledSessions","session", session);
	}
	@RequestMapping(value="/enrollMe")
	public ModelAndView enrollForSession(@RequestParam("name")String name) {
		return new ModelAndView("Success","name" ,name);
	}
}