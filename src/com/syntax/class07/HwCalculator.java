package com.syntax.class07;
import java.util.Scanner;
public class HwCalculator {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter two numbers");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double result;
		System.out.println("Please enter operator");
		char operator=scan.next().charAt(0);
		
		switch (operator) {
		
		case '*':
			result= a*b;
			break;
		case '/':
			result=a/b;
			break;
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		default:
			result=0;
		System.out.println("Invalid Operator");
		}
	
		System.out.println(a+ " "+operator+ " "+b+ " = "+result);
		scan.close();
	}

}
