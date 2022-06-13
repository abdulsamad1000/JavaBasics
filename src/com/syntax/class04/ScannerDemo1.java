package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("please enter you name");
		String name=input.next();
		System.out.println(name);
		
		System.out.println(name+"please enter you age");
		int age=input.nextInt();
		System.out.println(name+" is "+age+" years old");
		
		
		
		
	}

}
