package com.spring.da;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Launching {

	public static void main(String[] args) {
		ApplicationContext context= new FileSystemXmlApplicationContext("C:\\Users\\AKASH\\eclipse-workspace\\WebApp\\src\\main\\java\\com\\spring\\da\\TrainingConfig.xml");
		EmployeeDAO dao=(EmployeeDAO)context.getBean("employeedao");
		
	}

}
