package com.syntax.class06;

import java.util.Scanner;

public class HWTask5Cal {

	public static void main(String[] args) {
		/*
		 * use a scanner class to create a calculator
		 * allow user to put 2 number and operators (+,-,/,*)
		 * base on operator provide the result to the user
		 * please complete this assignment in 2 ways if statement and switch case.
		 */
		
		
		Scanner inp=new Scanner(System.in);
		System.out.println("calculator");
		int num1=inp.nextInt();
		int num2=inp.nextInt();
		char arith=inp.next().charAt(0);
		
		int num=255;
		
		
		if (arith=='/') {
			num=(num1/num2);}
		else if (arith=='*') {
			num=(num1*num2);}
		else if (arith =='+') {
			num=(num1+num2);}
		else if (arith=='-') {
			num=(num1-num2);}
		
		System.out.println("The result is "+num);
		
		
		
		
		
	}

}
