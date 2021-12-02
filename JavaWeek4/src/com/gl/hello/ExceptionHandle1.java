package com.gl.hello;

public class ExceptionHandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
       int a = 465/0;
		}
		catch(ArithmeticException e) {
			
			System.out.println("There is exception...");
			System.out.println(e);
		}
       System.out.println("Hello World");
	}

}
