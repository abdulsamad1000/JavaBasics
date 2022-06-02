package com.syntax.classo5;

import java.util.Scanner;

public class HomeWorkTask3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter number worked years");
		int work= scan.nextInt();
		
		System.out.println("anual salary");
		int salary= scan.nextInt();
		
		if (work>5) {
			System.out.println("eligible for the bounes");
			if (salary>5000) 
				System.out.println("bonus 5000");
			else 
				System.out.println("bonus 3000");
		}else {
			System.out.println("not eligible for bonus");
		}
		
	}

}
