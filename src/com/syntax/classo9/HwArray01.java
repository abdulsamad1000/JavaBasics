package com.syntax.classo9;

public class HwArray01 {

	public static void main(String[] args) {
		// creat ann array of cars and store 6 elements into it
		// using 2 different loops print all values from the array.
		
		String []cars=new String [6];
		cars[0]="Toyota";
		cars[1]="Honda";
		cars[2]="Ford";
		cars[3]="BMW";
		cars[4]="GMC";
		cars[5]="Mercediz";
		for (String car:cars) {
			System.out.print(car+" ");
		}
		System.out.println();
		System.out.println("===========2nd way==========================");
		for (int a=0; a<cars.length; a++) {
			System.out.print(cars[a]+" ");
		}
		

	}

}
