package com.technoelevate.javabasics.objectclass;

public class MainMethod {
	public static void main(String[] args) {
		Mobile mobile=new Mobile("samsung", 68000, 12);
		Mobile mobile2=new Mobile("samsung", 124000, 3);
		System.out.println(mobile);
		System.out.println(mobile2);
		System.out.println(mobile.hashCode());
		System.out.println(mobile2.hashCode());
		System.out.println(mobile.equals(mobile2));
	}

}
