package com.syntax.classo5;
import java.util.Scanner;
public class LogicalOperatiorExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("Please Enter your height");
		int height=input.nextInt();
	if (height<60) {
		System.out.println("the person is shor ");
	}else if (height>=60 && height<=72) {
		System.out.println("the person is medium");
	}else if (height>72) {
		System.out.println("the person is tall");
	}
	System.out.println();
	System.out.println("============================");
	String name="Abdul";
	if (!name.equals("Sana")) {
		System.out.println(" you are not abdul and  i need abdul");
		
		System.out.println();
		System.out.println("=========================");
		String firstName="Momand";
		if(!firstName.equals("Abdulsamad")) {
			System.out.println(" you are not abdulsamad i need abdulsamad");
		}
	}
	
	
	}

}
