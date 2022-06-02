package com.syntax.class08;

import java.util.Scanner;

public class ContinueAndBreakTask {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3
		
		for (int x=1; x<=50; x++) {
			if (x%3==0) {
				continue;
			}
			System.out.print(x+" ");
		}
			System.out.println("--------------------------------------------");
			
			// Create a program that will keep asking user to apply for a credit card. 
			// As soon you get “yes” from a user program should stop asking.
			
			Scanner sc=new Scanner (System.in);
			String answer;
			do {
				System.out.println(" will you apply for a credit card?");
				answer=sc.next();
			}while (!answer.equalsIgnoreCase("yes"));
			
			
			
	}

}
