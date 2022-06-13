package com.syntax.class14;

public class MethodsDemo3 {

		// write a method that take an integer value if that value is Even this method
		// return true otherwise it return false
	
	
	boolean isEven(int number) {
		if (number%2==0) {
			return true;
		}else {
			return false;
		}
	
	}
	boolean checkString(String str) {
		if (str.length()%2==0) {
			return true;	
		}else {
			return false;
		}
	}
	// write a method that takes a String and return true if number of 
	//characters in that String are Even otherwise Odd.
	public static void main(String[] args) {
		MethodsDemo3 md=new MethodsDemo3();
		System.out.println(md.isEven(22));
		System.out.println(md.checkString("hellol"));
	}

	}
