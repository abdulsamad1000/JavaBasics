package com.syntax.classo5;

import java.util.Scanner;

public class UsingScannerAndIFelseifStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("what is the amount of loan you needed");
		int loan=sc.nextInt();
		if (loan<=200000) {
			System.out.println(" you would lend the money");
		}else {
			System.out.println("you would be rejected the client");
		}
		

	}

}
