package com.syntax.class06;
import java.util.Scanner;
public class PracticeToCreateACalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Please Enter two Number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Plese Enter Operator");
		char operator=sc.next().charAt(0);
		 int result;
		 
		 switch (operator) {
		 case '*':
			 result=num1*num2;
			 break;
		 case '/':
			 result=num1/num2;
			 break;
		 case '-':
			 result=num1-num2;
			 break;
		 case '+':
			 result=num1+num2;
			 break;
		default:
			result=0;
			 
		 }
		System.out.println(num1+" "+operator+" "+num2+" = "+result);
		
		
		

	}

}
