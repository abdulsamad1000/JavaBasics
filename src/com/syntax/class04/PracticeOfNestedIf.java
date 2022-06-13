package com.syntax.class04;

public class PracticeOfNestedIf {

	public static void main(String[] args) {
		
		System.out.println("== Nested if Example with intergers");
	// Nested if---> if inside anthor if is call Nested if 
		boolean vacine=true;
		// pretent you had one dose 
		int dose=1;
		if (vacine) {
			System.out.println("let me check how many dose you had");
			if (dose==2) {
				System.out.println(" you need one more dose");
			}else {
				System.out.println(" you do not need more dose");
			}
		}
		
		
		System.out.println();
		System.out.println(" === anthor example with String====");
		String month="June";
		int day=2;
		if (month.equals("May")) {
			System.out.println(" let me check what is to day date");
			if (day==1) {
				System.out.println(" to day is mother day");
			}
			}else if (month.equals("June")) {
				System.out.println(" let me check what is to day date");
				if (day==2) {
					System.out.println("to day is a father day");
				}
			}
		}
		
	}


