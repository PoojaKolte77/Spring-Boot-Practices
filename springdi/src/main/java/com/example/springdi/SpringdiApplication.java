package com.example.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springdi"})
public class SpringdiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdiApplication.class, args);

			
    ConfigurableApplicationContext run = SpringApplication.run(SpringdiApplication.class, args);
		Car car = run.getBean("car",Car.class);
		car.drive();
	}

}
