package com.syntax.classo5;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*
		 * Monday and friday we no class
		 * tuesday and wendasy we have -> Manula testing
		 * thursday we have review class
		 * satuarday and sunday we have java class
		 */
		
		String day="Saturday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
			
		}else if (day.equals("Tuesday")|| day.equals("Wednesday")) {
			System.out.println("I have Manual testing class");
			
		}else if (day.equals("Thursday")) {
			System.out.println("I have Review class");
			
		}else if (day.equals("Saturday")|| day.equals("Sunday")) {
			System.out.println("I have java class");
		}
		
	}

}
