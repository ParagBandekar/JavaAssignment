
package com.technoelevate.javaprogram.encapsulation;

public class MainMethod {
	public static void main(String[] args) {
		EncapsulationDemo demo=new EncapsulationDemo();
		demo.setName(null);
		demo.setAge(0);
		demo.setPlace(null);
		System.out.println(demo.getAge());
		System.out.println(demo.getName());
		System.out.println(demo.getPlace());
	}

}
