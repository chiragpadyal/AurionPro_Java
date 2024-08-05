package com.swabhav.structural.adapter.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
	List<IItem> cartItems;

	public ShoppingCart() {
		super();
		this.cartItems = new ArrayList<IItem>();
	}
	public void addItemtoCart(List<IItem> newItems) {
		cartItems.addAll(newItems);
	}
	
	public List<IItem> getCartItems(){
		return cartItems;
	}
	
	public double getCartPrice() {
		return cartItems.stream().mapToDouble(IItem::getItemPrice).sum();
//		return cartItems.stream().collect(Collectors.summingDouble(IItem::getItemPrice));
	}
}
