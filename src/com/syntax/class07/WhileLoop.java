package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=0;
		if (time<1) {
			System.out.println("Morning");
		}
		System.out.println("-------------------------------------");
		
		while (time<12) {
			System.out.println("Morning");  // infinite 
			time++;
		
		}
		System.out.println("Hello");
	}

}

