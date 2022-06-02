package com.syntax.classo5;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/*
		 * if there is no traffic --> i will arrived work ontiem
		 */
		boolean traffic=false;
		if (!traffic) {
			System.out.println("I will arrved work ontime");
		}
		String name="Samad";
		if (!name.equals("Abdul")) {
			System.out.println("You are not Abdu, and i need Abdul");
		}
		
		
		

	}

}
