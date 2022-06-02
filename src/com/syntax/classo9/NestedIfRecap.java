package com.syntax.classo9;

public class NestedIfRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
			for (int y=1; y<=3; y--) {
				System.out.println("Bye");
			}
		}
		System.out.println("------------------------------------------------------");
		for (int a=1; a<=5; a++) {
			System.out.println("Hello");
			for (int b=1; b<=3; b++) {
				System.out.println("Bye");
			}
		}
		System.out.println("--------------------------------------------------------");
		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
			for (int y=1; y<=3; y++) {
				System.out.println("Bye");
				break;
			}
		}
	}

}
