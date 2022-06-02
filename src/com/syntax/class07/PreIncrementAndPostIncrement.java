package com.syntax.class07;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		// post increment
		// first use and then increment
		
		int result =num++;
		
		System.out.println("Value of num is "+num);
		System.out.println("Value of result is "+result);
		
		int num1 =10;
		// pre increment
		// first increment and then use
		int result1=++num1;
		System.out.println("Value of num is "+num1);
		System.out.println("Value of result is "+result1);
		

	}

}
