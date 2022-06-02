package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
	
		int age= 30;
		int weight=70;
		if (age>18) {
			System.out.println(" you are eligible");
		}else {
			System.out.println(" you are not eligible");
		}
		if (weight>110) {
			System.out.println(" you are eligible");
		}else {
			System.out.println(" we can not acept such patient");
		}	
	}
}
