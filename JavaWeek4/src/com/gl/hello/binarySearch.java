package com.gl.hello;

public class binarySearch {
	
	public static void bs(int arr[], int first, int last, int key) {
		
		int mid = (first+last)/2;
		while(first<= last) {
			if(arr[mid] < key) {
				first = mid+1;
				}
			else if (arr[mid] == key) {
				System.out.println("Element found in the position : " + mid);
				break;
			}
			else {
				last = mid-1;
			}
			mid = (first+last)/2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int array[]= { 3, 54, 76, 122, 555};
    int key = 3;
    int last = array.length - 1;
    bs(array, 0, last, key);
	}

}
