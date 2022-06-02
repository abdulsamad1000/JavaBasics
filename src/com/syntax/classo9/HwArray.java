package com.syntax.classo9;

public class HwArray {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it:
		//A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
		
		char []grade= {'A','B','C','D'};
		/*
		 * System.out.println(grade[0]);
		 *System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println(grade[5]);
		 */
	
		for (int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
			
		}
		System.out.println();
		String []words= {"Java","Saturday","day"};
		
		// i want to retrieve all elements
		for (int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");
			
		}
		

	}

}
