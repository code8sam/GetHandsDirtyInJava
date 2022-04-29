package com.codecean.conditionalsandloops;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[]args) {
		
		int num1=0;
		int num2=1;
		
		int n=10;
		int sum=0;
		
		// find nth fibonacci
		
		for(int i=2;i<=n;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
		System.out.println(sum); 
		
		

}}
