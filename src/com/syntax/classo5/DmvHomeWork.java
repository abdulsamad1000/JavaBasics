package com.syntax.classo5;

import java.util.Scanner;

public class DmvHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * You are DMV representative and you need to ask customer their age.
	 *  If they are 18 and older you will issue a driver license to them,
	 *  otherwise you will offer them to get a learners permit.
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Please Enter your age");
	int age = scan.nextInt();

	if (age > 25) {
		System.out.println("We will issue you a driver license");

	} else {
		System.out.println("YOU will offer to get a learners permit");
	}

}

}
