package com.syntax.classo9;

public class HwArray04 {

	public static void main(String[] args) {
		// create an array on integers and calculate the sum of all elements in an array.
		
		int box[]= {25,35,45,55,65};
		int sum=0;
		for (int a=0; a<box.length; a++) {
			
			sum=sum+box[a];
		}
		System.out.println(sum+" ");
	}

}
