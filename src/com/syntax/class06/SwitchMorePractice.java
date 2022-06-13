package com.syntax.class06;
import java.util.Scanner;
public class SwitchMorePractice {

	public static void main(String[] args) {
		
		// lets ask a user where he is from
		// based on the country we will define favorite food
		Scanner sc=new Scanner(System.in);
		String country,favoriteFood;
		System.out.println("please tell me where are you from");
		country=sc.nextLine();
		switch (country) {
		case "afghanistan":
			favoriteFood="kabab";
			break;
		case "mexico":
			favoriteFood="taco";
			break;
		case "pakistan":
			favoriteFood="Lental";
			break;
		case "canada":
			favoriteFood="puding";
			break;
			
		default:
			favoriteFood="invalid";
			break;
			
		}
		System.out.println(" you are from "+country+" and your favorite food is "+favoriteFood);
	}

}
