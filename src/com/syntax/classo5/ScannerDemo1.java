package com.syntax.classo5;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your name");
		String name=scan.nextLine();
		
		System.out.println("Pleae enter you current age");
		int age=scan.nextInt();
		
		System.out.println("Please enter the price of this item you want");
		double price=scan.nextDouble();
		
		System.out.println("Please enter the special character");
		char character=scan.next().charAt(0);
		
		System.out.println("please enter a boolean");
		boolean boo=scan.nextBoolean();
		
		System.out.println("==================");
		System.out.println("what is the amount of loan you is need");
		int loan=scan.nextInt();
		

		}

}
