package com.syntax.class08;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		
		
		int sum=0;
		for (int i=1; i<6; i++) {
			System.out.print(sum+" ");// 0 1 3 6 10
			sum+=i;
			// System.out.print(sum+" "); // 1 3 6 10 15
		}
		System.out.println();
		System.out.println(sum); // 15
		
		/*
		 * write a program to find sum of all even and all odd number from 1 to 70
		 */
		 int sum1=0;
		 for (int i=1; i<= 70; i++) {
			 if (i%2 ==0) {
				 sum1+=i;
			 }
		 }
			System.out.println("sum of all even ="+sum1); 
			int sum2=0;
			for (int a=1; a<=70; a++) {
				if (a % 2 !=0) {
					sum2+=a;
				}
			}
			System.out.println("Sum of all odds="+sum2);
			
			
			// ANTHOR way For the above question 
			int sumEven=0;
			int sumOdd=0;

			for (int i = 1; i <= 70; i++) {

			if (i % 2 == 0) {
			sumEven+=i;
			}else {
			sumOdd+=i;
			}
		 }
			System.out.println("Sum even numbers is "+sumEven);
			System.out.println("Sum even numbers is "+sumOdd);
		
			/*
			 * declare a secret number
			 * you want to ask user to guess your secret number
			 * your code should keep asking to guess until user gets your secret number
			 * once user gets the secret numbers --> you got it!
			 */
			
			Scanner sc=new Scanner(System.in);
			int num=120;
			do {
				System.out.println("Enter the secret number");	
				num = sc.nextInt();
			
		}while(num != 120);
		System.out.println("yo got it");
			
			
	}

}
