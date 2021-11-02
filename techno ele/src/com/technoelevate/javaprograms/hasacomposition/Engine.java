package com.technoelevate.javaprograms.hasacomposition;

public class Engine {
	String piston;
	int yearofmanufacture;
	String enginetype;
	
	public Engine(String piston, int yearofmanufacture, String enginetype) {
		super();
		this.piston = piston;
		this.yearofmanufacture = yearofmanufacture;
		this.enginetype = enginetype;
	}

	@Override
	public String toString() {
		return "Engine [piston=" + piston + ", yearofmanufacture=" + yearofmanufacture + ", enginetype=" + enginetype
				+ "]";
	}

}
