package com.syntax.class06;

import java.util.Scanner;

public class HWtask3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String grade;
		String explanation=null;
		System.out.println("Eter your grade");
		grade=scan.next();
		
		switch (grade) {
		case "A":
			explanation="Ecellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
		default:
			System.out.println("Not Acceptable");
			break;
		}
		System.out.println("Your grade is "+grade+" meaning "+explanation);
		
		

	}

}
