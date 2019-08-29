package com.shweta.model;

import java.util.Enumeration;
import java.util.Vector;

public class ItemName {

	private Vector ItemNames;
	
	
	public ItemName() {
		ItemNames = new Vector();
		}
	
	
	public void fetchCartItem(final CartItem cartItem) {
		//if(ItemNames.contains(cartItem)) {
			Vector items = (Vector) ItemNames.get(2);
		System.out.println(items);
	
		
	}


}
