package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Adem";
		String lastName=" jones";
		String fullName= firstName+lastName; // always always prefer this
		String fullName2=firstName.concat(lastName); // never use this because it can lead you to null pointer exception
		System.out.println(fullName2);
		System.out.println(fullName);
		
		String name=" ";
		System.out.println(name.isEmpty());
		
		
		String captainAmerica=" ne   ver ";
		System.out.println(captainAmerica.trim());
		System.out.println("=========== more practice =====");
		String name2="    ";
		System.out.println(name.isEmpty());
		String Abdulsamad=" Abulsamad ";
		System.out.println(Abdulsamad.trim());
		
		System.out.println();
		System.out.println("=== more practice example for concatanation====");
		String firstname="ahmad";
		String lastname="khan";
		System.out.println(firstname+" "+lastname);
		System.out.println(firstname.concat(lastname));
		
	
		
		
		
	}

}
