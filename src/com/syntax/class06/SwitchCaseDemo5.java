package com.syntax.class06;
import java.util.Scanner;
public class SwitchCaseDemo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String country,language;
		System.out.println("please enter your country");
		country=sc.nextLine();
		
		switch (country) {
		case "afghanistan":
			language="pashto";
			break;
		case "pakistan":
			language="urdo";
			break;
		case "turky":
			language="turkish";
			break;
		case "usa":
			language="english";
			break;
			
		default:
			language="invalid";
			break;
		}
		System.out.println("you are from "+country+" and your language is "+language);

	}

}
