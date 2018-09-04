package com.cg.project.services;

import org.springframework.stereotype.Component;

@Component(value="greetingServices")
public class GreetingServicesImpl1 implements GreetingServices {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}

	@Override
	public void sayBye(String name) {
		System.out.println("GoodBye "+name);	
	}
}
