package com.syntax.class06;
import java.util.Scanner;
public class ScannerClass01Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the current time");
		int time=sc.nextInt();
		if (time>=1 && time<=11) {
			System.out.println("It is Morning");
		}else if (time>=12 && time<=15) {
			System.out.println("It is Afternoon");
		}else if (time>=16 && time<=20) {
			System.out.println("It is Evening");
		}else if (time>=21 && time<=24) {
			System.out.println("It is night");
		}else {
			System.out.println("Invalid time");
		}
		
	}

}
