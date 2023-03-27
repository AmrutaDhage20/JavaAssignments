//Program for Nonprimitive data type
package com.encora.javaAssignments;
public class NonPrimitiveDataTypes {
	public static void main(String[] args) {
				 
		String str = "Amruta"; // declare the string
		System.out.println("First String is: " + str); // Print the string
		
		String stringName = new String ("My Java Programs"); // declaration of string
		System.out.println("Second String is: " +stringName);
		
		int arrayAtIndex[]; //declaration of array
		arrayAtIndex = new int[2]; //array integer is till index is 2
		arrayAtIndex[0]= 0;
		arrayAtIndex[1]= 1;
		System.out.println("Array at Index 0 is: " +arrayAtIndex[0]); // print 0th location value
		System.out.println("Array at Index 1 is: " +arrayAtIndex[1]); //print 1st location value
	}
}
