package com.technoelevate.javabasics.exceptionhandling;

public class ExceptionDemoOnReturnStatement {
	public static void main(String[] args) {
		System.out.println(returnStatementDemo());
	}

	private static int returnStatementDemo() {
		try {
			System.out.println("inside try block");
			int result=10/0;
			System.out.println("result:"+result);
			return result;
		}catch(ArithmeticException e) {
			System.out.println("inside catch block");
			return 10;
		}finally {
			System.out.println("inside finally block");
			return 9;
		}
		
	}
	

}
