package com.technoelevate.javabaics.abstractdemo;

abstract public class AbstractClassDemo {
	int i;
	public AbstractClassDemo(int i) {
		this.i=i;
		System.out.println(i);
		
	}
	public void sum() {
		System.out.println("abstract class concrete method");
	}
	abstract public void add();

}
