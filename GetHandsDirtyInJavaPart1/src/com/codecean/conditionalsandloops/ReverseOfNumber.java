package com.codecean.conditionalsandloops;

public class ReverseOfNumber {
	
	public static void main(String [] args) {
		
		int num = 45832;
		int revNum=0;
		
		while(num>0) {
			
			int temp = num%10;
			revNum = revNum*10+temp;
			num=num/10;
			
		}
		
		System.out.println("Reverse Number is "+revNum);
	}

}
