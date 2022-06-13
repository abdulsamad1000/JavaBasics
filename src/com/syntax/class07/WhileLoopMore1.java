package com.syntax.class07;

public class WhileLoopMore1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i want to print the number from 1 to 10 
		int num=1;
		while (num<=10) {
		System.out.print(num+" ");
		num++;
		}
		System.out.println();
		System.out.println("======== Even number =============");
		// i want to print the numbers from 1 to 50 only the Even number 
		int num2=2;
		while (num2<=50) {
			System.out.print(num2+" ");
			num2+=2;
		}
		System.out.println();
		System.out.println("========= Even number ==========");
		// i want to print the numbers from 30 to 90 only the Even number 
		int num3=30;
		while (num3<=90) {
			if (num3 %2==0) {
				System.out.print(num3+" ");
				
			}
			num3+=2;
		}
	}

}
