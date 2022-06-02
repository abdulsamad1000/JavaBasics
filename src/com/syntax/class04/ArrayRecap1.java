package com.syntax.class04;

public class ArrayRecap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the array of the country.
		String []country= {"Afghanistan","Pakistan","India","Turky"};
		System.out.println(country[0]);
		
		for (int a=1; a<country.length; a++) {
		System.out.println(country[a]+" ");	
		}
		
		System.out.println("===============2nd question===================");
		String []city= {"autin","dallas","houston","boston"};
		System.out.println(city[1]);
		 
		for (int b=0; b<city.length; b++) {
			System.out.println(city[b]+" ");
		}
		System.out.println("===================3rd question====================");
		String []fruits= {"banana","mango","watermelon","melon","apple"};
		System.out.println(fruits[3]);
		
		for (int c=0; c<fruits.length; c++) {
			System.out.println(fruits[c]+" ");
		}
		System.out.println("======================Char array ================");
		char[]characters= {'a','b','c','d'};
		System.out.print(characters[2]);
		
		for (int a=0; a<characters.length; a++) {
			System.out.print(characters[a]+" ");
		}
		System.out.println();
		System.out.println("====================int array ========================");
		int[]number= {10,20,30,40,50,60,70,};
		System.out.print(number[1]);
		
		for (int x=0; x<number.length; x++) {
			System.out.print(number[x]+" ");
			System.out.println();
			for (int num:number) {
				System.out.print(num+" ");
			}
		}
	}

}
