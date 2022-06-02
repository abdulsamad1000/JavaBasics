package com.syntax.class08;

import java.util.Scanner;

public class ForLoopsAnthorExp {

	public static void main(String[] args) {
		/*
		 * declare a secret number
		 * you want to ask user to guess your secret number
		 * your code should keep asking to guess until user gets your secret number
		 * once user gets the secret numbers --> you got it!
		 */
		int secretNumber=700;
		int guessNumber;
		Scanner sc=new Scanner (System.in);
		do {
		System.out.println("Guess my secret number");
		guessNumber=sc.nextInt();
		} while (guessNumber !=secretNumber);
		
		System.out.println("you got it");
		
	
		}
	
	}


