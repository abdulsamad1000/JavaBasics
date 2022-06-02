package com.syntax.class10;

public class HwArray01 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int []array= {2,4,6,8};
		int max=array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i]> max) {
				max=array[i];
			}
		}
		
		
		
		System.out.println("==================================");
		int[] nums= {2, 4, 6, 8};
		int largest = 0;
		
		for(int large:nums) {
			if(largest<large) {
				largest=large;
			}
		}
		System.out.println("The largest # is "+largest);
	}

}
