package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// str is just name it could be anything
		// this anthro method how we can serach something by their first name
		
		String str="Batch 13 is great";
		System.out.println(str.startsWith("frezon"));
		System.out.println(str.endsWith("t"));
		System.out.println(str.endsWith("Great"));
		System.out.println(str.endsWith("great"));
		System.out.println(str.toLowerCase().endsWith("great"));
		
		String name="HAMID";
		System.out.println(name.toLowerCase());
	
		System.out.println(str.contains("13"));
		System.out.println(str.contains("is"));
		System.out.println(str.toLowerCase().contains("batch"));
	System.out.println("========== more practice =====");
	String sentence="THIS is our string class";
	System.out.println(sentence.startsWith("that"));
	System.out.println(sentence.startsWith("This"));
	System.out.println(sentence.startsWith("T"));
	System.out.println(sentence.endsWith("s"));
	System.out.println(sentence.endsWith("Class"));
	System.out.println(sentence.endsWith("our"));
	System.out.println(sentence.endsWith("class"));
	System.out.println(sentence.toUpperCase().startsWith("This"));
	
	
	
	System.out.println(sentence.contains("is"));
	System.out.println(sentence.contains("me"));
	System.out.println(sentence.contains("our"));
	System.out.println(sentence.contains("string"));
	System.out.println(sentence.contains("ahamad"));
	System.out.println(sentence.toLowerCase().endsWith("class"));
	
	
	
	
	
	
	
	
	
	}
}
