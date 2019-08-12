package com.spring.di;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;





@Component
@Scope(value="prototype")
public class MikadoSolutions implements TrainingCompany {

	//static MikadoSolutions mikadoo;

	List<Trainer> trainers;
	
	Set<Course> courses;
	Map<Course,Trainer> courseTrainers; 
	
	
	
	public MikadoSolutions() {
		
	}
	/*
	 * privates MikadoSolutions() { } public static MikadoSolutions
	 * getMikadoSolutions() { if(mikadoo==null) mikadoo=new MikadoSolutions();
	 * return mikadoo; }
	 */
	 
	
	public void conductTraining() {				
				Iterator<Trainer> it = trainers.iterator();
				while(it.hasNext()) {
					Trainer trainer=it.next();
					System.out.println(trainer);
					trainer.train();
					}
				
	}
	
	
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	/*
	 * public String toString() { return "MikadoSolutions is a Chutiya company"; }
	 */
	public Map<Course, Trainer> getCourseTrainers() {
		return courseTrainers;
	}
	public void setCourseTrainers(Map<Course, Trainer> courseTrainers) {
		this.courseTrainers = courseTrainers;
		Collection<Trainer> values=courseTrainers.values();
		trainers=new ArrayList<Trainer>(values);
	}
	
	

}
