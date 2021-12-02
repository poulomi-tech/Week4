package com.gl.hello;

import java.util.Scanner;

public class LinerSearchExample {
	
	
	public int Num_Element, Search_Element;
	public int array[];
	public boolean status = false;
	
	Scanner sc = new Scanner(System.in);
	
	
	public void LS() {
		
        System.out.println("Enter the no. of elements you want in the array");
		
		Num_Element = sc.nextInt();
		array = new int[Num_Element];
		
		System.out.println("Enter the numbers one by one ...");
		insertValues();
		printValues();
		
		
		System.out.println("Enter the element to search ");
		Search_Element = sc.nextInt();
		searchValues(Search_Element);
	}
	
	public void insertValues() {
		for(int i = 0; i < Num_Element; i++) {
			System.out.println("Enter element at position " + i + ":");
			array[i] = sc.nextInt();
		}
	}
	
	public void printValues() {
		for(int i = 0; i < Num_Element; i++) {
			System.out.println("Value at position " + i + " is " + array[i]);
		}
		System.out.println();
	}
	
	public void searchValues(int value) {
		for (int i = 0; i < Num_Element; i++) {
			if(array[i] == value) {
				System.out.println("Search Value " + Search_Element + "found at the array index " + i);
			}
			status = true;
		}
		if(status == false) {
			System.out.println("Value not found...");
		}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     
		LinerSearchExample LS1 = new LinerSearchExample();
		LS1.LS();
		
     
     
	}

}
