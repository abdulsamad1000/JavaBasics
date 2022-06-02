package com.syntax.class08;

public class BreakKyeWordExp {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			System.out.println("Hello ");
			if (i==2) {
			break;
			}
		}

		boolean summer=true;
		int temp=95;
		while (summer) {
			
			System.out.println("I will go to the leak to swim evey weekend");
			if (temp<70){
				System.out.println("It is not hot anymore");
			break;
			}
		}
		
	}

}
