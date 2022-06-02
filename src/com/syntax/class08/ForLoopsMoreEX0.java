package com.syntax.class08;

public class ForLoopsMoreEX0 {

	public static void main(String[] args) {
		// I need to print number from 1 to 90
		
		
		for (int a=1; a<=90; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		// i need to print number from 60 to 10
		
		for (int b=60; b>=10; b--) {
			System.out.print(b+" ");
		}
		System.out.println();
		// what would be the output
		for (int c=5; c<=40; c+=5) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		// what would be the output?
		for (int d=4; d<=20; d+=4) {
			System.out.print(d+" ");
		}
		System.out.println();
		// print number from 1 to 100 in one line with space?
		for (int f=1; f<=100; f++) {
			System.out.print(f+" ");
		}
		System.out.println();
		// print numbers from 100 to 1?
		for (int g=100; g>=1; g--) {
			System.out.print(g+" ");
		}
		System.out.println();
		// print even numbers between 10 and 20 answer: which would be like 10,12,14,16,18,20
		int h=10;
		while (h<=20) {
			if (h%2==0) {
			System.out.print(h+" ");
			}
			h++;
		}
		System.out.println();
		// print even number between 1and 30
		int i=1;
		while (i<=30) {
			if (i %2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		// print the odd number 30 to 1
		int k=30;
		while (k>=1) {
			if (k%2!=0) {
				System.out.print(k+" ");
			}
			k--;
		}
		System.out.println();
		// first way of using for loops print even numbers from 20 to 1 using For loops.
		for (int m=20; m>=1; m--) {
			if(m%2 ==0) {
				System.out.print(m+" ");
			}
		}
		System.out.println();
		// second way of using for loops print even number from 20 to 1 using for loops.
		for (int n=20; n>=1; n-=2) {
			System.out.print(n+" ");
		}
		System.out.println();
		// i want to print the even number between 30 to 1 using for loops.
		for (int p=30; p>=1; p-=2) {
			System.out.print(p+" ");
		}
		System.out.println();
		// print me the Odd number between 20 and 50 using for loops.
		for (int x=21; x<=50; x+=2) {
			System.out.print(x+" ");
		}
		System.out.println();
		// second way to print odd number between 20 and 50 using for loops.
		for (int y=21; y<=50; y++) {
			if (y%2 !=0) {
				System.out.print(y+" ");
			}
		}
		
		}
	}


