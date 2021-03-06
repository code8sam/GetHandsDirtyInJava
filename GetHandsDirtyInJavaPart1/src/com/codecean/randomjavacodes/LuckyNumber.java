package com.codecean.randomjavacodes;

import java.util.Scanner;

public class LuckyNumber {
	
	public static void main(String []args) {
		//A lucky number is a number where the sum of squares of every even-positioned
		//digit (starting from the second position) is a multiple of 9.
		
		// For e.g. 1623 = 6^2+3^2 = 45 is a multiple of 9 and hence is a Lucky number
		
		
		System.out.println("Enter the number : ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int giveNum = sc.nextInt();
		int a = giveNum;
		double count = 0.0;
		int luckyCheck=0;
		
		
		while(a>0) {
			int num = a%10;
			count++;
			if(count%2!=0) {
				luckyCheck += num*num;
				}
			a=a/10;
		}
		
		if(luckyCheck%9==0) {
			System.out.println("The number "+giveNum+" is a Lucky number");
		}
		else {
			System.out.println("Oops! Not a Lucky number");
		}
	
	}
	
}
	
	

