package com.java.spring.model;

public class Item {
	private int id;
	private String name;
	private String imagepath;
	private String description;
	private double price;
	
	public Item() {
		
	}

	public Item(int id, String name, String imagepath, String description, double price) {
		
		this.id = id;
		this.name = name;
		this.imagepath = imagepath;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public boolean equals(Object o) {  //expecting these method to fetch the id and value return by the database to be match
		return (((Item)o).id == id);
	}
	
	
	
	
	

}
