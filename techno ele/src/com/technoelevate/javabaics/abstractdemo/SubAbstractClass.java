package com.technoelevate.javabaics.abstractdemo;

public class SubAbstractClass extends AbstractClassDemo{
	public SubAbstractClass(int i) {
		super(i);
	}
	@Override
	public void add() {
		System.out.println("concrete method of parent class");
	}
public void display() {
	System.out.println("concrete method of subclass");
}

}
