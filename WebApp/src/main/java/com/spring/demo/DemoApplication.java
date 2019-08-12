package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class DemoApplication {
	
	public static void main(String args[]) {
		ConfigurableApplicationContext context= SpringApplication.run(User.class, args);
		User use=context.getBean(User.class);
		use.show();
	}

}
