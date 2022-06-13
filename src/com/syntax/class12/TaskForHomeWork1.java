package com.syntax.class12;
import java.util.Scanner;
public class TaskForHomeWork1 {

	public static void main(String[] args) {

		/*
		 * Write a program that reads two people's first names and 
		 * if they expecting boy or girl?  Based on the input suggests a name for a baby:
		 *  Example Output: Mom's first name? Mary Dad's first name? Daniel Boy or Girl? boy
		 * suggested baby name: DANRY Example Outpot: moms first name Mary dads first name Daniel
		 */
		Scanner sc=new Scanner (System.in);
		System.out.println("mom first name");
		String momfirstname=sc.next();
		System.out.println("dad first name");
		String dadfirstname=sc.next();
		System.out.println("bor or girl");
		String boyorgirl=sc.next();
		if (boyorgirl.equalsIgnoreCase("boy")) {
			System.out.println("Daniel");
		}else {
			System.out.println("Maiel");
		}
		sc.close();
		
		

	}

}
