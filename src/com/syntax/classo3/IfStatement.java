package com.syntax.classo3;

public class IfStatement {

	public static void main(String[] args) {
		/*
		 * declare a variable mortagage rate.
		 * if mortgage rate is more than 5-> i am not buying a house.
		 */
		double mortgageRate=5.5;
		if (mortgageRate>5) {
			System.out.println(" i am not buying a house");
				
		}
		
		System.out.println("-----------------------------------------");
		/*
		 * declare a variable mortgage rate.
		 * if mortgage rate is less than <-4 than i am going to buy a house.
		 */
		double mortgageRate1=3.5;
		if (mortgageRate1< 4) {
			System.out.println(" i am going to buy a house");
		}
		// declar 2 variable and check if num1 is bigger than num2?
		int num1=99;
		int num2=10;
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}
		/*
		 * declar a tempreture, if the tempreture is higher than 75 i will go for walk.
		 */
		int tempr=78;
		if (tempr>75) { // when if statment or condition is true it goes to if block of code 
						// and than to else.
			System.out.println(" I am goig for walk");
		
		}else { // otherwise. code comes to else block of code {}
				// when the condition is false it mean when if statment is false
			System.out.println(" I am going to practice java");
		}
		
		System.out.println("---------------------------------");
		char gender='f';
		if (gender=='f') {
			System.out.println(" You like shopping");
		}else {
			System.out.println(" You like watching sports");
		}
		System.out.println("--------------------------------------");
		
		 String browser="chrom";
		 if (browser.equals("chrom")) {
			 System.out.println(" i will excuted test cases on chrom");
		 }else {
			 System.out.println(" I am not excuted any test cases ");
			 System.out.println(" Reason - wrong browser");
		 }
			
		
		
	}

}
