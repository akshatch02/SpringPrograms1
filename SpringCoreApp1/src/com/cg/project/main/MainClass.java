package com.cg.project.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.project.services.GreetingServices;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("projectBeans.xml");
		GreetingServices greetingServices=(GreetingServices)context.getBean("greetingServices");
		greetingServices.sayHello("ABC");


	}


}
