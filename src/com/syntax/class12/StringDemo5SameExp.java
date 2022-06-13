package com.syntax.class12;

public class StringDemo5SameExp {

	public static void main(String[] args) {
		// we want to find how many same letters we have in this sentence.
		String name=" ssss ass ansjll jutue aslsl bdnaand dsklsl slkskl";
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(17));
		
		//for (int i=0; i<name.length(); i++) {
			// System.out.println(name.charAt(i));
		int counter=0;
		for (int i=0; i<name.length(); i++) {
			if ('s'==name.charAt(i)||'a'==name.charAt(i)||'k'==name.charAt(i)) {
				counter++;
			}
		}
			
		System.out.println("s and a or k appeared "+counter+" in the string");	
			
		
	}

}
