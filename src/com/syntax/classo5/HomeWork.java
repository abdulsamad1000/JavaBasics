package com.syntax.classo5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the day of hte week today? enter the number");
		int day= scan.nextInt();
		if (day==1 || day==2 || day==3 || day== 4 || day==5){
			System.out.println("It is a weekday");
		}else if (day==6 || day==7){
			System.out.println("it is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
	}

}
