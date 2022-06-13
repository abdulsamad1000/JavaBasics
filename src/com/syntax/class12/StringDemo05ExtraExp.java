package com.syntax.class12;

public class StringDemo05ExtraExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in this example i want to see how many times number 1 is in this 
		String number="12234111545866611548531544";
		int counter=0;
		
		for (int i=0; i<number.length(); i++) {
			if ('1'==number.charAt(i)|| '6'==number.charAt(i)) {
				counter++;
				
			}
		}
		System.out.println("1 and 6 are will appear "+counter);	
		
		

	}

}
