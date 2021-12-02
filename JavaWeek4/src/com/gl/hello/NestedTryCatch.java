package com.gl.hello;

import java.util.Scanner;

class MyException extends Exception {
	public String toString() {
		return super.toString() + "I am toString()";
	}
	
	public String getMessage() {
		return super.getMessage() + "I am getMessage()";
	}
}

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number...");
   a = sc.nextInt();
   
   if(a < 76) {
	   try {
	   throw new MyException();
   }
   catch(Exception e){
	   System.out.println(e.getMessage());
	   System.out.println(e.toString());
	   e.printStackTrace();
	   System.out.println("done.....");
   }

	}
	}
}
