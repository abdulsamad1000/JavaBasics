package com.syntax.class15;

public class Task3 {
	//Create a method that will print whether given String is palindrome or not.
	void printIsPalindrome(String str) {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.reverse();
		String reversedStr=stringBuilder.toString();
		if (str.equals(reversedStr)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("string is not palindrom");
		}
	}
	public static void main (String[]args) {
		Task3 task3=new Task3();
		task3.printIsPalindrome("dad");
		task3.printIsPalindrome("Aladin");
		System.out.println();
		System.out.println("===============");
		String name4="khan";
		System.out.println(name4.length());
		System.out.println();
		System.out.println("===============");
		String nam="jan";
		String nam1="man";
		System.out.println("your name is "+nam+" and "+"you are a "+nam1);
		System.out.println(nam.concat(nam1));
		System.out.println();
		System.out.println("===============");
		
		String str=" i love coding";
		System.out.println(str.substring(3,7));
		System.out.println(str.substring(0,14));
		System.out.println(str.substring(8,14));
		System.out.println(str.substring(3,7));
		System.out.println();
		System.out.println("===============");
		String str1="batch 13 is good";
		System.out.println(str1.replaceAll("batch 13 is good","Batch 13 is great"));
		
		
		
		
	}
}
