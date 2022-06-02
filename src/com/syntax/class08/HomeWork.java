package com.syntax.class08;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want to buy.
		//and the price of that item. 
		//Every time user enters money, accumulate the 
		//amount and tell the user how much is left to pay off.
		//If user give more money program should return a change. 
		//Whenever a user done with payments program should say 
		//“Thank you for shopping!”
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter item you want to buy");
		String item=scan.nextLine();
		System.out.println("Please enter the price of the item");
		double price=scan.nextDouble();
		System.out.println("Please enter the bills");
		double bills=scan.nextDouble();
		System.out.println("This is how much left to pay off");
		
		

	}

}
