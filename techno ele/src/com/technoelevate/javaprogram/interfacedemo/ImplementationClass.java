package com.technoelevate.javaprogram.interfacedemo;

public class ImplementationClass implements InterfaceGrandChild{

	@Override
	public void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("parent method");
		
	}

	@Override
	public void childMethod() {
		// TODO Auto-generated method stub
		System.out.println("child method");
	}

	@Override
	public void grandChildMethod() {
		// TODO Auto-generated method stub
		System.out.println("grandchild method ");
		
	}
	

}
