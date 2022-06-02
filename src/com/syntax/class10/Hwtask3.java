package com.syntax.class10;

public class Hwtask3 {

	public static void main(String[] args) {
		// create an array to store double values and then print all elements use different loops
		
		double [] price={22.99,10.99,25.99,55.99};
		for (int a=0; a<price.length; a++) {
			System.out.println(price[a]+" ");
			
			
			for (double x:price) {
				System.out.println(x+" ");
			}
		}
		

	}

}
