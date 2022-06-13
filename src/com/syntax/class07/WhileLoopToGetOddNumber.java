package com.syntax.class07;

public class WhileLoopToGetOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print the number from 150 to 30 only the Odd numbers
		int num=149;
		while (num>=30) {
			System.out.print(num+" ");
			num-=2;
		}
		System.out.println();
		System.out.println("======== 2nd way of the same quesiton==");
		// print the number from 150 to 30 only the Odd numbers
		int num1=150;
		while(num1>=30) {
			if (num1%2!=0) {
			System.out.print(num1+" ");
			}
			num1--;
		}
		
	}

}
