package com.codecean.randomjavacodes;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		System.out.println();
		String str1 = sc.nextLine();
		
		String resultStr = str1.replaceAll("[ ]+", " ");
		
		System.out.println();
		
		System.out.println("Your String after processing is :"+resultStr);
	}

}
