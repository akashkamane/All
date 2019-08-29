package com.spring.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class User {

	String Name;
	String Sirname;
	public User() {
		
	}
	public User(String name, String sirname) {
		super();
		Name = name;
		Sirname = sirname;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSirname() {
		return Sirname;
	}
	public void setSirname(String sirname) {
		Sirname = sirname;
	}
	@Override
	public String toString() {
		return "These is a user class";
		
	}
	public void show() {
		System.out.println("Inside User boss");
	}
	
	
	
}
