package com.syntax.class08;

public class ForLoopTask {

	public static void main(String[] args) {
		// print number from 1 to 100 in 1 line with space
		for (int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		System.out.println("---------------------Question2-----------------------------");
		// print number from 100 to 1
		for (int b=100; b>=1; b--) {
			System.out.print(b+" ");
		}
		System.out.println("-----------------------------Question3-------------------------");
		// print even numbers from 20 to 1 (2 ways)
		for (int c=20; c>=1; c-=2) {
			System.out.print(c+" ");
		}
		
		System.out.println("-----------------------------------------------------");
		for (int m=20; m>=1; m--) {
			if (m%2==0) {
				System.out.print(m+" ");
			}
		}
		System.out.println("-------------------------------Question4--------------------");
		// print odd numbers between 20 and 50 (2 ways)
		for (int d=21; d<=50; d+=2) {
			System.out.print(d+" ");
		}
		System.out.println("---------------------2 way -----------");
		for (int i=20; i<50; i++) {
			if (i % 2 !=0) {
				System.out.print(i+" ");
			}
		}
	}

}
