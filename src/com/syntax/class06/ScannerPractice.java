package com.syntax.class06;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter his/her brith month");
		String month = scanner.nextLine();
		if (month.equalsIgnoreCase("January")|| month.equalsIgnoreCase("Febury")) {
			System.out.println("you were born in spring");
		}else if (month.equalsIgnoreCase("Marh")|| month.equalsIgnoreCase("April")) {
			System.out.println("you were born in summer");
		}else if (month.equalsIgnoreCase("May")|| month.equalsIgnoreCase("June")) {
			System.out.println("you were born in winter");
		}else {
			System.out.println("we are not tracking your born season");
		}
		
		}
		}