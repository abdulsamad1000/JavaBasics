package com.syntax.class06;
import java.util.Scanner;
public class CalculatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Four Number Sana you want.");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		System.out.println("Please Enter an Operator ");
		char Operator=scan.next().charAt(0);
		int result;
		
		switch (Operator) {
		case '+':
			result=a+b+c+d;
			break;
		case '-':
			result=a-b-c-d;
			break;
		case '*':
			result=a*b*c*d;
			break;
		case '/':
			result=a/b/c/d;
			break;
		default: 
			result=0;
			break;
			
		}
		System.out.println(a+" "+Operator+" "+b+" "+Operator+" "+c+" "+Operator+" "+d+" "+Operator+" = "+result);
	}

}
