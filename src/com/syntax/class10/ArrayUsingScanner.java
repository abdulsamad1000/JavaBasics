package com.syntax.class10;

import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values.
		 *  After the array is created, calculate the sum of all stored elements in that array.
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("enter your value");
		int []numbers= {1,2,3,4,};
		int sum=0;
		numbers[0]=scan.nextInt();
		numbers[1]=scan.nextInt();
		numbers[2]=scan.nextInt();
		numbers[3]=scan.nextInt();
		
		for(int a=0; a<numbers.length; a++) {
			sum=sum+numbers[a];
			
			for (int num:numbers) {
				System.out.println(num+"");
			}
			
		}
		System.out.println("sum of all elements ="+sum);
	  
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
