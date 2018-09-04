package com.cg.project.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.project.bean.Employee;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("projectBeans.xml");
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee);
	

	}
	

}
