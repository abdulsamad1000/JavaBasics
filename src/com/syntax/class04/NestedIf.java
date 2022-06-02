package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println(" Let me check how many  dose you have");
			if (dose == 1) {
				System.out.println(" You need 1 more shot");
			} else {
				System.out.println(" you are fully vacinated");
			}
		}
		System.out.println("-------------------------------------");

		String month = "June";
		int day=19;
		if (month.equals("May")) {
			System.out.println("Let me check what is today is date");
			if (day == 8) {
				System.out.println("Today is mother day");
			}
		} else if (month.equals("June")) {

			if (day==19) {
				System.out.println("Today is Father day");
			}
		}
	}
}
