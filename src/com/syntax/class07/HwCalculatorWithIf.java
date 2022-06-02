package com.syntax.class07;
import java.util.Scanner;
public class HwCalculatorWithIf {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a digit!");
		int a= input.nextInt();
		
		System.out.println("Please enter a operator");
		char operator=input.next().charAt(0);
		int b=input.nextInt(); 
		
		if (operator=='+') {
			System.out.println(a+b);
		}else if (operator=='*') {
			System.out.println(a*b);
		}else if (operator=='/') {
			System.out.println(a/b);
		}else if (operator=='-') {
			System.out.println(a-b);
		}
		else {
			System.out.println("Invalid Operator");
		}
	}

}
