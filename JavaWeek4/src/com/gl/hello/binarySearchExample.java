package com.gl.hello;

import java.util.Scanner;

public class binarySearchExample {
	
	public int array[];
	public int Num_Element, value, first, last, mid;
	
	Scanner sc = new Scanner(System.in);
	
	
	public static void bs() {
		System.out.println("Enter the number of element you want in array  ...  ");
		Num_Element = sc.nextInt();
		
		array = new int[Num_Element];
		insertValues();
		
		searchValues();
	}
	public void insertValues() {
		for(int i = 1; i< Num_Element; i++) {
			System.out.println("the value for the " + i + "position is ");
		}
	}
	
	public void searchValues() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
