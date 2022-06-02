package com.syntax.classo9;

public class ArrayExamples {

	public static void main(String[] args) {
		// i want to store prices in arrays
		
		double[]price=new double[4];
		price[0]=2.99;
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3.99;
		System.out.println(price[0]);
		
		int[] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		
		// numbers [3]=13; during run time error ----> ArrayIndexOutOfBoundsException
		
		System.out.println(numbers[2]);
	// arrays are fixed in size it mean during runtime JAVA can not increase or decrease a size of an array
		
		
		

	}

}
