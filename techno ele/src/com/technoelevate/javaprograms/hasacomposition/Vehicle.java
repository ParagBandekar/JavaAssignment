package com.technoelevate.javaprograms.hasacomposition;

public class Vehicle {
	Engine engine;
	Tyre tyre;
	String name;
	String color;
	
	public Vehicle(Engine engine, Tyre tyre, String name, String color) {
		super();
		this.engine = engine;
		this.tyre = tyre;
		this.name = name;
		this.color = color;
	}
	public void status() {
		System.out.println(this.name+" "+this.color+" "+this.engine+" "+this.tyre);
		System.out.println("vehicle is ready to go on roads");
	}

}
