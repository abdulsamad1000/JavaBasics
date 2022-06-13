package com.syntax.class06;
import java.util.Scanner;
public class CalculatorMorePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner (System.in);
		System.out.println("Please Enter Three Number");
		double x=inp.nextDouble();
		double y=inp.nextDouble();
		double z=inp.nextDouble();
		double result;
		System.out.println("Please Enter an Operator ");
		char ArthmaticOp=inp.next().charAt(0);
		switch (ArthmaticOp) {
		case '+':
			result=x+y+z;
			break;
		case '-':
			result=x-y-z;
			break;
		case '/':
			result=x/y/z;
			break;
		case '*':
			result=x*y*z;
			break;
			default:
				result=0;
				
			
		}
		System.out.println(x+" "+ArthmaticOp+" "+y+" "+ArthmaticOp+" "+z+" "+ArthmaticOp+"="+result);
	}

}
