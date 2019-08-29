package com.spring.di;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * @author AKASH
 *
 */
@SpringBootApplication
public class LaunchTraining {
		
	
	
	public static void main(String[] args) throws IOException {
		ApplicationContext context= new FileSystemXmlApplicationContext("C:\\Users\\AKASH\\eclipse-workspace\\WebApp\\Trainings.xml");
		System.in.read();
		Workshop trainingWorkshop=(Workshop)context.getBean("trainingWorkshop");
		trainingWorkshop.conductWorkshop();
		//AKASH
	}

}
