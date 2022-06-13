package com.syntax.class07;

public class WhileLoopFindOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print me the numbers from 50 to 90 only the Odd Numbers
		
		int num=49;
		while (num<=90) {
			System.out.print(num+" ");
			num-=-2;
		}
		System.out.println();
		System.out.println("============= find the Even number===");
		// print me the even numbers only 16 to 80 
		int num1=16;
		while (num1<=80) {
			System.out.print(num1+" ");
			num1+=2;
		}
	}

}
