package com.syntax.classo5;

import java.util.Scanner;

public class UseOfScannerAndIFelseIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		if (age>=18) {
			System.out.println("The DMV of Texas will issue you a driver license");
		}else {
			System.out.println("The DMV of Texas will issue you a driving permit");
		}
		

	}

}
