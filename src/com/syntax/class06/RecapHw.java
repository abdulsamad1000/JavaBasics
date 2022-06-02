package com.syntax.class06;

import java.util.Scanner;

public class RecapHw {

	public static void main(String[] args) {

		boolean checkboxSelected = false;
		if (!checkboxSelected) {
			System.out.println("click on checkbox");
		}
		System.out.println("--------------------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years");
		int years = input.nextInt();
		System.out.println("Enter annual salary");
		int salary = input.nextInt();

		if (years >= 5) {
			System.out.println("You are eligible for the bonus");
			if (salary > 50000) {
				System.out.println("You are eligible for 5000 bonus");
			} else {
				System.out.println("You are eligible for 3000 bonus");
			}
		} else {
			System.out.println("Sorry you are not eligible for bonus");
		}
	}

}
