package com.swabhav.model;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCBOLD, CEDAR, ADIRONDACK, ALDER, STIKA;
	
	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD: return "Indian RoseWood";
		case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
		case MAHOGANY: return "MAHOGANY";
		case MAPLE: return "Maple";
		case COCBOLD: return "Cocbold";
		case CEDAR: return "Cedar";
		case ADIRONDACK: return "Adirondack";
		case ALDER: return "Alder";
		case STIKA: return "Stika";
		default: return "undefined";
		}
	};
}
