package com.spring.di;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class AndroidTrainer implements Trainer {
	String name;
	@Autowired
	Set<String> specialties;
	


		public AndroidTrainer() {
		
	}


		public AndroidTrainer(String name, Set<String> specialties) {
		
		this.name = name;
		this.specialties = specialties;
	}
		

		@Override
		public void train() {
			System.out.println(name+" is a Android Trainer");

		}
		

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public void setSpecialties(Set<String> specialties) {
			this.specialties = specialties;
		}


		
		public Set<String> getSpecialties() {
			return specialties;
			
		}


		@Override
		public String toString() {
			return name+" is a AndroidTrainer";
		}
		

}
