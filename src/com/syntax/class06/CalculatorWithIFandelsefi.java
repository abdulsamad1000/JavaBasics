package com.syntax.class06;
import java.util.Scanner;
public class CalculatorWithIFandelsefi {

	public static void main(String[] args) {
		// create a calculator with IF or Else if Condition 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Plase Enter an Operatro");
		char Operator=sc.next().charAt(0);
		if (Operator=='+') {
			System.out.println(a+b);
		}else if (Operator=='-') {
			System.out.println(a-b);
		}else if (Operator=='/') {
			System.out.println(a/b);
		}else if(Operator=='*') {
			System.out.println(a*b);
		}else {
			System.out.println("the number is invalid");
		}
		
		

	}

}
