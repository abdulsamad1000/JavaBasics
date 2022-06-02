package com.syntax.classo5;

import java.util.Scanner;

public class HomeWorkTask1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the amount of loan you need");
		int loan= scan.nextInt();
		if (loan>=200000) {
			System.out.println("You would lend the money");
		}else {
			System.out.println("You would be rejected");
		}
		

	}

}
