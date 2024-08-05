package com.swabhav.test;

import com.swabhav.model.Builder;
import com.swabhav.model.Guitar;
import com.swabhav.model.Inventory;
import com.swabhav.model.Type;
import com.swabhav.model.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "aac", Type.ACOUSTIC, Wood.ADIRONDACK, Wood.CEDAR);
//		Guitar whatErinLikes = new Guitar(null, 0, null, null, "electric", null, "alder");
		Guitar guitar = inventory.searchGuitar(whatErinLikes);
		
		if(guitar != null) {
			System.out.println("Found Guitar");
			System.out.println(guitar);
		} else {
			System.out.println("Not Found Similar Guitar");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("", 0, "ender", "stratocastor", "electric", "alder", "alder");
	}
}
