package com.syntax.class02;

public class NonePremitives {

	public static void main(String[] args) {
		String name= "0leg";
		String Lastname= "Smith";
		
		long phone=5127013224l;
		
		// xxx-xxx-xxxx
		String PhoneNumber= "512-701-3224";
		String Address= "7485 Chevy Chase Dr";
		String age= "30";
		String city="Austin";
		
		
		
		
		// shortcut for printing 
		// syso +ctrl +space -----> hit enter 
		
		/*
		 * we can use +
		 * to attach String to String
		 * to attach String to Int
		 * to attach String to double 
		 * to any other type
		 */
		
		System.out.println(name+" "+Lastname);
		// note i want to add this 
		/*
		 * oleg lives in Austin
		 */
		System.out.println(name+" lives in "+city);
		
		// oleg is 30 years old
		
		System.out.println(name+" is " +age+" years old");
		
		
		

	}

}
