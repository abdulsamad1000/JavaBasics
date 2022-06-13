package com.syntax.classo5;
import java.util.Scanner;
public class UseOfScannerAndIFelseIFstatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("user has credit card yes or no?");
		String answer=scan.next();
		if (answer.equalsIgnoreCase("no")) {
			System.out.println("we will offer you a credite card ");
		}else {
			System.out.println("what is the blance of the crdite");
			int balance=scan.nextInt();
			if (balance>1000) {
				System.out.println("pay it off immidiatly");
			}else {
				System.out.println("you can spend more");
			}
		}
		
	}

}
