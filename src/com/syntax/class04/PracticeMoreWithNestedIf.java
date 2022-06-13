package com.syntax.class04;

public class PracticeMoreWithNestedIf {

	public static void main(String[] args) {
		
		/*
		 * we want to check if repl was completed
		 * 
		 * if repl is completed we want to see
		 * if you did 15 and more -- > great job
		 * if you did more then 10 --> good job
		 * if less then 10 --> try to complete all the assingnments 
		 */
		
		boolean repl=true;
		int assignment=17;
		if (repl) {
			System.out.println(" how many assignment have you done ");
		if (assignment>15) {
			System.out.println("you did a great job");
		}else if (assignment>10) {
			System.out.println("you did a good job");
		}else if (assignment<10) {
			System.out.println("complete all the assignment");
		}
		}else {
			System.out.println(" you will not succeed the class");
		}
		
		
		System.out.println();
		System.out.println("== Task for NestedIf========");
		boolean diploam=false;
		double gpa=4;
		if (diploam){
			System.out.println("Congratulation");
			if (gpa>3.5) {
				System.out.println("you are eligible for scholarship");
			}else  {
				System.out.println("You should stadied harder");
			}
			}else {
				System.out.println("get a degree");
			}
		System.out.println();
		System.out.println("======= Task for Nested IF====");
		double morgageRate=4.6;
		int housePrice=60000;
		if (morgageRate>4.5) {
			System.out.println(" user will not buy a house");
			if (housePrice>50000) {
				System.out.println("user will take a loan");
			}else {
				System.out.println("user will pay cash");
			}
		}else {
			System.out.println("user will buy a house");
		}
		
		
		}
}
