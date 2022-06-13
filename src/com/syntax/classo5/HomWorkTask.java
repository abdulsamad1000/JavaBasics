package com.syntax.classo5;

import java.util.Scanner;

public class HomWorkTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of years");
		int years=sc.nextInt();
		System.out.println("Enter your salary");
		int salary=sc.nextInt();
		
		if (years >=5) {
			System.out.println("you are eligible for 3000 bouns");
		}if (salary>50000) {
			System.out.println("you are eligible for 5000 bouns");
		}else {  
			System.out.println("sorry you are not eligible");
		}
		
	}

}
