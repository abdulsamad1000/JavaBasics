package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("khan"); // proper way of creating an object from a clas
		
		String name2="afghanistan is the great country in the world"; // its same as string name= new string("khan");
		// all the classes in java cab be treated as data types
		// if the calses is present inside the same package or if a class belong to
		// java.lan package
		
		System.out.println(name.length());
		name2="afghanistan is the great country in the world";
		System.out.println(name2.length());
		String name3="abdul";
		System.out.println(name.length());
		String name4="SAMAD";
		// I want to convert this SAMAD with Upercase to lower case.
		System.out.println(name4.toLowerCase());
		String name5="captain";
		// we want to change from lower to upercase 
		System.out.println(name5.toUpperCase());
		
		System.out.println();
		System.out.println("================practice examples=======");
		String name6="Mohammad khan";
		System.out.println(name6.length());
		String name7=new String ("Sharifullah Momand");
		System.out.println(name7.length());
		// i want to convert this lowere to upercase
		String name8=new String ("SHARIFULLAH MOMAND");
		System.out.println(name8.toLowerCase());
		System.out.println("===more practice Count the words =====");
		String name9=new String ("Mohammad Asghar");
		System.out.println(name9.length());
		System.out.println("==== practice convert from Uper to lower case ===");
		String name10=new String ("MOHAMMAD ASGHAR");
		System.out.println(name9.toLowerCase());
		System.out.println("=== convert from lower to uper case===");
		String name11=new String ("abdulmajeed momand");
		System.out.println(name11.toUpperCase());
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
