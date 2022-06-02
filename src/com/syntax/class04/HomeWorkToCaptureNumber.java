package com.syntax.class04;
import java.util.Scanner;
public class HomeWorkToCaptureNumber {

	public static void main(String[] args) {
		
		
		/*
		 * creat a java program in which using a scanner you are going to capture user
		 * first name, last name and state where he/she lives.
		 */
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your first name?");
		String name = input.next();
		
		System.out.println("Please inter your last name?");
		String lastName= input.next();
		
		System.out.println(name+" "+ lastName+"Please enter state where you live ");
		String state= input.next();
		System.out.println(name+" "+lastName+" is from "+state);
		
	}

}
