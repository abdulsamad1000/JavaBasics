package com.syntax.classo5;

public class PracticeLogicalOp {

	public static void main(String[] args) {
		/*
		 * Saturday and Sunday --> the Mopc lan is closed
		 * Monday and tuesday ---> the Mopc lan is under construction
		 * Wendnsday -----> the lan is open for the traffic
		 */
		String day="Wendsday";
		if (day.equals("Saturday")|| day.equals("Sunday")) {
			System.out.println(" The Mopc right lan is closed ");
		}else if (day.equals("Monday")|| day.equals("Tuesday")) {
			System.out.println(" The Mopc Ramp is under construction ");
		}else if (day.equals("Wendsday")) {
			System.out.println(" The lan is open for the traffice");
		}
		System.out.println();
		System.out.println("========================");
		double height=73;
		double medium=72;
		double tall=72;
		if (height<=60) {
			System.out.println("the person is short");
		}else if (height<=72) {
			System.out.println("the person is Medium");
		}else if (height>72) {
			System.out.println("the peroso is tall");
		}
		System.out.println();
		System.out.println("============================");
		String day1="Saturday";
		if (day1.equals("Monday")|| day1.equals("Tuesday")|| day1.equals("Wendsday")|| day1.equals("thursday")|| day1.equals("Friay")) {
			System.out.println("It is the weekdays you have work ");
		
		}else if (day1.equals("Sunday")|| day1.equals("Saturday")) {
			System.out.println("It is the weekend you can go out and enjoy your drink");
		}else {
			System.out.println(" Sorry You Enter Invalid day");
		}
		System.out.println();
		System.out.println("===============================");
		int num1=10;
		int num2=100;
		int num3=1000;
		if (num1>num2 && num2>num3) {
			System.out.println("the largest number is "+num1);
		}else if (num2>num3 && num2>num3) {
			System.out.println("the largest number is "+num2);
		}else if (num3>num1 && num3>num2) {
			System.out.println(" the largest number is "+num3);
		}
	}

}
