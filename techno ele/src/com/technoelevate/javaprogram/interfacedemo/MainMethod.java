package com.technoelevate.javaprogram.interfacedemo;

public class MainMethod {
public static void main(String[] args) {
	ImplementationClass implementationClass=new ImplementationClass();
	implementationClass.parentMethod();
	implementationClass.childMethod();
	implementationClass.grandChildMethod();
	System.out.println(InterfaceParent.i);
	System.out.println(Interfacehild.num);
	System.out.println(InterfaceGrandChild.f);
	System.out.println(InterfaceGrandChild.i);
	System.out.println(InterfaceGrandChild.num);
}
}
