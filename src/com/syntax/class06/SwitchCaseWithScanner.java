package com.syntax.class06;
import java.util.Scanner;
public class SwitchCaseWithScanner {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String grade;
		String explanation;
		System.out.println("please enter grade");
		grade=input.next();
		
		switch (grade) {
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
		case "D":
			explanation="Bad";
			break;
		default:
			explanation="Not Acceptable";
			break;
		
		}
		System.out.println("your grade is "+grade+" and your "+explanation);
		

	}

}
