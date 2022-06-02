package com.syntax.classo5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a Java program that will ask if user has a credit card or not.
		 *  If you user does not have a credit card then offer them. 
		 *  If they do have one ask what is balance on the card? 
		 *  If balance of the card is larger than 1000, tell them to pay off immediately,
		 *  otherwise you can tell them that they can spend more.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Do you have a credit card? or Not");
		String answer= scan.next();
		
		if (answer.equalsIgnorCase("no")) {
			System.out.println("We will offer you a credit card");
			
		}else {
			System.out.println("What is the balance on the card");
			int balance = scan.nextInt();
			
			if (balance>1000) {
				System.out.println("Pay it off immediatly");
			}else {
				System.out.println("You Can Spend more");
			}
			
		}
	
		
	}

}
