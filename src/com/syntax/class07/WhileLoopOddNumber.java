package com.syntax.class07;

public class WhileLoopOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print me the numeber from 100 to 1 only the Odd Numbers
		int num=100;
		while(num>=1) {
			if (num%2!=0) {
				System.out.print(num+" ");
				
			}
			num--;
		}
		System.out.println();
		System.out.println("=========== 2nd ways for the same example==");
		// print me the numeber from 100 to 1 only the Odd Numbers
		int num1=99;
		while (num1>=1) {
			System.out.print(num1+" ");
			num1-=2;
		}
		
	}

}
