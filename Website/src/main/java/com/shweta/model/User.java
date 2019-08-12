package com.shweta.model;

public class User {
private int Id;
private String Name;
private String Sirname;
private String UserName;
private String Address;
public User() {
	
}


public User(int id, String name, String sirname, String userName, String address) {
	super();
	Id = id;
	Name = name;
	Sirname = sirname;
	UserName = userName;
	Address = address;
}


public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
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
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}


@Override
public String toString() {
	return "User [Id=" + Id + ", Name=" + Name + ", Sirname=" + Sirname + ", UserName=" + UserName + ", Address="
			+ Address + "]";
}
 
}
