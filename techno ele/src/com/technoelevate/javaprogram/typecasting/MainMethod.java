package com.technoelevate.javaprogram.typecasting;

public class MainMethod {
public static void main(String[] args) {
	ParentClass class1=new ChildClass();
	class1.parentMethod();
	System.out.println(class1.num);
	
	ChildClass childClass=(ChildClass)class1;
	childClass.childMethod();
	}
}
