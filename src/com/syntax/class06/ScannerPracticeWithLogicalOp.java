package com.syntax.class06;
import java.util.Scanner;
public class ScannerPracticeWithLogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your grade");
		int grade=sc.nextInt();
		if (grade>=90) {
			System.out.println("you are grade A student");
		}else if (grade>=75) {
			System.out.println("you are grade B student");
		}else if (grade<=55) {
			System.out.println("you are grade c student");
		}else {
			System.out.println("your grade is unknown");
		}
	
		
	}

}
