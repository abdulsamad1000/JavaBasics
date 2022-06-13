package com.syntax.class06;
import java.util.Scanner;
public class DiscountExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("is there sale? yes or no");
		String sale=sc.next();
		 double price =0.00 , discount=0.00 ,salePrice=0.00;
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("what item you want to buy");
			String item=sc.next();
			System.out.println("Please enter the price of that item");
			 price=sc.nextDouble();
			 
			 if (price<20) {
				 discount=10;
				 salePrice= price-(price* 0.1);
			 }else if (price >=20 && price <=100) {
				 discount=20;
				 salePrice= price-(price*0.2);
			 }else if (price >=101 && price<=500) {
				 discount=30;
				 salePrice=price-(price* 0.3);
			 }else {
				 discount=50;
				 salePrice=price-(price* 0.5);
			 }
			System.out.println("After a discount of "+discount+"the price of the item"+" to"+salePrice);;
		}else {
			System.out.println("there is no sale, so you are not shopping");
		}
	}

}
