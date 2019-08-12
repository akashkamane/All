package com.spring.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AdvancedJavaCourse implements Course {
	@Autowired
	List<String> courseContents;
	@Autowired
	int courseDuration;
	@Autowired
	double courseFees;
	Course course;
	public AdvancedJavaCourse() {
		
	}
	public AdvancedJavaCourse(List<String> courseContents, int courseDuration, double courseFees) {
		
		this.courseContents = courseContents;
		this.courseDuration = courseDuration;
		this.courseFees = courseFees;
	}
	public List<String> getCourseContents() {
		return courseContents;
	}
	public void setCourseContents(List<String> courseContents) {
		this.courseContents = courseContents;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	@Override
	public String toString() {
		return "CoreJavaCourse " +courseContents+" duration is "+courseDuration+" Fees is "+courseFees;
	}
	@Override
	public void myCourse() {
		System.out.println(course);
		
	}
	

}
