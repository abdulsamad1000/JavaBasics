package com.syntax.classo9;

public class HwArrayStore03 {

	public static void main(String[] args) {
		// Create an array to store double values and 
		// then print all elements using 2 different loops
		
		double []price=new double[4];
		price[0]=1.99;
		price[1]=2.99;
		price[2]=3.99;
		price[3]=4.99;
		
		System.out.println(price[0]);
		System.out.println(price[1]);
		System.out.println(price[2]);
		System.out.println(price[3]);
		
		System.out.println("=============2nd way==========================");
		
		
		double[]itemPrice= {1.99,2.99,399,4.99};
		for (int y=0; y<itemPrice.length; y++) {
			System.out.println(itemPrice[y]+" ");
			
		}
		
		

	}

}
