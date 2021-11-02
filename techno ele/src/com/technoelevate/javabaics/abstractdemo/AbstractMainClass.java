package com.technoelevate.javabaics.abstractdemo;

public class AbstractMainClass {
	public static void main(String[] args) {
		SubAbstractClass subAbstractClass=new SubAbstractClass(30);
		subAbstractClass.add();
		subAbstractClass.sum();
		subAbstractClass.display();
		System.out.println(subAbstractClass.i);
		
	}

}
