package com.promineo;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");

// This is one type of comment for single line.
/*
 * This is another type of comment for multiple line comments.
 */

//  type variable-name operator operand;
//  camel 

	String firstName = "Daniel";
	System.out.println( "Hello " + firstName);
	
	firstName = "Lexi";
	System.out.println("Lets also say hello to " + firstName);
	
	int age = 17;
	System.out.println(firstName + " is " + age + " years young...");
	
	double barometricPressure = 30.25;
	System.out.println("Pressure: " + barometricPressure);
	
	int maxNumber = 2147483647;
	int maxNumberPlusOne = maxNumber + 1;
	System.out.println("Max Number + 1 = " + maxNumberPlusOne);

	
	// long longerNumber;

	System.out.println("3/4 = " + (3/4) + "   !!!???");
		System.out.println("3/4 = " + (3.0/4));
	
		double first = 0.1;
		double second = 0.2;
		System.out.println(first);
		System.out.println(second);
		
		double third = first + second;
		System.out.println(first + " + " + second + " = " + third);
		
	//ystem.out.format(" Just to the second digit %.2f " + third);
		
	
	int modulus = 6 % 4; // % vs / > modulus operator, remainder
	
	boolean isEven = (4%2) == 0;
	System.out.println(" 4 is even: " + isEven);
	
	isEven = (5 % 2) == 0;
	System.out.println(" 4 is even: " + isEven);
	}

}
