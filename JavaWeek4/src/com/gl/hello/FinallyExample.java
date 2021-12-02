package com.gl.hello;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		try {
		int a = 8;
        int b = 0;
        int c = a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is the end........");
		}
	}

}
