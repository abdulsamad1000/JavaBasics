package com.syntax.class06;

public class SwitchStamentExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// swithc is key word,  switch is statement that we use to test one variable
		// and compare with others cases.
		// swithc has it own block of code
		// in switch we provied diffrents values for one variables.
		// switch cases the block of code and then break.
	// first i am going to do this example wit if and else if condition 
		// then i will do the same example with switch case
		
		int day=5;
		
		if (day==1) {
			System.out.println("to day is sunday");
		}else if (day==2) {
			System.out.println("to day is monday");
		}else if (day ==3) {
			System.out.println("to day is tuesday");
		}else if (day == 4) {
			System.out.println("to day is wendsday");
		}else if (day==5) {
			System.out.println("to day is thursday");
		}else if (day ==6) {
			System.out.println("to day is friday");
		}else if (day==7) {
			System.out.println("to day is saturday");
		}else {
			System.out.println("day is invalid");
		}
		
		System.out.println("======================");
		int day1=5;
		String name;

		switch (1) {
		case 1:
			name="sunday";
			break;
		case 2:
			name="monday";
			break;
		case 3:
			name="tuesday";
			break;
		case 4:
			name="wendsday";
			break;
		case 5:
			name="thursday";
			break;
		case 6:
			name="friday";
			break;
		case 7:
			name="saturday";
			break;
			
		default:
			name="invalid";
			break;
				
			
		}
		
		
			
		}
			
		

	}


