package com.codecean.firstjavaprogram;

import java.util.Scanner;

public class Demo {
	
	// Structure Of A Basic Java Program
	
	public static void main(String [] args) {
		
		// For Output 
		
		System.out.println("Saare Jahan Se Accha Hindustan Humara !");
		
		// For input
		
		// Adding a comment to track change display in gitbash
		
		// import from java.util.*
		
		// taking the input from system:keyboard
		
		System.out.println("Enter the number to be displayed :");
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		
		System.out.println("the number is "+a);
	}
}
