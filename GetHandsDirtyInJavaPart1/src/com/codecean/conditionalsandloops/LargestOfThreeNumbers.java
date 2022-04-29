package com.codecean.conditionalsandloops;

public class LargestOfThreeNumbers {
	
	public static void main(String[]args) {
		
		int a=10;
		int b=10;
		int c=5;
		
		if(a==b | b==c | c==a) {
			System.out.println("Go and bring 3 distinct numbers first, Bye !!!");
			return;
		}
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is maximum and value is "+a);
			}
		}else if(b>a) {
			if(b>c) {
				System.out.println("b is maximum and value is "+b);
			}
		}else {
			System.out.println("c is maximum and value is"+c);
		}
	}

}
