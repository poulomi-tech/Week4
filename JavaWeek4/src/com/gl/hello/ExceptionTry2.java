package com.gl.hello;

import java.util.Scanner;

public class ExceptionTry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] marks = new int[3];
      marks[0]= 8;
      marks[1]= 87;
      marks[2]= 5;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the array index... ");
      int a = sc.nextInt();
      
      System.out.println("Enter the number you want to divide the value with ...");
      int b = sc.nextInt();
      
      try {
    	  System.out.println("The value at array index  entered is " + marks[a]);
    	  System.out.println("The value of the division is " + marks[a]/b);
      }
      catch(ArithmeticException e) {
    	  System.out.println("ArithmeticException is there ...");
    	  System.out.println(e);
      }
      catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println("ArrayIndexOutOfBoundsException  is there ...");
    	  System.out.println(e);
      }
      catch(Exception e) {
    	  System.out.println("Some exception is there ...");
    	  System.out.println(e);
      }
      }

}
