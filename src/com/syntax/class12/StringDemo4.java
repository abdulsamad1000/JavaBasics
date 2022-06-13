package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="kat";
		String name2="kat";
		System.out.println(name.equals(name2));
		name2="KAT";
		System.out.println(name.equalsIgnoreCase(name2));
		
		System.out.println("=================");
		String name3="samad";
		String name4="samad";
		System.out.println(name3.equals(name4));
		name4="SAMAD";
		System.out.println(name3.equalsIgnoreCase(name4));
}

}
