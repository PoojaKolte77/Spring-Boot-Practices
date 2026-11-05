package main.java.com.example.springci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public Car() {
		super();
       System.out.println("Car Default constructor");
	}
	
	@Autowired
	public Car(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("car parameterized constructor called");
	}
	
	// @Autowired optional when only one constructor please check

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
