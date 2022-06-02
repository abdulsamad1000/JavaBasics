package com.syntax.class07;

import java.util.Scanner;

public class HWDiscount {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Is there a sale? please enter yes or no");
		String sale=input.next();
		double price= 0.00, discount= 0.00, salePrice= 0.00;
		
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What Item do you want to buy?");
			String Item=input.next();
			System.out.println("Please enter the price of Item");
			price=input.nextDouble();
			
			if (price<20) {
				discount=10;
				salePrice= price - (price*0.1);
			}else if (price>= 20 && price<= 100) {
				discount=20;
				salePrice= price - (price*0.2);
			}else if (price >= 101 && price <= 500) {
				discount=30;
				salePrice= price - (price*0.3);
			}else {
				discount =50;
				salePrice= price - (price*0.5);
			}
			System.out.println("After a discount of "+ discount+" the price of the Item reduce from "+discount+" to "+salePrice);;
		}else {
			System.out.println("There is no sale, so you ar not going to shoppoing");
		}
	
	}

}
