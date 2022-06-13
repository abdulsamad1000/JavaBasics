package com.syntax.class12;

public class TaskForHomeWork {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		
		String weekday="Sunday";
		for (int i=weekday.length()-1; i>=0; i--) {
			System.out.print(weekday.charAt(i));
		}
	
	}

}
