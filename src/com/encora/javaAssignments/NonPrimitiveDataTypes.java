package com.encora.javaAssignments;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
				 
		String str = "Amruta"; // declare the string
		System.out.println("String is: " + str); // Print the string
		
		String str1 = new String ("Test The String"); // declaration of string
		System.out.println("Second String: " +str1);
		
		int arr[]; //declaration of array
		arr = new int[2]; //array integer is till index is 2
		arr[0]= 0;
		arr[1]= 1;
		
		//System.out.println(arr); // prints the whole memory location value 
		System.out.println(arr[0]); // print 0th location value
		System.out.println(arr[1]); //print 1st location value
	
	}

}
