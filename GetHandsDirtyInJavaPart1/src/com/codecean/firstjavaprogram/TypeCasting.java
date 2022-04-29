package com.codecean.firstjavaprogram;

import java.util.Scanner;

public class TypeCasting {
	
	public static void main (String[]args) {
		
		//Scanner sc = new Scanner(System.in);
		
		//For Type Conversion - Implicit Type Casting
		// 1. The two types must be compatible
		// 2. The destination type should be Larger/Wider than the source type
		
		//float num = sc.nextFloat();
		//System.out.println(num);
		
		
		
		
		
		// For Explicit Type Casting
		
		//int numNext = (int)(num);
		
		//System.out.println(numNext);
		
		
		
		
		
		
		// Automatic Type Promotion in expressions
		
//		int a = 257;
//		byte b = (byte)a;
//		System.out.println(b);  // 257 % 256 = 1
		
		
		
		
		//See the below code carefully
		
		// the result of intermediate term and operation of x and y exceeds
		// the byte limit and thus it automatically gets promoted to int
		// this is called Type Promotion
//		
//		byte x = 40;
//		byte y = 50;
//		byte z = 100;
//		
//		int xyz = x*y/z;
//		
//		System.out.println(xyz);
		
		
		
		
		
		
		// Store char value in int and see
		
//		int number = 'A';
//		System.out.println(number); // output will be the ASCII value of A i.e. 65
		
		
		
		
		
		
		/*
		 * Rules for Type Promotion -
		 * 
		 * all the byte, short and char values are promoted to int
		 * any one of the operands is long then whole will be promoted to long
		 * so --->byte->short->char->int->long->float->double
		 */
	}

}
