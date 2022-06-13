package com.syntax.class07;

public class WhileLoopMoreEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i want to print the numbers from 30 to 200 only the Even numbers 
		int num1=30;
		while (num1<=200) {
			System.out.print(num1+" ");
			num1+=2;
		}
		
		
		System.out.println();
		System.out.println("======= 2nd Way of the same example====");
		int num=30;
		while (num<=200) {
			if (num %2==0) {
				System.out.print(num+" ");
			}
			num++;
		}
		}

	}


