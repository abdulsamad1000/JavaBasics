package com.syntax.classo3;

public class ConditonalStatments {

	public static void main(String[] args) {
		/*
		 * declare a variable rate.
		 * if rate is more then 5 --> i am not buying a house
		 */
		
		double mortagageRate=4.5;
		if(mortagageRate>5) {
			System.out.println(" I am not buying a house");
			
		}
		
		/*
		 * declare 2 variables and check if num1 is gigger then num2
		 */
		int num1=99;
		int num2=100;
		
		if (num1>num2) {
			System.out.println(num1+" is bigger then "+num2);
			
		}
		
		/*
		 * declar temprature,
		 * if temp is higher then 75--> i will go for a walk
		 */
		int temp=89;
		if (temp>75){
			System.out.println(" i am going for a walk");
		}else {// otherwise. code comes to esle {}
			// when condition is false
			System.out.println(" i am goint to study java");
			
			
		}
		System.out.println("-------------------");
		char gender='f';
		if ( gender=='f') {
			System.out.println(" you like shopping");
		}else {
			System.out.println("you like watching sports");
			
		}
		System.out.println(" --------------------");
		String browser= "chrome";
		if (browser.equals("chrome")) {
			System.out.println(" All the test should be ");
		}
		
	}

}
