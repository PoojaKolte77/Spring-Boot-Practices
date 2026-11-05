package com.example.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	public void setEngine(Engine engine){
		this.engine = engine;
		System.out.println("Autowiring through setter method");
	}
	
	public Car() {
		super();
       System.out.println("Car Default constructor");
	}

	public void drive() {
		
		System.out.println("Car drive method started");
		int start = engine.start();
		if(start==1) {
			System.out.println("engine started");
		}
		else {
			System.out.println("engine not started");
		}
	}
	
	
	
}
