package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. 
		//After the array is created,
		//calculate the sum of all stored elements in that array.
		
		Scanner scanner=new Scanner (System.in);
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize=scanner.nextInt();
		// we can not use enhanced for loop fro inserting or updating the valuse of an array
		System.out.println("the size of the array is "+arraySize);
		int [] integerArray=new int[arraySize];
		// we use for loop here
		
		System.out.println("please enter "+arraySize+ " elements");
		for (int i=0; i<integerArray.length; i++ ) {
			integerArray[i]=scanner.nextInt();// taking the input from the user and storing it inside the array
		}
		System.out.println(Arrays.toString(integerArray));
		int sum=0;
		for (int element:integerArray) {
			sum=sum+element; // take the elements from the array one by one and
			// add them to the sum variable
			
		}
		System.out.println("the sum of all the elemnets is "+sum);
		
		scanner.close();
		

	}

}
