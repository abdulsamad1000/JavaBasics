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
		
		System.out.println("==================");
		int num=5;
		int num1=4;
		int num2=3;
		if (num>=num1) {
			if (num1>=num2) {
				System.out.println(num+" is the largest number");
			}else {
				System.out.println(num2+" is the largest number");
			}
			System.out.println("===================");
			int num3=55;
			int num4=45;
			int num5=30;
			if (num3>=num4) {
				if (num4>=num4) {
					System.out.println(num3+" is the largest number");
				}else {
					System.out.println(num4+" is the largest number");
				}
				
			}
		}
		
		
	}

}
