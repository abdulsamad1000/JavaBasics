package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sameer is funny";
		System.out.println(str.charAt(7));
		System.out.println(str.charAt(5));
		
		for (int i=0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		System.out.println("=========================");
		int counter=0;
		for (int i=0; i<str.length(); i++) {
			if ('s'==str.charAt(i)||'S'==str.charAt(i)) {
				counter++;
			}
		}
		System.out.println("s and a appeard "+counter+" in the string");
		
		
		
		
			
			
		}
		
		
		
		
	}


