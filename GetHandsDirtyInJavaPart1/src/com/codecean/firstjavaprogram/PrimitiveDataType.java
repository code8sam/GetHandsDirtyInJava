package com.codecean.firstjavaprogram;

import java.util.Scanner;

public class PrimitiveDataType {
	
	public static void main(String[]args) {
		 int rollNo = 62; // the value of rollNo is called Literal i.e. 10 and rollNo is called Identifier
		 
		 // String is not primitive
		 
		 String name = "Google";
		 
		 float marks = 99.99f;
		 double largeDecimalNos = 2848502049606.395960;
		 long largeIntegerValue = 88585995060604L;
		 
		 boolean check = false;
		 
		 // Now Taking Inputs From User For Same Things
		 
		 Scanner sc = new Scanner(System.in);
		 
		 // sc.next() will only take the first word of that line, nothing else
		 // but if you want that entire words needs to taken then use sc.nextline()
		 
		 String studentName = sc.nextLine();
		 double marks1 = sc.nextDouble();
		 int age = sc.nextInt();
		 
		 System.out.print("Marks of "+studentName+" whose age is "+age+" is having "+marks1+" marks in Mathematics.");
		 
		 sc.close();
	}

}
