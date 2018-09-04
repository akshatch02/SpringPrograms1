package com.cg.sessionschedule.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name= "ScheduledSessionsNew")
public class SessionSchedule {
	@Id
	private int id;
	@NotEmpty
	@NotNull
	private String name;
	private int duration;
	@NotEmpty
	@NotNull
	private String faculty;
	@NotEmpty
	@NotNull
	private String mode1;
	
	public SessionSchedule() {
		super();
	}
	public SessionSchedule(int id, String name, int duration, String faculty, String mode1) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode1 = mode1;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public String getMode1() {
		return mode1;
	}


	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}
	
}
