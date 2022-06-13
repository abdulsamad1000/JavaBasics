package com.syntax.class04;

public class PracticeForIfElseIfStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declar 2 numbers and verify which number is the largest
		 */
		int num1 = 300;
		int num2 = 50;
		if (num1 > num2) {
			System.out.println(num1 + " is the largert number");
		} else {
			System.out.println(num2 + " is the largest number");
		}
		System.out.println();
		System.out.println("============= anthor way of the same question=====");
		int num3 = 300;
		int num4 = 300;
		if (num3 > num4) {
			System.out.println(num3 + " is the largest number than " + num4);
		} else if (num4 > num3) {
			System.out.println(num4 + " is the largest number than " + num3);
		} else {
			System.out.println(num3+" is the equals number to "+num4);
		}
		System.out.println();
		System.out.println("=========== anthor example of if else if statments=========");
		
		String time="Afternoon";
		if (time.equals("Morning")) {
			System.out.println("Say Good Morning everyone");
		}else if (time.equals("Noon")) {
			System.out.println("Say Good noon everyone");
		}else if (time.equals("Evening")) {
			System.out.println("Say Good Nigt everyone");
		}else {
			System.out.println("It is time to go home and sleep");
		}
		
		System.out.println();
		System.out.println("== anthor example of If Else If condition statment== ");
		int day=5;
		if (day==1) {
			System.out.println("to day is monday");
		}else if (day==2) {
			System.out.println("to day is tuesday");
		}else if (day== 3) {
			System.out.println(" to day is wednesday");
		}else if (day ==4) {
			System.out.println(" to day is thursday");
		}else if (day==5) {
			System.out.println(" to day is friday");
		}else if (day== 6) {
			System.out.println(" to day is staturday");
		}else if (day==7) {
			System.out.println(" to day is sunday");
		}else {
			System.out.println(" the day is invalid");
		}
	System.out.println();
	System.out.println("=== char example if else if statment====");
	
	char characters='F';
	if (characters =='F') {
		System.out.println(characters+" is the gender for femal");
	}else if (characters=='f') {
		System.out.println(characters+" character needs to be seen by femals");
	}else {
		System.out.println(" this is man");
	}
	
	}

}
