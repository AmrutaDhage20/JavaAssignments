//Program for Implicit Data Type Conversion
package com.encora.javaAssignments;
public class ImplicitDataTypeConversion 
{
	public static void main(String[] args) 
	{
		int age=50;
		System.out.println("Int representation: "+age); //Prints the int value stored in age variable
		
		long name=age;
		System.out.println("Long representation: "+name);//Prints the long value stored at name
		
		float city= name;
		System.out.println("Float representation: "+city);//Prints the float value stored at city
	}
}