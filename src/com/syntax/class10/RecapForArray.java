package com.syntax.class10;

public class RecapForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []disney= {"shrek","elsa","goofy","mulan"};
		System.out.println(disney[1]); // result would be elsa
		
		System.out.println("All elements using regular for loop ");
		
		// to get all elements from an array.
		
		for (int x=0; x<disney.length; x++) {
			System.out.print(disney[x]+" ");
		}
		System.out.println("==================================");
		
		for (String character:disney) {
			if(character.equalsIgnoreCase("mulan")) {
				System.out.println(character+"is my favorite character");
			}else {
			System.out.print(character+" ");
		}
			
		}

	}

}
