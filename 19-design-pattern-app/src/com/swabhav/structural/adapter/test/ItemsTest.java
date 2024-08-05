package com.swabhav.structural.adapter.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.swabhav.structural.adapter.model.Biscuit;
import com.swabhav.structural.adapter.model.Hat;
import com.swabhav.structural.adapter.model.HatAdapter;
import com.swabhav.structural.adapter.model.IItem;
import com.swabhav.structural.adapter.model.ShoppingCart;

public class ItemsTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItemtoCart(
				Arrays.asList(
						new HatAdapter(new Hat("hatfname", "hatlname", 10, 8)),
						new Biscuit("parle", 5)
						)
				);
	
		System.out.println("------------- List --------------");
		System.out.printf(" %-23s %s%n",  "Name", "Price");
		int i = 1;
		for (IItem iItem : cart.getCartItems()) {
			System.out.printf("%2d. %-20s $%.2f%n",  i, iItem.getItemName(), iItem.getItemPrice());
			i++;
		}
		System.out.println("Total Cart Price: " + cart.getCartPrice() );
		

	}
}
