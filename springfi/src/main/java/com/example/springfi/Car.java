package main.java.com.example.springfi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;

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