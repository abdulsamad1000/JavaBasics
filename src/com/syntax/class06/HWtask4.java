package com.syntax.class06;

import java.util.Scanner;

public class HWtask4 {

	public static void main(String[] args) {
		/*
		 * based on the price you have calculate the price of the item after the discount.
		 * discount rule; ----- 
		 * if price is less than $20---> apply 10%
		 * if price is between $20 & $100 ---> 20%
		 * if price is between $100 & $500 ----> 30%
		 * otherwise apply 50% discount 
		 * after discount __ the price of the item reduce from __to ___*/
		 
		Scanner in=new Scanner (System.in);
		System.out.println("enter value fro sale: yes or no:");
		String sale =in.nextLine();
		
		if (sale.equals("no")) {
			System.out.println("you are not going for shopping");
		}else {
			System.out.println("you are going for shopping ");
			System.out.println("which item they want to buy and its price");
		}
		String item=null;
		int price=0;
		int disc,priceDisc = 0,finPrice;
		
		item=in.next();
		price=in.nextInt();
		disc=20;
		disc=30;
		disc=40;
		disc=50;
		if (price<=20) {
		}else if (price>=20&price<=100) {
		}else if (price>=100&price<=500) {	
		}
		switch (disc) {
		case 10:
			finPrice=price-priceDisc;
			break;
		case 20:
			finPrice=price-priceDisc;
			break;
		case 30:
			finPrice=price-priceDisc;
			break;
		default:
			finPrice=price-priceDisc;	
		}
		System.out.println(" After discount %"+disc+" the price of the item is reduce from $ "+price+" to $ "+finPrice);
		 
		 

	}

}
