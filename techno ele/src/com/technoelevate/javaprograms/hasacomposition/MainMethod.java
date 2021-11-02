package com.technoelevate.javaprograms.hasacomposition;

public class MainMethod {
	public static void main(String[] args) {
		Engine engine=new Engine("S4", 1994, "turbojet");
		Tyre tyre=new Tyre("MRF", "Tubeless", 14.6f, 13000.20);
		Vehicle vehicle=new Vehicle(engine,tyre , "audi", "white");
		vehicle.status();
	}

}

