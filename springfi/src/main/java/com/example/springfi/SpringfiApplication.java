package com.example.springfi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringfiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringfiApplication.class, args);
		Car car = run.getBean("car",Car.class);
		car.drive();
	}

}
