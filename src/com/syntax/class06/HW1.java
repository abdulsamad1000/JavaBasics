package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * ask a user to enter their country and capture it.
		 * onece vluse are captured print which language user speaks.
		 */
		Scanner in=new Scanner(System.in);
		String country,language;
		System.out.println("which language user speak");
		language= in.next();
		
		switch (language) {
		case "Pashto":
			country="Afghanistan";
			break;
		case "Farsi":
			country="Iran";
			break;
		case "Hindi":
			country="India";
			break;
		case "Chines":
			country="China";
			break;
		case "Spanish":
			country="Mexico";
			break;
		default:
			country="No county unknown";
			
		}
		System.out.println("the user speak"+language);
		
	}

}
