package model;


public class Item {
	private int Id;
	private String name;
	
	public Item() {
	
	}

	public Item(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	
	@Override
	public String toString() {
		return "Item [Id=" + Id + ", name=" + name + "]";
	}
	
	
	

}
