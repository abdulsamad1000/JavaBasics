package com.syntax.classo3;

public class RelationalOperators {

	public static void main(String[] args) {
		// >,<,>=,
		int num1=20;
		int num2=22;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1!=num2);
		System.out.println(num1==num2);
		System.out.println(num1=num2);
		
		System.out.println(num1==num2);
		boolean result=100>200;
		System.out.println(result);// false
		int num5=100;
		int num6=200;
		System.out.println(num6>num5);// true 
		String result2= "emre"+10;
		System.out.println(result2);// 
		int num3=10;
		int num4=11;
		result=num3==num4; // if num3 equals to num4
		System.out.println(result); // false
		// type mismatch: can not covert from boolean to int
		 // check if num3 not equal to num4
		result=num3!=num4;
		System.out.println(result);// false
		 
		;
		
		

	}

}
