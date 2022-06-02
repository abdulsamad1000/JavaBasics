package com.syntax.classo5;

import java.util.Scanner;

public class HomeWorkTask5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month= scan.next();
		if (month.equals("March") && month.equals("April")&& month.equals("May")) {
			System.out.println("Spring");
		}else if (month.equals("June") && month.equals("July")&& month.equals("Augest")) {
			System.out.println("Summer");
		}else {
			System.out.println("Winter");
		}System.out.println("You were born is season "+month);
	}

}
