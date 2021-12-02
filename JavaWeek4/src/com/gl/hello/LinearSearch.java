package com.gl.hello;

public class LinearSearch {
	
	public static int LinearSearch(int[] arr, int key, int size) {
		for(int i = 0; i < size; i++) {
			if (arr[i]== key) {
				return 1;
			}
			return -1;
		}
	}

	public static void main(String a[]) {
		// TODO Auto-generated method stub
    int[] arr = { 6, 65, 8, 456, 3, 77, 98, 1 };
    int size = arr.length;
    int keyElement = 8;
    int position = LinearSearch(arr, keyElement, size);
    if(position == -1) {
    	System.out.println("Element is not present in the given array..");
    }
    else
    {
    	System.out.println("Element found at the array index "+ position);
    }
	}
}

