package com.example.springAutomationFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringAutomationFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringAutomationFrameworkApplication.class, args);
//		var car = applicationContext.getBean(Car.class);
//		car.getCar();
	}



}
