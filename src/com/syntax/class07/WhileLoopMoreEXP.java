package com.syntax.class07;

public class WhileLoopMoreEXP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I want to print numbers from 1 to 30 but only Even numbers
		int num=2;
		while (num<=30) {
			System.out.print(num+" ");
			num+=2; 
		}
		System.out.println();
		System.out.println("=======anthor way of the same question =======");
		// I want to print numbers from 1 to 30 but only Even numbers
		int num1=1;
		while (num1<=30) {
			if (num1%2==0) {
			System.out.print(num1+" ");
			}
			num++;
		
}
		
		System.out.println();
		System.out.println("================");
		// i want to print numbers from 1 to 25
		int num2=2;
		while (num2<=25) {
			System.out.print(num2+" ");
			num2+=2;
		}
		
		System.out.println();
		System.out.println("=================");
		// i want to print numbers from 1 to 25
		int num3=1;
		while (num3<=25) {
			if (num3 %2==0) {
				System.out.print(num3+" ");
			}
			num3++;
		}

	}
}
