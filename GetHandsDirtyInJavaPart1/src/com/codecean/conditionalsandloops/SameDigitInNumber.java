package com.codecean.conditionalsandloops;

public class SameDigitInNumber {
	
	public static void main(String[]args) {
		
		int n =475737768;
		
		int repeat =7;
		
		int check=0;
		
		while(n>0) {
			
			int x = n%10;
			n = n/10;
			if(n%10==repeat) {
				check++;
				}
		}
		
		System.out.println("the number of times "+repeat+" appeared is "+check);
		
	}

}
