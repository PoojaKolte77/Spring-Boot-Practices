package main.java.com.example.springfi;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		super();
		System.out.println("Engine default constructor called");
	}
	
	public int start() {
		System.out.println("Engine start method");
		return 1;
	}

}